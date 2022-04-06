package tuning.chapter8;

public class Contribution {

    // static 선언된 객체를 여러 스레드에서 동시에 사용하는 경우
    private static int amount = 0;

    public static synchronized void donate() {
        amount++;
    }

//    private int amount = 0;

    // 하나의 객체를 여러 스레드에서 동시에 사용하는 경우
//    public synchronized void donate() {
//        amount++;
//    }

    public int getTotal() {
        return amount;
    }
}
