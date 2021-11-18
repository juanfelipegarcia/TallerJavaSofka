package com.sofka.taller.punto18;

public class EntregableTest {
    public static void main(String[] args) {

        Serie listSeries[] = new Serie[10];
        VideoJuego listVideoJuegos[] = new VideoJuego[10];

        listSeries[0] = new Serie("Lost in space",2, "Drama","Molly Parker");
        listSeries[1] = new Serie("Orange is the new black", 7, "Comedia", "Taylor Schilling");
        listSeries[2] = new Serie("Lucifer", 6, "Crimenes", "Tom Ellis");
        listSeries[3] = new Serie("Moder Famili", 11, "Comedia", "Ed O`neil" );
        listSeries[4] = new Serie("Blindspot", "Sullivan Srapleton");
        listSeries[5] = new Serie("The Walking Dead", "Andrew Lincoln");
        listSeries[6] = new Serie("The witcher", "Henry Cavil");
        listSeries[7] = new Serie("Lockey & Key", "Darby Stanchfield");
        listSeries[8] = new Serie("The Gift","Beren Saat");
        listSeries[9] = new Serie();

        listVideoJuegos[0] = new VideoJuego("Super Mario Galaxy",200, "Aventura", "Nintendo");
        listVideoJuegos[1] = new VideoJuego("Super Mario Galaxy 2",180, "Aventura", "Nintendo");
        listVideoJuegos[2] = new VideoJuego("The legend of Zelda Ocanite On time", 201, "Aventura", "Nintendo");
        listVideoJuegos[3] = new VideoJuego("The Legend of Zelda Skyward Sword", 200, "Aventura", "Nintendo");
        listVideoJuegos[4] = new VideoJuego("Xenoblade Chronicles", "Monolith Soft");
        listVideoJuegos[5] = new VideoJuego("Metroid Dread", "MercurySteam ");
        listVideoJuegos[6] = new VideoJuego("God od War", "Santa Monica Studio");
        listVideoJuegos[7] = new VideoJuego("Halo", " Industries");
        listVideoJuegos[8] = new VideoJuego();
        listVideoJuegos[9] = new VideoJuego();

        listSeries[2].entregar();
        listSeries[6].entregar();
        listSeries[8].entregar();
        listVideoJuegos[4].entregar();
        listVideoJuegos[9].entregar();
        listVideoJuegos[1].entregar();

        int entregados=0;
        int seriesEntregadas= 0;
        int videoJuegosEntregados = 0;

        for(int i=0;i<listSeries.length;i++){

            if(listSeries[i].isEntregado()){
                entregados+=1;
                seriesEntregadas+=1;
                listSeries[i].devolver();
            }
            if(listVideoJuegos[i].isEntregado()){
                entregados+=1;
                videoJuegosEntregados+=1;
                listVideoJuegos[i].devolver();
            }
        }
        System.out.println("*********************************************");
        System.out.println("*\t Hay "+entregados+" articulos entregados ");
        System.out.println("* Series        = "+seriesEntregadas);
        System.out.println("* Video Juegos  = "+videoJuegosEntregados);
        System.out.println("*********************************************\n");

        Serie serieMayor=listSeries[0];
        VideoJuego videojuegoMayor=listVideoJuegos[0];

        for(int i=1;i<listSeries.length;i++){
            if(listSeries[i].compareTo(serieMayor)==Serie.mayor){
                serieMayor=listSeries[i];
            }
            if(listVideoJuegos[i].compareTo(videojuegoMayor)==VideoJuego.mayor){
                videojuegoMayor=listVideoJuegos[i];
            }
        }

        System.out.println(videojuegoMayor);
        System.out.println(serieMayor);

    }
}
