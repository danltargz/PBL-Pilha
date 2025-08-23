class Pilha {
    private int capacidade;
    private int topo;
    private char[] dados;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.topo = -1;
        this.dados = new char[capacidade];
    }

    public void Insere(char elemento) {
        if (Cheia()) return;
        topo++;
        dados[topo] = elemento;
    }

    public boolean Cheia() {
        return topo == (capacidade - 1);
    }

    public boolean Vazia() {
        return topo == -1;
    }

    public char Remove() {
        if (Vazia()) return '\0';
        char elemento = dados[topo];
        topo--;
        return elemento;
    }
}