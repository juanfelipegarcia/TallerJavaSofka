package com.sofka.taller.evaluacion;

import javax.swing.*;

public class Punto02 {
    public static void main(String[] args) {
        try{
            int nun1 = Integer.parseInt(JOptionPane.showInputDialog("digite el Primer numero a comparar"));
            int nun2 = Integer.parseInt(JOptionPane.showInputDialog("digite el Segundo numero a comparar"));

            if (nun1 > nun2){
                JOptionPane.showMessageDialog(null, "el 1er numero ("+nun1+") es MAYOR que el 2do ("+nun2+")");
                //System.out.println("el 1ro numero ("+nun1+") es MAYOR que el 2° ("+nun2+")");
            }else{
                JOptionPane.showMessageDialog(null,"el 2do numero ("+nun2+") es MAYOR que el 1er ("+nun1+")" );
                //System.out.println("el 2do numero ("+nun2+") es MAYOR que el 1° ("+nun1+")");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Solo debes digitar numeros" );
            //System.out.println(e + "Solo debes digitar numeros");
        }
    }
}
