import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalType {
    public void createOptional(){
        Integer num1 = null;
        //Optional<Integer> intsOptional = Optional.of(num1);
        //System.out.println(intsOptional);

        Integer num2 = null;
        Optional<Integer> intsOptional2 = Optional.ofNullable(num2);
        System.out.println(intsOptional2);

    }

    public void ifElseOptional(){
        String name = null;
        String defaultName = new String();
        defaultName = "Default";

        Optional<String> optionalString = Optional.ofNullable(name);
        System.out.println(optionalString.orElse(defaultName));
    }

    public void filterOptional(){
        String name = "John";
        Optional<String> optionalS = Optional.ofNullable(name);

        optionalS.filter(str -> str.equals("John"))
                .ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        //new OptionalType().createOptional();
        new OptionalType().ifElseOptional();
        new OptionalType().filterOptional();
    }
}
