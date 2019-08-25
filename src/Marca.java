import java.util.List;
import java.util.Random;

public class Marca {

	private Carro carro;

	private String modelos;
	
	private int anoDeFabricacao;
	
	private int chassi;
	
	private double valor;
	
	private double valorAluguel;
	
	Random generator = new Random();
	
	public double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(double valorAluguel) {
		
		valorAluguel += valorAluguel;
	}

	public Marca() {
		
	}
	
	public Marca(int modelo, int anoDeFabricacao, int chassi, String modelos  ) {
		this.anoDeFabricacao = anoDeFabricacao;
		this.modelos = modelos;
		this.chassi = chassi;
		
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	
	public String getModelos() {
		return modelos;
	}

	public void setModelos(String modelos) {
		this.modelos = modelos;
	}

	public int getAnoDeFabricacao() {
		
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(int anoDeFabricacao) {
		if(anoDeFabricacao == 2017) {
			
			valor = valor + 800.0;
		}else if(anoDeFabricacao == 2018) {
			
			valor = valor + 900.0;
		}else if(anoDeFabricacao == 2016){
			valor = valor + 700.0;
		}else {
			valor = valor + 500.0;
		}
		
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		
		
		this.valor = valor;
	}

	public int getChassi() {
		int i;
		for(i = 1000000; i < 50000000; i+=1000) {
			i++;
		}
		return generator.nextInt(i);
				
		
		
	}

	@Override
	public String toString() {
		return "Marca [carro=" + carro + ", modelo=" + modelos + ", anoDeFabricacao=" + anoDeFabricacao + ", chassi="
				+ chassi + "]";
	}
	
	


	
	
	
	
	
	
	
	
	
	
}
