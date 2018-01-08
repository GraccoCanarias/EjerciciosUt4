package com.cip.program;

import java.util.Scanner;

public class RadioCirculo {

	public static void main(String[] args) {
	
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdusca el RADIO");
		double RADIO = sc.nextDouble();
		
		     double AREA = Math.PI * Math.pow(RADIO, 2);
		
		     System.out.println("El AREA es " + AREA);
		
	   sc.close();
		

	}

}
