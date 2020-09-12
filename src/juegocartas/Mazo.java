package juegocartas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.stream.IntStream;

public class Mazo {
    private LinkedList<Carta> mazo;
    private int numMazos;
    private boolean isComodin;

    public Mazo(int numMazos, boolean isComodin) {
        this.numMazos = numMazos;
        this.isComodin = isComodin;
        this.mazo = new LinkedList<>();
        this.reset();
    }

    public void reset(){
        this.mazo.clear();
        this.generateMazo();
    }

    public Carta getCarta(){
        Carta tmp = this.mazo.get(0);
        this.mazo.remove(0);
        return tmp;
    }

    private void generateMazo(){
        for(int i=0; i<this.getNumMazos(); i++){
            for(Figura fig:Figura.values()){
                for(int x=1; x<=13; x++){
                    mazo.add(new Carta(x,fig));
                }
            }
        }
    }

    public void mezclar(){
        LinkedList<Carta> tmp = new LinkedList();
        Random ran = new Random();
        IntStream intStream = ran.ints(this.mazo.size(), 1, 7);
        Iterator iterator = intStream.iterator();

        int i = this.mazo.size()/2;
        int j = i+1;
        int aux;

        while(i>=0 && j<this.mazo.size()){
            if(ran.nextBoolean()){
                aux = Integer.parseInt(iterator.next().toString());
                for(int x=j; x<j+aux && x<this.mazo.size(); x++){
                    tmp.add(this.mazo.get(x));
                }
                j=j+aux;
            }else{
                aux = Integer.parseInt(iterator.next().toString());
                for(int x=i; x>i-aux && x>=0; x--){
                    tmp.add(this.mazo.get(x));
                }
                i=i-aux;
            }
        }
        while(j<this.mazo.size()){
            tmp.add(this.mazo.get(j));
            j++;
        }
        while(i>=0){
            tmp.add(this.mazo.get(i));
            i--;
        }
        this.mazo.clear();
        this.mazo.addAll(tmp);
    }


    public LinkedList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(LinkedList<Carta> mazo) {
        this.mazo = mazo;
    }

    public int getNumMazos() {
        return numMazos;
    }

    public void setNumMazos(int numMazos) {
        this.numMazos = numMazos;
    }

    public boolean isComodin() {
        return isComodin;
    }

    public void setComodin(boolean comodin) {
        isComodin = comodin;
    }

    @Override
    public String toString() {
        return mazo.toString();
    }
}
