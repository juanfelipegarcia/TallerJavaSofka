package com.sofka.taller.evaluacion;

import javax.swing.*;

public class Punto01 {
    public static void main(String[] args) {

        try{
            int nun1 = 25;
            int nun2 = 10;

            if (nun1 > nun2){
                System.out.println("el 1° numero ("+nun1+") es MAYOR que el 2° ("+nun2+")");
            }else{
                System.out.println("el 2° numero ("+nun2+") es MAYOR que el 1° ("+nun1+")");
            }

        }catch (Exception e){
            System.out.println(e + "Solo debes digitar numeros");
        }


    }
}
