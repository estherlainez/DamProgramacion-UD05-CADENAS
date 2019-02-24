package Ejemplos;
import java.util.Arrays;

public class Ejemplo1_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//1)Asignacion de caracteres
		char c;
		
		c='a';//asignación de caracter 
		System.out.println(c);
		c='\u0061';//asignacion de caracter mediante unicode(numero hexadecimal)
		System.out.println(c);
		c=97;//Asignacion de caracter mediante unicode(numero decimal)
		System.out.println(c);
		c='\u2661';
		System.out.println(c);
		c=9825;
		System.out.println(c);
		
	//2)Secuencias de escape
		System.out.println('\"'+"PEPE"+'\"');//Escribir en consola, tenemos que usar una secuencia de escape
		System.out.println("\t");            //Usar una secuencia de escape
		System.out.println("\n");
		
	//3)Conversion de caracteres y ejemplo de la aritmetica de los caracteres
		char d='b';
		int f=(int)d;
		System.out.println(f);
		f=f+1;
		d=(char)f;
		System.out.println(d);
		//Conversion de mi nombre
		char e='e';
		e='\u0045';
		//System.out.println(e);
		char s='s';
		s='\u0053';
		//System.out.println(s);
		char t='t';
		t='\u0054';
		//System.out.println(t);
		char h='h';
		h='\u0048';
		//System.out.println(h);
		 e='e';
		e='\u0045';
		//System.out.println(e);
		char r='r';
		r='\u0052';
		//System.out.println(r);
		
		//Conversion de mi nombre en array
		char array[]= {'\u0045','\u0053','\u0054','\u0048','\u0045','\u0052'};
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		
		//4)Estudio de metodos de la clase character
		//dentro de los caracteres diferenciamos que son digitos
		
		boolean esDigito;
		char o='5';
		esDigito=Character.isDigit(o);
		if(esDigito==true) {
			System.out.println("El caracter introducido es un numero");
		}else {
			System.out.println("El caracter introducido NO es un numero");
		}
		
		
		boolean esLetra;
		char z='t';
		esLetra=Character.isLetter(z);
		System.out.println(esLetra);
		
		//discriminamos las letras y los digitos del resto de los caracteres tales como % & ...
		boolean esLetraoDigito;
		char g='b';
		esLetraoDigito=Character.isLetterOrDigit(g);
		System.out.println(esLetraoDigito);
		
		//discriminamos si el caracter es una letra mayuscula	
		char y='T';
		boolean esMayuscula;
		esMayuscula=Character.isUpperCase(y);
		System.out.println(esMayuscula);
		esMayuscula=Character.isLowerCase(y);
		System.out.println(esMayuscula);
		
		//discriminaremos si el caracter pasado como parametro de entrada
		//es un espacio '  '
		char i=' ';//char con comillas simples y String con comillas dobles
		boolean esEspacioEnBlanco;
		esEspacioEnBlanco=Character.isSpaceChar(i);
		System.out.println(esEspacioEnBlanco);
		
		//boolean isWhiteSpace(char c) amplia el metodo anterior y determina que el 
		//caracter pasado es cualquier tipo de blanco
		//Los caracteres que hacen que el metodo de true como resultado son
		//   -'\n'
		//   -' '
		//   -'\t'
	
		boolean isBlanco=Character.isWhitespace(i);
		System.out.println(isBlanco);
		
		/*5) Conversion de caracteres
		Veamos metodos que devuelven transformado el valor que se le pasa como parametro.
		normalmente un caracter, en otro caracter o en un valor de tipo distinto
		*/
		//5.1)Funcion char toLowerCase(char c)
		char j='T';
		System.out.println(j);
		j=Character.toLowerCase(j);
		System.out.println(j);
		j=Character.toUpperCase(j);
		
		//5.2)Conversion de caracter a otro tipo de datos
		//funcion Digit(char c, int base): devuelve el valor numerico de un caracter
		//c en la base indicada, Si no es posible realizar la conversion devuelve -1
		
		char l='9';//quiero que me devuelva el valor en base diez, teniendo en cuenta que es un hexadecimal
		int ll;
		ll=Character.digit(l, 10);
		System.out.println("el caracter "+l+" corresponde al numero entero "+ll);
		
		l=Character.forDigit(ll, 10);
		
	}

}
