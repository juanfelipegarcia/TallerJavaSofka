package com.sofka.taller.evaluacion;

public class Punto06 {
    public static void main(String[] args) {
        System.out.println("Numeros pares de 1 al 100");
        for (int i = 1; i<=100; i++ ){
            if(i%2==0){
                System.out.print(i+ ", ");
            }
        }

        System.out.println("\nNumeros impares de 1 al 100");
        for (int i = 1; i<=100; i++ ){
            if(i%2!=0){
                System.out.print(i+ ", ");

            }
        }
    }

}
