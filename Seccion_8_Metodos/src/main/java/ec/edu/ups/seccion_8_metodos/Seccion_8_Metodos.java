package ec.edu.ups.seccion_8_metodos;

import ec.edu.ups.seccion_8_metodos.Aritmetica;

/**
 *
 * @author Adrian
 */
public class Seccion_8_Metodos {

    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a=7;
        aritmetica1.b=5;
        aritmetica1.sumar();
        
        var resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la prueba = " + resultado);
        
        resultado =aritmetica1.sumarConArgumentos(10,25);
        System.out.println("resultado usando argumentos" + resultado );
    }
}
