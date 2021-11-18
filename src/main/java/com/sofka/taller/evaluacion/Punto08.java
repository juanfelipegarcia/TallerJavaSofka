package com.sofka.taller.evaluacion;

import javax.swing.*;
import java.util.Locale;

public class Punto08 {
    public static void main(String[] args) {

        String dia = JOptionPane.showInputDialog("Digite una dia de la semana para consultar").toLowerCase(Locale.ROOT);
        switch (dia){
            case "lunes", "martes", "miercoles", "jueves", "viernes":
                JOptionPane.showMessageDialog(null, "Es un dia laboral");
                break;
            case "sabado", "domingo":
                JOptionPane.showMessageDialog(null, "NO Es un dia laboral... a descansar");
                break;
            default:
                JOptionPane.showMessageDialog(null, "No existe este dia.");
        }

    }
}
