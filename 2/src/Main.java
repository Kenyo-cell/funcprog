import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {

    private static final Random random = new Random();
    private static final int MAX_ELEMENTS = 100;
    private static final int MAX_LENGTH = 1000;
    private static final int MAX_WIDTH = 1000;
    private static final int MAX_COST = 10000;

    private static List<Info> generateList() {
        List<Info> list = new LinkedList<>();
        for (int i = 0; i < random.nextInt(MAX_ELEMENTS); i++) {
            list.add(new Info(random.nextInt(MAX_LENGTH), random.nextInt(MAX_WIDTH), random.nextInt(MAX_COST)));
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cost = scanner.nextInt();
        Consumer<List<Info>> c = list -> list.stream()
                .map(x -> x.getLength() * x.getWidth() * x.getCost() >= x.getLength() * x.getWidth() * cost)
                .forEach(System.out::println);
        c.accept(generateList());
    }
}
