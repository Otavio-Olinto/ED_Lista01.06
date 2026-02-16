package view;

import controller.SomaSemOperador;

public class Principal {

	public static void main(String[] args) {
		// Instanciando os metodos da classe SomaSemOperador
		SomaSemOperador metodos = new SomaSemOperador();
		
		int num1 = 7, num2 = 25, soma;
		
		// A variável Soma obeterá o resultados da recursiva
		soma = metodos.Soma(num1, num2);
		
		// Como o resultado da recursiva é um número negatico, temos que trocar sua polaridade
		soma*=-1;
		
		System.out.println("A soma de "+num1+" e "+num2+" é: "+soma);

	}

}
