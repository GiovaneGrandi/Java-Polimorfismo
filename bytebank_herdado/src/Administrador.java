public class Administrador extends Funcionario implements Autenticavel{  //Ao contrário da herança uma classe pode impplementar quantas interfacez ou "assinar quantos contratos" ela quiser, não tem um limite

	//private int senha; //Inserindo o atributo necessário para os métodos funcionarem
	
//	@Override
//	public void setSenha(int senha) { //Adicionando os métodos exigidos pelo contrato com a interface "Autenticavel"
//		this.senha = senha;
//	}

	private Autenticador autenticador;
	
	public Administrador() {
		this.autenticador = new Autenticador();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha); 
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha); 
	} 
	
	@Override
	public double getBonificacao() {
		return 50;
	}

}
