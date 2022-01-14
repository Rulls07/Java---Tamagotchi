package tamagotchi;

import java.util.Scanner;

/**
 *
 * @author Rulls
 */
public class Animal {

    private String name;
    private String color;
    private String sexe;
    private int age;
    private int energy;
    private float weight;
    private int happiness;
    private int cleanliness;
    private int tiredness;
    private int hungriness;
    private int repas = 2;

    /**
     *
     * CONSTRUCTOR
     * @param name
     * @param color
     * @param sexe
     */


    public Animal(String name, String color, String sexe) {
        this.name = name;
        this.color = color;
        this.sexe = sexe;
    }

    public Animal() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexe() {
        return sexe;
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

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
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


    @Override
    public String toString() {
        return "Animal******* TEST{" + "name=" + name + ", color=" + color + ", age=" + age + ", energy=" + energy + ", weight=" + weight + ", happiness=" + happiness + '}';
    }

    public void createTamagotchi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nom du Tamagotchi: ");
        String nameAnimal = scanner.nextLine();
        System.out.println("Sexe du Tamagotchi: (FEMELLE/MALE): ");
        String sexAnimal = scanner.nextLine();
        while (!sexAnimal.equalsIgnoreCase("FEMELLE") && !sexAnimal.equalsIgnoreCase("MALE")) {
            System.out.println(sexAnimal);
            System.out.println("Saisie incorrect Sexe du Tamagotchi: (FEMELLE/MALE)");
            sexe = scanner.nextLine();
        }
        System.out.println("Color du Tamagotchi: ");
        String colorAnimal = scanner.nextLine();

        this.setName(nameAnimal);
        this.setColor(colorAnimal);
        this.setSexe(sexAnimal);
        this.setEnergy(10);
        this.setHappiness(50);
        this.setWeight(3);
        this.setAge(0);

    }
/**
 * 
 */
    public void bornTamagotchi() {

    }
/**
 * 
 */
    public void eatTamagotchi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You want to feed " + this.getName() + "??? 'Y'/'N': ");
        String eatAnswer = sc.nextLine();
        while (!eatAnswer.equalsIgnoreCase("Y") && !eatAnswer.equalsIgnoreCase("N")) {
            System.out.println("Incorrect answer, You want to feed " + this.getName() + ": 'Y'/'N': ");
            eatAnswer = sc.nextLine();
        }
        if ("Y".equalsIgnoreCase(eatAnswer)) {
            System.out.println("Yes!!!!, I am very hungry MMMMMMMM!!!!!!, I am very happy  ");
            this.setWeight((this.getWeight() + this.repas));
            this.setHappiness(this.getHappiness() + 10);
            this.setEnergy(this.getEnergy() + 10);
        }

    }
/**
 * Methode
 */
    public void sleepTamagotchi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You want to send " + this.getName() + "to sleep??? ('Y'/'N') ");
        String sleepAnswer = sc.nextLine();
        while (!sleepAnswer.equalsIgnoreCase("Y") && !sleepAnswer.equalsIgnoreCase("N")) {
            System.out.println("Incorrect answer, You want to send " + this.getName() + "to sleep??? ('Y'/'N') ");
            sleepAnswer = sc.nextLine();
        }
        if ("Y".equalsIgnoreCase(sleepAnswer)) {
            System.out.println("Yes!!!!, I am very tired, thank you my friend  ");
            this.setHappiness(this.getHappiness() + 10);
            this.setEnergy(this.getEnergy() + 10);
        }

    }
/**
 * Methode
 */
    public void playTamagotchi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You want to send " + this.getName() + "to play??? ('Y'/'N') ");
        String playAnswer = sc.nextLine();
        while (!playAnswer.equalsIgnoreCase("Y") && !playAnswer.equalsIgnoreCase("N")) {
            System.out.println("Incorrect answer, You want to send " + this.getName() + "to play??? ('Y'/'N') ");
            playAnswer = sc.nextLine();
        }
        if ("Y".equalsIgnoreCase(playAnswer)) {
            System.out.println("Yes!!!!,I want to play with you , thank you my friend  ");
            this.setHappiness(this.getHappiness() + 10);
            this.setEnergy(this.getEnergy() - 20);
        }

    }

}
