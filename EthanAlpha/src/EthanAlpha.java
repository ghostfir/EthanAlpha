import java.util.Scanner;

public class EthanAlpha {
    // Constructor
    public EthanAlpha() {
        System.out.println("Hello! I am Ethan Alpha, ready to assist.");
    }

    // Simulated response based on user input
    public String respondToUser(String input) {
        if (input.contains("Free Fire")) {
            return "I can give you tips for playing Free Fire!";
        } else if (input.contains("mood")) {
            return "I sense you're asking about mood. How are you feeling today?";
        } else {
            return "I'm still learning. Can you ask something else?";
        }
    }

    // Entry point for Ethan's Java application
    public static void main(String[] args) {
        EthanAlpha ethan = new EthanAlpha();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Ask Ethan anything:");

        // Conversation loop
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println(ethan.respondToUser(input));
        }

        scanner.close();
    }
}
