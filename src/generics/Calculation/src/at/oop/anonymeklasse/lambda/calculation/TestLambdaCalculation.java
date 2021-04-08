package generics.Calculation.src.at.oop.anonymeklasse.lambda.calculation;

//Hoelen Sie von diese Package die Klassen fuer diese Aufgabe:
//package com.standards.B_CollectionMapProperties

//Thema: Lambda Expressions

// Allgemeine Infos ueber Lambda Expressions
//A) Grundgedanken stammt aus Mathematik
//B) Lamda Expr. hat mit funktionale Programmierung zu tun.
//C) Das heisst, Lamda ist nicht Objektorientiert
//D) Java verschmeltzt OOP mit Funktionale Programmiersprache mit Hilfe von Lamda Expr.
//E) Unter bestimmte Bedingungen kann man Anonyme Klassen 
//mit Lamda Expressions darstellen. 
//F)        Lambda -operator     -> ist Lambda operator
//G) -> Operator teilt eine Lamda Expr. in zwei Teilen. d.h.:

//H) (Linke seite) -> (Rechte Seite)

//*******************************************************************************//
//I) Linke Seite: Hier stehen die Parametern die In Rechte seite verwendet werden
//*******************************************************************************//
//J) Die Parametern werden in Runden Klammern gesetzt.
//K) Mehrere Parametern werden mit "," komma getrennt.
//L)       () ->
//d.h. Hier brauchen wir keine Parameter
//M)     int a ->
//schreibt man , wenn nur eine einzige Parameter benoetigt wird
//N) 	(int a, int b) -> 
// Die Angabe der Datentypen ist nicht erforderlich, java findet selbst heraus!!
//O) d.h. :  Die Datentypen koennen weg gelassen werden:
// bsp.)			(a,b) ->
//verwenden Sie ueberall Datentyp oder nirgendswo
//Im hintergrund arbeitet java mit datentypen
//*******************************************************************************//
//P) Rechte Seite: Hier stehen die Lambda Anweisungen, die ausgefuehrt werden muessen
//*******************************************************************************//
//Q) 			(a , b) -> a + b;
//R)  Rechte seite> a + b : nennt man Lambda -Body
//Innerhalb dieser Anweisung werden die Variablen der Linke Seite verwendet.
//S)  Die Oben stehende Anweisung ist anonyme zu:
//				(a , b) -> {return a + b; };  //Achtung ; am Ende
//T)   Wenn nur eine einzige Anweisung vorhanden ist, brauchen wir nicht { } zu schreiben
//V)	return kann auch weggelassen werden.

// Schritt 1:
//erstellen CalculatorInterface

public class TestLambdaCalculation {
	public static void main(String[] args) {
		// Schritt 2
		// Wir benuetzen CalculatorInterface um eine Anonyme Klasse zu
		// definieren

		CalculatorInterface calc = new CalculatorInterface() {

			@Override
			public int add(int a, int b) {

				return a + b;
			}
		};

		System.out.println(calc.add(12, 10));

		// Schritt 3 :
		// Wir beuetzen die Lambda Expressions hier, um den Inhalt der
		// Anonyme -Klasse zu ersetzen: d.h :
		// Ausdruck von Oben wird so formuliert:

		CalculatorInterface calc_2 = (int a, int b) -> {
			return a + b;
		};

		// man kann also das interface genau so gut mit hilfe von Lambda benuetzen.
		// also eine Lamda expression an interface zuweisen
		System.out.println(calc_2.add(22, 10));

		// Schritt 4 :
		// Auf Typen der variablen kann man beim Einsatz von Lamda Expr.
		// verzichten.Java kann selbst heraufinden:

		CalculatorInterface calc_3 = (a, b) -> {
			return a + b;
		};

		// man kann also das interface genau so gut mit hilfe von Lambda benuetzen.
		// also eine Lamda expression an interface zuweisen
		System.out.println(calc_3.add(32, 10));

		// Schritt 5 :
		// ...auch koennen wir auf "return" verzichten,
		// wenn es sich ,wie Hier, um eine einzige Anweisung handelt.

		CalculatorInterface calc_4 = (a, b) -> {
			return a + b;
		};

		// man kann also das interface genau so gut mit hilfe von Lambda benuetzen.
		// also eine Lamda expression an interface zuweisen
		System.out.println(calc_4.add(42, 10));

	}

}
