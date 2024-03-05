package hello;
import java.lang.Math;
import java.util.Scanner;

public class hw1 {
  static int pv;
  static int fv;
  static final double  interest=0.05;
  static int interval;


public static void main(String[] args){
  Scanner scn = new Scanner(System.in);
  System.out.println("請輸入本金:");
  pv = scn.nextInt();
  System.out.println("請輸入週期:");
  interval = scn.nextInt();

  fv = (int)(pv * Math.pow(1+interest,interval));
  System.out.println("我的本金有"+pv+"元，週期"+interval+"年，利息為"+interest+"%，本利和為"+fv);               
  }
}

