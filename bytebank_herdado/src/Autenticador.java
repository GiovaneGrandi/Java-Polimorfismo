public class Autenticador { //Criando uma classe que irá servir para fazer todo o processo de autenticação dos autenticaveis, pois o código de autenticação se repete em todas 3 classes que precisam dele, assim eu junto todos os métodos e atributos em um só lugar

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	} 
	
}

//Juntar o funcionamento dos métodos repetidos em um só lugar e então invocalos de maneiras mais simples nas classes é chamado de "Composição"
//Quando um objeto herda(extende) algo ele "é aquilo"
//Quando um objeto assina um contrato com uma interface ele também "é aquilo"
//Já quando é criada uma composição o objeto "tem aquilo" porque um está diretamente atrelado ao outro, quando um nasce, o outro nasce, quaqndo um morre, o outro morre

//A herança em Java é utilizada quando se precisa reutilizar um código diversas vezes e usar do polimorfismo
//Mas quando só se precisa usar o polimorfismo usar as interfaces já é o suficiente
//Agora, se precisa apenas evitar a reutilização excessiva de código, a composição em Java é a melhor escolha
//Dependendo da situação cada uma dessas ferramentas será melhor do que as outras