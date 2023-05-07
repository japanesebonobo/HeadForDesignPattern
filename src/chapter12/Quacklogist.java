package chapter12;

public class Quacklogist implements Observer {
    
    public void update(QuackObservable duck) {
        System.out.println("カモの鳴き声学者"+duck.toString()+"が鳴きました");
    }

    public String toString() {
		return "Quackologist";
	}
}
