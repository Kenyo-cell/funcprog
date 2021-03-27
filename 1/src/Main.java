import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Function<String, List<String>> f = x -> Arrays.stream(x.split(" "))
                .distinct()
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }
}
