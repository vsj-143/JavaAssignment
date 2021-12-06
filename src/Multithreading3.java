importjava.util.Scanner;
class Mythread implements Runnable{
    public void run() {
        String colours[] = {"yellow","blue","green","red","yellow"};
    }
}

public class Multithreading3 {
    public static void main(String[] args) {
        Mythread obj =new Mythread();
        obj.run();
        Thread obj2 = new Thread(obj);
        obj2.start();
    }
}
