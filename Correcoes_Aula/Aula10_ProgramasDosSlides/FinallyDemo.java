class FinallyDemo {
   public static void main(String args[]) {
      try {
         procA();
      } catch (Exception e) {
         System.out.println("Excecao pega");
		 /*obs: Se uma exceção ocorrer dentro de um 
		 bloco try, ela poderá ser tratada 
		 através da cláusula catch
		 */
      }
      procB();
      procC();
   }   
   // Lança uma exceção para fora do método
   static void procA() {
      try {
         System.out.println("Dentro de procA");
         throw new RuntimeException("demo");
      } finally {
         System.out.println("Finally de procA");
      }
   }
   // Retorna de dentro de um bloco try
   static void procB() {
      try {
         System.out.println("Dentro de procB");
         return;
      } finally {
         System.out.println("Finally de procB");
      }
   }
  // Executa um bloco try normalmente
   static void procC() {
      try {
         System.out.println("Dentro de procC");
      } finally {
         System.out.println("Finally de procC");
      }
   }   
}



