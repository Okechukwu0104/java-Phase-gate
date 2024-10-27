class Account {
    private String firstName;
    private String lastName;
    private String pin;
    private double balance;

    public Account(String firstName, String lastName, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.balance = 0.0;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void changePin(String newPin) {
        this.pin = newPin;
    }
}