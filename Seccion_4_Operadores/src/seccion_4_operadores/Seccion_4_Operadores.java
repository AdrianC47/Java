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
         */
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

    }

}
