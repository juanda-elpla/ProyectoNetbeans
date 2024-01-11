/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosclase;

import java.util.Scanner;

/**
 *
 * @author jd.martinezblasco
 */
public class NuevaClase {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner sc = new Scanner(System.in);
        
        String cadena = sc.nextLine();
        
        System.out.println("El número de espacios en blanco es: " + calcularEspacios(cadena));
    }
    
    public static int calcularEspacios(String cadena) {
        int contador = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                contador++;
            }
        }
        
        return contador;
    }
}
