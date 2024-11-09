package no.hvl.dat100.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.*;
import no.hvl.dat100.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {

		Blogg bloggFraFil = new Blogg();
		
		String filePath = mappe+filnavn;
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader(filePath));
			
			String line;
			if((line = reader.readLine()) != null)
				bloggFraFil = new Blogg(Integer.parseInt(line));
			
			while ((line = reader.readLine()) != null) {
				
				String classData = "";
				
				System.out.print(TEKST + "  " + line);
				
				if(line.equals(TEKST))
				{
					for(int i = 0; i<5; i++)
						classData += reader.readLine()+"\n";

					String splitData[] = classData.split("\n");
					bloggFraFil.leggTil(getTekst(splitData));
				}
				
				if(line.equals(BILDE))
				{
					for(int i = 0; i<6; i++)
						classData += reader.readLine()+"\n";
					
					String splitData[] = classData.split("\n");
					bloggFraFil.leggTil(getBilde(splitData));
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("An error occurred while reading the file: " + e.getMessage());
			e.printStackTrace();
			
		} finally {
			
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				}
		}
		
		return bloggFraFil;
	}
	
	private static Tekst getTekst(String splitData[]) {
		
		int id = Integer.parseInt(splitData[0]);
		String bruker = splitData[1];
		String dato = splitData[2];
		int likes = Integer.parseInt(splitData[3]);
		String tekst = splitData[4];
				
		return new Tekst(id,bruker,dato,likes,tekst);
	}
	
	private static Tekst getBilde(String splitData[]) {
		
		int id = Integer.parseInt(splitData[0]);
		String bruker = splitData[1];
		String dato = splitData[2];
		int likes = Integer.parseInt(splitData[3]);
		String tekst = splitData[4];
		String url = splitData[5];
				
		return new Bilde(id,bruker,dato,likes,tekst,url);
	}

}















