package Exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class VetorNomes {
public static void main(String[] args) {
	
	  Scanner scanner = new Scanner(System.in);
	  
	String [] nome = new String [20];
	
	for (int i = 0; i < 10; i++) {
         System.out.print("insira um nome: ");
         nome [i] = scanner.nextLine();	        }

     Arrays.sort(nome);

     System.out.println("\n Lista em Ordem Alfabética:");
     for (String n : nome) {
         System.out.println(n);
     }
}
}
