class Dog extends Thread{
    public void run(){
        System.out.println("scooby");
    }
}

public class Multithreadig2 {
    public static void main(String[] args) {
        Dog obj = new Dog();
        System.out.println("shaggy");
        obj.start();
    }
}
