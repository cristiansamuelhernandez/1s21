public class p2p2_1s21{
	public static void main(String[] args) {
		int val=1;
		switch(val){
		case 1: System.out.println("se evalua a 1");break;
		case 2: System.out.println("se evalua a 2");break;
		case 3: System.out.println("se evalua a 3");break;
		case 4: System.out.println("se evalua a 4");break;
		case 5: System.out.println("se evalua a 5");break;
		default: System.out.println("Valor fuera del rango");
		}

		Character opc='a';
		switch(opc){
		case 'a': System.out.println("Se evaluo A");
		case 'b': System.out.println("Se evaluo B");
		case 'c': System.out.println("Se evaluo C");
		case 'd': System.out.println("Se evaluo D");
		case 'e': System.out.println("Se evaluo E");
		case 'f': System.out.println("Se evaluo F");
		default: System.out.println("Opcion no existe");
		}

		String cadena = "uno";
		switch(cadena){
		case "uno":System.out.println("Uno");
		case "dos":System.out.println("Dos");
		case "Tres":System.out.println("Tres");
		case "cuatro":System.out.println("Cuatro");
		default:System.out.println("No existe la opcion");
		}
	}
}