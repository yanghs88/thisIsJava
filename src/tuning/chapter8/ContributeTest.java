package tuning.chapter8;

public class ContributeTest {

    public static void main(String[] args) {

        Contributor[] csr = new Contributor[10];

        // 하나의 기부 단체에 여러 기부자가 동시에 기부하는 경우
        // 여려명이 하나의 인스턴스 필드에 값을 변경하는 행위.
        // 하나의 객체를 여러 스레드에서 동시에 사용하는 경우
//        Contribution group = new Contribution();

        for (int loop = 0; loop < 10; loop++) {
            // 여러 기부 단체에 기부하는 경우
            Contribution group = new Contribution();
            csr[loop] = new Contributor(group, "Contributor" + loop);
        }

        for (int loop = 0; loop < 10; loop++) {
            csr[loop].start();
        }
    }
}
