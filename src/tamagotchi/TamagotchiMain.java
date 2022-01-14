package tamagotchi;

/**
 *
 * @author Rulls
 */

public class TamagotchiMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tamagotchi pet = new Tamagotchi();
        pet.pet();
        System.out.println(pet.getMood());
        System.out.println(pet.toString());
        pet.taskChoice();
        System.out.println(pet.getMood());
        pet.passTime();
        pet.passTime();
        pet.passTime();
        System.out.println(pet.getMood());
        
    }
    
}
