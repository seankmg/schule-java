package einkaufszettel;

import java.util.*;

/*
 * Das Programm hab ich orientiert an der Dokumentation von
 * der Seite: https://courses.cs.washington.edu/courses/cse341/98au/java/jdk1.2beta4/docs/api/java/util/List.html
 * geschrieben.
 * 
 * Manche Methoden habe ich von dort.,
 * 
 * Einfach ausführen und die Konsole anschauen
 * 
 * Sean Gaenicke
 */


public class einkaufszettel {
	
	static List<String> Einkaufszettel = new ArrayList<String>(); // Erstelle List

	public static void main(String [] args) {
	
	System.out.println("- - - init - - -");
	System.out.println("");
	einkaufszettel.newElement("Banane"); // Füge Banane hinzu, newElement eigene Methode
	einkaufszettel.newElement("Apfel");  // Füge Apfel hinzu
	einkaufszettel.newElement("Zitrone"); // Füge Zitrone hinzu
	System.out.println("- - - end init - - -");
	System.out.println("");
	
	ausfuehren();
	}
	
	
	public static void ausfuehren() {
		
		einkaufszettel.delElement("Banana"); // Versucht BananA zu entfernen, gibt es aber nicht auf der Liste
		System.out.println("READ> "+Einkaufszettel.get(1)); // Gibt nun den zweiten(1) Eintrag "Apfel" aus
		einkaufszettel.delElement("Apfel"); // Entfernt Apfel aus der Liste
		einkaufszettel.newElement("Mango"); // Fügt Mango hinzu, wenn noch nicht bereits vorhanden 
		einkaufszettel.listeAusgeben(); // Gibt Liste aus
		
	}
	
	
	
	public static String delElement(String e) { // Löscht das angebenene Produkt (String)
		if (Einkaufszettel.contains(e)) {
		Einkaufszettel.remove(e);
		System.out.println("DEL> Das Produkt, "+e+", wurde erfolgreich entfernt.");
		return null;
		} else {
			System.out.println("!DEL> Das Produkt, "+e+", steht nicht auf deiner Liste.");
			return null;
		}
	}
	
	
	
	
	public static void listeAusgeben() { // Gibt den aktuellen kompletten Einkaufszettel aus
		System.out.println("");
		System.out.println("- - - Dein Einkaufszettel - - -");
		for (int i = 0; i < Einkaufszettel.size(); i++) {
			System.out.println("READ> ["+i+"] "+Einkaufszettel.get(i));
		}
		System.out.println("- - - - - - - - - - - - - - - -");
		
	}
	
	
	public static String newElement(String e) { // Fügt das angebenene Produkt (String) hinzu
		
		if (!Einkaufszettel.contains(e)) {
			Einkaufszettel.add(e);
			System.out.println("ADD> Das Produkt, "+e+", wurde dem Einkaufszettel erfolgreich hinzugefügt.");
			return null;
		} else {
			System.out.println("!ADD> Das Produkt, "+e+", ist bereits auf dem Einkaufszettel.");
			return null;
		}
		
	}
	
	
}

