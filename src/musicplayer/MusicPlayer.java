package musicplayer;
//pratica de encapsulamento

public class MusicPlayer {

    public static void main(String[] args) {

        Controle c = new Controle();
        c.ligar();
        c.abrirMenu();
        c.play();
        c.diminuirVolume();
        c.diminuirVolume();
        c.proxima();
        c.abrirMenu();
        c.proxima();
        c.aumentarVolume();
        c.pause();
        c.abrirMenu();
        c.play();
        c.abrirMenu();
        /* c.stop();
        c.abrirMenu();
        c.play();
        c.aleatorio();
        c.proxima();
        c.abrirMenu();
        c.proxima();
        c.abrirMenu();
        c.desligaAleatorio();
        c.abrirMenu();*/
        c.proxima();
        c.abrirMenu();
        c.proxima();
        c.abrirMenu();
    }

}
