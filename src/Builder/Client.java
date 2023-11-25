package Builder;

public class Client {
    public static void main(String[] args) {
        Employee e = Employee.getBuilder().setFirst_name("Phani").setId(1).build();
        System.out.println(e.getFirst_name());
    }
}
