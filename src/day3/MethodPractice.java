package day3;

import java.awt.event.MouseWheelEvent;

public class MethodPractice {

    public static void main(String[] args){
        MethodPractice methodPractice = new MethodPractice();
        int a = 2;
        int b = 3;
         int sum1 = a + b;
            //System.out.println(sum1);
             methodPractice.addPrint(a,b);

        int c = 2;
        int d = 8;
        int sum2 = c + d;

           //System.out.println(sum2);
           methodPractice.addPrint(c,d);

    }

    // a function that doesnot return anything - void

    public void addPrint(int a , int b){
            int sum = a + b;
            System.out.println(sum);
    }

}
