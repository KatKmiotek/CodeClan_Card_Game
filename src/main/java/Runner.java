import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner myObject = new Scanner(System.in);
        Game game = new Game();


        System.out.println("Enter player names, or type begin to start !");
        String name =  myObject.nextLine();

        while(!name.equalsIgnoreCase("begin")) {
            Player player = new Player(name);
            game.addPlayerToGame(player);
            name =  myObject.nextLine();
        }

        System.out.println("This just works");
    }
}
