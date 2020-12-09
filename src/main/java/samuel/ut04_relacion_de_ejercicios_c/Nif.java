/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel.ut04_relacion_de_ejercicios_c;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Nif {
     private String numDni;
    private char letDni;

    public Nif() {
        this.numDni = "";
        this.letDni = 'o';
    }

    public Nif(String numDni) {
        this.numDni = numDni;
        this.letDni = calcularLetra(numDni);
    }

    private static char calcularLetra(String num) {
        // String = array de char
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        // resto = el resto de el paso a int del string num entre 23
        int resto = Integer.parseInt(num) % 23;
        // Devuelve los caracteres de la posicion que sea el resto
        return caracteres.charAt(resto);
    }

    public String getNumDni() {
        return numDni;
    }

    public void setNumDni(String numDni) {
        this.numDni = numDni;
    }

    public char getLetDni() {
        return letDni;
    }

    public void setLetDni(char letDni) {
        this.letDni = letDni;
    }

    @Override
    public String toString() {
        return "NIF = " + numDni + "-" + letDni;
    }

    public void mostrar() {
        // MostrarÃ¡ por pantalla el toString
        System.out.println(toString());
    }

    public static String leer() { // Estático porque es de clase (no referencia
// ningún this)
        // Creamos teclado para recoger la info del usuario
        System.out.println("Introduzca su número del DNI:");
        Scanner teclado = new Scanner(System.in);
        // Esto devolverÃ¡ el texto que escriba el usario
        return teclado.nextLine();
    }
}
