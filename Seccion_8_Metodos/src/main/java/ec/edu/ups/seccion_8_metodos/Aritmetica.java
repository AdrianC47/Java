/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.seccion_8_metodos;

/**
 *
 * @author Adrian
 */
public class Aritmetica {
    //Atributos de la clase

    int a;
    int b;

    //Metodo
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
//        int resultado = a+b;
//        return  resultado;
        return this.a + this.b;
    }

    public int sumarConArgumentos(int a, int b) {
        //el operador this existe solo en la clase y apunta al objeto que se esta ejecutando en ese momento
        this.a = a; //El argumento a se asigna al atributo this.a
        this.b = b;
        //return a +b;  
        //En sí es opcional, sin embargo es una practica muy comun en Java usarlo ya que al ver el this.(Atributo/metodo)
        //sabemos que hace referencia a un atributo de nuestra clase y no a una variable local
        return this.sumarConRetorno();
    }
}
