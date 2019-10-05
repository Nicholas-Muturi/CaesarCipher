import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loopMenu = true;

        System.out.println("********************** CAESAR CIPHER **********************\n" + "Welcome to Caesar Cipher, Encrypt & Decrypt your information\n");
        while(loopMenu){
            System.out.println("----------------------------------------------------------");
            System.out.println("What do you want to do?\n" + "1: Encrypt\n" + "2: Decrypt\n" + "3: Exit");
            int menuSelection = input.nextInt();
            input.nextLine(); // To be consumed by nextInt;

            if(menuSelection == 1){
                //Encrypt
                System.out.println("Insert what you want encrypted");
                String userInput = input.nextLine();
                System.out.println("In which direction do you want to encrypt your information? Right or Left");
                String userDirection = "";

                boolean validDirection = true;
                while(validDirection){
                    userDirection = input.nextLine();
                    if(!userDirection.equalsIgnoreCase("right") && !userDirection.equalsIgnoreCase("left")){
                        System.out.println("Please select a direction by typing left or right");
                    }
                    else {
                        validDirection = false;
                    }
                }

                System.out.println("How many characters do you want to shift your information to the "+userDirection);
                int userShift = input.nextInt();
                Cipher cipher = new Cipher(userInput);
                System.out.println("Your Input: "+userInput);
                System.out.println("Encrypted Input: "+cipher.encryptText(userDirection, userShift));
            }
            else if(menuSelection == 2){
                //Decrypt
                System.out.println("Insert what you want decrypted");
                String userInput = input.nextLine();
                System.out.println("In which direction do you want to decrypt your information? Right or Left");
                String userDirection = "";

                boolean validDirection = true;
                while(validDirection){
                    userDirection = input.nextLine();
                    if(!userDirection.equalsIgnoreCase("right") && !userDirection.equalsIgnoreCase("left")){
                        System.out.println("Please select a direction by typing left or right");
                    }
                    else {
                        validDirection = false;
                    }
                }

                System.out.println("How many characters do you want to shift your information to the "+userDirection);
                int userShift = input.nextInt();
                Cipher cipher = new Cipher(userInput);
                System.out.println("Your Input: "+userInput);
                System.out.println("Decrypted Input: "+cipher.decryptText(userDirection, userShift));

            }
            else if(menuSelection == 3){
                loopMenu = false;
            }
            else {
                System.out.println("Your input is not recognized. Please select a item from the main menu");
            }
        }
        input.close();
    }
}
