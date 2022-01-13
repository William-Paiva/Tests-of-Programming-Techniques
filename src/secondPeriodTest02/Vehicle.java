package secondPeriodTest02;

public class Vehicle {
	String marca;
	String cor;
	int anoFab;
	int anoMod;
	Engine motor;
	
	public Vehicle (String marca, String cor, int anoFab, int anoMod, Engine motor) {
		this.marca = marca;
		this.cor = cor;
		this.anoFab = anoFab;
		this.anoMod = anoMod;
		this.motor = motor;
	}
	
	public void printV() {
		System.out.println("Marca : " + marca);
		System.out.println("Cor : " + cor);
		System.out.println("Ano de Fabricação : " + anoFab);
		System.out.println("Ano do Modelo : " + anoMod);
		motor.printM();
		
	}
}
