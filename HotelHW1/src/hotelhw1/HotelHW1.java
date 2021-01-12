package hotelhw1;

import java.util.Scanner;

public class HotelHW1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        MainMenu();
    }

    public static void MainMenu() {
        while (true) {
            System.out.println("Hello and welcome to my hotel ^o^");
            System.out.println("What would you like to do?");
            System.out.println("1- Book a room");
            System.out.println("0- Exit");

            int UserChoice = input.nextInt();

            switch (UserChoice) {
                case 1:
                    RoomChoice();
                    break;
                case 0:
                    System.out.println("Thanks for coming, please come again ^o^");
                    System.exit(0);
            }
        }
    }

    public static void RoomChoice() {
        System.out.println("Which room would you like to book?");
        System.out.println("1- Single(1) - £50");
        System.out.println("2- Double(2) - £75");
        System.out.println("3- Family(4) - £105");
        System.out.println("4- Nothing I changed my mind");

        int UserChoice = input.nextInt();

        switch (UserChoice) {
            case 1:
                SingleRoom();
                break;
            case 2:
                DoubleRoom();
                break;
            case 3:
                FamilyRoom();
                break;
            case 4:
                System.exit(0);
        }
    }

    public static void SingleRoom() {
        System.out.println("How many days are you staying?");
        int StayTime = input.nextInt();

        int Size = 1;
        double Price = 50;
        double DailyRate;

        int BoardType = 0;
        System.out.println("What board type would you like?");
        System.out.println("1- Self Catering - £0");
        System.out.println("2- Half Board - £10");
        System.out.println("3- Full Board - £20");

        int UserChoice = input.nextInt();

        switch (UserChoice) {
            case 1:
                BoardType = 1;
                break;
            case 2:
                BoardType = 2;
                break;
            case 3:
                BoardType = 3;
                break;
        }

        if (BoardType == 1) {
            Price = Price + 0;
        }
        if (BoardType == 2) {
            Price = Price + 10;
        }
        if (BoardType == 3) {
            Price = Price + 20;
        }

        DailyRate = Price;
        System.out.println("Your Daily Rate is: " + DailyRate);
        if (StayTime > 7) {
            System.out.println("Your Daily Rate without discount is: " + DailyRate);
            for (int i = StayTime - 7; i > 0; i--) {
                DailyRate = Price * 0.2;
            }
            DailyRate = Price - DailyRate;
            System.out.println("Your Daily Rate with discount is: " + DailyRate);
        }

    }

    public static void DoubleRoom() {
        System.out.println("How many days are you staying?");
        int StayTime = input.nextInt();

        int Size = 1;
        double Price = 75;
        double DailyRate;

        int BoardType = 0;
        System.out.println("What board type would you like?");
        System.out.println("1- Self Catering - £0");
        System.out.println("2- Half Board - £10");
        System.out.println("3- Full Board - £20");

        int UserChoice = input.nextInt();

        switch (UserChoice) {
            case 1:
                BoardType = 1;
                break;
            case 2:
                BoardType = 2;
                break;
            case 3:
                BoardType = 3;
                break;
        }

        if (BoardType == 1) {
            Price = Price + 0;
        }
        if (BoardType == 2) {
            Price = Price + 10;
        }
        if (BoardType == 3) {
            Price = Price + 20;
        }

        DailyRate = Price;
        System.out.println("Your Daily Rate is: " + DailyRate);
        if (StayTime > 7) {
            System.out.println("Your Daily Rate without discount is: " + DailyRate);
            for (int i = StayTime - 7; i > 0; i--) {
                DailyRate = Price * 0.2;
            }
            DailyRate = Price - DailyRate;
            System.out.println("Your Daily Rate with discount is: " + DailyRate);
        }
    }

    public static void FamilyRoom() {
        System.out.println("How many days are you staying?");
        int StayTime = input.nextInt();

        int Size = 1;
        double Price = 105;
        double DailyRate;

        int BoardType = 0;
        System.out.println("What board type would you like?");
        System.out.println("1- Self Catering - £0");
        System.out.println("2- Half Board - £10");
        System.out.println("3- Full Board - £20");

        int UserChoice = input.nextInt();

        switch (UserChoice) {
            case 1:
                BoardType = 1;
                break;
            case 2:
                BoardType = 2;
                break;
            case 3:
                BoardType = 3;
                break;
        }

        if (BoardType == 1) {
            Price = Price + 0;
        }
        if (BoardType == 2) {
            Price = Price + 10;
        }
        if (BoardType == 3) {
            Price = Price + 20;
        }

        DailyRate = Price;
        System.out.println("Your Daily Rate is: " + DailyRate);
        if (StayTime > 7) {
            System.out.println("Your Daily Rate without discount is: " + DailyRate);
            for (int i = StayTime - 7; i > 0; i--) {
                DailyRate = Price * 0.2;
            }
            DailyRate = Price - DailyRate;
            System.out.println("Your Daily Rate with discount is: " + DailyRate);
        }
    }

}
