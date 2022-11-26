public class Thread2 extends Thread {
    Bank bank;

    Thread2(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.dec();
    }
}
