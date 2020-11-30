/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel.ut04_relacion_de_ejercicios_c;

/**
 *
 * @author samuel
 */
public class Cafetera {
    private int capacidadMaxima;
    private int capacidadActual; 
    

    public Cafetera() {
        capacidadMaxima = 1000;
        capacidadActual = 0;
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
        if(capacidadActual > capacidadMaxima){
            capacidadActual = capacidadMaxima;
        }
    }

    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        capacidadMaxima = capacidadActual;
    }
    


    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }
}
