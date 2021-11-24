interface Engine1{
    default String model(int id){
        return "DEFAULT ENGINE";
    }
}

class Car1 implements Engine1, Vehicle1{
    public String model(int id){
        return "DEFAULT CAR";
    }
}

interface Vehicle1{
    default String model(int id){
        return "DEFAULT ENGINE";
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

    }
}
