
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println("Agencia: " + conta.getAgencia());	
		
		Conta conta2 = new Conta(1337, 16549);
		Conta conta3 = new Conta(1223, 123123);
		
		System.out.println(Conta.getTotal());
		
		
		// conta está incosistente em relação a regra de negocio. Porque agencia e numero nao pode ser valor <= zero.
		//conta.setAgencia(-100);
		//conta.setNumero(-30);
		
		
		
	}
}
