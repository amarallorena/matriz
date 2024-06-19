package matriz;

public class Ativ_5 {

	public static void main(String[] args) {
		char asterisco[][]= {

				{'*','*','*','*'},
				{'*','*','*',' '},
				{'*','*',' ',' '},
				{'*',' ',' ',' '}
		};

		for(char[]letra:asterisco) {
			for (char coluna: letra) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}

	}

}
