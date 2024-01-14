import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.Scanner;

interface DisplayInfo { // interface
    void displayInfo();
}

interface introduction { // interface
    void intro();
}

abstract class characNot implements DisplayInfo, introduction { // abstract class
    public abstract void displayInfo(); // abstrct method

    public void intro() {
        System.out.println("This is uncustomized character");
    }
}

class start implements introduction {
    public void intro() {
        System.out.println("====================================================================");
        System.out.println("Thank you for customizing me! I hope you are satisfied.");
    }
}

public class characCustomization extends characNot implements introduction { // inheritance
    private String name, skintone, faceShape, bodyShape, hairColor, eyeColor, hairStyle;
    private String tops, bottom, shoes, accessories;
    private String pSkill, sSkill, uSkill, pWeapon, sWeapon, throwables, pets;
    private double height;
    private int age, gender, sLevel;
    private boolean gameMode;

    // encapsulation
    public void setName(String name) { this.name = name; } // this keyword
    public void setGender(int gender) { this.gender = gender; }
    public void setSkintone(String skintone) { this.skintone = skintone; }
    public void setFaceShape(String faceShape) { this.faceShape = faceShape; }
    public void setBodyShape(String bodyShape) { this.bodyShape = bodyShape; }
    public void setHairColor(String hairColor) { this.hairColor = hairColor; }
    public void setEyeColor(String eyeColor) { this.eyeColor = eyeColor; }
    public void setHairStyle(String hairStyle) { this.hairStyle = hairStyle; }
    public void setTops(String tops) { this.tops = tops; }
    public void setBottom(String bottom) { this.bottom = bottom; }
    public void setShoes(String shoes) { this.shoes = shoes; }
    public void setAccessories (String accessories) {this.accessories = accessories;}
    public void setpSkill(String pSkill) { this.pSkill = pSkill; }
    public void setsSkill(String sSkill) { this.sSkill = sSkill; }
    public void setuSkill(String uSkill) { this.uSkill = uSkill; }
    public void setpWeapon(String pWeapon) { this.pWeapon = pWeapon; }
    public void setsWeapon(String sWeapon) { this.sWeapon = sWeapon; }
    public void setThrowables(String throwables) { this.throwables = throwables; }
    public void setPets(String pets) { this.pets = pets; }
    public void setAge(int age) { this.age = age; }
    public void setHeight(double height) { this.height = height; }
    public void setsLevel(int sLevel) { 
        if (sLevel >= 1 && sLevel <= 3) {
            this.sLevel = sLevel;
        } else {
            System.out.println("Invalid skill level. Setting default value.");
            this.sLevel = 1;
        }
    }
    public void setGameMode (boolean gameMode) {this.gameMode = gameMode; }
    public String getName() { return name; }
    public int getGender() { return gender; }
    public String getSkintone() { return skintone; }
    public String getFaceShape() { return faceShape; }
    public String getBodyShape() { return bodyShape; }
    public String getHairColor() { return hairColor; }
    public String getEyeColor() { return eyeColor; }
    public String getHairStyle() { return hairStyle; }
    public String getTops() { return tops; }
    public String getBottom() { return bottom; }
    public String getShoes() { return shoes; }
    public String getAccessories() {return accessories;}
    public String getpSkill() { return pSkill; }
    public String getsSkill() { return sSkill; }
    public String getuSkill() { return uSkill; }
    public String getpWeapon() { return pWeapon; }
    public String getsWeapon() { return sWeapon; }
    public String getThrowables() { return throwables; }
    public String getPets() { return pets; }
    public int getAge() { return age; }
    public double getHeight() { return height; }
    public int getsLevel() { return sLevel; }
    public boolean getGameMode() { return gameMode; }

    public characCustomization() {}
        private String getGenderString() {
            return (this.getGender() == 1) ? "Female" : "Male";
    }
    
    public void displayInfo() { // method overriding
        System.out.println("\nThis is your final customized character!");
        System.out.println("Character Attributes: \n=====================");
        String skillLevelDescription;
        switch (this.getsLevel()) {
            case 1:
                skillLevelDescription = "Beginner";
                break;
            case 2:
                skillLevelDescription = "Intermediate";
                break;
            case 3:
                skillLevelDescription = "Advanced";
                break;
            default:
                skillLevelDescription = "Unknown";
                break;
        }
        System.out.println("Name: " + this.getName() + "\nGender: " + this.getGenderString() + "\nAge: " + this.getAge() + " year/s old" + "\nHeight: " + this.getHeight());
        System.out.println("Skin Tone: " + this.getSkintone() + "\nFace Shape: " + this.getFaceShape() + "\nBody Shape: " + this.getBodyShape() + 
        "\nHair Color: " + this.getHairColor() + "\nEye Color: " + this.getEyeColor() + "\nHair Style: " + this.getHairStyle());
        System.out.println("Tops: " + this.getTops() + "\nBottom: " + this.getBottom() + "\nShoes: " + this.getShoes() + "\nAccessories: " + this.getAccessories());
        System.out.println("Primary Skill: " + this.getpSkill() + "\nSecondary Skill: " + this.getsSkill() + "\nUltimate Skill: " + this.getuSkill() + "\nSkill Level: " + this.getsLevel() + " = " + skillLevelDescription + "\nPrimary Weapon: " + this.getpWeapon() + 
        "\nSecondary Weapon: " + this.getsWeapon() + "\nThrowable: " + this.getThrowables() + "\nPet: " + this.getPets());
    }

