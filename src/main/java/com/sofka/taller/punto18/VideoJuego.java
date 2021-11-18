package com.sofka.taller.punto18;

public class VideoJuego implements Entregable {

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    private static int horasEstimadasPredeterminadas=100;
    public  static int mayor=1;
    public  static int menor=-1;
    public  static int igual=0;

    //contructores

    public VideoJuego() {
    }

    public VideoJuego(String titulo, String compania) {
        this(titulo,horasEstimadasPredeterminadas, "", compania);
    }

    public VideoJuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

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
        //Casting de objetos para usar el metodo get
        VideoJuego ref=(VideoJuego)a;
        if (horasEstimadas>ref.getHorasEstimadas()){
            estado=mayor;
        }else if(horasEstimadas==ref.getHorasEstimadas()){
            estado=igual;
        }
        return estado;
    }

    @Override
    public String toString(){
        return "********* Informacion del videojuego ******** \n" +
                "\tTitulo               : "+titulo+"\n" +
                "\tHoras estimadas      : "+horasEstimadas+"\n" +
                "\tGenero               : "+genero+"\n" +
                "\tcompañia             : "+compania;
    }

    public boolean equals(VideoJuego a){
        if (titulo.equalsIgnoreCase(a.getTitulo()) && compania.equalsIgnoreCase(a.getCompania())){
            return true;
        }
        return false;
    }
}
