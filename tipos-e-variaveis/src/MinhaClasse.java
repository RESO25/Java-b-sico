public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        short numeroPequeno = 1;
        int numeroInteiro = (int) numeroPequeno;
        numeroPequeno = (short) (numeroInteiro*2);

        final int resultado = (int) (numeroPequeno + numeroInteiro); 

        String texto = resultado > 5 ? "Maior que 5" : "Menor ou igual a 5";

        System.out.println(texto);

    }
}
