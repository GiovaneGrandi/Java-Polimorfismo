public abstract class Funcionario { //A palavra chave "abstract" serve para informar que aquela classe é abstrata, ou seja, que ela não serve para ser usada normalmente para criar objetos, mas sim para ser herdada pelas futuras novas classes que forem criadas para manter um bom funcionamento no sistema
	//O abstract impede a execução do comando "new Funcionario" afinal não existe a função "funcionario" em uma empresa, por tanto essa classe só serve para ser herdada pelos outros tipos de Funcionarios
	private String nome;
	private String cpf;
	//protected double salario; //O modificador de visibilidade "protected" é um meio termo entre o private e o public por significar que aquele atributo é apenas acessível pelos filhos daquela classe e mais ninguém
	private double salario;
	
//	public double getBonificacao() { //É possível criar um get/set de algo que não seja um atríbuto existente, pode usar a nomenclatura do get/set a vontade para criar métodos livres dos atributos
//		return this.salario * 0.05; //Um método onde irá adicionar 10% de bonificação ao salário do funcionário desejado
//	}
	
	public abstract double getBonificacao(); //Para que a classe "ControleBonificacao" funcione sem um modelo de bonificação padrão, deverá ser criado um método abstrato usando a palavra chave "abstract" assim como na classe pode existir um método abstrato que só estará ali para ser acessado pelos seus filhos
	//Um método abstrato não tem implementação, ou seja, não tem nenhum comando dentro de suas "{}" por isso ele deve ser aproveitado pelos filhos da classe para o implementarem como quiserem /Os filhos são obrigados a implementar os métodos abstratos da mãe senão o código não compila, porque um método abstrato não funciona em uma classe concreta
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
		
}
