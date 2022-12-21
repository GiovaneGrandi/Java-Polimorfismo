public class EditorDeVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Editor de Vídeo!"); //Criando um system out para mostrar que graças ao polimorfismo mesmo a referencia sendo genérica o método da bonificação irá pegar a bonificação especial de cada objeto
		return 150;
	}
}
