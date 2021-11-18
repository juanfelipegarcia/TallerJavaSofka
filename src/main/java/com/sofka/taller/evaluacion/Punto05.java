package com.sofka.taller.evaluacion;

public class Punto05 {
    public static void main(String[] args) {
        int numero = 1;
        //System.out.println("Numeros pares de 1 al 100");
        while (numero <= 100){
            if(numero%2==0 || numero%3==0){
                System.out.print(numero+ ", ");
                System.out.println(numero-1);
            }
            numero++;
        }
        /*numero = 0;

        System.out.println("\nNumeros impares de 1 al 100");
        while (numero <= 100){
            if(numero%2!=0){
                System.out.print(numero+ ", ");
            }
            numero++;
        }*/
    }
}
