package com.sofka.taller.evaluacion;

import java.util.Scanner;

public class Punto15 {
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);

        int opcion;
        do {
            System.out.println("************** GESTION CINEMATOGRAFICA **************");
            System.out.println("*  1-NUEVO ACTOR                                    *");
            System.out.println("*  2-BUSCAR ACTOR                                   *");
            System.out.println("*  3-ELIMINAR ACTOR                                 *");
            System.out.println("*  4-MODIFICAR ACTOR                                *");
            System.out.println("*  5-VER TODOS LOS ACTORES                          *");
            System.out.println("*  6-VER PELICULAS DE LOS ACTORES                   *");
            System.out.println("*  7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES  *");
            System.out.println("*  8-SALIR                                          *");
            System.out.println("************** GESTION CINEMATOGRAFICA **************");
            System.out.print("Indique una opcion :");
            opcion=tc.nextInt();

            if (opcion<1 || opcion>8){
                System.out.println("************** Opcion Incorrecta ***************\n");
            }

        } while (opcion<8 || opcion>8); }
}

