
package controleempresa;


public class Administrador  extends Funcionario implements Autenticavel {
    
    private Autenticador autenticou;
	
	public Administrador() {
		this.autenticou = new Autenticador();
	}
	                     
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 50;
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
