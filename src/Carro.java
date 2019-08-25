import java.util.Random;

public class Carro  {
	
	Marca marca;
	private Proprietario proprietario;
	private int velocidadeMax = 240;
	private int velocidadeAtual;
	private int tipo;
	private String cor;
	private int marchaAtual;
	private int numeroDePortas;
	private boolean temTetoSolar;
	private int numeroDeMarchas;
	private boolean temCambioAutomatico;
	private int volumeCombustivel;
	private int tipoDoCarro; // 0 - Nomal / 1 - Com Teto Solar/ 2 - Com Cambio Automatico / 4 - todas as features
	int i;
	

	Random rand = new Random();
	
	public Carro() {
		
	}
	public Carro(int VelocidadeMax, int tipoDoCarro, int numeroDePortas, boolean temTetoSolar, int numeroDeMarchas, boolean temCambioAutomatico, int volumeCombustivel) {
		
		this.velocidadeMax = velocidadeMax;
		this.tipoDoCarro = tipoDoCarro;
		this.numeroDePortas = numeroDePortas;
		this.temTetoSolar = temTetoSolar;
		this.numeroDeMarchas = numeroDeMarchas;
		this.temCambioAutomatico = temCambioAutomatico;
		this.volumeCombustivel = volumeCombustivel;
		
		
	} 
	
	
		
	
	public int  acelerar() {
		
		return velocidadeAtual++;
		
	}
	public int  reduzir() {
		
		return velocidadeAtual--;
		
	}
	
	
	
		
		
		
	

//		if(this.getVelocidadeAtual() == this.getVelocidadeMax()) {
//			System.out.println("Velocidade Máxima antigida");
//			return this.getVelocidadeMax();
//		}else {
//			this.velocidadeAtual ++;
			
//				System.out.println("Acelerando");
//				return this.getVelocidadeAtual();
//			}
			
//		}
		
		
	
	public void passarMarcha(int passarMarcha) {
		if(this.velocidadeAtual == 0) {
			passarMarcha = 0;
			System.out.println("O carro se encontra em ponto morto");
		}else if(this.velocidadeAtual == 20){
			passarMarcha = 1;
			System.out.println("marcha passada para 1");
		}else if(this.velocidadeAtual == 90) {
			passarMarcha = 2;
			System.out.println("marcha passada para 2");
		}else if(this.velocidadeAtual == 120) {
			passarMarcha = 3;
			System.out.println("marcha passada para 3");
		}else if(this.velocidadeAtual == 160) {
			passarMarcha = 4;
			System.out.println("marcha passada para a 4");
		}else if(this.velocidadeAtual == 180) {
			passarMarcha = 5;
			System.out.println("marcha passada para a 5");
		}else if(this.velocidadeAtual == 200) {
			passarMarcha = 6;
			System.out.println("marcha passada para a 6");
		}else if (this.velocidadeAtual == this.velocidadeMax) {
			passarMarcha = getNumeroDeMarchas();
			System.out.println("Já estamos na ultima marcha");
		}
	
	 }
	
	
	public void reduzirMarcha() {
		
		
		if(this.marchaAtual== 0 && this.velocidadeAtual == 0) {
			 this.marchaAtual --;
			 System.out.println("Está no ponto morto");
		}else if(this.marchaAtual <= -1 && this.velocidadeAtual == 0) {
			System.out.println("Impossivel reduzir a marcha");
		}else if(this.marchaAtual == -1 && this.velocidadeAtual == 0) {
			System.out.println("Dando Ré");
		}else if(this.velocidadeAtual > 0 || this.marchaAtual > 0) {
			System.out.println("Imposivel dar a ré");
		}else if(this.velocidadeAtual >= 0 && this.marchaAtual >=0) {
			this.marchaAtual --;
		}
	
	}
	
	
	

	public boolean frearCarro(int velocidadeMax) {

		if (this.velocidadeAtual == velocidadeMax) {

			velocidadeAtual = 0;
			System.out.println("Desacelerando");
			return true;
		} else {

			return false;
		}
	}
	
	public int getVelocidadeMax() {
		return velocidadeMax;
	}
	public void setVelocidadeMax(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	public int getVelocidadeAtual() {
		
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		
		this.velocidadeAtual = velocidadeAtual;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
		
		
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isTemTetoSolar() {
		return temTetoSolar;
	}
	public void setTemTetoSolar(boolean temTetoSolar) {
		this.temTetoSolar = temTetoSolar;
	}
	public boolean isTemCambioAutomatico() {
		return temCambioAutomatico;
	}
	public void setTemCambioAutomatico(boolean temCambioAutomatico) {
		this.temCambioAutomatico = temCambioAutomatico;
	}
	public int getVolumeCombustivel() {
		return volumeCombustivel;
	}
	public void setVolumeCombustivel(int volumeCombustivel) {
		this.volumeCombustivel = volumeCombustivel;
	}
	public int getTipoDoCarro() {
		return tipoDoCarro;
	}
	public void setTipoDoCarro(int tipoDoCarro) {
		if(tipoDoCarro == 1) {
			
			this.velocidadeMax = 200;
			this.numeroDePortas = 2;
			this.volumeCombustivel = 100;
			this.temCambioAutomatico = false;
			this.temTetoSolar = false;
			this.numeroDeMarchas = 4;
			this.cor = "PRETO";
			 
	
		}else if(tipoDoCarro == 2) {
			
			this.velocidadeMax = 220;
			this.numeroDePortas = 4;
			this.volumeCombustivel = 120;
			this.temCambioAutomatico = true;
			this.cor = "AZUL";
			this.temTetoSolar = false;
			this.numeroDeMarchas = 4;
			
			
		}else if(tipoDoCarro == 3){
			
			this.velocidadeMax = 240;
			this.numeroDePortas = 4;
			this.volumeCombustivel = 160;
			this.cor = "VERMELHO";
			this.temCambioAutomatico = true;
			this.temTetoSolar = false;
			this.numeroDeMarchas = 5;
			
		}else if(tipoDoCarro == 4){
			
			this.velocidadeMax = 240;
			this.cor = "AMARELO";
			this.numeroDePortas = 4;
			this.volumeCombustivel = 200;
			this.temCambioAutomatico = true;
			this.temTetoSolar = true;
			this.numeroDeMarchas = 7;
			
			
		}else {
			System.out.println("Nenhum modelo ideal encrontrado");
		}
		this.tipoDoCarro = tipoDoCarro;
	}
	
	
	public int getNumeroDePortas() {
		return numeroDePortas;
	}
	public int getNumeroDeMarchas() {
		return numeroDeMarchas;
	}
	
	

}
