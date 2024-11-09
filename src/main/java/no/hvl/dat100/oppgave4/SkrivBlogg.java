package no.hvl.dat100.oppgave4;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		String filePath = mappe+filnavn;
		
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(filePath));
			
			String write = samling.toString();
			writer.write(write);
			System.out.println("Content written to file successfully.");
			
		} catch (Exception e){
			System.out.println(e.getMessage());
			return false;
			
		} finally {
            
            try {
                if (writer != null) 
                    writer.close();
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return false;
            }
		}
		return true;
	}
}
	
	
	
	
	
	
	
