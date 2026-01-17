
public class PaymentSlip {
//Attributes
    private String name; 
    private int hours;
    private int hourlyRate; 

//Constructor
public PaymentSlip() {}

public PaymentSlip(String name, int hours, int hourlyRate) {
    this.name = name;
    this.hours = hours;
    this.hourlyRate = hourlyRate;
}

//Methods
public int CalculateSalary() {
    return hourlyRate * hours;
}

public double CalculateNetSalary() {
    return (double)(CalculateSalary() * 0.7);
}

//Getters and Setters
public String getName() {return name;}
public void setName(String name) {this.name=name;}

public int gethourlyRate() {return hourlyRate;}
public void sethourlyRate(int hourlyRate) {this.hourlyRate=hourlyRate;}

public int gethours() {return hours;}
public void sethours(int hours) {this.hours=hours;}

}


