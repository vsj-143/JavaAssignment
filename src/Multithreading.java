public class Multithreading extends Thread{
    public void run()
    { for (int i=0;i<5;i++)
        System.out.println(currentThread().getName());
    }
    public static void main(String[] args) {
        Multithreading obj = new Multithreading();
        for(int i=0;i<5;i++)
            System.out.println("hello");{
        obj.start();
            }


    }
}
