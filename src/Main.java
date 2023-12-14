import com.concurrency.RandomCallable1;
import com.concurrency.RandomRunnable;
import com.concurrency.RandomRunnable2;
import com.concurrency.Shopper;
import com.oop.StoreOrder;
import com.oop.WareHouseOrder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread shopper1 = new Thread(new Shopper());
        Thread shopper2 = new Thread(new Shopper());

        shopper1.start();
        shopper2.start();

        shopper2.join();
        shopper1.join();

        System.out.println("THE NUMBER OF GARLIC IS " + Shopper.garlicCount);

        Thread thread1 = new Thread(new RandomRunnable());
        thread1.start();

        thread1.join();
//        thread1.interrupt();

       /*
       Thread thread1 = new Thread(new RandomRunnable());
        Thread thread2 = new Thread(()-> System.out.println("THE SECOND THREAD"));
        Thread thread3 = new Thread(new RandomRunnable2());


        thread1.start();
        thread2.start();
        thread3.start();


        FutureTask<String> futureTask =  new FutureTask<>(new RandomCallable1());

        Thread callableThread = new Thread(futureTask);

        callableThread.start();

        System.out.println("BEFORE TRY CATCH CALLING FUTURE TASK");

        try {
            // THIS CALL IS SYNCHRONOUS
            System.out.println(futureTask.get());
            System.out.println("AFTER CALLING FUTURE TASK");
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getMessage());
        }

 */

        StoreOrder storeOrder = new StoreOrder("1234",new Date(),BigDecimal.TEN,"PENDING","1234");
        WareHouseOrder wareHouseOrder = new WareHouseOrder("4321",new Date(),BigDecimal.TEN,"PENDING","4321");


        storeOrder.validate("1234");

        wareHouseOrder.processOrder("4321");
    }

}

