package com.sofka.taller.punto17;

public class Lavadora extends Electrodomestico{

    private static int cargaPredeterminada = 5;

    private int carga;

    public int getCarga() {
        return carga;
    }
    //constructores
    public Lavadora() {
        this(precioPredeterminado, pesoPredeterminado, consumoPredeterminado, colorPredeterminado, cargaPredeterminada);
    }

    public Lavadora(double precio, double peso) {
        this(precioPredeterminado, peso, consumoPredeterminado, colorPredeterminado, cargaPredeterminada);
    }

    public Lavadora(double precio, double peso, char consumo, String color, int carga) {
        super(precio, peso, consumo, color);
        this.carga=carga;
    }

    //metodos

    public double precioFinal(){
        double extra=super.precioFinal();

        if (carga>30){
            extra+=50;
        }
        return extra;
    }
}
