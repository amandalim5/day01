package myapp.ver1;

import java.io.Console;

public class Hello {
  public static void main(String[] args){
    // Get system console
    Console cons = System.console();

    // Read from the console, the result is assigned to a variable
    String name = cons.readLine("What is your name? ");


    // name == "Fred" is a comparison for numbers only
    // generally, for String comparison, we also add the trim 
    // to remove the leading and training whitespaces 
    // (not for passwords, since passwords may use space)
    if(name.trim().equals("Fred")){
      System.out.println("Yabbadabbado");
    } else if(name.trim().equals("Amanda")){
      System.out.printf("Welcome back %s\n", name);
    } else if(name.trim().isEmpty()){
      // another way of checking for an empty trim, .isEmpty(), .equals(""), .length() == 0 
      System.err.println("Please type in your name");
    }
     else{
      // Send a greeting to the name
      System.out.printf("Hello %s. \nNice to make your acquantance...\n", name.toUpperCase());
      // %s, means a string is going to be placed there. printf: for formated string
      // \n is for new line, \t is for tab
    }
    // you can also have a switch statement, where the default is the last else
    // for switch, you need to tell it to stop using break, else it will fall right
    // through and go to the next statement (notice switch has no curly braces)


    String secondName = "";
    while(secondName.trim().length() == 0){
      secondName = cons.readLine("What is your name? ");
    }
    if(secondName.trim().equals("Fred")){
      System.out.println("Yabbadabbado");
    } else if(secondName.trim().equals("Amanda")){
      System.out.printf("Welcome back %s\n", secondName);
    } else if(secondName.trim().isEmpty()){
      // another way of checking for an empty trim, .isEmpty(), .equals(""), .length() == 0 
      System.err.println("Please type in your name");
    }
     else{
      // Send a greeting to the name
      System.out.printf("Hello %s. \nNice to make your acquantance...\n", secondName.toUpperCase());
      // %s, means a string is going to be placed there. printf: for formated string
      // \n is for new line, \t is for tab
    }


    // to compile
    // javac -sourcepath src -d classes src/myapp/*.java
    // javac -sourcepath src -d classes src/myapp/*.java src/myapp/ver1/*.java
    // incremental compilation
    // javac -sourcepath src -d classes src/myapp/ver1/*.java
    // to run Hello
    // java -cp classes myapp.ver1.Hello
  }
}
