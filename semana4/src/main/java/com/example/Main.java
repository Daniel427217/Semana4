package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ejercicio de restaurante

        // Valor de la cuenta
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de su cuenta: ");
        double valorCuenta = sc.nextDouble();
        double iva = valorCuenta + 0.50;
        System.out.println("valorCuenta: " + iva);

        // Porcentaje propina 
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Ingrese el porcentaje de propina que desee dejar: ");
        double porecentajePropina = sc2.nextDouble();

        // Calculo de valor 
        System.out.println("El porcentaje de propina es: " + porecentajePropina + "%");
        double porcentaje = iva * porecentajePropina / 100; 
        System.out.println("El valor de la propina es: " + porcentaje);

        // Valor total
        double valorTotal = iva + porcentaje;

        //Resultado en Consola
        System.out.println("El valor total de su cuenta es: " + valorTotal);

       
        // Ejercicio de Taxi

        // Distancia recorrida
        Scanner sc3 = new Scanner (System.in);
        System.out.println("Ingrese los kilometros recorridos: ");
        double distancia = sc3.nextDouble();

        //Tiempo espera 
        Scanner sc4  = new Scanner (System.in);
        System.out.println("Digite los minutos esperados en el trafico: ");
        int tiempoEspera = sc4.nextInt();

        // Valor variables 
        double tarifaBase = 4000;
        double valorKilometro = 900;
        double valorMinuto = 150;

        // Calculos, formato de precio y valor total
        double valorTotal2 = ((distancia * valorKilometro) + (tiempoEspera * valorMinuto) + (tarifaBase));
        String formatoPrecio = String.format("$%,.0f", valorTotal2);

        //Resultado en consola
        System.out.println("El valor de su viaje es: " + formatoPrecio);


        //Ejercicio mensaje secreto
        String mensajeCodificado = "H0l4  MUnD0,  3st0  3s  Un  m3ns4j3  s3cr3t0";

        // Reemplazo de numeros por letras
        String mensajeDecodificado = mensajeCodificado
        .replace("0", "o")
        .replace("3", "e")
        .replace("4", "a");
        
        //Eliminación de espacios en blanco
        mensajeDecodificado = mensajeDecodificado.trim().replaceAll(" .", " ");

        //Conversíon mayusculas 
        mensajeDecodificado = mensajeDecodificado.toUpperCase();

        //Resultado en consola
        System.out.println("Mensaje decodificado: " + mensajeDecodificado);
    }
}
