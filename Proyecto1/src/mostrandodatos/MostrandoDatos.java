package mostrandodatos;

import java.util.Scanner;

public class MostrandoDatos {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		System.out.println("Dime tu nombre");
		String nombre=input.nextLine();
		System.out.println("Dame tu apellido");
		String apellido=input.nextLine();
		System.out.println(nombre+" "+apellido);
		
		
		input.close();

	}

}
