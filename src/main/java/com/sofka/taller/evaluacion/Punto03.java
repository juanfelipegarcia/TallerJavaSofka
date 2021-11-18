package com.sofka.taller.evaluacion;

import javax.swing.*;
import java.util.Scanner;

public class Punto03 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            double radioCiculo = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio del ciculo para el calculo de su respectiva area"));
            double areaCirculo = Math.PI*Math.pow(radioCiculo,2);
            JOptionPane.showMessageDialog(null, "EL valor del Area del circulo con radio "+radioCiculo+" es de: "+areaCirculo);
            //System.out.println(areaCirculo);
        }catch (Exception e ){
            //System.out.println(e + "Digita unicamente numeros");
            JOptionPane.showMessageDialog(null, "Digita unicamente numeros" );
        }




    }
}
