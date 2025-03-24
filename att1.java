package att8Java;

import java.util.ArrayList;
import java.util.Scanner;

public class att1 {
public static void main(String[] args) {
	Scanner lerScanner = new Scanner(System.in);
	 ArrayList<String> cores = new ArrayList<String>();
	 
	 System.out.println("Digite 5 cores");
	 
	 
	 for(int i = 0; i < 5; i++) {
		 System.out.print("Cor " + (i + 1) + ": ");
         cores.add(lerScanner.nextLine()); 
	} 
	 
	 System.out.println();
	 System.out.println("Listar todas as cores:");
	 System.out.println(cores);
	 
	 System.out.println("______________________________________");
	 
	 cores.sort(null); 
	 System.out.println("\nLista Ordenada:");
     for (String cor : cores) {
         System.out.println(cor);
     }
     

     lerScanner.close();
	 
}
}
