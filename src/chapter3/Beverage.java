package chapter3;

public abstract class Beverage {
    String description = "不明な飲み物";
    public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();
}