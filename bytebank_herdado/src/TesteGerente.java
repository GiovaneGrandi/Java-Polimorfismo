public class TesteGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marco"); //Utilizando getters e setters definidos na classe Funcionario porém agora usando o Gerente como sujeito das frases
		g1.setCpf("1122334455");
		g1.setSalario(5000);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222); //Utilizando o método exclusivo da classe Gerente
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}
}
