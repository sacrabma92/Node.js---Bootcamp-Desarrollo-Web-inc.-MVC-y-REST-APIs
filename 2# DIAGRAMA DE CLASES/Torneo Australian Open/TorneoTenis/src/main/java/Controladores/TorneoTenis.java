package Controladores;

import Modelos.Jugador;
import Modelos.Raqueta;

public class TorneoTenis {

    public static void main(String[] args) {
        int numero = 5;
        Jugador jugador1 = new Jugador("1", "Nadal", "España", 1, 40, 0);
        Jugador jugador2 = new Jugador("2", "Luis", "Colombia", 98, 35, 0);
        
        Raqueta raqueta1 = new Raqueta("1", "nike", 40.6);
        Raqueta raqueta2 = new Raqueta("2", "puma", 39.6);
        
        jugador1.describirJugador();
        jugador1.setRaqueta(raqueta1);
        jugador1.describirJugador();
    }
}
