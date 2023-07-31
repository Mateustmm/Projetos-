package apppilha;

public class AppPilha {
    
    public static void main(String[] args) throws Exception {
        // Teste aqui todos os comandos solicitados.
        PilhaSequencial pilha = new PilhaSequencial();
        pilha.empilha(1);
       
        
        //pilha.getTamanho();
        //pilha.esvazia();
        System.out.println(pilha.getTamanho());
        System.out.println(pilha.peek());
        
    }
}
