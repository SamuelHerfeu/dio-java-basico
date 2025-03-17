public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void  mudarCanal (int novoCanal){
        canal = novoCanal;    
    }
    public void aumentarCanal(){
        canal++;        
    }

    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuir o volume para: " + volume);
    }

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }
}
