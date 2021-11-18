package com.sofka.taller.evaluacion;

import javax.swing.*;

public class Punto09 {
    public static void main(String[] args) {
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String fracePersonal = ", una sonrisa puede cambiar el Mundo!!";

        System.out.println(frase.replace("a","e")+fracePersonal);
        JOptionPane.showMessageDialog(null, frase.replace("a","e")+fracePersonal);
    }
}
