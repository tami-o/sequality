/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    System.out.println(new Calculate().twoAve(2, 3));
    System.out.println(new Calculate().largeMountAve(1, 10));
    System.out.println(new Calculate().sumEvenOdd(1, 10));
  }
}
