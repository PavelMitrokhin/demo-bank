import static java.lang.System.out;

public class Account {
    String name;
    String address;
    double balance;
    public void display() {
        out.println(name);
        out.println(" (");
        out.println(address);
        out.println(") имеет на счету $");
        out.println(balance);
    }
    public double getInterest(double percentageRate) {
        return balance * percentageRate / 100.00;
    }
}
