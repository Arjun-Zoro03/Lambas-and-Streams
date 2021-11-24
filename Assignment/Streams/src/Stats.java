import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Stats{

    public void range(){
        IntStream streamOfInts = IntStream.range(10,20);
        streamOfInts.forEach(System.out::println);
    }

    public void minMax(){
        IntStream streamOfInts = IntStream.range(10,20);
        OptionalInt max = streamOfInts.max();

        streamOfInts = IntStream.range(10,20);
        OptionalInt min = streamOfInts.min();

        System.out.println("Max: " + max.getAsInt());
        System.out.println("Min: " + min.getAsInt());
    }

    public static void main(String[] args) {
        new Stats().range();
        new Stats().minMax();
    }
}
