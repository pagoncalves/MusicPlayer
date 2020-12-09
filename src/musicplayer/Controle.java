package musicplayer;

import java.lang.reflect.Array;

public class Controle implements InterfaceControle {

    //Atributos 
    private boolean ligado;
    private boolean tocando;
    private int[] faixa = new int [0];/*Arrumar metodo aleatorio*/
    private int volume;

    //Métodos Especiais 
//construtor define o estado inicial do objeto 
    public Controle() {
        this.ligado = false;
        this.tocando = false;
        this.faixa = new int[12] ;
        this.volume = 10;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public int getFaixa() {
        return faixa;
    }

    public void setFaixa(int faixa) {
        this.faixa = faixa;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //Métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("Bem vindo");

    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("Desligando");
    }

    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }

    @Override
    public void stop() {
        if (this.getLigado()) {
            this.setTocando(false);
            this.setFaixa(1);
        }
    }

    @Override
    public void próxima() {
        if (this.getLigado()) {
            this.setFaixa(this.getFaixa() + 1);
        }
    }

    @Override
    public void anterior() {
        if (this.getLigado() && (this.getFaixa() > 0)) {
            this.setFaixa(this.getFaixa() - 1);
        }
    }

    @Override
    public void aumentarVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 2);
        }
    }

    @Override
    public void diminuirVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 2);
        }
    }

    @Override
    public void aleatorio() {
        //construir algoritmo com arrays
        int fx[] = null;
        for (int i = 1; i < fx.length; i++) {
            fx[i] = i;

        }

    }

    @Override
    public void abrirMenu() {
        System.out.println("---Menu---");
        System.out.println("Faixa: " + this.getFaixa());
        System.out.println("Volume: " + this.getVolume());
        if (this.tocando == true) {
            System.out.println(">");
        } else {
            System.out.println("||");
        }
    }

}
