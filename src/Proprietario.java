
public class Proprietario {

	private String nome;
	private String cpf;
	private String rg;
	private String dataDeNascimento;
	private Endereco endereco = new Endereco();
	
	
	public Proprietario() {
		
	}
	
	public Proprietario(String nome, String cpf, String rg, Endereco endereco, String dataDeNascimento) {
		this.endereco = endereco;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Propietario [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", dataDeNascimento=" + dataDeNascimento
				+ ", endereco=" + endereco.toString() + "]";
	}
	
	

}
