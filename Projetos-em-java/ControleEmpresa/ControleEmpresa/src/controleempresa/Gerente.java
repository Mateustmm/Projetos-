
package controleempresa;


public class Gerente extends Funcionario implements Autenticavel {
    
    private Autenticador autenticou;
    
    public Gerente() {
        this.autenticou = new Autenticador();
    }

    @Override
    public double getBonificacao() {
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticou.setSenha(senha);
    }

    @Override
    public boolean atentica(int senha) {
        return this.autenticou.atentica(senha);
    }

}