    public static void main (String [] args) {
        int skillLevelInput;
        boolean confirmed;
        Scanner scanner = new Scanner(System.in);
        characCustomization character = new characCustomization();
        start Start = new start();
        
    do {
        confirmed = true;
        String[] skinTones = {"Pale", "Tan", "Light", "Brown", "Dark"};
        String[] faceShapes = {"Round", "Oval", "Square", "Diamond", "Heart", "Oblong"};
        String[] bodyShapes = {"Slim", "Athletic", "Muscular", "Petite", "Fit"};
        String[] hairColors = {"Black", "Brown", "Red", "Yellow", "Purple", "Pink"};
        String[] eyeColors = {"Black", "Brown", "Blue", "Hazel", "Green"};
        String[] hairStyles = {"Short", "Long", "Curly", "Braided", "Buns", "Layers"};
        String[] tops = {"Shirt", "Tank tops", "Hoodie", "Sando", "None"};
        String[] bottoms = {"Short", "Pants", "Skirt", "Jumpsuit", "Leggings"};
        String[] shoes = {"Sneakers", "Boots", "Sandals", "Slides", "None"};
        String[] acceList = {"Hat", "Gloves", "Earrings", "Necklace", "Bracelet"};
        String[] primarySkills = {"Teleportation", "Rasenggan", "Mud Wall", "Soul Steal", "Sword Mastery"};
        String[] secondarySkills = {"Energy Ball", "Sand Arrow", "Mirroring", "Healing", "Stealth"};
        String[] ultimateSkills = {"God Speed", "Rising Sun", "Transformation", "Summoning", "Ethereal Form"};
        String[] primaryWeapons = {"Sniper", "Rifle", "Shotgun", "Machinegun", "Crossbow"};
        String[] secondaryWeapons = {"Pistol", "Knife", "Shield", "Shuriken", "Kunai"};
        String[] throwables = {"Grenade", "Molotov", "Flashbang", "Smoke", "Gas Grenade"};
        String[] petsList = {"Dragon", "Wolf", "Eagle", "Bear", "Cat"};

        System.out.println("Welcome! Please customize your character. \nThere will be choices available for you to choose from in order to fully create your character. \n====================================================================");
        System.out.print("Enter your name: ");
        character.setName(scanner.nextLine());
        while (true) {
            System.out.print("Choose gender: \n1. Female \n2. Male \nChoice: ");    
            try {
                int genderChoice = scanner.nextInt();
                if (genderChoice == 1 || genderChoice == 2) {
                    character.setGender(genderChoice);
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter 1 or 2.");
                scanner.nextLine();
            }}
        while (true) {
            System.out.print("Enter age: ");
            try {
                int age = scanner.nextInt();
                if (age < 1 || age > 125) {
                    System.out.println("Invalid age. Please input between 1 - 125.");
                }else {
                    character.setAge(age);
                    break;
            }
            }catch (InputMismatchException e) {
                System.out.println("Invalid. Please input number.");
                scanner.nextLine(); 
        }}
        character.setHeight(heightChoices(scanner));
        character.setSkintone(displayChoices(scanner, "Choose skin tone:", skinTones));
        character.setFaceShape(displayChoices(scanner, "Choose face shape:", faceShapes));
        character.setBodyShape(displayChoices(scanner, "Choose body shape:", bodyShapes));
        character.setHairColor(displayChoices(scanner, "Choose hair color:", hairColors));
        character.setEyeColor(displayChoices(scanner, "Choose eye color:", eyeColors));
        character.setHairStyle(displayChoices(scanner, "Choose hair style:", hairStyles));
        character.setTops(displayChoices(scanner, "Choose tops:", tops));
        character.setBottom(displayChoices(scanner, "Choose bottom:", bottoms));
        character.setShoes(displayChoices(scanner, "Choose shoes:", shoes));
        character.setAccessories(displayChoices(scanner, "Choose accessories:", acceList));
        character.setpSkill(displayChoices(scanner, "Choose primary skill:", primarySkills));
        character.setsSkill(displayChoices(scanner, "Choose secondary skill:", secondarySkills));
        character.setuSkill(displayChoices(scanner, "Choose ultimate skill:", ultimateSkills));    
        while (true) {
            System.out.print("Enter skill level: \n1. Beginner \n2. Intermediate \n3. Advanced \nEnter choice: ");
            try {
                skillLevelInput = scanner.nextInt();
                if (skillLevelInput >= 1 && skillLevelInput <= 3) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                scanner.nextLine();
            }
        }
        character.setsLevel(skillLevelInput);
        character.setpWeapon(displayChoices(scanner, "Choose primary weapon:", primaryWeapons));
        character.setsWeapon(displayChoices(scanner, "Choose secondary weapon:", secondaryWeapons));
        character.setThrowables(displayChoices(scanner, "Choose throwable:", throwables));
        character.setPets(displayChoices(scanner, "Choose pet:", petsList));
        System.out.println("Choose game mode: \n1. Hard Mode \n2. Normal Mode");
        System.out.print("Enter choice: ");
        int gameModeChoice;

    while (true) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number (1 for Hard Mode, 2 for Normal Mode): ");
            scanner.next();
    }
        gameModeChoice = scanner.nextInt();
    if (gameModeChoice < 1 || gameModeChoice > 2) {
        System.out.print("Invalid choice. Please enter 1 for Hard Mode or 2 for Normal Mode: ");
    } else {
        break;
    }
}
        scanner.nextLine();
        boolean isHardMode = gameModeChoice == 1;
        character.setGameMode(isHardMode);
        Start.intro();
        confirmed = confirmCharacterCustomization(scanner, character);
        if (!confirmed) {
            scanner.close();
            return;
        }
        if (character.getGameMode()) {
            System.out.println("\nHard Mode... \nThe dungeon boss can be defeated once the boss battle begins. Locate elemental bosses in each of the five elemental dungeons and take them out one at a time. You will battle Fire, Earth, Water, Thunder, and Air bosses in every dungeon. You must defeat each Boss in order to advance to the next dungeon. Gaining victory over every dungeon boss will get you a reward.");
        } else {
            System.out.println("\nNormal Mode... \nKill the beast by entering the world of resources. There are several kinds of materials and loot, and the amount of experience you receive varies according on the level of the monsters you kill. You can stay here to get a lot of experience points and stuff to level up and enhance your skill builds. To defeat the dungeon bosses, you must maximize both your character level and your abilities.");
        }
        scanner.close();
    } while (!confirmed);
}


