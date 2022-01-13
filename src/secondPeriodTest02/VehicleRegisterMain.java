package secondPeriodTest02;

import java.util.Scanner;

public class VehicleRegisterMain {

	static Scanner scanner = new Scanner(System.in);
	static Vehicle veiculos[]  = new Vehicle[50];
	static int nv = -1;
	
	public static void main(String[] args) {
		int option;
		
		do {
			option = menu();
			scanner.nextLine();
			
			if(option == 1) {
				cadastro();
			}else if(option == 2) {
				list();
			}else if(option == 3) {
				remove();
			}
			
			
			
		}while(option != 4);
		System.out.println("Obrigado!!!");
			
			
			
		}
		
		public static int menu() {
		
		System.out.println("Escolha uma opção abaixo: ");
		System.out.println("1. Cadastro de Veículos");
		System.out.println("2. Listar todos os Veículos");
		System.out.println("3. Remover veículos Cadastrados");
		System.out.println("4. Sair");
		return scanner.nextInt();
		
	}

		public static void cadastro() {
			System.out.println("Digite a marca do veículo: ");
			String marca = scanner.nextLine();
			System.out.println("Digite a cor do veículo: ");
			String cor = scanner.nextLine();
			System.out.println("Digite o ano de fabricação do veículo: ");
			int anoFab = scanner.nextInt();
			System.out.println("Digite o ano do modelo do veículo: ");
			int anoMod = scanner.nextInt();
			System.out.println("Digite a potência do motor do veículo: ");
			float potencia = scanner.nextFloat();
			System.out.println("Digite os cilindros do veículo: ");
			int cilindros = scanner.nextInt();
			
			Engine m = new Engine(potencia, cilindros);
			Vehicle v = new Vehicle(marca, cor, anoFab, anoMod, m);
			
			nv++;
			veiculos[nv] = v;
				
		}
		
		public static void list() {
			for(int i=0; i<=nv; i++ ) {
				System.out.println("Veículo número " + (i+1) + ": ");
				veiculos[i].printV();
				System.out.println("");
				
			}
			
		}
		
		public static void remove() {
			System.out.println("Digite o número do veículo que quer remover: ");
			int r = scanner.nextInt() - 1;
			if(r == nv) {
				nv--;
			}else {
				for(int i=r; i<nv; i++) {
					veiculos[i] = veiculos[i+1];
				}
				nv--;
			}

	}

}
