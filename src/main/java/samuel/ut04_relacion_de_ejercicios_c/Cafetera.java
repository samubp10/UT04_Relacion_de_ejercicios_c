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

    private double capacidadMaxima;
    private double cantidadActual;

    public Cafetera() {

        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima=capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima=capacidadMaxima;
        
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        }else{
            this.cantidadActual = cantidadActual;
        }
    }

    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }
    
    public void servirTaza(double cafe){
        if (cafe > this.cantidadActual){
            vaciarCafetera();
        }else{
            this.cantidadActual-=cafe;
        }
    }
    
    
    public void vaciarCafetera(){
        cantidadActual=0;
    }
    
    public void agregarCafe(double cantidadAgregar){
        if (cantidadAgregar+this.cantidadActual > this.capacidadMaxima){
            this.cantidadActual = capacidadMaxima;
        }else{
            this.cantidadActual+=cantidadAgregar;
        }
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + this.capacidadMaxima + ", cantidadActual=" + this.cantidadActual + '}';
    }
    
}