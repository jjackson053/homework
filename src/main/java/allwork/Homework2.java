package allwork;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        int value = 0;
        while(value < 10){
        System.out.println("hello" + value);
        value = value + 1;
    }
      for(int i=0; i<5; i++){
          System.out.printf("the value of i is: %d\n", i);

      }
      int myint = 15;
      if(myint<10){
          System.out.println("yes its true");
      }else if(myint>20){
          System.out.println("yes its false");
      }else{
          System.out.println("none of the above");
      }
      int loop = 0;
      while (true){
          System.out.println("looping:" + loop);
          if(loop==5){
              break;
          }
          loop++;
          System.out.println("running");
      }
        Scanner input = new Scanner(System.in);
        System.out.println("enter a floating point value: ");
         double number = input.nextDouble();
        System.out.println("you enter: " + number);

       Scanner scanner = new Scanner(System.in);
       int Value =0;
        do{
            System.out.println("enter a number: ");
             Value = scanner.nextInt();
        }
        while (Value != 5);
        System.out.println("dot 5!");


    }

}
