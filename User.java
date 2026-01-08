
public class User {

    private String name;
    private int phoneNumber;
    private String email;
    private int age;
    private int aadhar;
    private String password;
    private int pin;
    private double balance;

    public User(String name,int phoneNumber,String email,int age,int aadhar,String password,int pin,int balance) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
        this.aadhar = aadhar;
        this.password = password;
        this.pin = pin;
        this.balance = 5000;

    }

    String getName(){
        return name;
    }
    int getphoneNumber(){
        return phoneNumber;
    }
    String getemail(){
        return email;
    }
    int getage(){
        return age;
    }
    int getaadhar(){
        return aadhar;
    }
    String getpassword(){
        return password; 
    }
    double getbalance(){
        return balance;
    }
    int getpin(){
        return pin;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setphoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setemail(String email){
        this.email = email;
    }
    public void setage(int age){
        this.age = age;
    }
    public void setaadhar(int aadhar){
        this.aadhar = aadhar;
    }
    public void setpassword(String password){
        this.password = password;
    }
    public void setbalance(int balance){
        this.balance = balance;
    }
    public void setpin(int pin){
        this.pin = pin;
    }
    @Override
    public String toString(){
        return "User name: " +name+ " " + "User age :" + age + " " + "User Phone Number :" + phoneNumber + " " + "User email :" + email + " " + "User aadhar no. :" + aadhar + " " + "User Balance :" + balance + " ";

    }
    
}





