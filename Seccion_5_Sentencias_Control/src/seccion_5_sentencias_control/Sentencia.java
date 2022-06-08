/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion_5_sentencias_control;

/**
 *
 * @author Adrian
 */
public class Sentencia {

    public static void main(String[] args) {
        var condicion = false;
        if (condicion) { // esto es lo mismo que condicion == true
            System.out.println("Condicion Verdadera");
            System.out.println("nueva linea");
        } else {
            System.out.println("Condicion Falsa");
        }

        var numero = 99;
        var numeroTexto = "Numero desconocido";
        if (numero == 1) {
            System.out.println(numeroTexto);
        } else if (numero == 2) {
            numeroTexto = "Numero 2";
        } else if (numero == 3) {
            numeroTexto = "Numero 3";
        } else if (numero == 4) {
            numeroTexto = "Numero 4";
        } else {
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
