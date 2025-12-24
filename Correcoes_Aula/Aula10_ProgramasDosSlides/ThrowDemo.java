class ThrowDemo {
   static void demoproc() {
      try {
         throw new NullPointerException("demo");
      } catch(NullPointerException e) {
		  
		 /*NullPointerException é uma exceção que indica que a aplicação tentou 
		 usar uma referência de um objeto que estava com valor nulo 
		 */
         System.out.println("Excecao dentro do metodo demoproc.");
         throw e; // relança a exceção
      }
   }
   public static void main(String args[]) {
      try {
         demoproc();
      } catch(NullPointerException e) {
         System.out.println("Pega novamente: " + e);
      }
   }
}
