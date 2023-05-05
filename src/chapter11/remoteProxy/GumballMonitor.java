package chapter11.remoteProxy;

public class GumballMonitor {
    GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("ガムボールマシン: " + gumballMachine.getLocation());
        System.out.println("現在の在庫: " + gumballMachine.getCount());
        System.out.println("現在の状態: " + gumballMachine.getState());
    }
}
