interface IMovie{
    public boolean check(int id);
}

public class MethodReference {

    public static boolean isClassic(int movieId){
        return true;
    }

    public void testMovieStaticMethodRef(){
        IMovie m1 = (i) -> i < 100 ? true : false;
        IMovie m2 = MethodReference :: isClassic;
    }

    public void testInstanceMethodRef(){
        MethodReference ref = new MethodReference();
        IMovie m1 = (i) -> i > 10 && 1 < 100 ? true : false;
        IMovie m2 = ref :: top10;
    }

    public boolean top10(int moiveID){
        return true;
    }

    public void testMovieArbitaryMethodObject(){
        IMovie m1 = SomeMethodReference :: isComedy;
    }

}

class SomeMethodReference{
    public static boolean isComedy(int i){
        return false;
    }
}