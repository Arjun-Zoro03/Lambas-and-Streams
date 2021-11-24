public class ConstructorReference {

    class Movie{
        public Movie(int id){

        }
        public Movie(int id, String name){

        }
    }

    interface MovieFactory{
        Movie create(int id);
    }

    MovieFactory m1 = i -> new Movie(i);

    MovieFactory m2 = Movie::new;

    interface MovieFactory2{
        Movie create(int id,String name);
    }

    MovieFactory2 m3 = Movie::new;

    public static void main(String[] args) {
        ConstructorReference client = new ConstructorReference();
    }
}
