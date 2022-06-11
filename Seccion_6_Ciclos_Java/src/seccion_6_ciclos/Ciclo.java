/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion_6_ciclos;

/**
 *
 * @author Adrian
 */
public class Ciclo {

    public static void main(String[] args) {
//        var contador = 0;
//        while( contador <3){
//            System.out.println("contador = " + contador);
//            contador++;
//        }

//          var contador = 0;
//          do {            
//              System.out.println("contador = " + contador);
//              contador++;
//          } while (contador <3);
//        for (var contador = 0; contador < 3; contador++) {
//            if(contador % 2 ==0){
//                System.out.println("contador = " + contador);
//                break;
//            }
//        }
//        for (var contador = 0; contador < 3; contador++) {
//            if (contador % 2 != 0) { //pregunto si el contador es impar
//                continue; // ir a la siguiente iteracion
//            }
//            System.out.println("contador = " + contador);
//        }
        //Una etiqueta nos va a permitir indicar a las palabras continue o break ir hacia un lugar específico de nuestro programa, sin embargo no es muy recomendable
        //usarla porque puede romper la logica de nuestro programa
        inicio:
        for (var contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) { //ir a la linea de codigo de la etiqueta que hemos agregado
                continue inicio; 
            }
            System.out.println("contador = " + contador);
        }

    }
}
