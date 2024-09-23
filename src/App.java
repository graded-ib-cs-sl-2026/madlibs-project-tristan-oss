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

    public void doMadlib() {}
    
    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }

}
