package appconversaobinario;

public class PilhaSequencial implements IPilha {

    private int quantidade;
    private int TamanhoMaximoDaPilha = 100;
    private int[] lista;

    public PilhaSequencial() {
        this.quantidade = 0;
        this.lista = new int[this.TamanhoMaximoDaPilha];
    }

    @Override
    public void empilha(int n) throws Exception {
        if (!this.estaCheia()) {
            this.lista[this.quantidade] = n;
            this.quantidade++;
        } 
    }
    
        @Override
    public int desempilha() throws Exception {
        if (!this.estaVazia()) {
            --this.quantidade;
            return this.lista[this.quantidade];
        } else {
            throw new Exception("A pilha está vazia");
        }
    }

    public boolean estaVazia() {
        return this.quantidade == 0;
    }

    private boolean estaCheia() {
        return this.quantidade == this.TamanhoMaximoDaPilha;
    }
}
