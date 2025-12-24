class Erro2 {
  public static void main(String[] args) {
     int a, d = 0;
     try {
        a = 42 / d;
        System.out.println("Isto nao sera exibido");
     } catch (ArithmeticException e) {
        System.out.println("Divisao por zero");
     }
     System.out.println("Apos o catch");
  }
}

