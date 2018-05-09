package exemplo03;

public class MetodoEqualsIgnoreCase { 
	
	public static void main(String[] args) {
		String texto = "java";
		
		if (texto.equals("Java")) {
			System.out.println("É igual");
		} else {
			System.out.println("Não é igual");
		}
		
		System.out.println("\n---------------\n");
		
		if (texto.equalsIgnoreCase("JAVA")) {
			System.out.println("É igual");
		}
		else System.out.println("Não é igual");
	}

}
