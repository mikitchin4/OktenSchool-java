package Lesson2.task3;

public class Book extends Papyrus{

    private int pages;

    public Book() {
    }

    public Book(int textSize, int pages) {
        super(textSize);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                "} " + super.toString();
    }
}
