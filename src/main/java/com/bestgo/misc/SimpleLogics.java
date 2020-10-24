package com.bestgo.misc;

public class SimpleLogics {

  public long fibonacci1(int n) {
    if(n < 0) throw new RuntimeException("Can't be a negative");

    if(n == 0 || n == 1) return 1;
    return fibonacci1(n-1)+fibonacci1(n-2);
  }

  public long fibonacci2(int n) {
    if(n == 0 || n == 1) return 1;

    long prev1 = 1;
    long prev2 = 1;
    long ret = 0;
    for(int i=2; i<=n; i++) {
      ret = prev1+prev2;
      prev1 = prev2;
      prev2 = ret;
    }

    return ret;
  }

  public static void main(String[] args) {
    SimpleLogics sl = new SimpleLogics();
    //long ret = sl.fibonacci1(-4);

    for(int i=0; i<9; i++) {
      long ret1 = sl.fibonacci1(i);
      long ret2 = sl.fibonacci2(i);

      System.out.println(i+ " >> " + ret1+":"+ret2);
    }
  }
}
