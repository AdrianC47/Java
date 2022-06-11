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
        for (var contador = 0; contador < 3; contador++) {
            if(contador % 2 !=0){ //pregunto si el contador es impar
                continue; // ir a la siguiente iteracion
            }
            System.out.println("contador = " + contador);
        }
    }
}
