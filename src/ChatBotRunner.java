import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // introduction and creating chatbot
        System.out.print("Hello! What is your name? ");
        String userName = myScanner.nextLine();
        System.out.print("Welcome to Chat Bot " + userName + ". What would you like to call your bot? ");
        String botName = myScanner.nextLine();
        System.out.print("What would you like your bot's favorite number to be? ");
        int favNum = myScanner.nextInt();
        myScanner.nextLine();

        System.out.print("What is your favorite number? ");
        int userFavNum = myScanner.nextInt();
        myScanner.nextLine();

        System.out.print("What about your least favorite number? ");
        int userLeastFavNum = myScanner.nextInt();
        myScanner.nextLine();

        System.out.print("How tall are you to the nearest foot? ");
        int userHeight = myScanner.nextInt();
        myScanner.nextLine();

        ChatBot bot1 = new ChatBot(botName, favNum);

        // chatting
        bot1.greeting(userName);
        bot1.weather();
        System.out.println("I saw that your favorite number is " + userFavNum + ". ");
        bot1.favoriteNumber(userFavNum);
        System.out.println("Did you know your favorite number + my favorite number + your LEAST favorite number is " + bot1.addNumbers(userFavNum, favNum, userLeastFavNum) + "?");
        System.out.println("I also saw that you are around " + userHeight + " feet tall!");
        System.out.println("That is " + bot1.convertFeetToMeters(userHeight) + " meters tall!");
        bot1.nbaPlayer(userHeight);
        System.out.println("If you stood on Sun Mingming's head, you guys would be about " + bot1.combinedHeight(userHeight) + " feet tall!!");
    }
}
