
public class ContaMateus {

	public static void main(String[] args) {
		Conta contaDaBobodi = new Conta(7730, 15696);
		Cliente bobodi = new Cliente();
		Endereco enderecoBobodi = new Endereco("Rua caramuru", "Serrinha", 105);
		
		contaDaBobodi.setTitular(bobodi);
		contaDaBobodi.getTitular().setEndereco(enderecoBobodi);
		contaDaBobodi.getTitular().getEndereco().setComplemento("APARTAMENTO 106 // BLOCO A");
		
		
		
		//INFORMAÇÕES DA CONTA DO MATEUS.
		Conta contaDoMateus = new Conta(7730, 15695);
		Cliente mateus = new Cliente();
		Endereco enderecoMateus = new Endereco("Rua Duarte Pimentel", "Serrinha", 361);
		contaDoMateus.setTitular(mateus);
		contaDoMateus.getTitular().setEndereco(enderecoMateus);
		
		contaDoMateus.getTitular().setProfissao("programador");
		
		contaDoMateus.deposita(1000);
		//System.out.println("saldo atual da conta do mateus: "+ contaDoMateus.getSaldo());
		
		contaDoMateus.saca(300);
		//System.out.println("saldo atual depois do saque: "+ contaDoMateus.getSaldo());
		
		contaDaBobodi.deposita(400);
		contaDaBobodi.transfere(200, contaDoMateus);
		System.out.println(contaDoMateus.getSaldo());
		System.out.println(contaDaBobodi.getSaldo());
		
	}
}
