public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel Autenticavel) { //Eu posso usar como referencia uma referencia do tipo do contrato que aquele objeto tem, então o "Autenticavel" pode servir como uma referencia para aqueles que assinaram seu contrato que são "Cliente", "Gerente" e "Administrador"
		boolean autenticou = Autenticavel.autentica(this.senha);
		if(autenticou) {
			System.out.println("Bem vindo ao sistema interno do Bytebank!");
		} else {
			System.out.println("Acesso negado!!");
		}
	}
}
