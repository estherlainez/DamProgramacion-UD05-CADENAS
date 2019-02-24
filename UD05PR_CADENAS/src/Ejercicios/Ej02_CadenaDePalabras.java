package Ejercicios;
import java.util.Scanner;
public class Ej02_CadenaDePalabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String cadena = "",palabra;
		System.out.println("Escriba la frase");
		palabra=teclado.nextLine();
		String a=" ";	
		String fin="fin";
		
		while(!palabra.equals(fin)) {
			cadena=cadena+a+palabra;
			palabra=teclado.nextLine();
			System.out.println(cadena);
		}
		
		if(palabra.equals(fin)) {
			System.out.println("Esto es todo....fin!!!");
		}

		
	}

}
