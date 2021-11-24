import java.util.stream.IntStream;

public class PrimitiveStreams {
    public static void intStream(){
        int[] ints = new int[]{1,2,3,4,5};

        IntStream intStream = IntStream.of(ints);
        intStream.forEach(System.out::println);

        IntStream intStream2 = IntStream.of(6,7,8,9);
        intStream.forEach(System.out::println);
    }

    public static void main(String[] args) {
        PrimitiveStreams.intStream();
    }
}
