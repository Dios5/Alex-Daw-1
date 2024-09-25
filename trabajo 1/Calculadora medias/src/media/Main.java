package media;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cual es tu nombre?");
		
		String name = entrada.next();
		
		System.out.println("Buenos dias "+ name);
		
		System.out.println("Introduce tu nota de programacion:");
		
		
		Scanner notas = new Scanner(System.in);
		
			Double programacion = notas.nextDouble();
		
		System.out.println("Introduce tu nota de lenguaje de marcas");
		
			Double lmarcas = notas.nextDouble();

		System.out.println("Introduce tu nota de analisis");
		
			Double analisis = notas.nextDouble();
		
		System.out.println("Introduce tu nota de bases de datos");
		
			Double base = notas.nextDouble();
			
		System.out.println("Introduce tu nota de empleabilidad");
			
			Double empleabilidad = notas.nextDouble();
			
			
		System.out.println("Tus notas son:");
		System.out.println(programacion+(" en programacion"));
		System.out.println(lmarcas+" en lenguaje de marcas");
		System.out.println(analisis+" en analisis");
		System.out.println(base+" en bases de datos");
		System.out.println(empleabilidad+" en empleabilidad");
		
		if ((programacion < 5) || (lmarcas < 5) || (analisis < 5) || (base < 5) || (empleabilidad < 5)) {
			
		System.out.println(name+", tu media final es "+((programacion+lmarcas+analisis+base+empleabilidad)/5)+", lamentablemente has supendido");	
		}
		else { System.out.println(name+", tu media final es "+((programacion+lmarcas+analisis+base+empleabilidad)/5)+" y has aprobado :)"); }
		}
	}


