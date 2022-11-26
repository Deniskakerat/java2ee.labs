public class Thread1 extends Thread {
    Bank bank;

    Thread1(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.inc();
    }
}
