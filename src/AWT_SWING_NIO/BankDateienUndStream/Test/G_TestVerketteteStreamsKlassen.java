package AWT_SWING_NIO.BankDateienUndStream.Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class G_TestVerketteteStreamsKlassen {

	// Package Java.long
	// Thema Verkettung mehrere Stream -Klassen

	public static void main(String[] args) {

		String dateiName = "E:\\\\eclipse-java-2019-03"
				+ "\\\\BankDateienUndStream\\\\src\\\\at\\\\bfi\\\\standards\\\\D_DateienUndStream\\\\data.bin";
		schreiben(dateiName);
		lesen(dateiName);

	}

	private static void lesen(String dateiName) {
		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dateiName)))) {

			String name = "Mueler";
			int alter = 30;
			double groesse = 1.82;

			out.writeUTF(name);
			out.writeInt(alter);
			out.writeDouble(groesse);
		} catch (FileNotFoundException e) {
			System.out.println("File nicht gefunden! beim Schreiben:  " + e.getMessage());
		} catch (IOException e1) {

			System.out.println("IOException!  beim Schreiben:  " + e1.getMessage());
		}

	}

	private static void schreiben(String dateiName) {
		try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(dateiName)))) {

			String name = input.readUTF();
			int alter = input.readInt();
			double groesse = input.readDouble();

			System.out.println("Name: " + name + " Alter: " + alter + " Groesse: " + groesse);
		} catch (FileNotFoundException e) {
			System.out.println("File nicht gefunden! : beim Lesen: " + e.getMessage());
		} catch (IOException e1) {

			System.out.println("IOException! beim Lesen: " + e1.getMessage());
		}

	}

}
