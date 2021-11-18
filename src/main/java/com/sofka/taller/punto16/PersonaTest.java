package com.sofka.taller.punto16;

import java.util.Scanner;

public class PersonaTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digita el Nombre ");
        String nombre = sc.nextLine();
        System.out.print("Digite la edad ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.print("Diguite su sexo h o m ");
        char sexo = sc.nextLine().charAt(0);
        System.out.print("Digite su peso ");
        double peso = Double.parseDouble(sc.nextLine());
        System.out.print("Digite su altura ");
        double altura = Double.parseDouble(sc.nextLine());

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        persona2.setPeso(70.5);
        persona2.setAltura(1.60);

        persona3.setNombre("Andrea");
        persona3.setEdad(33);
        persona3.setSexo('m');
        persona3.setPeso(55.2);
        persona3.setAltura(1.70);

        System.out.println("********** Persona 1 **********");
        MensajePeso(persona1);
        MayorDeEdad(persona1);
        System.out.println(persona1.toString());
        System.out.println("*******************************");
        System.out.println("\n");

        System.out.println("********** Persona 2 **********");
        MensajePeso(persona2);
        MayorDeEdad(persona2);
        System.out.println(persona2.toString());
        System.out.println("*******************************");
        System.out.println("\n");

        System.out.println("********** Persona 3 **********");
        MensajePeso(persona3);
        MayorDeEdad(persona3);
        System.out.println(persona3.toString());
        System.out.println("*******************************");
        System.out.println("\n");

    }

    public static void MensajePeso(Persona p){
        int valorImc = p.CalcularIMC();
        if (valorImc == -1) {
            System.out.println("  Esta en su peso ideal");
        } else if (valorImc == 0) {
            System.out.println("  Esta por debajo de su peso ideal");
        } else {
            System.out.println("  Tiene sobrepeso");
        }
    }

    public static void MayorDeEdad(Persona p){
        if (p.MayorDeEdad()) {
            System.out.println("  Es mayor de edad");
        } else {
            System.out.println("  no es mayor de edad");
        }
    }
}
