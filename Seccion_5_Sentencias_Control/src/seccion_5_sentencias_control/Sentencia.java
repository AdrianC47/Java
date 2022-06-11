/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion_5_sentencias_control;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Sentencia {

    public static void main(String[] args) {
//        var condicion = false;
//        if (condicion) { // esto es lo mismo que condicion == true
//            System.out.println("Condicion Verdadera");
//            System.out.println("nueva linea");
//        } else {
//            System.out.println("Condicion Falsa");
//        }
//
//        var numero = 99;
//        var numeroTexto = "Numero desconocido";
//        if (numero == 1) {
//            System.out.println(numeroTexto);
//        } else if (numero == 2) {
//            numeroTexto = "Numero 2";
//        } else if (numero == 3) {
//            numeroTexto = "Numero 3";
//        } else if (numero == 4) {
//            numeroTexto = "Numero 4";
//        } else {
//            numeroTexto = "Numero no encontrado";
//        }
//        System.out.println("numeroTexto = " + numeroTexto);
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Por favor ingrese el numero del mes ");
//        var  cadena = entrada.nextLine();
//        int mes = Integer.parseInt(cadena);
//        var estacion = "Estacion desconocida";
//        if (mes == 1 || mes == 2 || mes == 12) {
//            estacion = "Invierno";
//
//        } else if (mes == 3 || mes == 4 || mes == 5) {
//            estacion = "Primavera";
//
//        } else if (mes == 6 || mes == 7 || mes == 8) {
//            estacion = "Verano";
//
//        } else if (mes == 9 || mes == 10 || mes == 11) {
//            estacion = "Otoño";//se recomienda evitar el uso de ñ 
//
//        }
//        System.out.println("estacion = " + estacion);

//        var numero = 66;
//        var numeroTexto = "Valor desconocido";
//        switch (numero) {
//            case 1:
//                numeroTexto = "Numero uno";
//                break;
//            case 2:
//                numeroTexto = "Numero dos";
//                break;
//            case 3:
//                numeroTexto = "Numero tres";
//                break;
//            case 4:
//                numeroTexto = "Numero cuatro";
//                break;
//            default: //esto es un else osea si no cumple ninguno de los anteriores casos
//                numeroTexto= "Caso no encontrado";
//        }
//        System.out.println("numeroTexto = " + numeroTexto);
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingrese el dato del mes");
//        var mes = entrada.nextInt();
//        var estacion = "Estacion desconocida";
//        
//        switch (mes) {
//            case 1: case 2: case 12:
//                estacion = "Invierno";
//                break;
//            case 3: case 4: case 5:
//                estacion = "Primavera";
//                break;
//            case 6: case 7: case 8:
//                estacion = "Verano";
//                break;
//            case 9: case 10: case 11:
//                estacion = "Otoño";
//                break;
//        }
//        System.out.println("estacion = " + estacion);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        int num = entrada.nextInt();
        if (num >=9 && num <10) {
            System.out.println("A");
        } else if(num >=8 && num < 9){
            System.out.println("B");
        } else if (num >=7 && num <8){
            System.out.println("C");
        } else if(num >=6 && num <7){
            System.out.println("D");
        } else if(num >=0 && num <6){
            System.out.println("F");
        } else {
            System.out.println("Valor desconocido");
        }
    }
}
