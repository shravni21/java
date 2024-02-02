package Multithreading;

class Atm {
    synchronized public void checkBalance(String name) {
        System.out.println(name + " Checking ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    synchronized public void withdraw(String name, int amount) {
        System.out.println(name + " Withdrawing rs." + amount);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Customer extends Thread {
    String name;
    int amount;
    Atm atm;

    Customer(String s, Atm a, int amt) {
        name = s;
        atm = a;
        amount = amt;
    }

    public void useATM() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run() {
        useATM();
    }
}

public class AtmMachine {
    public static void main(String[] args) {
        Atm at = new Atm();

        Customer c1 = new Customer("Shravni", at, 1000);
        Customer c2 = new Customer("Pratiksha", at, 4000);
        c1.start();
        c2.start();

    }
}
