public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        // A TV está desligada
        
        smartTv.ligarDesligar();
        //A TV ligou

        System.out.println("A TV está ligada? " + smartTv.ligada);
        // A TV está ligada

        System.out.println("Em qual canal a tv está? " +  smartTv.canal);
        // O canal atual é 1

        smartTv.subirCanal();
        // o canal subiu para 2

        System.out.println("Em qual canal a tv está? " +  smartTv.canal);
        // O canal atual é 2
    }
}
