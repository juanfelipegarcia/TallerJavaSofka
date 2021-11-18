package com.sofka.taller.punto17;

public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;
    protected static String colorPredeterminado="blanco";
    protected final static char consumoPredeterminado='F';
    protected static double precioPredeterminado=100;
    protected static double pesoPredeterminado=5;
    // Constructores
    public Electrodomestico(){
        this(precioPredeterminado, pesoPredeterminado, consumoPredeterminado, colorPredeterminado);
    }

    public Electrodomestico(double precio, double peso){
        this(precio, peso, consumoPredeterminado, colorPredeterminado);
    }

    public Electrodomestico(double precio, double peso, char consumo, String color){
        this.precio=precio;
        this.peso=peso;
        comprobarConsumoEnergetico(consumo);
        comprobarColor(color);
    }

    // Getters

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }

    //Metodos

    private void comprobarColor(String color){
        String colores[]={"azul", "gris", "rojo", "blanco", "negro"};
        boolean encontrado=false;

        for(int i=0;i<colores.length && !encontrado;i++){
            if(colores[i].equals(color)){
                encontrado=true;
            }
        }

        if(encontrado){
            this.color=color;
        }else{
            this.color=colorPredeterminado;
        }
    }

   public void comprobarConsumoEnergetico(char consumo){

        if(consumo>=65 && consumo<=70){
            this.consumo =consumo;
        }else{
            this.consumo =consumoPredeterminado;
        }

    }

    public double precioFinal(){
        double extra=0;
        switch(consumo){
            case 'A','a':
                extra+=100;
                break;
            case 'B','b':
                extra+=80;
                break;
            case 'C','c':
                extra+=60;
                break;
            case 'D','d':
                extra+=50;
                break;
            case 'E','e':
                extra+=30;
                break;
            case 'F','f':
                extra+=10;
                break;
        }

        if(peso>=0 && peso<19){
            extra+=10;
        }else if(peso>=20 && peso<49){
            extra+=50;
        }else if(peso>=50 && peso<=79){
            extra+=80;
        }else if(peso>=80){
            extra+=100;
        }
        return precio+extra;
    }
}
