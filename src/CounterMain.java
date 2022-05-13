import java.util.Scanner;

public class CounterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A counter that starts  at 0.");

        Counter counter = new Counter();

        System.out.println(counter);

        System.out.println("Increase");
        counter.increase();

        System.out.println(counter);

        System.out.println("Decrease");
        counter.decrease();

        System.out.println(counter);

        System.out.println("Will count at the given value input");

        System.out.print("Enter value: ");

        int valueInput = Integer.valueOf(scanner.nextLine());
        Counter counterInput = new Counter(valueInput);
        System.out.println(counterInput);
        System.out.println("Input an integer to increase value: ");

        int valueIncrease = Integer.valueOf(scanner.nextLine());
        counterInput.increase(valueIncrease);
        System.out.println(counterInput);
        System.out.println("Input an integer to decrease value: ");

        int valueDecrease = Integer.valueOf(scanner.nextLine());
        counterInput.decrease(valueDecrease);
        System.out.println(counterInput);
    }
}