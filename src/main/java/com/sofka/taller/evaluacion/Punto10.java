package com.sofka.taller.evaluacion;

import javax.swing.*;

public class Punto10 {
    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Digita una frase que te  guste");

        JOptionPane.showMessageDialog(null, frase.replace(" ",""));

    }
}
