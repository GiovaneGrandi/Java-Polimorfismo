public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		//Funcionario g2 = new Gerente(); /É possível criar um objeto filho (Gerente) utilizando uma referencia do tipo mãe (Funcionario), essa é a base do polimorfismo, onde se tem diversas formas de se criar o mesmo objeto, porém nesse exemplo isso não trás benefícios algum pois criando uma referencia do tipo Funcionario só é possível utilizar os métodos do Funcionario, afinal o Java só presta atenção na referencia que está chamando o método e não em qual objeto ela representa
		
		g1.setNome("Marcos");
		g1.setSalario(5000);
		
		EditorDeVideo ev1 = new EditorDeVideo();
		ev1.setSalario(2500);
		
		Designer d1 = new Designer();
		d1.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1); //Passando como parâmetro um objeto do tipo Gerente mesmo sendo exigido um Funcionario, pelo Gerente ser um Funcionario o código não só compila como também é possível pegar a bonificação de um Gerente ao invés de passar a de um Funcionario comum por engano
		controle.registra(ev1);
		controle.registra(d1);
		
		System.out.println(controle.getSoma());
	}

}
