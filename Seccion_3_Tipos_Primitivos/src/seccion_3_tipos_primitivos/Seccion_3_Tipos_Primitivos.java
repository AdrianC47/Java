/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seccion_3_tipos_primitivos;

/**
 *
 * @author Adrian
 */
public class Seccion_3_Tipos_Primitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        /*
            Tipos primitivos enteros: byte, short, int, long
        
        /*
        //Los datos de tipo byte pueden almacenar unicamente 8 bits
                            //aqui le digo que me transforme el 129 a byte
        byte numeroByte = (byte)129;// no imprime lo que quiero ya que los datos de tipo byte tienen rango de -128 a 127
        System.out.println("valor minimo byte:"+ Byte.MIN_VALUE);
        System.out.println("valor maximo byte:"+ Byte.MAX_VALUE);
        System.out.println("Valor byte:"+numeroByte);
    
        //Los datos de tipo short pueden almacenar unicamente hasta 16 bits
                        //aqui le digo que me transforme el 32768 a Short
        short numeroShort =(short)32768; //// no imprime lo que quiero ya que los datos de tipo short tienen rango de -32768 a 32767
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("valor minimo short: "+ Short.MIN_VALUE);
        System.out.println("valora maximo short: " +Short.MAX_VALUE);
       
        //Los datos de tipo int pueden almacenar unicamente hasta 32 bits
                         //aqui le digo que me transforme  el 2147483648L (la L es de Long) a int
        int numeroInt = (int)2147483648L; // no imprime lo que quiero ya que los datos de tipo int tienen rango de -2147483648 a 2147483647
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor minimo int: "+ Integer.MIN_VALUE);
        System.out.println("valora maximo int: " +Integer.MAX_VALUE);
        
       //Los datos de tipo Long pueden almacenar unicamente hasta  64 bits
 
          /*              
        long numeroLong = (long)9223372036854775807L; 
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("valor minimo long: "+ Long.MIN_VALUE);
        System.out.println("valora maximo long: " +Long.MAX_VALUE);
        
        
       //TIPOS PRIMITIVOS FLOTANTES
       float numeroFloat = (float)3.4028235E38D;
       System.out.println("numeroFloat = " + numeroFloat);
       System.out.println("valor minimo float: "+ Float.MIN_VALUE);
       System.out.println("valora maximo float: " +Float.MAX_VALUE);
       
       double numeroDouble = 1.7976931348623157E308;
       System.out.println("numeroDouble = " + numeroDouble);
       System.out.println("valor minimo double: "+ Double.MIN_VALUE);
       System.out.println("valora maximo double: " +Double.MAX_VALUE);
         */
        
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);
    
        var numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);
    }

}
