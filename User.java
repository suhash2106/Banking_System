
public class User {

    private String name;
    private int phoneNumber;
    private String email;
    private int age;
    private int aadhar;
    private String password;
    private int pin;
    private double balance;
    public static int count = 0;

    public User(String name, int phoneNumber, String email, int age, int aadhar, String password, int pin,
            int balance) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
        this.aadhar = aadhar;
        this.password = password;
        this.pin = pin;
        this.balance = 5000;
        count = count + 1;
    }

    String getName() {
        return name;
    }

    int getphoneNumber() {
        return phoneNumber;
    }

    String getEmail() {
        return email;
    }

    int getAge() {
        return age;
    }

    int getAadhar() {
        return aadhar;
    }

    String getPassword() {
        return password;
    }

    double getBalance() {
        return balance;
    }

    int getpin() {
        return pin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAadhar(int aadhar) {
        this.aadhar = aadhar;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "User name: " + name + " " + "User age :" + age + " " + "User Phone Number :" + phoneNumber + " "
                + "User email :" + email + " " + "User aadhar no. :" + aadhar + " " + "User Balance :" + balance + " ";

    }

}
