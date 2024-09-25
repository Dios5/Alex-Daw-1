package ofertas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Buenos dias, que tipo de cliente eres?");
		
		System.out.println("- Normal");
		System.out.println("- Socio");
		System.out.println("- Vip");
		
		
		Scanner entrada = new Scanner(System.in);
		
		String clienteType = entrada.next();
		
		if (clienteType.equals("normal")) {
		System.out.println("cliente normal");
		} else if (clienteType.equals("socio")) {
			System.out.println("cliente socio");
			
			} else if (clienteType.equals("vip")) {
				System.out.println("cliente vip");
				
				} else { System.out.println("error, reinicia la solicitud");}
		
		System.out.println("Introduzca el importe de su compra:");
		
		Scanner importe = new Scanner(System.in);
		
		Double precio = entrada.nextDouble();
		
		if (clienteType.equals("normal")) {
			System.out.println("No se te aplica ningun descuento");
			System.out.println("El coste total es de "+ precio+("$"));
			} else if (clienteType.equals("socio")) {
				System.out.println("Se te ha aplicado un 5% de descuento");
				System.out.println("El coste total es de "+ (precio)* 0.95 +("$"));}
			  else if (clienteType.equals("vip")) {
				  System.out.println("Se te ha aplicado un 20% de descuento");
				System.out.println("El coste total es de "+ (precio)* 0.8 +("$"));}
			  else { System.out.println("Reinicia la solicitud por favor");}
		
	}}


