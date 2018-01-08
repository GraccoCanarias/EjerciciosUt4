package com.cip.program;

import java.util.Scanner;

public class ValorMenor {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner (System.in);
			
			System.out.println("Introdusca VALOR 1º");
			double valor1 = sc.nextDouble();
			
			System.out.println("Introdusca VALOR 2º");
			double valor2  = sc.nextDouble();
			
				double valormenor = Math.min(valor1,valor2);
						
				System.out.println("El Valor Menor es " + valormenor);
			
			sc.close();	
		
			

	}

}
