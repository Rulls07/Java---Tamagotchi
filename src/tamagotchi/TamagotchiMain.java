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
//        int alive = 0;
        boolean isAlive;
        Tamagotchi pet = new Tamagotchi();
        System.out.println("-------------NEW PET----------");
        pet.pet();
        System.out.println(pet.toString());
        do {
            pet.taskChoice(pet.displayTaskMenu());
            System.out.println(pet.getMood());
            System.out.println("-------------STATISTIC----------");
            pet.displayStatistics();
            System.out.println("-------------PASSTIME----------");
            pet.passTime();
//            alive = pet.checkAlive();
            isAlive = pet.isAlivePet();
            
        } while (isAlive);
//            (alive == 2)
    }

}
