public class Main {
    public static void main(String[] args) {
        FilaSuperMercado f1 = new FilaSuperMercado(10);

        f1.entrarNaFila();
        f1.fila();
//        f1.entrarNaFila();
//        f1.entrarNaFila();
        System.out.println("O tamanho da fila eh: " + f1.tamanhoDaFila());
        f1.atenderCliente();
        System.out.println("O tamanho da fila eh: " + f1.tamanhoDaFila());
        f1.atenderCliente();


    }
}
