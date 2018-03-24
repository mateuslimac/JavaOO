
public class Conta {

	private double saldo; //atributos de instancia do objeto
	private int agencia; //atributos de instancia do objeto
	private int numero; //atributos de instancia do objeto
	private Cliente titular;  // = new Cliente(); (se quisesse deixar default new Cliente, também pode, mas no nosso caso nem sempre quem vai criar uma nova conta é um cliente novo.)
	private static int total; //Usamos static porque eu quero que o atributo TOTAL pertença MESMO a CLASSE CONTA e não que ficasse em cada
							  //instancia criada da classe Conta. Como se fosse um atributo compartilhável p/todas as instancias
								
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("o total de contas é: "+ Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando a conta de número: "+ this.numero);
		
		}
	
	
	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	} //fim do método deposita
 
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	} //fim do método saca
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor; // ou poderia ser: this.saca(); (poderia reutilizar o método saca)
			destino.deposita(valor); // ou poderia fazer destino.saldo += saldo. Só que eu aproveitei o metodo deposita, pq faz a mesma coisa.
			return true;
		}
		return false;		
		
	} //fim do método transfere
	
	public double getSaldo() {
		return this.saldo;
	} //fim do método getSaldo
	
	public int getNumero() {
		return this.numero;	
	} //fim do método getNumero
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Valor inválido! Número da conta nao pode ser menor ou igual a zero.");
			return;
		}
		this.numero = numero;		
	} //fim do método setNumero

	public int getAgencia() {
		return this.agencia;
	} //fim do metodo getAgencia
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Valor inválido! Agencia nao pode ser menor ou igual a zero.");
			return; // para a execução do método, não vai executar a linha de baixo. (COMO É VOID, VOCE NAO COLOCA NADA DO LADO.)
		}
		this.agencia = agencia;
	} //fim do metodo setAgencia
	
	public Cliente getTitular() {
		return this.titular;
	} //fim do metodo getTitular
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	} //fim do metodo setTitular
	
	public static int getTotal() { //também preciso dizer que esse método pertence a classe, e não a instancia da classe.
		return Conta.total;
	}
	
} //fim da classe Conta
