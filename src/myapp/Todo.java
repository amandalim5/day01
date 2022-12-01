package myapp;

public class Todo {

  public static void main(String[] args){
    // Create an array of 3 String elements
    String[] tasks = new String[3];
    tasks[0] = "running";
    tasks[1] = "eating";
    tasks[2] = "sleeping";

    // this will give an improper value
    System.out.println(tasks); 
    System.out.println(tasks[0]);
    System.out.println(tasks[1]);
    System.out.println(tasks[2]);
    System.out.println(tasks.length); // 3

//     [Ljava.lang.String;@2c7b84de
// running
// eating
// sleeping
// 3

    int count = tasks.length;
    while(count > 0){
      System.out.println(tasks[tasks.length-count]);
      count--;  
    } 

    int countTwo = 0;
    while(countTwo != tasks.length){
      System.out.println(tasks[countTwo]);
      countTwo++;
    }

    int countThree = 0;
    while(countThree < tasks.length){
      System.out.printf("%d -- %s\n", countThree, tasks[countThree]);
      countThree++;
    }

    for(int i=0; i<tasks.length; i++){
      System.out.println(tasks[i]);
    }
  }
  
}
