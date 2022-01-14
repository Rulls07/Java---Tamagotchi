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
        int taskUser = 0;
        Tamagotchi pet = new Tamagotchi();
        System.out.println("-------------NEW PET----------");
        pet.pet();
        System.out.println("-------------PASSTIME----------");
        
        System.out.println("-------------THE PET CONDITIONS----------");
        System.out.println(pet.getMood());
        System.out.println(pet.toString()); 
        taskUser = pet.displayTaskMenu();
        System.out.println("-------------TASK USER CHOICE----------");
        pet.taskChoice(taskUser);
       
        System.out.println(pet.getMood());
        
        System.out.println("-------------PASSTIME----------"); 
        pet.passTime();
        pet.passTime();
        pet.passTime();
         System.out.println("-------------THE PET CONDITIONS----------");
        System.out.println(pet.getMood());
        
    }
    
}
