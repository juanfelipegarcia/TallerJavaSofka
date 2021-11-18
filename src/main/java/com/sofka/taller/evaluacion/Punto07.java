package com.sofka.taller.evaluacion;

import javax.swing.*;
import java.util.Scanner;

public class Punto07 {
    public static void main(String[] args) {
        int numero =0;
        do {
            numero =  Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
        }while (numero < 0);
        JOptionPane.showMessageDialog(null, "El numero: "+numero+" es Mayor q igual que cero '0' fin...");

        /*Scanner sc = new Scanner(System.in);
        Integer numero = 0;
        do {
            System.out.println("Digita un numero");
            numero = sc.nextInt();
        }while (numero<0);
        System.out.println("El numero: "+numero+" es Mayor q igual que cero '0' ");
        */






    }
}
