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
  System.out.println("�п�J����:");
  pv = scn.nextInt();
  System.out.println("�п�J�g��:");
  interval = scn.nextInt();

  fv = (int)(pv * Math.pow(1+interest,interval));
  System.out.println("�ڪ�������"+pv+"���A�g��"+interval+"�~�A�Q����"+interest+"%�A���Q�M��"+fv);               
  }
}

