package java.com.bestgo.hello;

public class HelloMain {

  public long sum(int a, int b) {
    return a+b;
  }

  public static void main(String[] args) {
    System.out.println("main method started");

    HelloMain main = new HelloMain();
    long result = main.sum(5,7);
    System.out.println("Result: "+result);
  }
}
