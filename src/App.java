import java.util.Scanner; 
import java.util.Random; // import of the random class 

public class App {

    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */

     public void start() {
        String playAgain; 
        String userName = getUserName(); 
        printGreeting(userName); 
        printInstructions(); 
    
        do { /* Joao porto helped me with this */ 
            doMadlib(); 
            playAgain = restartGame();  // Ask if the user wants to play again
        } while (playAgain.equalsIgnoreCase("yes")); // Loop if the user enters "yes" 
        
        // This message will print if user does not play again
        System.out.println("Thanks for choosing Tristan as your MadLib supplier! Goodbye ");
    }

        
    
     /* this method prints the instructions for the madlib */ 
    public void printInstructions() {
    System.out.println("To play this game, you will need to input all the following words into the console. Remeber, be creative!");
    }

    
    /*  this  asks players their name */
    public String getUserName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi, whats your name? ");
        String username = input.nextLine();
        return username;
    }
    /* this method greets the players using their inputed name */ 
    public void printGreeting(String userName) {
        System.out.println("Greetings " + userName +"!");

    }

    public void doMadlib() {
        Scanner input = new Scanner(System.in);
        System.out.println("choose a category: 'Basketball' or 'Space'"); 
       String category = input.nextLine();
        System.out.println("Enter a verb:");
        String verb = input.nextLine(); 
        System.out.println("Enter a noun:");
        String noun = input.nextLine();
        System.out.println("Enter an adverb:");
        String adverb = input.nextLine();
        System.out.println("Enter a pronoun:"); 
        String pronoun = input.nextLine();
        System.out.println("Enter a verb:");
        String verb2 = input.nextLine();
        System.out.println("Enter a noun: ");
        String noun2 = input.nextLine();
        System.out.println("Enter an adverb:");
        String adverb2 = input.nextLine();
        System.out.println("Enter a pronoun: ");
        String pronoun2 = input.nextLine();
        System.out.println("Enter a name for a person: ");
        String person = input.nextLine();
        System.out.println("Enter another name for a person: ");
        String secondPerson = input.nextLine();
    
    
    /* Joao Porto taught me about this code. I also used the website stackoverflow to further understand it */ 
    Random random = new Random();
    int madLib = random.nextInt(2) + 1; // generates random number 1 or 2 

/* if/else statement displays story prints based on users choice */
// W3 schools helped me understand this code
   if (category.equals( "Basketball"))
    if (madLib == 1) {
        System.out.println("Interesting choices! Here is your MadLib Basketball story:");
        System.out.println(person + " dribbled the " + noun + " down the court with precision. With just seconds left, "
                + pronoun + " spotted a " + noun2 + " " + adverb + " approaching from the sideline. Without hesitation, "
                + pronoun + " " + verb + " past the defense and " + verb2 + " an incredible shot from the three-point line. "
                + secondPerson + " leapt to their feet and screamed, 'That was the most " + adverb2 + " shot I've ever seen!' "
                + "The crowd erupted, knowing this would be a game they would never forget.");
    }else if ( madLib == 2) {
        System.out.println( person + " made a spectacular play, using a " + noun + " to pass to " + secondPerson + ". With " + pronoun + " strategy, "
        + secondPerson + " swiftly " + verb + " and took a shot, scoring with " + adverb + " flair! The crowd went wild, as " 
        + pronoun2 + " cheered for the unforgettable moment. 'What a " + adverb2 + " performance!' they shouted.");


    } else {
        System.out.println("Invalid madLib value.");
    } 
    
    
    else if (category.equals("Space")) {
        if (madLib == 1) { 
        System.out.println("Interesting choices! Here is your MadLib space adventure:");
        System.out.println(person + " piloted the " + noun + " through the vast expanse of space. Suddenly, " + pronoun + " encountered a "
                + noun2 + " that was " + adverb + " floating towards the ship. Without hesitation, " + pronoun + " " + verb + " the controls and "
                + verb2 + " into hyperdrive. As the ship blasted away, " + secondPerson + " exclaimed, 'That was the most " + adverb2 + " escape in the history of space travel!'");
     
                   }   
                   
        else if ( madLib == 2) { 
            System.out.println( person + " discovered a new planet while " + verb + "ing in their " + noun + ". Suddenly, " + pronoun + " spotted a " 
            + noun2 + " that was " + adverb + " orbiting a nearby star. " + pronoun + " quickly " + verb2 + " to investigate, and as "
            + secondPerson + " joined, they both exclaimed, 'This is the most " + adverb2 + " discovery ever!'"); 

        }
         else {
        System.out.println("Invalid category. Please choose Basketball or Space.");
    }
} 
}

    
    /*  method asks players if they would like to play again */ 
    public String restartGame() { 
        Scanner input = new Scanner(System.in);
        System.out.println("would you like to play again? (yes or no)");
        return input.nextLine();

    }
    
    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }

}
