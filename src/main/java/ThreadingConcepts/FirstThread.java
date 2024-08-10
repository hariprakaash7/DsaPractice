package ThreadingConcepts;

public class FirstThread implements Runnable{

    BankRepo bankRepo;

    public FirstThread(BankRepo bankRepo) {
        this.bankRepo = bankRepo;
    }


    @Override
    public void run() {
        synchronized (bankRepo) {
            System.out.println("Thread1");
            try {
                System.out.println("Waiting begins");
                bankRepo.wait();
                System.out.println("Waiting for transaction to proceed");
                Thread.sleep(1000);
                bankRepo.withdraw("ACC1");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
