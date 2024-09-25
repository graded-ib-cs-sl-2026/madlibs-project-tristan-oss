import java.util.Scanner;

public class App {

    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */

    public void start() {
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        doMadlib();
    }

    
    
     // this method prints the instructions for the madlib */ 
    public void printInstructions() {

    }

    
    // this code asks players their name */
    public String getUserName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi, whats your name? ");
        String name = input.nextLine();
        return name;
    }
    // this method greets the players using their inputed name */ 
    public void printGreeting(String userName) {
        System.out.println("Greetings " + userName);

    }

    public void doMadlib() {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Verb 1:");
        String verb = input.nextLine(); 
        System.out.println("noun 1");
        String noun = input.nextLine();
        System.out.println("adverb 1");
        String adverb = input.nextLine();
        System.out.println("pronoun"); 
        String pronoun = input.nextLine();
        System.out.println(" Verb 2");
        String verb2 = input.nextLine();
        System.out.println("noun 2");
        String noun2 = input.nextLine();
        System.out.println("adverb 2 ");
        String adverb2 = input.nextLine();
        System.out.println("pronoun 2");
        String pronoun2 = input.nextLine();
        System.out.println("person 1");
        String person = input.nextLine();
        System.out.println("person 2");
        String secondPerson = input.nextLine();



    }

    
    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }

}
