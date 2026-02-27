import Task2.Animal;
import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> animals;

    public Zoo() {
    }
    
    public Zoo(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public Zoo(Zoo other) {
        this(other.animals);
    }
    
}