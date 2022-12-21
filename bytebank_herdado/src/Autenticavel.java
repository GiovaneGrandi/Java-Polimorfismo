public abstract interface Autenticavel { //Criando uma classe intermediaria que herda os comportamentos da classe "Funcionario" e que sirva para o Administrador e o Gerente herdarem ela para poderem fazer as suas autenticações exclusivas sem que qualquer Funcionario possa entrar no sistema /Após essa execução não dar certo irei transformar essa classe em uma interface
//A palavra chave "interface" serve para declarar uma interface
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
}

//Uma interface é uma classe abstrata que tem todos os seus métodos abstratos