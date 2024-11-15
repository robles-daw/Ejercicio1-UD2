package Sumando;

import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
		
		System.out.println("Dime un numero");
		int numero1=input.nextInt();
		System.out.println("Dame otro numero");
		int numero2=input.nextInt();
		System.out.println(numero1+numero2);
		
		
		input.close();

	}

}
