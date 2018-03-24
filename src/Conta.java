
public class Conta {

	private double saldo; //atributos de instancia do objeto
	private int agencia; //atributos de instancia do objeto
	private int numero; //atributos de instancia do objeto
	private Cliente titular;  // = new Cliente(); (se quisesse deixar default new Cliente, tamb�m pode, mas no nosso caso nem sempre quem vai criar uma nova conta � um cliente novo.)
	private static int total; //Usamos static porque eu quero que o atributo TOTAL perten�a MESMO a CLASSE CONTA e n�o que ficasse em cada
							  //instancia criada da classe Conta. Como se fosse um atributo compartilh�vel p/todas as instancias
								
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("o total de contas �: "+ Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando a conta de n�mero: "+ this.numero);
		
		}
	
	
	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	} //fim do m�todo deposita
 
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	} //fim do m�todo saca
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor; // ou poderia ser: this.saca(); (poderia reutilizar o m�todo saca)
			destino.deposita(valor); // ou poderia fazer destino.saldo += saldo. S� que eu aproveitei o metodo deposita, pq faz a mesma coisa.
			return true;
		}
		return false;		
		
	} //fim do m�todo transfere
	
	public double getSaldo() {
		return this.saldo;
	} //fim do m�todo getSaldo
	
	public int getNumero() {
		return this.numero;	
	} //fim do m�todo getNumero
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Valor inv�lido! N�mero da conta nao pode ser menor ou igual a zero.");
			return;
		}
		this.numero = numero;		
	} //fim do m�todo setNumero

	public int getAgencia() {
		return this.agencia;
	} //fim do metodo getAgencia
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Valor inv�lido! Agencia nao pode ser menor ou igual a zero.");
			return; // para a execu��o do m�todo, n�o vai executar a linha de baixo. (COMO � VOID, VOCE NAO COLOCA NADA DO LADO.)
		}
		this.agencia = agencia;
	} //fim do metodo setAgencia
	
	public Cliente getTitular() {
		return this.titular;
	} //fim do metodo getTitular
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	} //fim do metodo setTitular
	
	public static int getTotal() { //tamb�m preciso dizer que esse m�todo pertence a classe, e n�o a instancia da classe.
		return Conta.total;
	}
	
} //fim da classe Conta
