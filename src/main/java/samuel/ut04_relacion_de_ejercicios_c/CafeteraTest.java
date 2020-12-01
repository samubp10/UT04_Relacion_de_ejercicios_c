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
public class CafeteraTest {
    public static void main(String[] args) {
        Cafetera cafetera1 = new Cafetera();
        System.out.println(cafetera1);
        
        Cafetera cafetera2 = new Cafetera(500);
        System.out.println(cafetera2);
        
        Cafetera cafetera3 = new Cafetera(500, 250);
        System.out.println(cafetera3);
        
        Cafetera cafetera4 = new Cafetera(500, 600);
        System.out.println(cafetera4);
        
        cafetera3.llenarCafetera();
        System.out.println(cafetera3);
        
        cafetera2.servirTaza(600);
        System.out.println(cafetera2);
        
        cafetera2.agregarCafe(100);
        System.out.println(cafetera2);
    }
}
