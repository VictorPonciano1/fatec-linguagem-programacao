public class MultiCatch2 {
   public static void main( String[] args ) {
	  try {
		System.out.println(10 / 0);
	  } catch (ArithmeticException | IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
	  System.out.println("Erro: " + e.getMessage());
}
   }
}

