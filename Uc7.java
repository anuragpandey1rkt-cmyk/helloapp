public class Uc7 {

    public static void main(String[] args) {

        String names;

        // Check if arguments are provided
        if (args.length == 0) {
            names = "World";
        } else {
            // Join all names with comma and space
            names = String.join(", ", args);
        }

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}
