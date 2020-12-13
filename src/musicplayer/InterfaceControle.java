package musicplayer;
//estudo de encapsulamento
public interface InterfaceControle {
    //public para ser acessado fora 
    //abstract porque não será utilizado na classe
    //void porque nao retorna
    public abstract void abrirMenu();//abrir display
    public abstract void ligar();//liga
    public abstract void desligar();//desliga
    public abstract void play();//inicia
    public abstract void pause();//pausa
    public abstract void stop();//para e volta a contagem para 1
    public abstract void proxima();//avança 1
    public abstract void anterior();//volta 1
    public abstract void aumentarVolume();// salto 2
    public abstract void diminuirVolume();//salto 2
    public abstract void aleatorio();//proxima faixa aleatoria
    public abstract void desligaAleatorio();// volta faixa sequencial
}
