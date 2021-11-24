public class LambdaScope extends SuperScope{
    private String member = "GRANDPA";

    interface Family{
        String who(String member);
    }

    public void testMember(String member){
        System.out.println("Local member: " + member);
        System.out.println("thisFamily member: " + this.member);
        System.out.println("superFamily member: " + super.member);

        Family familyLambda = (familyMember) -> {
            System.out.println("familyMember: " + familyMember);
            System.out.println("memberLocal member: " + member);
            System.out.println("thisFamily member: " + this.member);
            System.out.println("superFamily member: " + super.member);
            return familyMember;
        };

        familyLambda.who(member);

    }

    public static void main(String[] args) {
        new LambdaScope().testMember("SON");
    }

}
