package Builder;

public class Employee {
    private int id;
    private String first_name;
    private String last_name;
    private int age;
    private int experience;
    private int rating;

    Employee(){
        super();
    }

    Employee(EmployeeBuilder e){
        this.id = e.getId();
        this.age = e.getAge();
        this.first_name = e.getFirst_name();
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

    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public static EmployeeBuilder getBuilder(){
        return new EmployeeBuilder();
    }
}
