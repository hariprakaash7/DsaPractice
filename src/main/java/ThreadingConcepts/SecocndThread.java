package ThreadingConcepts;

public class SecocndThread implements Runnable {

    BankRepo bankRepo;

    public SecocndThread(BankRepo bankRepo) {
        this.bankRepo = bankRepo;
    }

    @Override
    public void run() {
        synchronized (bankRepo) {
            System.out.println("Second Thread");
            bankRepo.addAmount("ACC1", 2000);
            bankRepo.notify();
            System.out.println("Notified");
        }
    }
}
