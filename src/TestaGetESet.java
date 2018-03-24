
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
				
		conta.deposita(300);
		System.out.println("Valor do saldo: " + conta.getSaldo());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");

		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("programador"); // conta pega (get) o titular e altera (set) a profissão
		System.out.println(conta.getTitular().getProfissao()); 
		
		// agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(paulo);
		System.out.println(titularDaConta);
		System.out.println(conta.getTitular());
		
	} 
}
