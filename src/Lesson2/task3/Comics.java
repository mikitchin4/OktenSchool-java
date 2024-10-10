package Lesson2.task3;

public class Comics extends Book{

    private int numberOfPictures;

    public Comics() {
    }

    public Comics(int textSize, int pages, int numberOfPictures) {
        super(textSize, pages);
        this.numberOfPictures = numberOfPictures;
    }

    public int getNumberOfPictures() {
        return numberOfPictures;
    }

    public void setNumberOfPictures(int numberOfPictures) {
        this.numberOfPictures = numberOfPictures;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "numberOfPictures=" + numberOfPictures +
                "} " + super.toString();
    }
}
