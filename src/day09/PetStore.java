package day09;

public class PetStore {
    
    public void perform(IAnimal animal) {
        animal.eat();
        animal.play();
        if(animal instanceof Electricity) {
            int volt = ((Electricity)animal).volt();
            System.out.println("volt: " + volt);
        }
    }
    
    public static void main(String[] args) {
        Shiba shiba = new Shiba();
        Chihuahua chihuahua = new Chihuahua();
        PetStore petStore = new PetStore();
        EDog eDog = new EDog();
        
        petStore.perform(shiba);
        petStore.perform(chihuahua);
        petStore.perform(eDog);
    }
}
