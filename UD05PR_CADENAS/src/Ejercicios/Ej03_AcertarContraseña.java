package Ejercicios;
import java.util.Scanner;
public class Ej03_AcertarContraseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String palabra="";
		System.out.println("Jugador 1 introduce palabra");
		
		String contraseña=teclado.nextLine();
		int pos;
		int longitudC=contraseña.length();
		int longitudP=palabra.length();
		
		char[]array=contraseña.toCharArray();
		for (int i=0;i<contraseña.length();i++) {
			//System.out.println("[" + i + "] " + array[i]);
		}
		char[]array1=palabra.toCharArray();
		for (int j=0;j<palabra.length();j++) {
			//System.out.println("[" + j + "] " + array[j]);
		}
		System.out.println("Jugador 2 introduce palabra");
		do {
			palabra=teclado.nextLine();
			if(palabra.length()==contraseña.length()) {
				System.out.println("Jugador 2 la palabra tiene los mismos caracteres que la introducida");
			}else if(palabra.length()>contraseña.length()) {
				System.out.println("Jugador 2 la palabra es de mas caracteres que la contraseña");
			}else if(palabra.length()<contraseña.length()) {
				System.out.println("Jugador 2 la palabra es de menos caracteres que la contraseña");
			}
			
			char characterC=contraseña.charAt(0);
			char characterP=palabra.charAt(0);	
			
			if(contraseña.charAt(0)==palabra.charAt(0)) {
				System.out.println("El primer caracter es correcto, es la letra "+characterC);
			}
			
			 
			char ultimoC=contraseña.charAt(contraseña.length()-1);
			char ultimoP=palabra.charAt(palabra.length()-1);
			
			if(contraseña.charAt(contraseña.length()-1)==palabra.charAt(palabra.length()-1)) {
				System.out.println("El ultimo caracter es correcto, es la letra "+ultimoC);
			}
			
		}while(!palabra.equals(contraseña));
		
		if(palabra.equals(contraseña)) {
			System.out.println("FELICIDADES!!! ERES UN GENIO, HAS ACERTADO!!!");
				
		}	  
	}

}
