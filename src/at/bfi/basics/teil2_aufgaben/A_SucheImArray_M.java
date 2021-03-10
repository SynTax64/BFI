package at.bfi.basics.teil2_aufgaben;

public class A_SucheImArray_M {

	public static boolean searchNumberInArray(double searchNumber, double[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == searchNumber) {
				return true;
			}
		}
		return false;
	}

	public static boolean searchNameInArray(String searchName, String[] names) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(searchName)) {
				return true;
			}
		}
		return false;
	}

	public static int searchIndexInArray(String searchName, String[] names) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(searchName)) {
				return i;
			}
		}
		return -1;
	}

	public static int searchIndexInArray(double searchNumber, double[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == searchNumber) {
				return i;
			}
		}
		return -1;
	}

	public static void ausgabe(double nummer, double[] myNumbers) {
		String output = "";
		for (int i = 0; i < myNumbers.length; i++) {
			if (myNumbers[i] == nummer) {
				output += "Die Nummer \"" + nummer + "\" wurde auf dem Index " + i + " gefunden.\n";
			}
		}

		if (output.length() == 0) {
			System.out.println("Es wurde keine Nummber \"" + nummer + "\" im Feld gefunden.");
		} else {
			System.out.println(output);
		}
	}

	public static void ausgabe(String name, String[] myNamesArray) {
		String output = "";
		for (int s = 0; s < myNamesArray.length; s++) {
			if (myNamesArray[s].equals(name)) {
				output += "Der Name \"" + name + "\" wurde auf dem Index " + s + " gefunden.\n";
			}
		}

		if (output.length() == 0) {
			System.out.println("Es wurde kein Name \"" + name + "\" im Feld gefunden.");
		} else {
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		String[] myArrayNames = { "Jan", "Karl", "Donald", "Gustav", "Marc", "Jan", "David", "Niko", "Jan" };
		double[] myArray = { 51, 100, 21, 30, 29, 15, 8, 12, 45, 85, 25, 11, 25, 35, 45, 25, 65, 10, 2, 25 };
		ausgabe(25, myArray);
		ausgabe("Jan", myArrayNames);

	}

}
