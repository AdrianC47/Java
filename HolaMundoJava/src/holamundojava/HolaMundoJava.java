/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundojava;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class HolaMundoJava {

    /**
     * Mi Clase en Java
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
        //Definimos la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Hello Friend";
        System.out.println(miVariableCadena);
        
        miVariableCadena="Goodbye Friend";
        System.out.println(miVariableCadena);

        //var - Inferencia de tipos de datos
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Holi";
        System.out.println("mi Variable Cadena 2 " + miVariableCadena2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2); //soutv + tab
        
        //Valores Permitidos en el nombre de las variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
//        var áVariable = 10; //Si bien es válido , no es recomendado
        
       
        var usuario = "Adrian";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union  = " + union);
        var i =3;
        var j = 4;
        
        System.out.println(i+j);//Aquí se realiza la suma de números 
        System.out.println(i+j+usuario); //Evaluación de izq a derecha , realiza suma 
        System.out.println(usuario + i + j); // Contexto cadena , todo  es una cadena 
        System.out.println(usuario + (i + j)); // Uso de paréntesis, modifcan la prioridad  
        

        var nombre = "Luis";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b"+ nombre);
        System.out.println("Comilla Simple: \'" + nombre + "\'");
        System.out.println("Comilla Doble: \""+nombre + "\"");
        
        System.out.println("Escribe tu nombre ");
        Scanner entrada = new Scanner(System.in);
        var usuario = entrada.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe el titulo");
        var titulo = entrada.nextLine();
        System.out.println("Resultado = " + titulo + " " + usuario);

         */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Proporciona el titulo:");
        var titulo = entrada.nextLine();
        System.out.println("Proporciona el autor:");
        var autor = entrada.nextLine();
        System.out.println(titulo + " fue escrito por "+autor);
    }

}
