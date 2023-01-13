package DigitalNomads;

public interface Bank {
    double getBalance();

    void deposit(double amount) throws Exception;

    void withDraw(double amount) throws Exception;

    static void transferFunds(Bank sender, Bank resipient, double transferamount) throws Exception {
        sender.withDraw(transferamount);
        resipient.deposit(transferamount);
    }

    static void transferKCIB(Bank sender, KCIB resipient, double transferamount) throws Exception {
        sender.withDraw(transferamount);
        resipient.deposit(transferamount);
    }

    static void transferKyrgyzstan(Bank sender, Kyrgyzstan resipient, double transferamount) throws Exception {
        sender.withDraw(transferamount);
        resipient.deposit(transferamount);
    }
}