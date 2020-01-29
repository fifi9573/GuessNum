// Name: Fiona Tong
// Period: 6
// Date: 10/16/18

import java.util.*;
public class Main {

    public static void main(String[] args) {
      int num = 7;
      
      Scanner scan =new Scanner(System.in);
      System.out.print("Guess my number! Enter an integer between from 0 to 20: ");
      int magicNum = scan.nextInt();
      
      if (magicNum == num){
            System.out.println("Congratulations! Your guess was correct!");
        }else if (magicNum > num){
            System.out.println("Your guess is too high.");
        }else if(magicNum<num){
            System.out.println("Your guess is too low.");
        }
    }
}
