package applistadupla;

public class ListaDupla {

    private Celula cabeca;

    public ListaDupla() {
        this.cabeca = null;
    }

    public void adicionaNoFim(int valor) {
        Celula novo = new Celula(valor);
        if (this.cabeca == null) {
            this.cabeca = novo;
        } else {
            Celula ultimo = this.cabeca;
            while (ultimo.getProximo() != null) {
                ultimo = ultimo.getProximo();
            }
            ultimo.setProximo(novo);
            novo.setAnterior(ultimo);
        }
    }
    
    // Não modificar a assinatura
    public void removePenultimo(){
        // Implementar aqui:
        Celula cursor = this.cabeca;
        while (cursor.getProximo()!=null){
        
            cursor = cursor.getProximo();
        
        }
            cursor = cursor.getAnterior();
            Celula ultimo = cursor.getAnterior();
            ultimo.setProximo(cursor.getProximo());
            
        // Remover o penúltimo elemento da lista duplamente encadeada.
    }
    
    public void imprime(){        
        for (Celula c = this.cabeca; c != null; c = c.getProximo()) {
            System.out.print(c);
            System.out.print(" ");
        }
        System.out.println();
    }
}
