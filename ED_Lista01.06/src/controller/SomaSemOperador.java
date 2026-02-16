package controller;

public class SomaSemOperador {

	public SomaSemOperador() {
		super();
	}
	
	public int Soma(int num1, int num2) {
		
		// Como não podemos usar a operação de adição, iremos utilizar a subtração
		// Com parada quando ambos números forem zero
		
		if(num1==0 && num2==0) return 0;
		
		// Caso contrário, iremos chamar a mesma função decrescendo num1, num2  em 1
		
		if(num1==0) return Soma(num1, num2-1)-1;
		
		return Soma(num1-1, num2)-1;
	}

}
