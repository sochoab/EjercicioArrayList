/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquqte;

import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class Logica {
    int acum=0;
    public ArrayList <String> listaP;
    
    public Logica(){
     listaP = new ArrayList<String>();
     listaP.add("Rapido y furioso");
     listaP.add("Anabell");
     listaP.add("El oso ted");
     listaP.add("La niña del aro");
     listaP.add("Nerve");
     listaP.add("El hoyo");
     listaP.add("The avengers EndGame");
     listaP.add("Soy leyenda");
     listaP.add("The purge 2");
     listaP.add("Toy story 2");
    }
   
    
    public String descripcion(int p){
    String cadena="";
    if(p==1){
    cadena="Rapido y furioso, director gary scott, año 2001, Con Dom y Letty de luna de miel, Brian y Mia retirados y el resto de la pandilla viviendo en paz, parece que todo está tranquilo. Sin embargo, una misteriosa mujer seducirá a Dom para adentrarlo en el mundo del crimen y traicionar a la pandilla.";
    }else if(p==2){
    cadena="Anabelle, director John. Leonetti, año 2010,John Form encuentra el regalo perfecto para Mia, su esposa embarazada: una preciosa muñeca antigua llamada Annabelle. Una noche, una secta satánica les ataca brutalmente y provocan que un ente maligno se apodere de Annabelle. ";
    }else if(p==3){
    cadena="El oso ted, director Seth MacFarlane, año 2012, Cuando John Bennett era un niño pequeño, pidió el deseo de que Ted, su querido oso de peluche, cobrara vida. Treinta años más tarde, Ted continúa siendo el compañero de John, ante el disgusto de Lori, la novia de John.";
    }else if(p==4){
    cadena="La niña del aro, director Walter F. Parkes,año 2002, La historia se basa en Samara, una niña con dotes sobrenaturales que fue arrojada a un pozo y regresa desde la muerte a través de un video maldito. Si alquien ve la cinta, en siete días Samara saldrá del pozo para transportarse al mundo físico y asesinarlo.";
    }else if(p==5){
    cadena="Nerve, director Henry Joost, año 2016, Presionada por sus amigos, una adolescente participa en un juego de realidad virtual, pero el cariz de lo que se presuponía un divertimiento, cambia y se torna primero inquietante, después siniestro";
    }else if(p==6){
    cadena="El hoyo, director Galder Gaztelu, año 2020, En el futuro, los prisioneros se alojan en celdas verticales, observando cómo los presos de las celdas superiores son alimentados mientras los de abajo mueren de hambre ";
    }else if(p==7){
    cadena="The avengers, director Joe Russo, año 2019, DescripciónLos Vengadores restantes deben encontrar una manera de recuperar a sus aliados para un enfrentamiento épico con Thanos, el malvado que diezmó el planeta y el universo ";
    }else if(p==8){
    cadena="Soy leyenda, director Francis Lawrence, año 2007, Robert Neville, un brillante científico, es el único sobreviviente de una plaga creada por el hombre que transforma a los humanos en mutantes sedientos de sangre";
    }else if(p==9){
    cadena="The purge 2, director James DeMonaco, año 2014, Durante una noche de caos sancionada por el gobierno, la misión de un hombre para vengar a su hijo muerto se transforma en una búsqueda para proteger a unos desconocidos de unos asaltantes violentos. ";
    }else if(p==10){
    cadena="Toy story 2, director John Lasseter, año 1999, Andy se va de campamento y deja solos a sus juguetes. Entonces, Al McWhiggin, un compulsivo coleccionista de juguetes valiosos, encuentra a Woody y quiere quedárselo para su colección.";
    }
   return cadena;
    }
    

}
