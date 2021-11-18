package com.sofka.taller.evaluacion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Punto13 {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        System.out.println("---------------------------------------------");

        DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        DateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("Son las: "+formatoHora.format(fechaActual)+" de fecha: "+formatoFecha.format(fechaActual));
    }
}
