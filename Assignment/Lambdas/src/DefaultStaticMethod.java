interface Employee{
    Employee find(int id);

    default boolean isExecutive(int id){
        return true;
    }

    static String getDefaultCountry(){
        return "UK";
    }
}

public class DefaultStaticMethod {
    public static void main(String[] args) {

        class EmployeeImp implements Employee{

            @Override
            public Employee find(int id) {
                boolean executive = isExecutive(id);
                return null;
            }
        }

        EmployeeImp impl = new EmployeeImp();
        impl.isExecutive(1234);

        String defaultCountry = Employee.getDefaultCountry();
    }
}
