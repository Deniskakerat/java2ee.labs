public  class Thread2 extends Thread {
     Bank bank;

     Thread2(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
         // блок bank є synchronized аби сам метод звертаючись до bank його блокував для інших методів.
        synchronized (bank) {
            for (int i = 1; i <= 200000; i++) {
                bank.setAccount(bank.getAccount() - 1);
            }
            System.out.println("2Potok increment: " + bank.getAccount());
        }
    }
}
