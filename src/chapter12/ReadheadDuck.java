package chapter12;

public class ReadheadDuck implements Quackable {
    Observable observable;

	public ReadheadDuck() {
		observable = new Observable(this);
	}

    public void quack() {
        System.out.println("ガーガー");
    }

    public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

	public String toString() {
		return "Redhead Duck";
	}
}
