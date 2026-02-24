package tarea;

import java.util.Scanner;

public class Aplicacion {
	public static void main(String[] args) {
        
        System.out.println("========================================");
        System.out.println("   BIENVENIDO AL SISTEMA DE GITHUB   ");
        System.out.println("========================================");
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Por favor, introduce tu nombre: ");
        String nombreUsuario = teclado.nextLine();
        
        System.out.println("\nHola, " + nombreUsuario + "!");
        System.out.println("Este es el primer archivo de la Actividad 4.2.");
        System.out.println("Estado actual: Repositorio clonado y funcionando.");
        
        teclado.close();
        System.out.println("========================================");
    }
}
