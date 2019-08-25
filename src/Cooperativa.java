import java.util.Scanner;

public class Cooperativa {
	
	
	public static void main(String[] args) {
		
		String nome,cpf, rg, dataDeNascimento, rua, bairro, cidade, estado, complemento , cep , modelo ;
		int numeroDaCasa; 
		int tipoDeCarro;
		int chassi;
		int anoDeFabricação;
		int op;
		int opc =0;
		int escolhaPlano = 0;
		int opt;
		int acelerar;
		
		Proprietario prop = new Proprietario();
		Endereco endereco = new Endereco();
		Carro carro = new Carro();
		Marca marca = new Marca();
			
			
		Scanner sc = new Scanner(System.in);
		
		
	 System.out.println("---------------------------------------------------------------------------");
	 System.out.println("---------------EMPRESTIMO DE CARROS CARRARA AUTOMOVEIS --------------------");
	
	 
	 System.out.println("-------------------------------------------------------");
	 System.out.println("--------------- SEJA BEM-VINDO ! ----------------------");
	 System.out.println("-------------------------------------------------------");
	 
	 System.out.println("---------------------------------------------------------------------------");
	 System.out.println("----------------------CADASTRO DE USUÁRIOS --------------------------------");
	 
	 
	 System.out.println("ENTRE COM SEU NOME ");
	 nome = sc.nextLine();
	 System.out.println("ENTRE COM SEU CPF");
	 cpf = sc.nextLine();
	 System.out.println("ENTRE COM SEU RG");
	 rg = sc.nextLine();
	 System.out.println("ENTRE COM SUA DATA DE NASCIMENTO");
	 dataDeNascimento = sc.nextLine();
	 
	 
	 System.out.println("---------------------------------------------------");
	 
	 System.out.println("-----------------FICHA DE ENDEREÇO ----------------");
	 
	 System.out.println("---------------------------------------------------");
	 
	 
	 System.out.println("ENTRE COM NOME DA RUA");
	 rua =sc.nextLine();
	 System.out.println("ENTRE COM O NUMERO DA RESIDÊNCIA");
	 numeroDaCasa = sc.nextInt();
	 sc.nextLine();
	 System.out.println("ENTRE COM O COMPLEMENTO");
	 complemento = sc.nextLine();
	 System.out.println("ENTRE COM O CEP DA RESIDÊNCIA");
	 cep =sc.nextLine();
	 System.out.println("ENTRE COM O NOME DO BAIRRO");
	 bairro = sc.nextLine();
	 System.out.println("ENTRE COM O MUNICIPIO DE RESIDÊNCIA");
	 cidade = sc.nextLine();
	 System.out.println("ENTRE COM O UF DE RESIDÊNCIA");
	 estado = sc.nextLine();
	 
	 
	 System.out.println("---------------------------------------------------------------");
	 
	 System.out.println("                   OPÇÕES DE CARRO                             ");
	 
	 System.out.println("---------------------------------------------------------------");
	 
	 System.out.println("              ESCOLHA O VEICULO IDEAL PARA ALUGAR                ");
	 
	 System.out.println("---------------------  MARCAS------------------------------------");
	 System.out.println("1 - HONDA");
	 System.out.println("2 - HYUNDAI");
	 System.out.println("3 - RENAULT");
	 System.out.println("4 - VOLKSWAGEN");
	 op = sc.nextInt();
	 sc.nextLine();
	 switch(op) {
	 
	 	case 1 :
	 		System.out.println("VOCÊ ESCOLHEU UM CARRO DO MARCA HONDA");
	 		System.out.println("AGORA ESCOLHA UM DOS MODELOS ABAIXO");
	 		System.out.println("VEICULOS DISPONIVEIS PARA EMPRESTIMO");
	 		System.out.println("1- HONDA CIVIC 2016");
	 		System.out.println("2- HONDA FIT 2017");
	 		System.out.println("3- HONDA CITY 2018");
	 		
	 		opc = sc.nextInt();
	 		sc.nextLine();
	 		if(opc == 1) {
	 			System.out.println("VOCÊ ESCOLHEU O HONDA CIVIC");
	 			marca.setModelos("HONDA CIVIC");
	 			marca.setAnoDeFabricacao(2016);
	 			System.out.println("ESCOLHA O PLANO DE EMPRESITO");
	 			System.out.println("1 - DIARIA ");
	 			System.out.println("2 - SEMANA ");
	 			System.out.println("3 - MENSAL ");
	 			escolhaPlano = sc.nextInt();
	 			sc.nextLine();
	 			if(escolhaPlano == 1) {
	 				marca.setValorAluguel(75);
	 			}else if(escolhaPlano == 2) {
	 				marca.setValorAluguel(150.0);
	 			}else {
	 				marca.setValorAluguel(500.0);
	 			}

	 			
	 		}else if(opc == 2) {
	 			System.out.println("VOCÊ ESCOLHEU O HONDA CITY");
	 			marca.setModelos("HONDA CITY");
	 			marca.setAnoDeFabricacao(2018);
	 			System.out.println("ESCOLHA O PLANO DE EMPRESITO");
	 			System.out.println("1 - DIARIA ");
	 			System.out.println("2 - SEMANA ");
	 			System.out.println("3 - MENSAL ");
	 			escolhaPlano = sc.nextInt();
	 			sc.nextLine();
	 			if(escolhaPlano == 1) {
	 				marca.setValorAluguel(75);
	 			}else if(escolhaPlano == 2) {
	 				marca.setValorAluguel(150.0);
	 			}else {
	 				marca.setValorAluguel(500.0);
	 			}

	 			
	 		}else if(opc == 3){
	 			System.out.println("VOCÊ ESCOLHEU O HONDA FIT");
	 			marca.setModelos("HONDA FIT");
	 			marca.setAnoDeFabricacao(2017);
	 			System.out.println("ESCOLHA O PLANO DE EMPRESITO");
	 			System.out.println("1 - DIARIA ");
	 			System.out.println("2 - SEMANA ");
	 			System.out.println("3 - MENSAL ");
	 			escolhaPlano = sc.nextInt();
	 			sc.nextLine();
	 			if(escolhaPlano == 1) {
	 				marca.setValorAluguel(75);
	 			}else if(escolhaPlano == 2) {
	 				marca.setValorAluguel(150.0);
	 			}else {
	 				marca.setValorAluguel(500.0);
	 			}

	 		}else {
	 			System.out.println("Nenhum carro selecionado");
	 		}
	 		break;
	 	case 2:	
	 		System.out.println("VOCÊ ESCOLHEU UM CARRO DO MARCA HYUNDAI");
	 		System.out.println("VEICULOS DISPONIVEIS PARA EMPRESTIMO");
	 		System.out.println("AGORA ESCOLHA UM DOS MODELOS ABAIXO");
	 		System.out.println("1- HYUNDAI HB20 2016");
	 		System.out.println("2- HYUNDAI SANTA FE 2017");
	 		System.out.println("3- HYUNDAI IX35 2018");
	 		opc = sc.nextInt();
	 		sc.nextLine();
	 		if(opc == 1) {
	 			System.out.println(" VOCÊ ESCOLHEU O HYUNDAI HB20");
	 			marca.setModelos("HYUNDAI HB20");
	 			marca.setAnoDeFabricacao(2016);
	 			
	 			System.out.println("ESCOLHA O PLANO DE EMPRESITO");
	 			System.out.println("1 - DIARIA ");
	 			System.out.println("2 - SEMANA ");
	 			System.out.println("3 - MENSAL ");
	 			escolhaPlano = sc.nextInt();
	 			sc.nextLine();
	 			if(escolhaPlano == 1) {
	 				marca.setValorAluguel(50);
	 			}else if(escolhaPlano == 2) {
	 				marca.setValorAluguel(150.0);
	 			}else {
	 				marca.setValorAluguel(500.0);
	 			}
	 			
	 		}else if(opc == 2) {
	 			System.out.println(" VOCÊ ESCOLHEU A HYUNDAI SANTA FE");
	 			marca.setModelos("HYUNDAI SANTA FE");
	 			marca.setAnoDeFabricacao(2017);
	 			System.out.println("ESCOLHA O PLANO DE EMPRESITO");
	 			System.out.println("1 - DIARIA ");
	 			System.out.println("2 - SEMANA ");
	 			System.out.println("3 - MENSAL ");
	 			escolhaPlano = sc.nextInt();
	 			sc.nextLine();
	 			if(escolhaPlano == 1) {
	 				marca.setValorAluguel(100.0);
	 			}else if(escolhaPlano == 2) {
	 				marca.setValorAluguel(350.0);
	 			}else {
	 				marca.setValorAluguel(750.0);
	 			}
	 		}else if(opc == 3){
	 			System.out.println("VOCÊ ESCOLHEU O HYUNDAI IX35");
	 			marca.setModelos("HYUNDAI IX35");
	 			marca.setAnoDeFabricacao(2018);
	 			System.out.println("ESCOLHA O PLANO DE EMPRESITO");
	 			System.out.println("1 - DIARIA ");
	 			System.out.println("2 - SEMANA ");
	 			System.out.println("3 - MENSAL ");
	 			escolhaPlano = sc.nextInt();
	 			sc.nextLine();
	 			if(escolhaPlano == 1) {
	 				marca.setValorAluguel(100);
	 			}else if(escolhaPlano == 2) {
	 				marca.setValorAluguel(150.0);
	 			}else {
	 				marca.setValorAluguel(600.0);
	 			}
	 		}else {
	 			System.out.println("Nenhum carro selecionado");
	 		}
	 		break;
	 	case 3:	
	 		System.out.println("VOCÊ ESCOLHEU UM CARRO DO MARCA RENAULT");
	 		System.out.println("VEICULOS DISPONIVEIS PARA EMPRESTIMO");
	 		System.out.println("AGORA ESCOLHA UM DOS MODELOS ABAIXO");
	 		System.out.println("1- RENAULT CLIO 2015");
	 		System.out.println("2- RENAULT SANDERO 2016");
	 		System.out.println("3- RENAULT DUSTER 2017");
	 		opc = sc.nextInt();
	 		sc.nextLine();
	 		if(opc == 1) {
	 			System.out.println("VOCÊ ESCOLHEU O RENAULT CLIO");
	 			marca.setModelos("RENAULT CLIO");
	 			marca.setAnoDeFabricacao(2015);
	 			System.out.println("ESCOLHA O PLANO DE EMPRESITO");
	 			System.out.println("1 - DIARIA ");
	 			System.out.println("2 - SEMANA ");
	 			System.out.println("3 - MENSAL ");
	 			escolhaPlano = sc.nextInt();
	 			sc.nextLine();
	 			if(escolhaPlano == 1) {
	 				marca.setValorAluguel(50);
	 			}else if(escolhaPlano == 2) {
	 				marca.setValorAluguel(100.0);
	 			}else {
	 				marca.setValorAluguel(400.0);
	 			}
	 		}else if(opc == 2) {
	 			System.out.println("VOCÊ ESCOLHEU O RENAULT SANDERO");
	 			marca.setModelos("RENAULT SANDERO");
	 			marca.setAnoDeFabricacao(2016);
	 			System.out.println("ESCOLHA O PLANO DE EMPRESITO");
	 			System.out.println("1 - DIARIA ");
	 			System.out.println("2 - SEMANA ");
	 			System.out.println("3 - MENSAL ");
	 			escolhaPlano = sc.nextInt();
	 			sc.nextLine();
	 			if(escolhaPlano == 1) {
	 				marca.setValorAluguel(70.0);
	 			}else if(escolhaPlano == 2) {
	 				marca.setValorAluguel(150.0);
	 			}else {
	 				marca.setValorAluguel(500.0);
	 			}
	 			
	 		}else if(opc == 3){
	 			System.out.println("VOCÊ ESCOLHEU O RENAULT DUSTER ");
	 			marca.setModelos("RENAULT DUSTER");
	 			marca.setAnoDeFabricacao(2017);
	 			sc.nextLine();
	 			System.out.println("ESCOLHA O PLANO DE EMPRESITO");
	 			System.out.println("1 - DIARIA ");
	 			System.out.println("2 - SEMANA ");
	 			System.out.println("3 - MENSAL ");
	 			escolhaPlano = sc.nextInt();
	 			sc.nextLine();
	 			if(escolhaPlano == 1) {
	 				marca.setValorAluguel(75);
	 			}else if(escolhaPlano == 2) {
	 				marca.setValorAluguel(150.0);
	 			}else {
	 				marca.setValorAluguel(500.0);
	 			}
	 			
	 		}else {
	 			System.out.println("Nenhum carro selecionado");
	 		}
	 		break;
	 	case 4:
	 		System.out.println("VOCÊ ESCOLHEU UM CARRO DO MARCA VOLKSWAGEN");
	 		System.out.println("VEICULOS DISPONIVEIS PARA EMPRESTIMO");
	 		System.out.println("AGORA ESCOLHA UM DOS MODELOS ABAIXO");
	 		System.out.println("1- VOLKSWAGEN JETTA 2016");
	 		System.out.println("2- VOLKSWAGEN POLO 2017");
	 		System.out.println("3- VOLKSWAGEN VOYAGE 2018");
	 		opc = sc.nextInt();
	 		sc.nextLine();
	 		if(opc == 1) {
	 			System.out.println("VOCÊ ESCOLHEU O VOLKSWAGEN JETTA");
	 			marca.setModelos("VOLKSWAGEN JETTA");
	 			marca.setAnoDeFabricacao(2016);
	 			System.out.println("ESCOLHA O PLANO DE EMPRESITO");
	 			System.out.println("1 - DIARIA ");
	 			System.out.println("2 - SEMANA ");
	 			System.out.println("3 - MENSAL ");
	 			escolhaPlano = sc.nextInt();
	 			sc.nextLine();
	 			if(escolhaPlano == 1) {
	 				marca.setValorAluguel(80);
	 			}else if(escolhaPlano == 2) {
	 				marca.setValorAluguel(150.0);
	 			}else {
	 				marca.setValorAluguel(500.0);
	 			}
	 		}else if(opc == 2) {
	 			System.out.println("VOCÊ ESCOLHEU O VOLKSWAGEN POLO ");
	 			marca.setModelos("VOLKSWAGEN POLO");
	 			marca.setAnoDeFabricacao(2017);
	 			System.out.println("ESCOLHA O PLANO DE EMPRESITO");
	 			System.out.println("1 - DIARIA ");
	 			System.out.println("2 - SEMANA ");
	 			System.out.println("3 - MENSAL ");
	 			escolhaPlano = sc.nextInt();
	 			sc.nextLine();
	 			if(escolhaPlano == 1) {
	 				marca.setValorAluguel(50);
	 			}else if(escolhaPlano == 2) {
	 				marca.setValorAluguel(150.0);
	 			}else {
	 				marca.setValorAluguel(500.0);
	 			}
	 		}else if(opc == 3){
	 			System.out.println("VOCÊ ESCOLHEU O VOLKSWAGEN VOYAGE ");
	 			marca.setModelos("VOLKSWAGEN VOYAGE");
	 			marca.setAnoDeFabricacao(2018);
	 			System.out.println("ESCOLHA O PLANO DE EMPRESITO");
	 			System.out.println("1 - DIARIA ");
	 			System.out.println("2 - SEMANA ");
	 			System.out.println("3 - MENSAL ");
	 			escolhaPlano = sc.nextInt();
	 			sc.nextLine();
	 			if(escolhaPlano == 1) {
	 				marca.setValorAluguel(80);
	 			}else if(escolhaPlano == 2) {
	 				marca.setValorAluguel(170.0);
	 			}else {
	 				marca.setValorAluguel(600.0);
	 			}
	 		}else {
	 			System.out.println("Nenhum carro selecionado");
	 		}
	 		break;
	 	default:
	 			System.out.println("NENHUMA OPCAO SELECIONADA");
	 		break;

	 		
	 }
	 sc.nextLine();
	 
	 System.out.println("AGORA ESCOLHA UMA DAS ESPECIFICAÇÕES DO CARRO");
	 System.out.println("1 - CARRO NORMAL DE 2 PORTAS");
	 System.out.println("2 - CARRO NORMAL DE 4 PORTAS COM TETO SOLAR");
	 System.out.println("3 - CARRO NORAML DE 4 PORTAS COM CAMBIO AUTOMATICO");
	 System.out.println("4 - CARRO NOMAL DE 4 PORTAS COM TETO SOLAR E CAMBIO AUTOMATICO");
	 tipoDeCarro = sc.nextInt();
	 sc.nextLine();
	 
	 	if(tipoDeCarro ==1) {
	 		carro.setTipoDoCarro(1);
	 		carro.getTipoDoCarro();
	 	}else if (tipoDeCarro == 2) {
	 		carro.setTipoDoCarro(2);
	 		carro.getTipoDoCarro();
	 	}else if(tipoDeCarro == 3) {
	 		carro.setTipoDoCarro(3);
	 		carro.getTipoDoCarro();
	 	}else if(tipoDeCarro ==4 ) {
	 		carro.setTipoDoCarro(4);
	 		carro.getTipoDoCarro();
	 	}else {
	 		System.out.println("nenhum carro escolhido");
	 	}
	 
	 
	 
	 	System.out.println("Deseja Testar");
	 	System.out.println("1 - SIM / 2 - NÃO");
	 	opt = sc.nextInt();
	 	switch(opt) {
	 		case 1:
	 			for(acelerar = carro.getVelocidadeAtual(); acelerar <= carro.getVelocidadeMax(); acelerar ++) {
	 				carro.setVelocidadeAtual(acelerar);
	 				carro.passarMarcha(acelerar);
	 				System.out.println(carro.getVelocidadeAtual());
	 			
	 			}break;
	 		case 2 :
	 			
	 			 System.out.println("Carro escolhido foi:"+ carro.getTipoDoCarro());
	 			 System.out.println("Da cor:" + carro.getCor());
	 			 System.out.println("Modelo: " + marca.getModelos());
	 			 System.out.println("Numero de Portas: "+ carro.getNumeroDeMarchas());
	 			 System.out.println("Numero de Marchas: "+ carro.getNumeroDeMarchas());
	 			 System.out.println("Velocidade Maxima: "+carro.getVelocidadeMax());
	 			 System.out.println("Volume do Tanque: "+carro.getVolumeCombustivel()+" L");
	 			 System.out.println("O Plano Escolhido foi de numero: "+ escolhaPlano);
	 			 
	 			 
	 	
	 	}
	 	
	 
	 
	 
	 
	 endereco = new Endereco(rua, bairro, cidade, estado, cep, complemento, numeroDaCasa);
	 prop = new Proprietario(nome, cpf, rg, endereco, dataDeNascimento);
	 
	 
	//System.out.println(prop.toString());
	 //System.out.println(endereco.toString());
	 
	 sc.close();
	 
	 
	 
	 
	
	
	 
	 
		
			
		
		
		

	
	 
	 
	 
	 
	 
	 
		
		
	}

}
