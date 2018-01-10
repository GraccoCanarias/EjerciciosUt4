package com.cip.program;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Redondeo {

	public static void main(String[] args) {
	
        Scanner sc = new Scanner (System.in);
		
		System.out.println("Introdusca valor nº1");
		double valor1= sc.nextDouble();
		
		System.out.println("Introdusca valor nº2");
		double valor2 = sc.nextDouble();
		
			double dividir = valor1 / valor2;
			
			DecimalFormat df = new DecimalFormat();
			df.setMaximumFractionDigits(2);
			System.out.println(df.format(dividir));
		
		sc.close();	

	}

}
