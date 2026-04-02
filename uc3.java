public class HelloApp {

    public static void main(String[] args) {

        // Default value
        String name = "World";

        // Check if argument is provided
        if (args.length > 0) {
            name = args[0];
        }

        // Output
        System.out.println("Hello, " + name + "!");
    }
}