private static boolean confirmCharacterCustomization(Scanner scanner, characCustomization character) {
    boolean confirmed = false;
    String confirmconfirm;

    while (true) {
        System.out.print("Would you like to confirm your choices? (Yes / No): ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("yes")) {
            System.out.println("Your character customization has been confirmed:");
            character.displayInfo();
            confirmed = true;
            break;
        } else if (confirmation.equalsIgnoreCase("no")) {
            System.out.println("Your character customization has been cancelled. Thank you for trying.");
            System.out.print("Would you like to try again? (Yes / No): ");
                while (true) {
                    confirmconfirm = scanner.nextLine();
                    if (confirmconfirm.equalsIgnoreCase("yes")) {
                        System.out.println("");
                        characCustomization.main(null);
                        break;
                    } else if (confirmconfirm.equalsIgnoreCase("no")) {
                        System.out.println("Your character customization has been cancelled. Thank you for trying."); break;
                    }
                    else {
                        System.out.println("Invalid input. Please enter Yes / No.");
                        System.out.print("Would you like to try again? (Yes / No): "); continue;
                    }
                }


            break;
        } else {
            System.out.println("Invalid input. Please enter (Yes / No).");
        }
    }

    return confirmed;
}



private static double heightChoices (Scanner scanner) { // method
        String[] heights = {"1. 40%", "2. 70%", "3. 100%", "4. 120%"};
        double[] convert = {0.4, 0.7, 1.0, 1.2};
    
        System.out.println("Choose height percentage:");
        for (String choice : heights) {
            System.out.println(choice);
        }
    
        int userInput;
        do {
            System.out.print("Enter the number of your choice (1-" + heights.length + "): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                System.out.print("Enter the number of your choice (1-" + heights.length + "): ");
                scanner.next();
            }
            userInput = scanner.nextInt();
            if (userInput < 1 || userInput > heights.length) {
                System.out.println("Invalid choice. Please enter a number between 1 and " + heights.length);
            }
        } while (userInput < 1 || userInput > heights.length);
    
        return convert[userInput - 1];
    }
    

    private static String[] choiceNum (String[] choices) {
        String[] numChoice = new String[choices.length];
        for (int i = 0; i < choices.length; i++) {
            numChoice[i] = (i + 1) + ". " + choices[i];
        }
        return numChoice;
    }
    
    private static String displayChoices(Scanner scanner, String prompt, String[] choices) {
        String[] numChoice = choiceNum(choices);
        System.out.println(prompt);
        for (String choice : numChoice) {
            System.out.println(choice);
        }
    
        int userInput;
        do {
            System.out.print("Enter the number of your choice (1-" + choices.length + "): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                System.out.print("Enter the number of your choice (1-" + choices.length + "): ");
                scanner.next();
            }
            userInput = scanner.nextInt();
            if (userInput < 1 || userInput > choices.length) {
                System.out.println("Invalid choice. Please enter a number between 1 and " + choices.length);
            }
        } while (userInput < 1 || userInput > choices.length);
    
        scanner.nextLine(); 
        return choices[userInput - 1];
    }}
    