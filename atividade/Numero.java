package atividade;

import java.util.Scanner;

public class Numero {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[10];
					
		System.out.println("Dê 10 números: ");
		for (int i = 0; i < 10; i++) {
			num[i] = scanner.nextInt();
			
			Somar calc = new Somar();
			
			int somar = calc.numeros(num);
			System.out.println("\nResultado da soma:" + somar);
		}


	}
}
