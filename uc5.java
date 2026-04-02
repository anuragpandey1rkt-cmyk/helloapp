public class HelloApp {

    public static void main(String[] args) {

        String result;

        // If no arguments → default
        if (args.length == 0) {
            result = "World";
        } else {

            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Enhanced for loop
            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            result = nameBuilder.toString();
        }

        System.out.println("Hello, " + result + "!");
    }
}
