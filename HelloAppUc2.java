public class HelloApp {

    public static void main(String[] args) {

        // Check if user has provided a name
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Default output if no argument is given
            System.out.println("Hello, World!");
        }
    }
}
