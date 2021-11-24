import java.util.Arrays;
import java.util.List;

public class IterationStrategies {
    List<Integer> numbers = Arrays.asList(2,3,4,5);

    public void printSquareUsingStream(){
        numbers.stream()
                .map(x -> x*x)
                .forEach(System.out::println);
    }

    public void testInternalIteration(){
        numbers.stream()
                .filter((i) -> i%2 == 0)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        IterationStrategies iterationStrategies = new IterationStrategies();
        iterationStrategies.printSquareUsingStream();
        iterationStrategies.testInternalIteration();
    }
}
