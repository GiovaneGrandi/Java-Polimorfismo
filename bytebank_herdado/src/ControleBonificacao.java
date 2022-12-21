public class ControleBonificacao {
	
	private double soma; //Criando o atributo "soma" que irá justamente somar todas as bonificações ganhas por todos Funcionarios
	
	public void registra(Funcionario funcionario) { //Criando um método que recebe como parâmetro uma referencia genérica do tipo Funcionario, mesmo na execução eu dando uma referencia de um tipo mais específico como Gerente ou EditorDeVideo ele irá pegar a bonificação exclusiva de cada um deles
		double bonificacao = funcionario.getBonificacao(); //Guardando a bonificação requisitada em uma variavel
		this.soma = this.soma + bonificacao; //Código que realiza a soma de todas bonificações pedidas 
	}
	
	public double getSoma() { //Método que retorna o valor total da soma para que ela possa ser vista em locais fora da própria classe
		return soma;
	}
	
}

//Nesses casos ao contrário do exemplo anterior onde referenciar um Gerente como um Funcionario iria limitar as suas funcionalidades aqui acaba sendo muito melhor usar uma referencia do tipo Funcionario para chegar no Gerente e conseguir executa-lo, assim evitando ter de fazer um método registra para cada novo tipo de Funcionario novo adicionado na empresa
//VIVA O POLIMORFISMO

//Basicamente: ao criar um objeto Gerente utilizando uma referencia do tipo Funcionario você vai estar limitando aquele gerente a um funcionario comum, porém em um método genérico que você crie que deva ser utilizado por todos os tipos de funcionarios, ao invés de criar um pra cada e escrever demais você pode usar uma referencia genérica como Funcionario, até porque independente do cargo da pessoa ela sempre será um Funcionario então o código irá compilar, porém nos métodos mesmo a referencia sendo do tipo genérico o Java vai olhar para aquele objeto, se ele não for do tipo Funcionario ele vai executar o comando inerente a aquela classe específica
//Obs: Um objeto NUNCA muda de tipo, ele nasce daquele tipo e morre daquele tipo, porém as referencias sim podem mudar de tipos
