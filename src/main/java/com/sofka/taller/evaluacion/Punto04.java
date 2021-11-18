package com.sofka.taller.evaluacion;

import javax.swing.*;

public class Punto04 {
    public static void main(String[] args) {
        try{
            double iva = 21;
            double precioArticulo = Double.parseDouble(JOptionPane.showInputDialog("Digita el valor del producto"));
            double precioConIva = precioArticulo + ((precioArticulo*iva)/100);
            JOptionPane.showMessageDialog(null, "El precio del articulo es: $"+precioConIva);

        }catch (Exception e ){
            System.out.println(e + "Digita El valor del producto unicamente en numeros");
        }

    }
}
