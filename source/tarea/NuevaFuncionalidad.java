package tarea;

import java.util.Scanner;

public class NuevaFuncionalidad {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Nueva Funcionalidad: Calculadora de Descuentos ---");
        System.out.print("Introduce el precio del producto: ");
        double precio = sc.nextDouble();
        double precioFinal = precio * 0.85;
        
        System.out.println("Precio original: " + precio + "€");
        System.out.println("Precio con descuento (15%): " + precioFinal + "€");
        
        sc.close();
    }
}
