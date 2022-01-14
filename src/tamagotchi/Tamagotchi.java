package tamagotchi;

import java.util.Scanner;

/**
 *
 * @author Rulls
 */
public class Tamagotchi {

    private String name;
    private String typeTamagotchi;
    private String sexe;
    private int age;
    private int weight;
    private int happiness = 0;
    private int cleanliness;
    private int tiredness = 0;
    private int hungriness = 0;
    private boolean isAlive;

    /**
     * Constructor
     *
     * @param name
     * @param typeTamagotchi
     * @param sexe
     */
    public Tamagotchi(String name, String typeTamagotchi, String sexe) {
        this.name = name;
        this.typeTamagotchi = typeTamagotchi;
        this.sexe = sexe;
    }

    /**
     * Constructor vide
     */
    public Tamagotchi() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeTamagotchi() {
        return typeTamagotchi;
    }

    public void setTypeTamagotchi(String typeTamagotchi) {
        this.typeTamagotchi = typeTamagotchi;
    }

    public String getSexe() {
        return this.sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHappiness() {
        return this.happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getCleanliness() {
        return this.cleanliness;
    }

    public void setCleanliness(int cleanliness) {
        this.cleanliness = cleanliness;
    }

    public int getTiredness() {
        return this.tiredness;
    }

    public void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }

    public int getHungriness() {
        return this.hungriness;
    }

    public void setHungriness(int hungriness) {
        this.hungriness = hungriness;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    @Override
    public String toString() {
        return "Pet's name is::" + this.name + ", pet type is:" + this.typeTamagotchi + ", your pet's sex is:" + this.sexe;
    }

    public void displayStatistics() {
        System.out.println("HAPPINESS: " + this.happiness + " - " + " CLEANLINESS:" + this.cleanliness + " - " + " TIREDNESS:" + this.tiredness + " - " + " HUNGRINESS:" + this.hungriness + " - " + "\n"
                            + " WEIGHT:" + this.weight + " - " + " AGE:" + this.age);
    }

    /**
     *
     */
    public void clean() {
        this.cleanliness = 10;
        System.out.println(this.getName() + " :thanks I’m completely clean" + "[" + this.getCleanliness() + "]");
    }

    /**
     * method to feed your tamagotchi
     */
    public void feed() {
        this.hungriness -= 5;
        if (this.hungriness < 0) {
            this.hungriness = 0;
        }
        this.weight += 3;

    }

    /**
     * Method to reduce the weight of your pet weigth -= 6
     */
    public void diet() {
        this.weight -= 6;
        System.out.println(this.getName() + ": Thanks for the diet, I needed it");
    }

    /**
     * Method of playing with your pet happiness +=3 tireness +=2
     */
    public void play() {
        this.happiness += 3;
        this.tiredness += 2;
        this.weight -= 3;
        if (this.happiness > 10) {
            this.happiness = 10;
            System.out.println("the tamagotchi: " + this.getName() + " is super excited");

        }
        if (this.tiredness > 10) {
            this.tiredness = 10;
            System.out.println("the tamagotchi: " + this.getName() + " is very tired");

        }
        System.out.println(this.getName() + " :Thanks, I really wanted to play");
    }

    /**
     * Pet creation (dog, cat or bear), happiness =5 weight =3 = age We ask the
     * user for the name, sex and type of the pet
     */
    public void pet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the pet's name: ");
        String nameAnimal = scanner.nextLine();
        System.out.println("Enter the sex of the pet: (FEMALE/MALE): ");
        String sexAnimal = scanner.nextLine();
        while (!sexAnimal.equalsIgnoreCase("FEMALE") && !sexAnimal.equalsIgnoreCase("MALE")) {
            System.out.println(sexAnimal);
            System.out.println("Incorrect entry, Enter the sex of the pet: (FEMALE/MALE)");
            sexAnimal = scanner.nextLine();
        }
        System.out.println("Enter the type of tamagotchi:(DOG/CAT/BEAR)");
        String typeTama = scanner.nextLine();
        while (!typeTama.equalsIgnoreCase("DOG") && !typeTama.equalsIgnoreCase("CAT") && !typeTama.equalsIgnoreCase("BEAR")) {
            System.out.println(typeTama);
            System.out.println("Incorrect entry, enter the type of tamagotchi: (DOG/CAT/BEAR)");
            typeTama = scanner.nextLine();
        }

        this.setName(nameAnimal);
        this.setTypeTamagotchi(typeTama);
        this.setSexe(sexAnimal);
        this.setWeight(3);
        this.setAge(0);

        this.happiness += 5;
        if (this.happiness > 10) {
            this.happiness = 10;
        }

    }
//    currentMode Tiredness=10  = "asleep", Tiredness >7  ="tired", Hungriness >7 "hungry", Cleanliness < 3 "dirty", Happiness > 7 "happy" , Happiness >=4 and <7 = "good", Happiness < 4 ="sad"

    /**
     *
     * @return a string with the pet's status
     */
    public String getMood() {
        String msj = "";
        if (this.tiredness == 10) {
            msj += this.getName() + " is aslepp" + "[" + this.tiredness + "]" + "\n";
        } else if (this.tiredness > 7) {
            msj += this.getName() + " is tired" + "[" + this.tiredness + "]" + "\n";
        }
        if (this.hungriness >= 7) {
            msj += this.getName() + " is hungry" + "[" + this.hungriness + "]" + "\n";
        }
        if (this.cleanliness < 3) {
            msj += this.getName() + " is dirty" + "[" + this.cleanliness + "]" + "\n";
        }
        if (this.happiness > 7) {
            msj += this.getName() + " is happy" + "[" + this.happiness + "]" + "\n";
        } else if (this.happiness >= 4) {
            msj += this.getName() + " is good" + "[" + this.happiness + "]" + "\n";
        } else {
            msj += this.getName() + " is Sad" + "[" + this.happiness + "]" + "\n";
        }
        if (this.weight > 11 && this.weight <= 14) {
            msj += this.getName() + " your pet must go on a diet" + "[" + this.weight + "]" + "\n";
        } else if (this.weight > 14) {
            msj += this.getName() + " I’m sorry,your pet has died from overweight, from a heart attack" + "[" + this.weight + "]" + "\n";
        }
        if (this.age > 9) {
            msj += this.getName() + " my time has finally come, dead!!!!!" + "[" + this.age + "]" + "\n";
        }
        return msj;
    }

    /**
     * Time simulation increases hungriness +=1 decreases cleanliness -=1
     */
    public void passTime() {
        this.hungriness++;
        this.cleanliness--;
        this.age++;

        //****************** Tired
        if (this.tiredness == 10) {
            this.tiredness = 0;
        } else {
            this.tiredness++;
        }
        //****************** Hungry   

        if (this.hungriness >= 7) {
            this.happiness--;
        }

        if (this.hungriness == 10) {
            this.hungriness = 10;
        }
        //****************** Dirty

        if (this.cleanliness < 3) {
            this.happiness--;
        }
        if (this.cleanliness < 0) {
            this.cleanliness = 0;
        }
        //****************** Happy

        if (this.happiness < 0) {
            this.happiness = 0;
        }

    }

    /**
     * Display the task menu to the user
     *
     * @return
     */
    public int displayTaskMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What activity do you want to do with: " + this.getName());
        System.out.println("[0] = Clean the pet, [1] = Play with the pet, [2] = Feed the pet, [3] = Pet diet");
        int choiseUser = scanner.nextInt();
        scanner.nextLine();
        return choiseUser;
    }

    /**
     * user choice activity
     *
     * @param choiseUser
     */
    public void taskChoice(int choiseUser) {

        switch (choiseUser) {
            case 0:
                clean();
                break;
            case 1:
                play();
                break;
            case 2:
                feed();
                break;
            case 3:
                diet();
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    public boolean isAlivePet() {
        boolean isAlivePet;
        isAlivePet = this.weight <= 14 || this.age > 9;
        return isAlivePet;
    }

    public int checkAlive() {
        int alive;
        if (this.weight > 14) {
            alive = 1;
        } else {
            alive = 2;
        }
        return alive;
    }
}
