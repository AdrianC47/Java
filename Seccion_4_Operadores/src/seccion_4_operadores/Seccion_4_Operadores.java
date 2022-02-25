/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seccion_4_operadores;

import java.util.Scanner;

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

   
    //Operadores Unarios
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    
        //Incremento
        //1.preincremento  (simbolo antes de la variable)
        var e =3;
        var f = ++e;//primero se incrementa  la variable y luego se usa su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        //2.postincremento  (despues de la variable)
        var g = 5;
        var h = g++;//primero se utiliza el valor de la variable y luego se incrementa
        System.out.println("g = " + g);//teniamos pendiente un incremento 
        System.out.println("h = " + h);
        
        //Decremento
        //1.predecremento
        var i = 2;
        var j = --i;//primero se decrementa la variable y luego se usa su valor
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    
        //2.postdecremento 
        var k =4;
        var l = k--;//primero se utiliza el varlo de la variable y luego se decrementa
        System.out.println("k = " + k);//teniamos pendiente un decremento
        System.out.println("l = " + l);
        
        var a = 3;
        var b = 2;

        var c = (a == b);
        System.out.println("c = " + c);

        var d = a != b;
        System.out.println("d = " + d);

        var cadena = "Hola";
        var cadena2 = "Hola";
        var e = cadena == cadena2;//compara referencias de objetos
        System.out.println("e = " + e);

        var f = cadena.equals(cadena2);//comparamos contenido de cadenas
        System.out.println("f = " + f);

        var g = a >= b;//mayor  que > o el mayor o igual >=
        System.out.println("g = " + g);

        if (a % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }

        var edad = 10;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es menor de edad");
        }
    
        var a = 8;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = a >= 0 && a <= 10;
        if (resultado) { // cuando se pone solo asi pregunta por defecto si es true
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }

        var vacaciones = false;
        var diaDescanso = true;

        if (vacaciones || diaDescanso) {
            System.out.println("Padre puede asisitir al juego del hijo");
        } else {
            System.out.println("El padre esta ocupado");
        }
        
        var resultado = (1>2) ? "verdadero" : "falso" ;
        System.out.println("resultado = " + resultado);
    
        var numero = 7;
        resultado = (numero % 2 == 0)? "Es par" : "Es impar";
        System.out.println("resultado = " + resultado);

        
        var x = 5;
        var y = 10;
        var z = ++x + y--; //  6 + 10 
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    
        var resultado = 4 + 5 * 6 /3;//leyes de signos pero en java multiplicacion y division tienen misma prioridad
                                     // sin embargo se va a realizar el que esté primero contando de izq a derecha
                                     // 4 + ((5*6)/3)
        System.out.println("resultado = " + resultado);
        
        resultado = (4 + 5) * 6 / 3;
        System.out.println("resultado = " + resultado);
         
        //Ejercicio 
        //En el siguiente ejercicio se solicita calcular el área y el perímetro de un Rectángulo, para ello deberemos crear las siguientes variables:
        alto (int)
        ancho (int)
        El usuario debe proporcionar los valores de largo y ancho, y después se debe imprimir el resultado en el siguiente formato
        (no usar acentos y respetar los espacios, mayúsculas, minúsculas y saltos de línea):
        Proporciona el alto:
        Proporciona el ancho:
        Area: <area>
        Perimetro: <perimetro>
        Las fórmulas para calcular el área y el perímetro de un Rectángulo son:

        Área: alto * ancho

        Perímetro: (alto + ancho) * 2

        Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.

 
        
        int alto = 0;
        int ancho = 0;
        int area;
        int perimetro;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Proporciona el alto: ");
        alto = Integer.parseInt(entrada.nextLine());
        System.out.println(alto);
        System.out.println("Proporciona el ancho: ");
        ancho = Integer.parseInt(entrada.nextLine());
        System.out.println(ancho);
        area = alto * ancho;
        perimetro = (alto + ancho) * 2;
        System.out.print("Área: ");
        System.out.println(area);
        System.out.print("Perímetro: ");
        System.out.println(perimetro);
         */
        //esta bien pero se puede simplificar a 
        /*
        Scanner scanner = new Scanner(System.in);
        // Escribe tu solucion aqui
        System.out.println("Proporciona el alto:");
        int alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el ancho:");
        int ancho = Integer.parseInt(scanner.nextLine());
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);*/

        //Segundo Ejercicio
        //        Solicitar al usuario dos valores:
        //
        //numero1 (int)
        //
        //numero2 (int)
        //
        //Se debe imprimir el mayor de los dos números (la salida debe ser identica a la que sigue):
        //
        //Proporciona el numero1:
        //Proporciona el numero2:
        //El numero mayor es:
        //<numeroMayor>
        //Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.
        //
        //Preguntas de esta tarea
        //¿Cuál es el código del requerimiento solicitado?
        /*
        int numero1, numero2, numeroMayor;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Proporciona el numero 1: ");
        numero1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Proporciona el numero 2: ");
        numero2 = Integer.parseInt(entrada.nextLine());
        System.out.println("El numero mayor es: ");
        if (numero1 == numero2) {
            System.out.println("Son numeros iguales");
        } else {
            if (numero1 > numero2) {
                numeroMayor = numero1;
                System.out.println(numeroMayor);
            } else {
                numeroMayor = numero2;
                System.out.println(numeroMayor);
            }
        }
         */
        //Esta bien realizado el mio pero se puede simplificar usando operadores ternarios
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero2:");
        int numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println("El numero mayor es:");
        System.out.println(numero1 > numero2 ? numero1 : numero2);
    }
}
