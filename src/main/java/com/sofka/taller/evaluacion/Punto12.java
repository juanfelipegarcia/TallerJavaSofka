package com.sofka.taller.evaluacion;

import java.util.Locale;
import java.util.Scanner;

public class Punto12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la palabra 1");
        String palabra1 = sc.next().toLowerCase();

        System.out.println("Escribe la palabra 2");
        String palabra2 = sc.next().toLowerCase();

        if(palabra1.equals(palabra2)){
            System.out.println("Las palabras son iguales");
        }else{

            int contadorVocalesP1 = 0;
            for (int x = 0; x < palabra1.length(); x++) {
                if ((palabra1.charAt(x) == 'a') || (palabra1.charAt(x) == 'e') ||
                        (palabra1.charAt(x) == 'i') || (palabra1.charAt(x) == 'o') || (palabra1.charAt(x) == 'u')) {
                    contadorVocalesP1++;
                }
            }

            int contadorVocalesP2 = 0;
            for (int x = 0; x < palabra2.length(); x++) {
                if ((palabra2.charAt(x) == 'a') || (palabra2.charAt(x) == 'e') ||
                        (palabra2.charAt(x) == 'i') || (palabra2.charAt(x) == 'o') || (palabra2.charAt(x) == 'u')) {
                    contadorVocalesP2++;
                }
            }

            System.out.println("Las palabras no son iguales");
            System.out.println("la palabra :"+palabra1+" contiene "+palabra1.length()+" letras");
            System.out.println("la palabra :"+palabra2+" contiene "+palabra2.length()+" letras");
            System.out.println("la palabra :"+palabra1+" contiene "+contadorVocalesP1+" vocales");
            System.out.println("la palabra :"+palabra2+" contiene "+contadorVocalesP2+" vocales");

        }
    }

}
