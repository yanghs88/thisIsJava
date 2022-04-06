package tuning.chapter8;

public class Contributor extends Thread {

    private Contribution myContribution;
    private String myName;

    public Contributor(Contribution contribution, String myName) {
        this.myContribution = contribution;
        this.myName = myName;
    }


    public void run() {
        for (int loop = 0; loop < 1000; loop++) {
            myContribution.donate();
        }
        System.out.println(String.format("%s total = %d\n", myName, myContribution.getTotal()));
    }
}
