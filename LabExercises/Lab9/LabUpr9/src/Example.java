public class Example {
    static int counter = 0;
    static final Object o = new Object();

//    @FunctionalInterface
//    interface Printable
//    {
//        String print(String s);
//    }
//    public static void main(String[] args)
//    {
//        Printable p = (string) ->
//        {
//            System.out.println(string);
//            return string;
//        }
//    }
//}

    public static void main(String[] args) throws InterruptedException{

        Runnable r = () ->   //runable s lambda class; programata da vurshi poveche raboti ednovremenno
        {
            for (int i = 0; i < 1000; i++)
            {
                synchronized (o)
                {
                    counter++;
                }
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();  //chaka vsichko koeto e v runnable da prikluchi

        System.out.println(counter);
    }
}