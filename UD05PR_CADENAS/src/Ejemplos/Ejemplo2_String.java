package Ejemplos;

public class Ejemplo2_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int alumnos[]=new int[5];
		
		String cadena="en un lugar de la mancha";
		
		//Si quiero poner comillas en un String usamos los caracteres de escape
		cadena="En un \"lugar\" de la mancha";
		System.out.println(cadena);
		
		/*Funcion para transformar un dato de otro tipo a STRING
		 * 
		 * static String valueOf (tipo valor);
		 */
		double numero=1234.56;
		int dni=23454212;
		cadena=String.valueOf(dni);
		
		//Funcion para hacer comparaciones
		
		String respuesta="hola mundo";
		String correcta="hola mundo";
		boolean  iguales;
		if(iguales=respuesta.equals(correcta)) {
			System.out.println("Has acertado, puedes pasar");
		}else {
			System.out.println("No puedes pasar");
			
		}
		
		
		//concatenacion: el operador + sirve para unir 2 cadenas
		dni=23454212;
		cadena=String.valueOf(dni);
		String letra="E";
		String nif=cadena+"-"+letra;
		System.out.println(nif);
		
		//Saber longitud de cadena
		int longitud=nif.length();
		System.out.println(longitud);
		
		//Obtencion de caracteres
		/*char charAt (int posicion): que devuelve el caracter que ocupa el indice posicion en la cadena
		 * que invoca el metodo. Hay que tener mucha precaucion con no utilizar una posicion que se encuentre
		 * fuera de rango, ya que esto provocara un error y la terminacion abrupta del programa.
		 * Veamos un ejemplo:
		 
		 */
		String frase="nacio con el don de la palabra";
		frase.toUpperCase();
		char character=frase.charAt(0);
		System.out.println("Ejemplo de charAt:"+character);

		
		/*Obtencion de subcadenas
		 * String substring (int inicio): devuelve la subcadena formada desde la posicion inicio
		 * hasta el final de la cadena. Lo que se devuelve es una copia y la cadena invocante 
		 * no se modifica
		 * */
		String cad="una mañana, al despertar";
		String cad2=cad.substring(5);
		System.out.println(cad2);
		String cad3=cad.substring(5, 12);
		System.out.println("Ejemplo de substring:"+cad3);
		
		/*
		 * String trim(): que devuelve una copia de la cadena eliminando, al principio y al final caracteres blancos.
		 * La cadena invocante no se modifica
		 * 
		 * */
		cad="   ,      ,este es un texto";
		String cad4;
		cad4=cad.trim();
		System.out.println("ejemplo de trim:"+cad4);
		
		/*funcion indexOf (int c, int inicio) busca la primera ocurrencia del caracter c,
		 * pero en lugar de  comenzar a buscar en la posicion 0 lo hace desde la posicion inicio en adelante. 
		 * Devuelve el indice del elemento buscado si lo encuentra,
		 * o -1 en caso contrario.
		 * Tambien podemos buscar una cadena dentro de otra cadena
		 * funcion indexOf (String cade,a int Inicio);
		 * */
		int pos;
		String cad5="Mi perro pequines se llama perico";
		pos=cad5.indexOf('q');
		System.out.println("EjemplodeIndexOf:"+pos);
		int pos2=cad5.indexOf('q',pos+1);
		System.out.println("ejemplo de indexOf:"+pos2);
		
		
		//convertir una cadena en un array de caracteres
		String sCadena="Esto es una cadena";
		//char[]aCaracteres;
		char[]aCaracteres=sCadena.toCharArray();
		
		for (int x=0;x<aCaracteres.length;x++)
			  System.out.println("[" + x + "] " + aCaracteres[x]);
		
	}

}
