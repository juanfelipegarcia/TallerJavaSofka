package com.sofka.taller.punto18;

public class Serie implements Entregable{

    private static int temporadasPredeterminadas = 3;

    private String titulo;
    private int numeroDeTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    private final static int horasEstimadasPredefinidas=100;
    public final static int mayor=1;
    public final static int menor=-1;
    public final static int igual=0;

    //Constructores

    public Serie() {
        this("", temporadasPredeterminadas, "","");
    }

    public Serie(String titulo, String creador) {
        this(titulo,temporadasPredeterminadas, "",creador);
    }

    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = false;
    }

    //Setter and Getter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public void entregar() {
        entregado=true;
    }

    @Override
    public void devolver() {
        entregado=false;
    }

    @Override
    public boolean isEntregado() {
        if(entregado){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object a) {
        int estado=menor;
        Serie ref=(Serie)a;
        if (numeroDeTemporadas>ref.getNumeroDeTemporadas()){
            estado=mayor;
        }else if(numeroDeTemporadas==ref.getNumeroDeTemporadas()){
            estado=igual;
        }
        return estado;
    }

    @Override
    public String toString() {
        return "********** Informacion de la Serie **********\n" +
                "\tTitulo               : " + titulo + "\n" +
                "\tNumero De Temporadas : " + numeroDeTemporadas +"\n"+
                "\tGenero               : " + genero + "\n" +
                "\tCreador por          : " + creador + "\n";
    }

    public boolean equals(Serie a){
        if (titulo.equalsIgnoreCase(a.getTitulo()) && creador.equalsIgnoreCase(a.getCreador())){
            return true;
        }
        return false;
    }
}
