import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dem = "D";
        String rep = "R";
        String ind = "I";
        String userParty;


        System.out.println("What is your party affiliation? Please use only the first letter capitalized.");
        userParty = scan.nextLine();

        if (userParty.equals(dem)){
            System.out.println("You get a Democratic Donkey.");
        }
        else if(userParty.equals(rep)) {
            System.out.println("You get a Republican Elephant.");
        }
        else if (userParty.equals(ind)){
            System.out.println("You get an Independent Person.");
        }
        else{
            System.out.println("Sorry you have entered an invalid party. Please try again.");
            System.exit(0);
        }

    }

}