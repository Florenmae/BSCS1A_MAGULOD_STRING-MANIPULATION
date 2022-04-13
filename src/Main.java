import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner newInput = new Scanner(System.in);
        //Ask the user to be able to input a string
        System.out.println("Input a String");

        //Search if the character to replace in the string is present
        String search = newInput.nextLine();
        System.out.println("Replace something from the String");
        String find = newInput.nextLine();

        //Used boolean to check if the searched character in the string is present or not
        //If the character is not present then it would print that the character is not found
        //if the character is present then proceed with the next segment and replace the character
        boolean check = search.contains(find);
        if (check) {
            System.out.println("Replace " + find + " with what?");
            String replace = newInput.nextLine();
            System.out.println("New String: " + search.replaceFirst(find, replace));
        } else {
            System.out.println("String/Character to replace is not found");
        }

    }
}
