package matriz;

public class Figura_C {

	public static void main(String[] args) {
		//Tamanho da figura

		//Criando e preenchendo a matriz
		char[][] matriz = new char [4][4];
		for (int i = 0; i<4; i++) {
			for (int j =0; j < 4; j++) {
				if (j == (4 - 1 - i)) {
					matriz[i][j] = '*';
				}else {
					matriz[i][j] = ' ';
				}
			}
		}

		//Exibindo a figura C
		System.out.println("Figura C");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
			System.out.print(matriz[i][j] +" ");
		}
		System.out.println();
	}
}
}
