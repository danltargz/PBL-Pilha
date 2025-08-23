class Expressao {

    public int valida(String expressao) {
        Pilha pilha = new Pilha(expressao.length());
        int indice = 0;

        while (indice < expressao.length()) {
            char caractereAtual = expressao.charAt(indice);

            if (caractereAtual == '(' || caractereAtual == '{' || caractereAtual == '[') {
                pilha.Insere(caractereAtual);
            } else if (caractereAtual == ')' || caractereAtual == '}' || caractereAtual == ']') {
                if (pilha.Vazia()) return 0;
                char topoPilha = pilha.Remove();
                if (!corresponde(topoPilha, caractereAtual)) return 0;
            }

            indice++;
        }

        if (pilha.Vazia()) {
            return 1;
        } else {
            return 0;
        }
    }

    private boolean corresponde(char caractereAbre, char caractereFecha) {
        if (caractereAbre == '(' && caractereFecha == ')') return true;
        if (caractereAbre == '{' && caractereFecha == '}') return true;
        if (caractereAbre == '[' && caractereFecha == ']') return true;
        return false;
    }
}
