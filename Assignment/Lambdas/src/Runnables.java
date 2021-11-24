import java.util.concurrent.Callable;

class Runnables{

    public void methodAcceptableRunnable(Runnable r){

    }

    public void methodAcceptableCallable(Callable c){

    }

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello, lambda");

        new Runnables().methodAcceptableRunnable(runnable);

        new Runnables().methodAcceptableRunnable(() -> {
                    System.out.println("Complex Lambda");
                    persist();
                    email();
                });

        Callable callable = () -> "Hello, Callable";
        new Runnables().methodAcceptableCallable(callable);

        new Runnables().methodAcceptableCallable(() ->{
            return "Hello!";
        });
    }

    public static void persist(){

    }

    public static void email(){

    }

    interface Tradable<Trade>{
        boolean check(Trade t);
    }

    //Tradable<Trade> bigTradableLambda = (trade) -> trade.isBigTrade();
}

