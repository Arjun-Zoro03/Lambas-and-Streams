import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducingStreams {

    public static void main(String[] args)
    {
        List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);

        int sum = array.stream().reduce(0,
                (element1, element2) -> element1 + element2);
        System.out.println("The sum of all elements is " + sum);

        System.out.println("The sum of all + 10 is " + array.stream().reduce(10, (x,y) -> x+y));

        List<Integer> array1 = Arrays.asList();
        Optional<Integer> arrayOptional = array1.stream().reduce((x,y) -> x+y);
        if (arrayOptional.isPresent())
            System.out.println("Optional use: " + arrayOptional.get());
    }
}

