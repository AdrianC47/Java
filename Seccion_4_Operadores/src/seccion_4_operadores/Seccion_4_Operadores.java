/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seccion_4_operadores;

/**
 *
 * @author Adrian
 */
public class Seccion_4_Operadores {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);

        resultado = a - b;
        System.out.println("resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);

        var resultado2 = 3D / b;
        System.out.println("resultado division = " + resultado2);

        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);

        if (b % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }
         */
        int a = 3, b = 2;
        int c = a + 5 - b;
        System.out.println("c = " + c);

        a += 1;//a = a + 1
        System.out.println("a = " + a);

        a += 3;//a = a + 3
        System.out.println("a = " + a);

        a -= 2;//a = a - 2
        System.out.println("a = " + a);

        // *=   /=   %= TAREA
        System.out.println("TAREA");
        a *= 2;//a = a * 2
        System.out.println("a = " + a);

        a /= 2;//a = a / 2
        System.out.println("a = " + a);

        a %= 2;//a = a % 2
        System.out.println("a = " + a);

    }

}
