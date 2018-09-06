package db;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {
    @Id
    private int id;
    private String First_Name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }
}


