public class Library {
    public static void main(String[] args) {
        Author myAuthor = new Author("Leon Chamberlain", "nunyabizz@email.com", 'o');
        Book myBook = new Book("How to be a Minecraft Pro", myAuthor, 2.00, 3);
        System.out.println(myBook);
    }
}

class Book {
    private String name;
    private Author Author;
    private double price;
    private int qty;

    Book(String name, Author Author, double price, int qty) {
        this.name = name;
        this.Author = Author;
        this.price = price;
        this.qty = qty;
    }

    Book(String name, Author Author, double price) {
        this.name = name;
        this.Author = Author;
        this.price = price;
    }

    //Getters
    public String getName() {return name;}
    public Author getAuthor() {return Author;}
    public double getPrice() {return price;}
    public int getQty() {return qty;}
    public String toString(){return("Book [name=" + this.name + ", " + this.Author + ", price=" + this.price + ", qty=" + this.qty + "]");}

    //Setters
    public void setQty(int qty){this.qty = qty;}
}


class Author{
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    //Getters
    public String getName() {return name;}
    public String getEmail() {return email;}
    public char getGender() {return gender;}
    public String toString(){return("Author[name=" + this.name + ", email=" + this.email + ", gender=" + this.gender + "]");}
}
