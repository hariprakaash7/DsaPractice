package ThreadingConcepts;

import java.util.HashMap;
import java.util.Map;

public class BankRepo {
    Map<String,Double> doubleMap = new HashMap<>();
     public BankRepo() {
         doubleMap.put("ACC1", 0.00);
         doubleMap.put("ACC2", 20000.0);
     }

     public void addAmount(String accountNumber,Integer amount) {
             Double balance = doubleMap.get(accountNumber);
             balance+=amount;
             doubleMap.put(accountNumber,balance);
         }

    public Double getBalance(String acc1) {
         return doubleMap.get(acc1);
    }

    public void withdraw(String acc1) throws InterruptedException {
         Double balance = doubleMap.get(acc1);
         doubleMap.put(acc1,balance-1000);
    }
}
