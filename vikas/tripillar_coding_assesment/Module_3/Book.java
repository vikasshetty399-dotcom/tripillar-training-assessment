package tripillar_coding_assesment.Module_3;

    class Book {
        private String title;
        private double price;
        public void setTitle(String title) {
            this.title = title;
        }
        public void setPrice(double price) {
            if (price > 0) {          // validation
                this.price = price;
            } else {
                System.out.println("Price must be positive!");
            }
        }
        public String getTitle() {
            return title;
        }
        public double getPrice() {
            return price;
        }
    }
    class Main {
        public static void main(String[] args) {
            Book b1 = new Book();
            b1.setTitle("Java Programming");
            b1.setPrice(450);
            System.out.println("Book Title: " + b1.getTitle());
            System.out.println("Book Price: " + b1.getPrice());
        }
}
