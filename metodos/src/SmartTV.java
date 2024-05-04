public class SmartTV {
    boolean ligada = false;

    int canal = 1;

    int volume = 50;

    public void ligarDesligar(){
        ligada = !ligada;
    }

    public void aumentarVolume(){
        if(ligada == false)
            return;

        if(volume<100)
            volume++;
    }
    
    public void diminuirVolume(){
        if(ligada == false)
            return;

        if(volume<0)
            volume--;
    }

    public void subirCanal(){
        if(ligada == false)
            return;

        if(canal<5)
            canal++;
    }

    public void descerCanal(){
        if(ligada == false)
            return;

        if(canal>1)
            canal--;
    }
}
