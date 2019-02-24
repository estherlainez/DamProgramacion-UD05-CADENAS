package Ejercicios;
import java.util.Arrays;
import java.util.Scanner;
public class juegoDelAhorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int pos=0,posA=0,j=0;
		int intentos=0;
		int fallos=0, aciertos=0;
		int vidas=3;
		int posicion=0;
	
		
		String[] palabra= { "ordenador","impresora","programacion","tecnologia","informatico","contraseña","algoritmo","parametro","solicitud","mantenimiento"};
		
		pos=(int) (Math.random()*10);
		
		String letra;
		System.out.println(palabra[pos]);
		String p =palabra[pos] ;
		
		int longitud=p.length();
		
		System.out.println("La palabra tiene  "+p.length()+" letras. Comenzamos el juego!!!");
		
		//Paso la palabra p a un array de caracteres
		char[]caracteres=p.toCharArray();
		
		for (int x=0;x<caracteres.length;x++) {
			  //System.out.print( caracteres[x]+"["  + x +  "] ");
			 
		}
		 System.out.println("");
		
		
		 
		do { //Pido letra y verifico que sea correcta
			
	            System.out.println("Ingresa una letra: ");
	            letra = teclado.nextLine();
	            System.out.println("letra:"+letra);
	    		
	        	  if(p.indexOf(letra) != -1){	
	            	posicion=0;
	            	
	                for (int i = 0; i <longitud; i++) {
	                    if (p.charAt(i) == letra.charAt(0)) {
	                        caracteres[i] = letra.charAt(0);
	                        posicion=i+1;
	                        intentos++;
	                        System.out.println("La letra "+letra+" es correcta y su posicion es "+posicion);
	                        aciertos=aciertos+1;
	                        
	                    } 
	                   
	                  }
	               }else {
	            	   posicion=-1;
	            	   intentos++;
		        	   intentos=aciertos+fallos;
		        	   
	               }
	        	 
	        	  
	        	  
	        	  if(posicion==-1) {
	        		  fallos=fallos+1;
	        		  
	        		 detectarFallos(fallos);
	        	  }
	        	  
	        	 
	        	 char[] tuRespuesta=new char[p.length()];
	        	 char tuLetra = letra.charAt(0);
	        	 
	        	
				//creo array de caracteres con mis respuestas
	        	 for(int i = 0; i < tuRespuesta.length; i++){
	 	            System.out.print(tuRespuesta[i] + "_ ");
	 	         }
	        	
	      		
	    	 
	        	
	        	   for ( j = 0; j < caracteres.length; j++){	  
	        			tuRespuesta[j] = '_';        			
	        			if (caracteres[j] == tuLetra) {
	        				tuRespuesta[j]=caracteres[j];	   
	        				caracteres[j] ='_';  
	        		     } 
	        			//System.out.print( tuRespuesta[j] +"  "); 
	        			
	        	  }
	        	
	        	 
	        	 
	        	  
	        	  System.out.println("\n ");
	        		
	        	  	System.out.println("                 JUEGO DEL AHORCADO                   ");
		            System.out.println("                                                      ");
		            System.out.println("        ACIERTOS="+aciertos+"           FALLOS="+fallos);
		            System.out.println("                                                      ");
		            System.out.println("             VIDAS="+vidas +"                         ");
		            
		            System.out.println("");
	        	  
	        	  
	        	  if(aciertos==longitud) {
	        		  System.out.println("HAS GANADO!!!ERES UN CRACK!!!");
	        		  System.out.println("La palabra era "+p);
	        	  }
	        	  if(fallos==8) {
	        		  System.out.println("GAME OVER....ERES UN TORPE!!!"); 
	        		 // System.out.println("La palabra era "+p);
	        		  vidas--;
	        		  aciertos=0;
	        		  fallos=0;
	        		  intentos=0;
	        		  System.out.println("Intente de nuevo");
	        	  }
	        	  if(vidas==0) {
	        		  System.out.println("GAME OVER....ADIOS MI TORPE!!!"); 
	        		  System.out.println("SUERTE PARA LA PROXIMA.....VUELVE PRONTO!!!"); 
	        		  }
	             
	      
		 } while (aciertos <= longitud && vidas != 0 );
			
		 
	}
	
	
	

	public static void detectarFallos(int fallos) {
		char a,b;
		a='\u03F9';
		b='\u039F';
	
		switch (fallos) {
		case 1:
			System.out.println("     ------------------------------------");
			System.out.println("    |                                    | ");
			System.out.println("    |                                    /\\ ");
			System.out.println("    |                                   /  \\ ");
			System.out.println("    |                                  /____\\ ");
			System.out.println("    |                                     |    ");
			System.out.println("    |                                    "+a+" ");
			System.out.println("    |                                                ");
			System.out.println("  -------                                            ");
			System.out.println("  |     |                                            ");
			System.out.println("  |     |                                            ");
			System.out.println("  |     |                                            ");
			System.out.println("  |     |                                            ");
			System.out.println("  |     |                                            ");
			System.out.println("  -------                                            ");
			System.out.println("                                                     ");
			break;
		case 2:
			System.out.println("     ------------------------------------");
			System.out.println("    |                                     | ");
			System.out.println("    |                                    /\\ ");
			System.out.println("    |                                   /  \\ ");
			System.out.println("    |                                  /____\\ ");
			System.out.println("    |                                     |    ");
			System.out.println("    |                                     "+b+" ");
			System.out.println("    |                                          ");
			System.out.println("  -------                                            ");
			System.out.println("  |     |                                            ");
			System.out.println("  |     |                                            ");
			System.out.println("  |     |                                            ");
			System.out.println("  |     |                                            ");
			System.out.println("  |     |                                            ");
			System.out.println("  -------                                            ");
			System.out.println("                                                     ");
			break;
		
		case 3:
			System.out.println("     --------------------------------------");
			System.out.println("    |                                     | ");
			System.out.println("    |                                     /\\ ");
			System.out.println("    |                                    /__\\ ");
			System.out.println("    |                                      |    ");
			System.out.println("    |                                   ^^^^^^^ ");
			System.out.println("    |                                   |-  - |    ");
			System.out.println("    |                                  (|  |  |)   ");
			System.out.println("  -------                               | ___ |            ");
			System.out.println("  |     |                                  |               ");
			System.out.println("  |     |                                                  ");
			System.out.println("  |     |                                                  ");
			System.out.println("  |     |                                                  ");
			System.out.println("  |     |                                                  ");
			System.out.println("  |     |                                                  ");
			System.out.println("  |     |                                                  ");
			System.out.println("  |     |                                                  ");
			System.out.println("  -------                                                  ");
			System.out.println("                                                           ");
			break;
		case 4:
			System.out.println("     --------------------------------------");
			System.out.println("    |                                     | ");
			System.out.println("    |                                     /\\ ");
			System.out.println("    |                                    /__\\ ");
			System.out.println("    |                                      |    ");
			System.out.println("    |                                   ^^^^^^^ ");
			System.out.println("    |                                   |-  - |    ");
			System.out.println("    |                                  (|  |  |)   ");
			System.out.println("  -------                               | ___ |            ");
			System.out.println("  |     |                           0 _____|               ");
			System.out.println("  |     |                                                  ");
			System.out.println("  |     |                                                  ");
			System.out.println("  |     |                                                  ");
			System.out.println("  |     |                                                  ");
			System.out.println("  |     |                                                  ");
			System.out.println("  |     |                                                  ");
			System.out.println("  -------                                                  ");
			System.out.println("                                                           ");
			break;
		case 5:
			System.out.println("     --------------------------------------");
			System.out.println("    |                                     | ");
			System.out.println("    |                                     /\\ ");
			System.out.println("    |                                    /__\\ ");
			System.out.println("    |                                      |    ");
			System.out.println("    |                                   ^^^^^^^ ");
			System.out.println("    |                                   |-  - |    ");
			System.out.println("    |                                  (|  |  |)   ");
			System.out.println("  -------                               | ___ |       ");
			System.out.println("  |     |                           0______|______0   ");
			System.out.println("  |     |                                             ");
			System.out.println("  |     |                                             ");
			System.out.println("  |     |                                             ");
			System.out.println("  |     |                                             ");
			System.out.println("  |     |                                             ");
			System.out.println("  -------                                             ");
			System.out.println("                                                      ");
			break;
		case 6:
			System.out.println("     --------------------------------------");
			System.out.println("    |                                     | ");
			System.out.println("    |                                     /\\ ");
			System.out.println("    |                                    /__\\ ");
			System.out.println("    |                                      |    ");
			System.out.println("    |                                   ^^^^^^^ ");
			System.out.println("    |                                   |-  - |     ");
			System.out.println("    |                                  (|  |  |)     ");
			System.out.println("  -------                               | ___ |      ");
			System.out.println("  |     |                           0______|______0  ");
			System.out.println("  |     |                                |    |      ");
			System.out.println("  |     |                                |    |      ");
			System.out.println("  |     |                                |    |      ");
			System.out.println("  |     |                                ------      ");
			System.out.println("  |     |                                            ");
			System.out.println("  |     |                                            ");
			System.out.println("  |     |                                            ");
			System.out.println("  -------                                            ");
			System.out.println("                                                     ");
			break;
		case 7:
			System.out.println("     --------------------------------------");
			System.out.println("    |                                     | ");
			System.out.println("    |                                     /\\ ");
			System.out.println("    |                                    /__\\ ");
			System.out.println("    |                                     |    ");
			System.out.println("    |                                   ^^^^^^^ ");
			System.out.println("    |                                   |-  - |    ");
			System.out.println("    |                                  (|  |  |)   ");
			System.out.println("  -------                               | ___ |     ");
			System.out.println("  |     |        ¡PELIGRO!          0______|______0  ");
			System.out.println("  |     |                                |    |      ");
			System.out.println("  |     |  ¡ESTAS A PUNTO DE             |    |      ");
			System.out.println("  |     |      PERDER....!               |    |      ");
			System.out.println("  |     |                                ------      ");
			System.out.println("  |     |                               //           ");
			System.out.println("  |     |                              //            ");
			System.out.println("  |     |                             //             ");
			System.out.println("  -------                                            ");
			System.out.println("                                                      ");
			break;
		case 8:
			System.out.println("     --------------------------------------");
			System.out.println("    |                                     | ");
			System.out.println("    |                                     /\\ ");
			System.out.println("    |             GAME OVER              /__\\ ");
			System.out.println("    |                                      |    ");
			System.out.println("    |                                   ^^^^^^^ ");
			System.out.println("    |                                   | - - |    ");
			System.out.println("    |                                  (|  |  |)   ");
			System.out.println("  -------   ¡¡¡TORPE!!!                 | ___ |            ");
			System.out.println("  |     |                           0______|______0        ");
			System.out.println("  |     |                                |    |            ");
			System.out.println("  |     |                                |    |            ");
			System.out.println("  |     |  ¡¡HAS PERDIDO!!               |    |            ");
			System.out.println("  |     |                                ------            ");
			System.out.println("  |     |                               //    \\\\         ");
			System.out.println("  |     |                              //      \\\\        ");
			System.out.println("  |     |                             //        \\\\       ");
			System.out.println("  -------                                                  ");
			System.out.println("                                                           ");
			break;
		
		
		}

}
}
