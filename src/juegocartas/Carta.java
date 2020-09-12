package juegocartas;

import java.util.Objects;

public class Carta {
    private int numero;
    private Figura figura;

    public Carta(int numero, Figura figura) {
        this.numero = numero;
        this.figura = figura;
    }

    public int getNumero() {
        return numero;
    }

    public Figura getFigura() {
        return figura;
    }

    @Override
    public boolean equals(Object o) {
        Carta carta = (Carta) o;
        return this.numero == carta.getNumero() &&
                this.figura == carta.getFigura();
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, figura);
    }

    @Override
    public String toString() {
        String cad;
        if(this.getNumero()==1){
            cad="A";
        }else if(this.getNumero()==11){
            cad="J";
        }else if(this.getNumero()==12){
            cad="Q";
        }else if(this.getNumero()==13){
            cad="K";
        }else{
            cad=""+this.getNumero();
        }

        if(this.getFigura() == Figura.Corazon){
            cad+= "C";
        }else if(this.getFigura() == Figura.Diamante){
            cad+= "D";
        }else if(this.getFigura() == Figura.Picas){
            cad+= "P";
        }else if(this.getFigura() == Figura.Trebol){
            cad+= "T";
        }
        return cad;
    }
}
