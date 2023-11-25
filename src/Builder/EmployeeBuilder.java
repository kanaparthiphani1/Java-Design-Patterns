package Builder;

public class EmployeeBuilder implements Builder<Employee> {
    private int id;
    private String first_name;
    private String last_name;
    private int age;
    private int experience;
    private int rating;

    EmployeeBuilder(){

    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public int getRating() {
        return rating;
    }

    public EmployeeBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder setFirst_name(String first_name) {
        this.first_name = first_name;
        return this;

    }

    public EmployeeBuilder setLast_name(String last_name) {
        this.last_name = last_name;
        return this;

    }

    public EmployeeBuilder setAge(int age) {
        this.age = age;
        return this;

    }

    public EmployeeBuilder setExperience(int experience) {
        this.experience = experience;
        return this;

    }

    public EmployeeBuilder setRating(int rating) {
        this.rating = rating;
        return this;

    }

    @Override
    public Employee build() {
        return new Employee(this);
    }
}
