package main;

public class Paciente {
	
	private double peso;
	private double altura;
	
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	public double calcularIMC() {
	    double imc = peso / (altura * altura);
	    return imc;
	}
	public String diagnostico() {
	    double imc = calcularIMC();
	    String diagnostico;

	    if (imc < 16) {
	        diagnostico = "Baixo peso muito grave";
	    } else if (imc >= 16 && imc < 16.99) {
	        diagnostico = "Baixo peso grave";
	    } else if (imc >= 17 && imc < 18.49) {
	        diagnostico = "Baixo peso";
	    } else if (imc >= 18.50 && imc < 24.99) {
	        diagnostico = "Peso normal";
	    } else if (imc >= 25 && imc < 29.99) {
	        diagnostico = "Sobrepeso";
	    } else if (imc >= 30 && imc < 34.99) {
	    	diagnostico = "Obesidade Grau I";
	    } else if (imc >= 35 && imc < 39.99) {
	    	diagnostico = "Obesidade Grau II";
	    } else {
	        diagnostico = "Obesidade Grau III";
	    }
	    return diagnostico;
	}
	public double getPeso() {
		return peso;
	}
	public double getAltura() {
		return altura;
	}
}
