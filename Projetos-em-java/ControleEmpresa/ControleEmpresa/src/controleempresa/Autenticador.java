
package controleempresa;


public class Autenticador {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean atentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

}
