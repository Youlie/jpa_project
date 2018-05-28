package com.aplose.smooss.model;

import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CarPoolingMainTest {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY  )
	private long id;
	

	public static void main(String[] args) 
	
	{

System.out.println("Classe CarPooling");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Veuillez entrer l'adresse de départ :");
		String departAdress = scan.nextLine();
		
		System.out.println("Veuillez entrer l'adresse d'arrivée :");
		String arriveeAdress = scan.nextLine();
		
		System.out.println("Veuillez entrer le nombre de place du véhicule :");
		String nbPlaces = scan.nextLine();
		
		System.out.println("Veuillez entrer une description du véhicule :");
		String carDescription = scan.nextLine();
		
		System.out.println("Veuillez préciser si c'est un aller retour :");
		String allerRetour = scan.nextLine();
		
		System.out.println("Veuillez entrer l'heure de départ du covoiturage :");
		String departureTime = scan.nextLine();
		
		System.out.println("Veuillez entrer l'heure de retour en cas d'aller-retour :");
		String departureBackTime = scan.nextLine();
		
		scan.close();
		
	//PENSER A ENLEVER LE SYSTEM OUT DE NOTE DE DEV		

		System.out.print("NOTE DEV AFFICHAGE VARIABLES " +arriveeAdress + " " +departAdress + " " +nbPlaces + " " +carDescription + " " +allerRetour + " " +departureTime + " " +departureBackTime + " ");
				
	}
}