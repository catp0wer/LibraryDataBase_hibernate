package db;
import javax.persistence.*;

@Entity

public class Author {
    @Id
    private int id;
    private String First_Name;
    private String Last_Name;
    private String Year_of_Birth;

    public Author(int id, String First_Name,String Last_Name,String Year_of_Birth){
        this.id=id;
        this.First_Name=First_Name;
        this.Last_Name=Last_Name;
        this.Year_of_Birth=Year_of_Birth;
    };

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public void setYear_of_Birth(String year_of_Birth) {
        Year_of_Birth = year_of_Birth;
    }

    public String getLast_Name() {return Last_Name;}

    public String getYear_of_Birth() {
        return Year_of_Birth;
    }

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
