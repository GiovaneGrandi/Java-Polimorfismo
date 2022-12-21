public class Cliente implements Autenticavel { //A palavra chave "implements" serve para dizer que uma classe "assinou o contrato" com uma interface que a obriga a implementar os seus métodos

	private Autenticador autenticador;
	
	public Cliente() {
		this.autenticador = new Autenticador(); //Criando um construtor que ao ser inicializado um objeto do tipo Cliente ele irá criar junto um Autenticador que irá armazenar a senha e os métodos
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha); //Continuo com o método no Cliente, mas a sua implementação é toda feita através da classe "Autenticador" que tem a função setSenha nela /Eu uso os "." para percorrer pela classe "Autenticador" e então invocar os seus métodos
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha); //Aqui eu peço para o Autenticador usar o método autentica dele e então fazer a sua verificação em seguida retornando o resultado boolean para o Cliente seguir com as ações
	} 

	
	
}
