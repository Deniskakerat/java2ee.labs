public class Bank {
    //поле яке саме блокується
    private int account = 2;
//методи синхронізовані аби викликати 1 метод блокуючи об'єкт
    public synchronized void inc() {
        for (; account < 2000; account++) {
            System.out.println("inc:" + account);
        }
    }
//так само синхронізований метод, Зроблено це аби методи неможливо було визвати одночасно
    public synchronized void dec() {
        for (; account > 1; account--) {
            System.out.println("dec:" + account);
        }
    }

    public void setAccount(int id) {
        this.account = id;
    }
}
