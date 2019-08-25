
public class Endereco  {
	
	private String rua;
	private String bairro;
	private int numeroDaCasa;
	private String cidade;
	private String estado;
	private String cep;
	private String complemento;
	
	
	
	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Endereco(String rua, String bairro, String cidade, String estado, String cep, String complemento, int NumeroDaCasa ) {
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.numeroDaCasa = numeroDaCasa;
		this.complemento = complemento;
		
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setNumeroDaCasa(int numeroDaCasa) {
		this.numeroDaCasa = numeroDaCasa;
	}
	public int getNumeroDaCasa() {
		return numeroDaCasa;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep="
				+ cep + ", complemento=" + complemento + "]";
	}
	
	

}
