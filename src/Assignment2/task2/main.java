package Assignment2.task2;


public class main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("Nurdaulet", 1, 200);

        ba.deposit(200);
        System.out.println("-=-=-=-=-=-=-=-=-=-=");

        ba.withdraw(100);
        System.out.println("-=-=-=-=-=-=-=-=-=-=");

        ba.withdraw(0);
        System.out.println("-=-=-=-=-=-=-=-=-=-=");

        ba.display();
    }
}
