public class Banker {
    private String name;
    private int age;
    private int empId;
    private String password;

    public Banker(String name, int age, int empId, String password) {
        this.name = name;
        this.age = age;
        this.empId = empId;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return password;
    }

    public int age() {
        return age;
    }

    public int getId() {
        return empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int empId) {
        this.empId = empId;
    }

    public void setPass(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Banker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", empId='" + empId + '\'' +
                '}';
    }
}
