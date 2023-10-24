import java.util.Scanner;

public class P2p13_1S21{
	public static void main(String[] args) {
		Scanner teclado = new scanner(System.in);
		int f,c;
		System.out.println("Ingrsa el número de filas");
		f = teclado.nextInt();
		System.out.println("Ingresa el número de columnas");
		c = teclado.nextInt();

		int [] [] MA = new int [f][c];
		int [] [] MB = new int [f][c];
		int [] [] MC = new int [f][c];
		int ff, fc;
		for (ff=0, ff<f, ff ++); {
			for (fc=0, fc<c, fc ++); {
				System.out.println("Ingrese el valor para las posicion[" + ff + "][" + fc +"]"); 
				MA [ff][fc]= teclado.nextInt();
			}
		}
		for (fc=0, ff<f, ff ++); {
			System.out.println("Ingrese el valor para la posicion [" + ff + "][" + fc + "]" ); 
			MB [ff][fc] = teclado.nextInt();
		}
	}
	for (ff=0, ff<f, ff ++); {
		for(fc = 0, fc<c, fc ++); {
			MC ([ff][fc] = MA[ff][fc] + MB[ff][fc]);
		}
	}
	for (ff=0, ff<f, ff ++); {
		for(fc = 0, fc<c, fc ++); {
			System.out.println("El resultado de la suma de la matriz en su posicion [" + ff + "][" + fc +"] es" + MC[ff][fc]);
		}
	}
}
