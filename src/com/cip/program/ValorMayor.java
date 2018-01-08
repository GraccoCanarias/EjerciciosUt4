package com.cip.program;

import java.util.Scanner;

public class ValorMayor {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner (System.in);
		
		System.out.println("Introdusca VALOR 1º");
		double valor1 = sc.nextDouble();
		
		System.out.println("Introdusca VALOR 2º");
		double valor2  = sc.nextDouble();
		
			double ValorMayor = Math.max(valor1,valor2);
					
			System.out.println("El Valor Mayor es " + ValorMayor);
		
		sc.close();	
		

	}

}
