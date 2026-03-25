public class HelloApp {

    public static void main(String[] args) {

        String name;

        // Check if arguments exist
        if (args.length > 0) {

            // Join all names with comma
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            name = nameBuilder.toString();

        } else {
            // Default case
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    }
}
