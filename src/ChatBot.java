public class ChatBot {

    // instance variables
    private String name;
    private int number;

    // constructor
    public ChatBot(String chatBotName, int faveNum) {
        name = chatBotName;
        number = faveNum;
    }

    // method that prints a greeting
    public void greeting(String yourName) {
        System.out.println("Hello, " + yourName + " my name is " + name); // name is an instance variable
        System.out.println("and I am a chat bot! How are you today?");
    }

    // method that prints the weather
    public void weather() {
        System.out.println("I actually don't know much about the weather! Ha ha!");
        System.out.println("But I know it's warm and dry inside a computer! Ha ha!");
    }

    // method that converts feet to meters and returns the meters
    public double convertFeetToMeters(int numFeet) {
        final double METERS_PER_FOOT = 0.3048;
        return METERS_PER_FOOT * numFeet;
    }

    // method that prints information about favorite numbers
    public void favoriteNumber(int yourNumber) {
        int distance = yourNumber - number;  // number is an instance variable
        System.out.println("My favorite number is " + number);
        System.out.println("That is " + distance + " away from your number!");
    }

    // method that adds and returns the sum of three numbers
    public int addNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // method that RETURNS a goodbye message as a String -- note there is no printing here!
    public String goodbye() {
        return "It was nice talking with you! Have a great day! Sincerely, " + name;
    }

    // void method
    // this calculates and prints teh approximate comparison of the users height to sun mingmings height
    public void nbaPlayer(int height){
        final int sunMingMingHeight = 8; // in feet (7'9 really)
        int heightDifference = sunMingMingHeight - height;
        if (heightDifference>1) {
            System.out.println("The tallest professional basketball player, Sun Mingming is almost " + heightDifference + " feet taller than you.");
        } else if (heightDifference==1){
            System.out.println("The tallest professional basketball player, Sun Mingming is almost " + heightDifference + " foot taller than you.");
        } else if (heightDifference<0){
            System.out.println("You're taller than Sun Mingming, the tallest professional basketball player! WOW!!");
        } else {
            System.out.println("You're around the same height as Sun Mingming, the tallest professional basketball player! WOW!!");
        }
    }

    // method that returns a variable
    // this approximates the height of user and sun mingming combined
    public int combinedHeight(int height){
        final int sunMingMingHeight = 8; // in feet (7'9 really)
        return sunMingMingHeight + height;
    }

    }




