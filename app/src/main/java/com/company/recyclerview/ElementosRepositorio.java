package com.company.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class ElementosRepositorio {

    List<Elemento> elementos = new ArrayList<>();

    interface Callback {
        void cuandoFinalice(List<Elemento> elementos);
    }

    ElementosRepositorio(){
        elementos.add(new Elemento("Bulbasaur", "Este Pokémon nace con una semilla en el lomo, que brota con el paso del tiempo."));
        elementos.add(new Elemento("Ivysaur", "Cuando le crece bastante el bulbo del lomo, pierde la capacidad de erguirse sobre las patas traseras."));
        elementos.add(new Elemento("Venusaur", "La planta florece cuando absorbe energía solar, lo cual le obliga a buscar siempre la luz del sol."));
        elementos.add(new Elemento("Charmander", "Prefiere las cosas calientes. Dicen que cuando llueve le sale vapor de la punta de la cola."));
        elementos.add(new Elemento("Charmeleon", "Este Pokémon de naturaleza agresiva ataca en combate con su cola llameante y hace trizas al rival con sus afiladas garras."));
        elementos.add(new Elemento("Charizard", "Se dice que el fuego de Charizard arde con más fuerza cuantas más duras batallas haya vivido."));
        elementos.add(new Elemento("Squirtle", "Cuando retrae su largo cuello en el caparazón, dispara agua a una presión increíble."));
        elementos.add(new Elemento("Wartortle", "Se lo considera un símbolo de longevidad. Los ejemplares más ancianos tienen musgo sobre el caparazón."));
        elementos.add(new Elemento("Blastoise", "Para acabar con su enemigo, lo aplasta con el peso de su cuerpo. En momentos de apuro, se esconde en el caparazón."));
        elementos.add(new Elemento("Caterpie", "Para protegerse, despide un hedor horrible por las antenas con el que repele a sus enemigos."));
        elementos.add(new Elemento("Metapod", "Como en este estado solo puede endurecer su coraza, permanece inmóvil a la espera de evolucionar."));
        elementos.add(new Elemento("Butterfree", "Adora el néctar de las flores. Una pequeña cantidad de polen le basta para localizar prados floridos."));
        elementos.add(new Elemento("Weedle", "El aguijón de la cabeza es muy puntiagudo. Se alimenta de hojas oculto en la espesura de bosques y praderas."));
        elementos.add(new Elemento("Kakuna", "Aunque es casi incapaz de moverse, en caso de sentirse amenazado puede envenenar a los enemigos con su aguijón."));
        elementos.add(new Elemento("Beedrill", "Tiene tres aguijones venenosos, dos en las patas anteriores y uno en la parte baja del abdomen, con los que ataca a sus enemigos una y otra vez."));
    }

    List<Elemento> obtener() {
        return elementos;
    }


    void actualizar(Elemento elemento, float valoracion, Callback callback) {
        callback.cuandoFinalice(elementos);
    }
}
