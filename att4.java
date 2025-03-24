package att8Java;


import java.util.HashSet;
import java.util.Scanner;

public class att4 {
public static void main(String[] args) {
	
	Scanner lerScanner = new Scanner(System.in);
	
	HashSet<Integer> numeros = new HashSet<>();
	
    numeros.add(2);
    numeros.add(5);
    numeros.add(1);
    numeros.add(3);
    numeros.add(4);
    numeros.add(9);
    numeros.add(7);
    numeros.add(8);
    numeros.add(10);
    numeros.add(6);
    
    for(int i = 0; i < 10; i++) {
		 System.out.println("Digite um numero: ");
		 int numeroDigitado = lerScanner.nextInt();
		 
		 if (numeros.contains(numeroDigitado)) {
			 System.out.println("O número " + numeroDigitado + " foi encontrado!");
		 }
		 else {
			 System.out.println("O número " + numeroDigitado + " não foi encontrado!");
		}
     break;    
	} 
}
}
