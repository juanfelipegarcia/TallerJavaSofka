package com.sofka.taller.punto17;

public class Television extends Electrodomestico {

    private static int resolucionPredeterminada = 20;

    private int resolucion;
    private boolean sintonizador;

    //constructores


    public Television() {
        this(precioPredeterminado,pesoPredeterminado,consumoPredeterminado,colorPredeterminado,resolucionPredeterminada, false);

    }

    public Television(double precio, double peso) {
        this(precio, peso, consumoPredeterminado, colorPredeterminado, resolucionPredeterminada, false);
    }

    public Television(double precio, double peso, char consumo, String color, int resolucion, boolean sintonizador) {
        super(precio, peso, consumo, color);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    //metodos

    public double precioFinal(){
        double extra = super.precioFinal();

        if (resolucion>40){
            extra+=precio*0.3;
        }
        if (sintonizador){
            extra+=50;
        }
        return extra;
    }
}
