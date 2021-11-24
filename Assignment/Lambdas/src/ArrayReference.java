public class ArrayReference {

    interface StringArray{
        String[] create(int size);
    }

    public void testArrayConstructorReference(){
        StringArray stringArray = (size) -> new String[size];
        StringArray stringArray1 = String[]::new;
    }
}
