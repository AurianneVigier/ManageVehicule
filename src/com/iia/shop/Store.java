package com.iia.shop;

import java.util.ArrayList;
import java.util.Scanner;

import com.iia.shop.entity.Vehicule;

public class Store {

	private static ArrayList<Vehicule> vehicules;
	private static Scanner sc;
	
	public static void main(String[] args) {
		vehicules = new ArrayList<Vehicule>();
		
		assets(); // voitures crees par defaut
		
		System.out.println("Gestion des vehicules");
		System.out.println("1- Creer un vehicule");
		System.out.println("2- Mettre a jour un vehicule");
		System.out.println("3- Voir tous les vehicules");
		System.out.println("4- Selectionner un vehicule");
		System.out.println("5- Supprimer un vehicule");
		
		System.out.println("Entrez votre choix");
		
		sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		Vehicule vehicule;
		
		
		switch(choice){
			case 1:
				vehicule = new Vehicule();
				
				setVehicule(vehicule);
				
				create(vehicule); // ajout du vehicule dans la liste
				break;
			case 2:
				System.out.println("Saisissez le numero du vehicule");
				Vehicule readVehicule = read(sc.nextInt());
				
				displayVehicule(vehicule);
				
				
				
				
				break;
			case 3:
				ArrayList<Vehicule> vehicules = readAll();
				
				for (Vehicule vehicule2 : vehicules) {
					displayVehicule(vehicule2);
				}
				break;
			case 4:
				System.out.println("Saisissez le numero du vehicule");
				Vehicule readVehicule2 = read(sc.nextInt());
				
				displayVehicule(vehicule);
				
				setVehicule(vehicule);
				break;
			case 5:
				System.out.println("Saisissez le numero du vehicule");
				delete(sc.nextInt());
				break;
			default:
				break;
		}
	}
	
	private static void create(Vehicule vehicule){
		vehicules.add(vehicule);
	}
	
	private static void delete(int index, Vehicule vehicule){
		vehicules.remove(index);
	}
	
	private static ArrayList<Vehicule> readAll(){
		return vehicules;
	}
	
	private static Vehicule read(int index){
		return vehicules.get(index);
	}

	private static void displayVehicule(Vehicule vehicule){
		System.out.println("Marque : " + vehicule.getBrand());
		System.out.println("Annee : " + vehicule.getYear());
		System.out.println("Vitesse : " + vehicule.getSpeed());
		System.out.println("Modele : " + vehicule.getModel());
		System.out.println("Couleur : " + vehicule.getColor());
		System.out.println("Prix : " + vehicule.getPrice());
	}
	
	private static void setVehicule(Vehicule vehicule){
		System.out.println("Saisissez la marque du vehicule"); // on demande avant
		vehicule.setBrand(sc.next()); // cette ligne recupere la saisie de l'utilisateur
		
		System.out.println("Saisissez l'annee du vehicule");
		vehicule.setYear(sc.nextInt());
		
		//System.out.println("Saisissez la vitesse du vehicule");
		//vehicule.setSpeed(sc.nextInt());
		
		System.out.println("Saisissez le modele du vehicule");
		vehicule.setModel(sc.next());
		
		System.out.println("Saisissez la couleur du vehicule");
		vehicule.setColor(sc.next());
		
		System.out.println("Saisissez le prix du vehicule");
		vehicule.setPrice(sc.nextDouble());
	}
	
	private static void assets(){
		Vehicule v1 = new Vehicule("Peugeot", 2012, 150, "208", "Grise", 15000);
		Vehicule v2 = new Vehicule("Renault", 2014, 100, "Twingo", "Rouge", 1200);
		vehicules.add(v1);
		vehicules.add(v2);
	}
}
