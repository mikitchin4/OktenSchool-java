package Lesson2.task3;

    public class Magazine extends Book{

        private int numberOfArticles;

        public Magazine() {
        }

        public Magazine(int textSize, int pages, int numberOfArticles) {
            super(textSize, pages);
            this.numberOfArticles = numberOfArticles;
        }

        public int getNumberOfArticles() {
            return numberOfArticles;
        }

        public void setNumberOfArticles(int numberOfArticles) {
            this.numberOfArticles = numberOfArticles;
        }

        @Override
        public String toString() {
            return "Magazine{" +
                    "numberOfArticles=" + numberOfArticles +
                    "} " + super.toString();
        }
    }

