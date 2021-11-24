import java.util.Random;
import java.util.stream.Stream;

public class CreatingStreams {

    private void testEmptyStream(){
        Stream<String> moviesEmptyStream = Stream.empty();
        System.out.println("Empty stream: " +moviesEmptyStream.count());
    }

    private void testStreamsFromValues(){
        Stream<String> movieNames = Stream.of("Movie1", "Movie2");
        System.out.println(movieNames.count());

        String[] movieNames2 = {"Movie1", "Movie2"};
        Stream<String> mNames2 = Stream.of(movieNames2);
    }

    private void testGenerateIterateStreams(){
        Stream<Double> randomStream = Stream.generate(Math::random);
        randomStream.forEach(System.out::println);
    }
}
