package matriz;

public class Ativ_1 {

	public static void main(String[] args) {
		
		int pares[][] = new int [5][5];
		
		//Entrada de dados
		for (int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				pares[i][i] = (int)Math.round(Math.random()*100);
				
			}
		}
		//Saída de dados
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				
				if (pares[i][j]% 2==0);	
				System.out.println("O valor inteiro dos pares é:" + pares[i][j] +"[" +i+"]"+"["+ j+"]");
		}

	}

	}
}
