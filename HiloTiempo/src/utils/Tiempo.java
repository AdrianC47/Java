/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Adrian
 */
public class Tiempo extends Thread {

    private int segundos;
    private int minutos;
    private JLabel lblTiempo;
    private boolean pausar;

    public Tiempo(JLabel lblTiempo) {
        segundos = 0;
        minutos = 0;
        pausar=true;
        this.lblTiempo = lblTiempo;
        super.setName("Hilo del Tiempo");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10); // Dormir el hilo por 100 milisegundos
                if (pausar == false) {

                    segundos++;
                    if (segundos >= 60) {
                        segundos = 0;
                        minutos++;
                    }
                    lblTiempo.setText(this.toString());
                }
            } catch (InterruptedException ex) {
                ///return; //terminando de ejecutar el metodo run
                pausar = true;
            }

        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public JLabel getLblTiempo() {
        return lblTiempo;
    }

    public void setLblTiempo(JLabel lblTiempo) {
        this.lblTiempo = lblTiempo;
    }

    public boolean isPausar() {
        return pausar;
    }

    public void setPausar(boolean pausar) {
        this.pausar = pausar;
    }

    @Override
    public String toString() {
        return "segundos=" + segundos + ", minutos=" + minutos;
    }

}
