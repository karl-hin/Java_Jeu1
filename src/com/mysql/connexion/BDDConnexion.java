package com.mysql.connexion;

import java.sql.*;

import javax.swing.JOptionPane;

import fr.karl.jeu1.Guerrier;
import fr.karl.jeu1.Magicien;
import fr.karl.jeu1.Personnage;

public class BDDConnexion {

	private Connection connection = null;
	private Statement statement = null;
	private String DRIVER;
	private String USERNAME;
	private String PASSWORD;
	private String URL;

	public BDDConnexion() {
		DRIVER = "com.mysql.cj.jdbc.Driver";
		USERNAME = "root";
		PASSWORD = "karl";
		URL = "jdbc:mysql://localhost:3306/jeu";
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			JOptionPane.showMessageDialog(null, "Connexion établit: ");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erreur de connexion: ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void requestRecupere() {
		try {
			statement = connection.createStatement();
			ResultSet resultat = statement.executeQuery("SELECT * FROM jeu.hero");
			JOptionPane.showMessageDialog(null, "Requête réussi: ");
			while (resultat.next()) {
				System.out.println(" id = " + resultat.getInt(1) + " " + " type = " + resultat.getString(2) + " "
						+ " nom = " + resultat.getString(3) + " " + " vie = " + resultat.getInt(4) + " "
						+ " atk = " + resultat.getInt(5) + " " + " arme/sort = " + resultat.getString(6));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Requête failed: ");
		}
	}
	
	public Guerrier requestPerso1() {
		try {
			statement = connection.createStatement();
			ResultSet resultat = statement.executeQuery("SELECT * FROM jeu.hero WHERE id = 5");
			JOptionPane.showMessageDialog(null, "Requête réussi: ");
			if (resultat.next()) {
				System.out.println("Vous avez choisit " + "id = " + resultat.getInt(1) + " " + " type = " + resultat.getString(2) + " "
						+ " nom = " + resultat.getString(3) + " " + " vie = " + resultat.getInt(4) + " "
						+ " atk = " + resultat.getInt(5) + " " + " arme/sort = " + resultat.getString(6));
				Guerrier joueur = new Guerrier(resultat.getString(3), resultat.getInt(4), resultat.getInt(5));
				return joueur;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Requête failed: ");
		}
		return null;
	}
	
	public Magicien requestPerso2() {
		try {
			statement = connection.createStatement();
			ResultSet resultat = statement.executeQuery("SELECT * FROM jeu.hero WHERE id = 6");
			JOptionPane.showMessageDialog(null, "Requête réussi: ");
			if (resultat.next()) {
				System.out.println("Vous avez choisit " + "id = " + resultat.getInt(1) + " " + " type = " + resultat.getString(2) + " "
						+ " nom = " + resultat.getString(3) + " " + " vie = " + resultat.getInt(4) + " "
						+ " atk = " + resultat.getInt(5) + " " + " arme/sort = " + resultat.getString(6));
				Magicien joueur = new Magicien(resultat.getString(3), resultat.getInt(4), resultat.getInt(5));
				return joueur;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Requête failed: ");
		}
		return null;
	}

	public void requestInsert() {
		try {
			statement = connection.createStatement();
			int statut = statement.executeUpdate("INSERT INTO jeu.hero (Nom) VALUES ('karl')");
			JOptionPane.showMessageDialog(null, "Requête réussi: ");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Requête failed: ");
		}
	}

	public void requestDelete() {
		try {
			statement = connection.createStatement();
			int statut = statement.executeUpdate("DELETE FROM jeu.hero WHERE id = 4");
			JOptionPane.showMessageDialog(null, "Requête réussi: ");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Requête failed: ");
		}
	}
}
