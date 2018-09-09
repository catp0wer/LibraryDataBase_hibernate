package base;
import db.Author;


public class HibTest {
    public static void main(String[] args) {
        Author author1 = new Author(1,"Scott","Kelly","1970");
        Author author2 = new Author(2,"Stephen","Hawking","1942");
        Author author3 = new Author(3,"Daniel","Kahneman","1934");
        Author author4 = new Author(4,"gg","Kahneman","1934");

        DataManipulation dm = new DataManipulation();
        dm.Insert(author1);
        dm.Insert(author2);
        dm.Insert(author3);
        dm.Insert(author4);
    }
}