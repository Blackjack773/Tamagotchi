package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import model.Tamagotchi;

public class Utilitaires {

	public static String saisieString() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s;
	}

	public static int saisieInt() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}

	public static int randomNumber(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	public static void eraseTamagotchi(String file) throws FileNotFoundException {
		File f = new File(file);
		Scanner scanner = new Scanner(file);
		PrintWriter writer = new PrintWriter(file);

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String newLine = "";
			writer.println(newLine);
		}
	}

	public static void saveTamagotchi(Tamagotchi tama, String file) throws IOException {
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Nom: " + tama.getNom());
		bw.write("\nEnergy: " + tama.getEnergy());
		bw.write("\nForce: " + tama.getForce());
		bw.write("\nJoie: " + tama.getJoie());
		bw.write("\nFaim: " + tama.getFaim());
		bw.write("\nFatigue: " + tama.getFatigue());
		bw.write("\nProprete: " + tama.getPropreté());
		bw.write("\nMalusForce: " + tama.getMalusForce());
		bw.newLine();
		bw.close();
	}
	
	public static void loadTamagotchi(Tamagotchi tama, String file) {
		File f = new File(file);
		Scanner scanner = new Scanner(file);
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			for (int i = 0; i < line.length(); i++){
		        if (scanner.next()=="") { 
		            
		        }
		    }
		    }
		}
		
	}
