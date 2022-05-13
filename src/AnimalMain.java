import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {

    Animal newAnimal = new Animal();
    Animal animalName = new Animal("Tiger");
    Animal dog = new Animal(true);
    Animal animalNameThatIsNotDog = new Animal(false);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> list = new ArrayList<Animal>();
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");
        while (true) {
            System.out.print("Please enter a name: ");
            String nameOfDog = scanner.nextLine();
            if (nameOfDog.isEmpty()) {
                break;
            }
            System.out.print("Is it a dog? Yes or no: ");
            String response = scanner.nextLine();
            boolean seeIfDog = response.equalsIgnoreCase("Yes");
            list.add(new Animal(nameOfDog, seeIfDog));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}