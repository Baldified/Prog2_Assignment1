import Task2.Animal;
import java.util.ArrayList;

public class Zoo {
    public static ArrayList<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }
    
    public Zoo(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public Zoo(Zoo other) {
        this.animals = other.animals;
    }
    
    
    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        Zoo.animals = animals;
    }

    public static int countAnimals(String type) {
        int count = 0;

        for (Animal a : animals) {
            if (type != null && type.equals(a.getType()))
                count++;
            }

        return count;
    }

    public static void updateValidTypes() {
        String[] types = {"Cat", "Dog", "Monkey"};
        
        for (String type : types) {
            if (countAnimals(type) == 0)
            for (Animal a : animals) {
                a.removeLegalTypes(type);
            }
        }
    }

    public static boolean isGenderBalanced(String type) {
        int maleCount = 0;
        int femaleCount = 0; 
        
        for (Animal a : animals) {
            if (type.equals(a.getType())) 
                if ("Male".equals(a.getGender()))
                    maleCount++;
                else if ("Female".equals(a.getGender()))
                    femaleCount++;    
        }
        
        int totalCount = maleCount + femaleCount;
        if (totalCount == 0) return false;
        int difference = Math.abs(femaleCount - maleCount);

        
        return difference < (int) Math.round(totalCount * 0.2);
    }

    public static void removeOldest(String type) {
        boolean run = Animal.isTypeValid(type);
        int oldest = Integer.MIN_VALUE;

        while (run) {
            for (Animal a : animals) {
                if (a.getAge() > oldest) oldest = a.getAge();
            }
            for (Animal a : animals) {
                if (a.getAge() >= oldest) animals.remove(a);
            }
            run = false;
        }
        updateValidTypes();
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Zoo)) 
            return false;

        final Zoo other = (Zoo) obj;

        return this.animals.equals(other.animals);
    }

    @Override
    public String toString() {
        return "Total Number of Animals:" + animals.size() + '\n' +
           "Male:" + animals.stream().filter(a -> a.getGender().equals("male")).count() + '\n' +
           "Female:" + animals.stream().filter(a -> a.getGender().equals("female")).count() + "\n" +
           "Cats:" + '\n' +
               "Number:" + countAnimals("cat") + '\n' +
               "Male:" + animals.stream().filter(a -> a.getType().equals("cat") && a.getGender().equals("male")).count() + '\n' +
               "Female:" + animals.stream().filter(a -> a.getType().equals("cat") && a.getGender().equals("female")).count() + '\n' +
               "balanced:" + isGenderBalanced("cat") + '\n' +
               "Oldest:" + animals.stream().filter(a -> a.getType().equals("cat")).mapToInt(Animal::getAge).max().orElse(0) + '\n' +
           "Dogs:" + '\n' +
               "Number:" + countAnimals("dog") + '\n' +
               "Male:" + animals.stream().filter(a -> a.getType().equals("dog") && a.getGender().equals("male")).count() + '\n' +
               "Female:" + animals.stream().filter(a -> a.getType().equals("dog") && a.getGender().equals("female")).count() + '\n' +
               "balanced:" + isGenderBalanced("dog") + '\n' +
               "Oldest:" + animals.stream().filter(a -> a.getType().equals("dog")).mapToInt(Animal::getAge).max().orElse(0) + '\n' +
           "Monkeys:" + '\n' +
               "Number:" + countAnimals("monkey") + '\n' +
               "Male:" + animals.stream().filter(a -> a.getType().equals("monkey") && a.getGender().equals("male")).count() + '\n' +
               "Female:" + animals.stream().filter(a -> a.getType().equals("monkey") && a.getGender().equals("female")).count() + '\n' +
               "balanced:" + isGenderBalanced("monkey") + '\n' +
               "Oldest:" + animals.stream().filter(a -> a.getType().equals("monkey")).mapToInt(Animal::getAge).max().orElse(0);
    }


}