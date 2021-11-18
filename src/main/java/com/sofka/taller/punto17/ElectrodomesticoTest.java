package com.sofka.taller.punto17;

public class ElectrodomesticoTest {
    public static void main(String[] args) {

        Electrodomestico listElectrodomesticos[] = new Electrodomestico[12];

        listElectrodomesticos[0] = new Electrodomestico(1000,100);
        listElectrodomesticos[1] = new Lavadora(1000, 100, 'A', "gris", 30);
        listElectrodomesticos[2] = new Television(1000, 100);
        listElectrodomesticos[3] = new Electrodomestico();
        listElectrodomesticos[4] = new Lavadora(1000, 100, 'A', "gris", 30);
        listElectrodomesticos[5] = new Television(1000, 100, 'B',"negro",35,true);
        listElectrodomesticos[6] = new Electrodomestico(1000, 100,'A', "azul");
        listElectrodomesticos[7] = new Lavadora(1000,100);
        listElectrodomesticos[8] = new Television(1000, 100,'C', "blanco",22,false);
        listElectrodomesticos[9] = new Electrodomestico(1000, 100, 'C',"rojo");
        listElectrodomesticos[10] = new Lavadora();
        listElectrodomesticos[11] = new Television();

        double electrodomesticostotal = 0;
        double televisorestotal = 0;
        double lavadorasTotal = 0;

        for (int x = 0; x<listElectrodomesticos.length; x++){
            if (listElectrodomesticos[x] instanceof Electrodomestico){
                electrodomesticostotal+=listElectrodomesticos[x].precioFinal();
            }
            if (listElectrodomesticos[x] instanceof Lavadora){
                lavadorasTotal+=listElectrodomesticos[x].precioFinal();
            }
            if (listElectrodomesticos[x] instanceof Television){
                televisorestotal+=listElectrodomesticos[x].precioFinal();
            }
        }

        System.out.println("La suma del precio de los electrodomesticos es de "+electrodomesticostotal);
        System.out.println("La suma del precio de las lavadoras es de "+lavadorasTotal);
        System.out.println("La suma del precio de las televisiones es de "+televisorestotal);


    }
}
//String colores[]={"blanco", "negro", "rojo", "azul", "gris"};