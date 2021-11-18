package com.sofka.taller.evaluacion;

import javax.swing.*;

public class Punto14 {
    public static void main(String[] args) {
        /*int numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero entre 1 y 1000"));

        for (int i = numero; i< 1000; i++){
            System.out.print(i++ + ",");

        }*/
        try{
            int numero =0;
            do {
                numero =  Integer.parseInt(JOptionPane.showInputDialog("Digita un numero entre 1 y 1000"));
            }while (numero > 1000 || numero < 1);

            for (int i = numero; i< 1000; i++){
                System.out.print(i++ + ",");

            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e + "Debes digitar un numero" );
            //System.out.println(e + "Debes digitar un numero");
        }




    }
}
