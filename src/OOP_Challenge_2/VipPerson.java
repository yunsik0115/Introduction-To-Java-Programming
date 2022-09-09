package OOP_Challenge_2;

public class VipPerson {

    public VipPerson() {
        new VipPerson("Default", 0.00, "default");
    }

    public VipPerson(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    private String name;
    private double creditLimit;
    private String emailAddress;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
