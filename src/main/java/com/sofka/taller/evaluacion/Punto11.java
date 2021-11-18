package com.sofka.taller.evaluacion;

import java.util.Locale;

public class Punto11 {
    public static void main(String[] args) {

        int contadorVocales = 0;
        int contadorA =0, contadorE=0 , contadorI=0 , contadorO=0 , contadorU = 0;
        String frase ="La sonrisa sera la mejOr ArmA contra la tristeza".toLowerCase(Locale.ROOT);
        System.out.println("la Longitud de la frese es: "+frase.length());

        for(int x=0;x<frase.length();x++) {
           if ((frase.charAt(x)=='a')){
               contadorA++;
               contadorVocales++;
           }else if((frase.charAt(x)=='e')){
               contadorE++;
               contadorVocales++;
           }else if ((frase.charAt(x)=='i')){
               contadorI++;
               contadorVocales++;
           }else if((frase.charAt(x)=='o')){
               contadorO++;
               contadorVocales++;
           }else if((frase.charAt(x)=='u')){
               contadorU++;
               contadorVocales++;
           }
        }

        System.out.println("La Frase " + frase + "contiene " + contadorVocales + " vocales");
        System.out.println("Vocales a :" + contadorA);
        System.out.println("Vocales e :" + contadorE);
        System.out.println("Vocales i :" + contadorI);
        System.out.println("Vocales o :" + contadorO);
        System.out.println("Vocales u :" + contadorU);

    }
}
