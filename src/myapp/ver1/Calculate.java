package myapp.ver1;

import java.io.Console;

public class Calculate {
  public static void main(String[] args){
    // Console cons = System.console();
    // int sum = 0;

    // while (true){
      
    //   String input=cons.readLine("Enter a number:");
      
    //   if(input.trim().toLowerCase().equals("stop")){
    //     // System.out.printf("The total is " + sum);
    //     System.out.printf("The total is %d", sum);
    //     break;
    //   } else {
    //     int num = Integer.parseInt(input.trim());
    //     sum += num;
    //   }
    // }


    String input = "";
    Integer total = 0;
    Integer count = 0;

    Console cons = System.console();

    while(!input.equals("stop")){
      input = cons.readLine("Please enter a number: ");
      input = input.trim();

      if(input.equals("stop")){
        break;
      }

      // Integer value = Integer.parseInt(input);
      total += Integer.parseInt(input);
      count++;

    }

    System.out.printf("The total of the %d numbers is %d\n",count, total);
  }
}
