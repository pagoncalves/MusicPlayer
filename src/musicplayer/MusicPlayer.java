package musicplayer;
//pratica de encapsulamento
public class MusicPlayer {
    public static void main(String[] args) {
        
        int [] fx = new int[12];
        
        Controle c = new Controle();
        c.ligar();
        c.abrirMenu();
        c.play();
        c.aumentarVolume();
        c.próxima();
        c.abrirMenu();
        c.próxima();
        c.aumentarVolume();
        c.pause();
        c.abrirMenu();
        c.play();
        c.abrirMenu();
        c.stop();
        c.abrirMenu();
        c.aleatorio();
      
    }
    
}
