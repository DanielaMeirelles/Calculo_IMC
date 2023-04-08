package main;

public class Principal {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente(60.1, 1.70);
		Paciente p2 = new Paciente(55.4, 1.80);
		Paciente p3 = new Paciente(90, 1.57);
		
		
		System.out.println("P1, seu IMC é: "+String.format("%.2f", p1.calcularIMC()));
		System.out.println("Diagnóstico: "+p1.diagnostico());
		
		System.out.println("P2, seu IMC é: "+String.format("%.2f", p2.calcularIMC()));
		System.out.println("Diagnóstico: "+p2.diagnostico());
		
		System.out.println("P3, seu IMC é: "+String.format("%.2f", p3.calcularIMC()));
		System.out.println("Diagnóstico: "+p3.diagnostico());
	}

}
