class libraryItem {
    private int Id;
    String title;
    int year;
    public int getId() {
        return Id;
    }
    public void setId(){
        this.Id=Id;

    }
}
class Book extends libraryItem {
    String author;
}
class Magazine extends libraryItem{
    int issues;
}
class main{
    public static void main(String[] args) {
        Book book = new Book();
        Magazine magazine = new Magazine();


        magazine.setId();
        magazine.title = "The Great Gatsby";
        magazine.year = 1925;
        book.author = "Fitzgerald";
        System.out.println(magazine.getId());
        System.out.println(magazine.title);
        System.out.println(magazine.year);
        System.out.println(magazine.issues);
        System.out.println(book.author);
        
    }
}