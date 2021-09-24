import java.util.Scanner;
public class Objective4Lab{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";
    System.out.println("What is your first name?");
    fname = keyboard.next();
    System.out.println("What is your last name?");
    lname = keyboard.next();
    System.out.println("What is your favorite animal?");
    favoriteAnimal = keyboard.next();
    System.out.println("What is your favorite food?");
    favoriteFood = keyboard.next();
    System.out.println("What is your favorite song?");
    favoriteSong = keyboard.next();
    System.out.println("My name is " + fname + lname);
    System.out.println("My favorite animals are " + favoriteAnimal);
    System.out.println("My favorite food is " + favoriteFood);
    System.out.println("My favorite song is " + favoriteSong);

  }
}
