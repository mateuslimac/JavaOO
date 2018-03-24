
public class Endereco {
	
	private String rua;
	private String bairro;
	private String complemento;
	private int numero;
	
	public Endereco(String rua, String bairro, int numero) {
		
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
	}
	
	public String getRua() {
		return this.rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getBairro() {
		return this.bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getComplemento() {
		return this.complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
		
}
