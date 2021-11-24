public class TargetType {
    //i -> i*i;

    public interface Email{
        String constructEmail(String name);
    }

    Email email = (String name) -> name + "arjun.ganesh@zemosolabs.com";

    public String getEmail(String name, Email email){
        return null;
    }

    public static void main(String[] args) {
        new TargetType().getEmail("Arjun",(String name) -> name + "arjun.ganesh@zemosolabs.com");
    }
}
