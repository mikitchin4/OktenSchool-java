package Lesson2.task3;

public class Papyrus {

    private int textSize;

    public Papyrus() {
    }

    public Papyrus(int textSize) {
        this.textSize = textSize;
    }

    public int getTextSize() {
        return textSize;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "textSize=" + textSize +
                '}';
    }
}
