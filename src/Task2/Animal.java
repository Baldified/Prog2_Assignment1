package Task2;

import java.util.ArrayList;
import java.util.Objects;

public class Animal {
        String name;
        String gender;
        int age;
        String type;
        static ArrayList<String> legalTypes = new ArrayList<>();
        static {
            legalTypes.add("Dog");
            legalTypes.add("Cat");
            legalTypes.add("Monkey");
        }

    public Animal() {
    }

    public Animal(String name, String gender, int age, String type) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        if (isTypeValid(type))
        this.type = type;
    }

    public Animal(Animal animal) {
        this.name = animal.name;
        this.gender = animal.gender;
        this.age = animal.age;
        if (isTypeValid(animal.type))
        this.type = animal.type;
    }

    public static boolean isTypeValid(String type) {
        return legalTypes.contains(type);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Animal other = (Animal) obj;

        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }

        return Objects.equals(this.type, other.type);
    }

    @Override
    public String toString() {
        return "Name   : " + name + "\n" +
               "Gender : " + gender + "\n" +
               "Age    : " + age + "\n" +
               "Type   : " + type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (isTypeValid(type))
        this.type = type;
    }

    
    
}
