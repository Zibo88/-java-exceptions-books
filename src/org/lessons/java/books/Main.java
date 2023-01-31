package org.lessons.java.books;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner data = new Scanner(System.in);
		
		Book nuovoLibro;
		
		String titolo="";
		int numeroPagine=0;
		String autore="";
		String editore="";
		
		int n = 2;
		Book[] libreria = new Book[n];
		
			try {
				for(int i = 0; i < n; i++) {
				System.out.println("Dimmi il titolo del libro");
				titolo = data.nextLine().toLowerCase().trim();
				
				try {
					System.out.println("Dimmi il numero delle pagine del libro");
					numeroPagine = Integer.parseInt(data.nextLine());
				}catch(Exception e) {
					numeroPagine = 0;
				}
				
				System.out.println("Dimmi chi ha scritto questo libro");
				autore = data.nextLine();
				System.out.println("Dimmi l'editore di questo libro");
				editore = data.nextLine();
				
				nuovoLibro = new Book(titolo, numeroPagine, autore, editore);
				nuovoLibro.setTitolo(titolo);
				nuovoLibro.setNumeroPagine(numeroPagine);
				nuovoLibro.setAutore(autore);
				nuovoLibro.setEditore(editore);
			
				libreria[i] = nuovoLibro;
					
					for(int j = 0; j < libreria.length;j++) {
						System.out.println("La tua libreria presenta questi libri:" + " "+libreria[j]);
					}
				}
				
			}catch(Exception e) {
				System.out.println("errore di validazione, non è possibile istanziare un nuovo libro");
				return;
			}finally {
				data.close();
			}
	}

}
