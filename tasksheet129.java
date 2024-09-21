//ANIMAL INTERFACE
interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

//GORILLA CLASS IMPLEMENTATION
class Gorilla implements Animal {

    // Implements the feed method
    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            // put gorilla food into cage
            System.out.println("Gorilla is being fed.");
            return true;
        } else {
            System.out.println("Gorilla is not hungry.");
            return false;
        }
    }

    // Implements the groom method
    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Gorilla is being groomed.");
    }

    // Implements the pet method
    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Attempting to pet the gorilla... Pet at your own risk!");
    }
}

//MAIN CLASS
public class tasksheet129 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        
        // Feeding the gorilla
        gorilla.feed(true);
        
        // Grooming the gorilla
        gorilla.groom();
        
        // Petting the gorilla
        gorilla.pet();
    }
}