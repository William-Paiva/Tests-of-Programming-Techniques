package secondPeriodTest02;

public class Engine {
	float potencia;
	int cilindros;
	
	public Engine (float potencia, int cilindros) {
		this.potencia = potencia;
		this.cilindros = cilindros;
	}
	public void printM() {
		System.out.println("Motor: ");
		System.out.println("\tPotencia: " + potencia);
		System.out.println("\tCilindros: " + cilindros);
	}
}
