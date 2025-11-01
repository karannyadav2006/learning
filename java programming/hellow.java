class CommandLineExample {
    public static void main(String[] args) {
        // Check if arguments are passed
        if(args.length > 0) {
            System.out.println("You passed these arguments:");
            for(int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "] = " + args[i]);
            }
        } else {
            System.out.println("No arguments passed!");
        }
    }
}
