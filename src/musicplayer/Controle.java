package musicplayer;

import java.util.Random;

public class Controle implements InterfaceControle {

    //Atributos
    private boolean ligado;
    private boolean tocando;
    private int faixa;
    private int volume;
    private boolean aleatorio;
    private int nfaixa;//numero de faixas

    //Métodos Especiais
//construtor define o estado inicial do objeto
    public Controle() {
        this.ligado = false;
        this.tocando = false;
        this.faixa = 1;
        this.volume = 10;
        this.nfaixa = 12;
        this.aleatorio = false;
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

    public boolean isAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(boolean aleatorio) {
        this.aleatorio = aleatorio;
    }

    public int getNfaixa() {
        return nfaixa;
    }

    public void setNfaixa(int nfaixa) {
        this.nfaixa = nfaixa;
    }

    //Métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("Bem vindo!");

    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("Desligando...");
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
    public void proxima() {
        if (this.getLigado() && (this.getNfaixa() > 0)) {
            if (aleatorio == true) {
                Random ale = new Random();
                this.setFaixa(ale.nextInt(this.getNfaixa()));
            } else {
                if (faixa == nfaixa) {
                    faixa = 1;
                } else {
                    this.setFaixa(this.getFaixa() + 1);
                }

            }

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
        if (this.getLigado() && this.getVolume() < 30) {
            this.setVolume(this.getVolume() + 2);
        }
    }

    @Override
    public void diminuirVolume() {
        if (this.getLigado() && this.getVolume() >= 0) {
            this.setVolume(this.getVolume() - 2);
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
        if (this.aleatorio == true) {
            System.out.println("?");
        } else {
            System.out.println(">1");
        }
    }

    @Override
    public void aleatorio() {
        if (ligado == true) {
            this.setAleatorio(true);
            proxima();
        }

    }

    @Override
    public void desligaAleatorio() {
        this.setAleatorio(false);
        proxima();
    }

}
