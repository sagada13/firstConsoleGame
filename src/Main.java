import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        ArrayList<items> itemsArray = new ArrayList<items>();
        items firstItem = new items("White Powder", "Drug", 0);
        items secondItem = new items("Blue Crystal", "Drug", 0);
        items thirdItem = new items("Russian Drink", "Booze", 0);
        items fourthItem = new items("False Passport", "Paper", 0);
        items fifthItem = new items("Suspicious Package", "???", 0);
        itemsArray.add(firstItem);
        itemsArray.add(secondItem);
        itemsArray.add(thirdItem);
        itemsArray.add(fourthItem);
        itemsArray.add(fifthItem);
        ArrayList<City> cities = new ArrayList<City>();
        City firstCity = new City("Mourreal", 0, 1);
        City secondCity = new City("Bumville", 0, 2);
        City thirdCity = new City("Richtown", 0, 3);
        City fourthCity = new City("Shawinigan", 0, 4);
        cities.add(firstCity);
        cities.add(secondCity);
        cities.add(thirdCity);
        cities.add(fourthCity);

        Smuggler alCapone = new Smuggler(200, 100, 0);

        Scanner myScanner = new Scanner(System.in);
        String userInput = "";
        int userInputValidation = -1;
        while (!userInput.equalsIgnoreCase("X")) {
            System.out.println("Please press X to begin the game");
            userInput = myScanner.nextLine();
        }

        do {
            System.out.println("Which city woud you like to travel to? Use the numbers to travel");
            System.out.println("1:Mourreal\n2:Bumville\n3:Richtown\n4:Shawinigan");
            while (!myScanner.hasNextInt()) {
                System.out.println("Please enter a number between 1 and 4");
            }
        } while (userInputValidation <= 0 && userInputValidation > 4);
        {
            userInputValidation = myScanner.nextInt();
            switch (userInputValidation) {
                case 1:
                    firstCity.travel();
                    break;
                case 2:
                    secondCity.travel();
                    break;
                case 3:
                    thirdCity.travel();
                    break;
                case 4:
                    fourthCity.travel();
                    break;
            }
        }



        System.out.println("You in front of us for what now.. Business? Press Y to buy, or N to offer us what you smuggled. Our prices as always. If not S is for Safehouse.");
        userInput = myScanner.next();
        userInput = (userInput).toUpperCase();
        switch (userInput) {

            case "Y":
            do {
                System.out.println("Which item would you be interested to buy?");
                System.out.println("1:White Powder\n" + "2:Blue Crystal\n" + "3:Russian Drink\n" + "4:False Passport\n" + "5:Suspicious Package");
                if (!myScanner.hasNextInt()) {
                    System.out.println("Pick your poison then. Enter a number between 1 and 5");
                }
            }
            while (userInputValidation <= 0 && userInputValidation > 5 && userInput == "Y");
            {
                userInputValidation = myScanner.nextInt();
                if (userInputValidation == 1) {
                    firstItem.buyItem();
                } else if (userInputValidation == 2) {
                    secondItem.buyItem();
                } else if (userInputValidation == 3) {
                    thirdItem.buyItem();
                } else if (userInputValidation == 4) {
                    fourthItem.buyItem();
                } else if (userInputValidation == 5) {
                    fifthItem.buyItem();
                }
            }
            break;
            case "N":
                System.out.println("Tough guy got it all huh. Let's see it then smuggler..");
            do {
                System.out.println("Which item would you be interested to sell?");
                System.out.println("1:White Powder\n" + "2:Blue Crystal\n" + "3:Russian Drink\n" + "4:False Passport\n" + "5:Suspicious Package");
                while (!myScanner.hasNextInt()) {
                    System.out.println("You better sell us the good stuff, we have police on payroll. You can't hide. Enter a number between 1 and 5");
                }
            }
            while (userInputValidation <= 0 && userInputValidation > 5 && userInput == "N");
            userInputValidation = myScanner.nextInt();
            if (userInputValidation == 1) {
                firstItem.sellItem();
            } else if (userInputValidation == 2) {
                secondItem.sellItem();
            } else if (userInputValidation == 3) {
                thirdItem.sellItem();
            } else if (userInputValidation == 4) {
                fourthItem.sellItem();
            } else if (userInputValidation == 5) {
                fifthItem.sellItem();
            }
            break;

            case "S":
            while (!userInput.equalsIgnoreCase("S")) ;
            {
                System.out.println("Safe travels are ever rarer. Make sure to continue moving smart. \n King's weren't ever pawns but every kingpin's journey starts somewhat similar to ours." +
                        "\nStand your ground and choose between the following: \n1:Buy \n2:Sell \n3:Inventory \n4:Travel \n5:Location");
            }
            break;
        }
    }
}

