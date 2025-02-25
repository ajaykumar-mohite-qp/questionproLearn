import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Test {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        CompletableFuture<String> cf = new CompletableFuture<>();
//        cf.complete("Hello");
//        cf.thenAccept(output -> System.out.println(output));

        System.out.println();
//        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
//            try {
//                System.out.println("Inside here");
//                Thread.sleep(5000);
//
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return "Hello from completableFuture";
////        });
//        completableFuture.thenAccept((output) -> System.out.println(output));
//
//        Thread.sleep(10000);



//        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(
//                () -> System.out.println("Hi There")
//        );
//
//        completableFuture.get();

//
//        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(
//                () -> "Hi There"
//        ).thenApply((input) -> input + " Ha ha ha");
//
//        System.out.println(completableFuture.get());


//        CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(
//                () -> "Hi There"
//        ).thenAccept((output) -> System.out.println(output));


        CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(
                () -> "Hi 1"
        );

        CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(
                () -> " Hi 2"
        );

        CompletableFuture<String> completableFuture = completableFuture1.thenCombine(completableFuture2, (a, b) -> a + b);

        System.out.println(completableFuture.get());


    }


}