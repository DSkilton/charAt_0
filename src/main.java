import java.util.Scanner;//the import we need for a Scanner

public class main {

    public static void main(String[] args) { //your code starts from the next line
            Scanner input = new Scanner(System.in);//creating a Scanner called input

            System.out.println("Enter the name of an animal: ");
            String animal = input.nextLine();

            System.out.println("How would you describe a " + animal + "? ");
            String description = input.nextLine();

            input.close(); //close scanner

            char letter = animal.charAt(0);//takes the first character from String animal
            System.out.println("A " + animal + " is " + description);

            System.out.println("You will find it under " + letter + " in the dictionary");
    }//END OF MAIN
}// END OF CLASS
