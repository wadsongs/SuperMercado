public class Cliente {
    private String nome;
    private int numeroDeItens;

    public Cliente (String nome, int numeroDeItens) {
//        this.nome = nome;
//        this.numeroDeItens = numeroDeItens;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeItens() {
        return numeroDeItens;
    }

    public void setNumeroDeItens(int numeroDeItens) {
        this.numeroDeItens = numeroDeItens;
    }
}
