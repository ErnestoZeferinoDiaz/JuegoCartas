package juegocartas;

import java.util.LinkedList;

public class BasicJugador {
    private LinkedList<Carta> cartasInicio;

    public BasicJugador(){
        this.cartasInicio = new LinkedList();
    }

    public void reset(){
        cartasInicio.clear();
    }

    public void addCarta(Carta a){
        this.cartasInicio.add(a);
    }

    public void removeCarta(Carta a){
        this.cartasInicio.remove(a);
    }

    public void removeCarta(int index){
        this.cartasInicio.remove(index);
    }

    public LinkedList<Carta> getCartasInicio() {
        return cartasInicio;
    }

    public void setCartasInicio(LinkedList<Carta> cartasInicio) {
        this.cartasInicio = cartasInicio;
    }
}
