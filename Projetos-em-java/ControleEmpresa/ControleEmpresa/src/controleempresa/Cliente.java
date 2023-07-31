
package controleempresa;

public class Cliente implements Autenticavel {

    private Autenticador autenticou;

    public Cliente() {

        this.autenticou = new Autenticador();

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
