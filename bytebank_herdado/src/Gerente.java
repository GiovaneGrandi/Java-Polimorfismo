public class Gerente extends Funcionario implements Autenticavel{ //O extends é usado para informar que a classe Gerente está herdando todos os atributos e métodos da classe Funcionario
	
	private Autenticador autenticador;
	
	public Gerente() {
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
	
	public double getBonificacao() { //Reescrevendo um método da classe Funcionario na classe Gerente para que ele tenha retornos diferentes em cada uma delas, para fazer uma reescrita de um método de uma classe para a outra é necessário replicar exatamente a mesma chamada de método de uma classe para a outra mudando apenas a execução da parte interna do método
		System.out.println("Chamando o método de bonificação do Gerente!");
		return super.getSalario(); //É uma boa prática entre os desenvolvedores Java utilizar a palavra chave "super" ao invés do "this" para se referir a um atributo da classe mãe /O this dá a entender que aquele atributo está declarado nessa classe, pois então, sempre que for referenciar um atributo da classe mãe é recomendável utilizar o super para melhorar a legibilidade do código /Ao invés de usar o "protected" para permitir os atributos de serem acessados pelos filhos é melhor usar o privado e quando necesário acessar eles pelos métodos get nas classes filhas
	} //Usando o super para invocar o método da classe mãe e reutiliza-lo para sobrescrever mais instruções sem ter que ficar duplicando código
	
}

//O atalho "ctrl + 7" serve para comentar múltiplas linhas selecionadas