package example;

//import example.command.CommandReader;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting...");

        authenticate();

        Command command = new Command();
    }

    private static void authenticate() {
        Auth authentication = new Auth();
        authentication.authenticate();
    }
}
