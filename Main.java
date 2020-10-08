import java.util.Scanner;

/**
 * search algorithm
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new scanner fo user input
    Scanner input = new Scanner(System.in);

    //ask user for 10 integers
    System.out.println("Please enter in 10 integers to put into the array");

    //create an array to store the integers
    int[] integers = new int[10];

    //use a for loop to get all the integers from the user
    for(int i = 0; i < integers.length; i++){
      integers[i] = input.nextInt();
    }

    //ask user for an integer to find and declare a variable to store that number
    System.out.println("Please enter a number to find");
    int find = input.nextInt();

    //create a for loop to determine the index that the located number is on
    for(int i = 0; i < integers.length; i++){
      
      //create an if statement to determine if an integer in the set is equal to the number asked for
      if (integers[i] == find){
        System.out.println(find + " is located at index " + (i+1));
      }else{
        System.out.println("The number you have asked for is not in the set");
      }
    }
    
  }
}
