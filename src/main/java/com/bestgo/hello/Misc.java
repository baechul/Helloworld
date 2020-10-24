package com.bestgo.hello;

import java.util.*;
import java.awt.*;

public class Misc {

//  public void case1() {
//    List<String> sl = new ArrayList<String>();
//    sl.add("Baechul");
//    sl.add("Debora");
//
//    sl.forEach(sub -> {
//      System.out.println(sub);
//    });
//  }


  public static void main(String[] args) {
//    Misc misc = new Misc();
//    misc.case1();

    Frame frame=new Frame("ActionListener java8");

    Button b=new Button("Click Here");
    b.setBounds(50,100,80,50);

    b.addActionListener(e -> System.out.println("Hello World!"));
    frame.add(b);

    frame.setSize(200,200);
    frame.setLayout(null);
    frame.setVisible(true);
  }
}
