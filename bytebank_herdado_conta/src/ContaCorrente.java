public class ContaCorrente extends Conta implements Tributavel {
//	public ContaCorrente() {
//		//super(); //Chamando o construtor da classe mãe /Com o construtor generico criado na classe mãe o super passa a estar atrelado automaticamente, não é necess´pario invocalo 
//	}
	
	public ContaCorrente(int agencia, int numero) { //Chamando um construtor especifico atraves dos parametros
		super(agencia, numero); //Chamando os parametros usados no construtor mãe
	}
	
	@Override //Ao sobrescrever um método no Java é importante deixar o "@Override" para que assim ele interprete isso como uma sobrescrita e não um método totalmente novo, assim ele irá corrigir a assinatura do método corretamente
		public boolean saca(double valor) {
			double valorASacar = valor + 0.2;
			return super.saca(valorASacar);
		}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
}

//Ao herdar uma classe você herda todos os seus métodos e seus atributos mas nunca os seus construtores!
//Não é possível chamar um construtor generico por não existir um na classe mãe, mas ao invocar uma classe especifica existente na mãe o cóidigo compila normalmente 