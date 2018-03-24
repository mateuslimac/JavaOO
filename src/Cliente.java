
public class Cliente {

	private String nome;
	private String cpf;
	private String profissao;
	private Endereco enderecoCliente;
	
	/*public Cliente (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}*/
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public Endereco getEndereco() {
		return this.enderecoCliente;
	}
	
	public void setEndereco(Endereco enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	
}
