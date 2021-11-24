public class FunctionalInterfaceAnnotation {

    @java.lang.FunctionalInterface
    interface Cruncher{
        int crunch(int i, int j);
    }

    public int cruncherSerivce(int i, int j, Cruncher cruncher){
        return cruncher.crunch(i,j);
    }

    public static void main(String[] args) {
        FunctionalInterfaceAnnotation client = new FunctionalInterfaceAnnotation();

        int ans  = client.cruncherSerivce(3,4, (p,q) -> p*q);
        System.out.println("Answer: " + ans);

        ans  = client.cruncherSerivce(3,4, (p,q) -> p+q);
        System.out.println("Answer: " + ans);

        ans  = client.cruncherSerivce(3,4, (p,q) -> p-q);
        System.out.println("Answer: " + ans);

        ans  = client.cruncherSerivce(3,4, (p,q) -> p/q);
        System.out.println("Answer: " + ans);

    }
}
