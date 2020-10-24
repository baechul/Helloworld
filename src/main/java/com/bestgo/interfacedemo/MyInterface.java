package com.bestgo.interfacedemo;

@FunctionalInterface
public interface MyInterface {
  void abstract_func(int x, int y);

  default void default_fun() {
    System.out.println("This is a default method");
  }
}

class Main {
  // "String[] args" works too.
  public static void main(String args[]) {
    MyInterface fobj = (int x, int y) -> System.out.println(x+y);

    fobj.abstract_func(5,5);
    fobj.default_fun();
  }
}
