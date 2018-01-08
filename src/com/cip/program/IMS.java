package com.cip.program;

import java.util.Scanner;

public class IMS {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introdusca su peso");
		double peso = sc.nextDouble();
		
		System.out.println("Introdusca su altura en metros");
		double altura = sc.nextDouble();
		
			double imc = peso / Math.pow(altura, 2.0);
			System.out.println("Su IMC es " + imc);
		
		sc.close();	

		
		
	}

}
