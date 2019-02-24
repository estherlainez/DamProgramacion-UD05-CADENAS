package Ejercicios;
import java.util.Scanner;
public class EJ01_LongitudPalabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner teclado=new Scanner(System.in);
		
		//introducir por teclado dos palabras e indicar cual de ellas es la mas corta,es decir,
		//la que contiene menos caracteres
		
		//public static int length(String)
		
		String palabra1;
		String palabra2;
		int longitud1;
		int longitud2;
		System.out.println("Introduzca palabra 1");
		palabra1=teclado.nextLine();
		System.out.println("Introduzca palabra 2");
		palabra2=teclado.nextLine();
		longitud1=palabra1.length();
		longitud2=palabra2.length();
		if(longitud2>longitud1) {
			System.out.println(palabra2+" es mas larga que "+palabra1+" con "+longitud2+" letras");
		}else {
			System.out.println( palabra1 +" es mas larga que "+ palabra2 +" con "+longitud1+" letras");
		}
	}

}
