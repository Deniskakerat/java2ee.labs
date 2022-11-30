public class Thread1 extends Thread {
    Bank bank;

    Thread1(Bank bank) {
        this.bank = bank;
    }

    @Override
    public synchronized void run() {
        for (int i = 1; i <= 200000; i++) {
            bank.setAccount(bank.getAccount() +2);
        }
        System.out.println("1Potok increment: " + bank.getAccount());
    }
}
