package EnterpriseJavaDevelopment38.Model_ejercicio2;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "speakers")
public class Speakers {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private Integer presentationDuration;

    @ManyToOne()
    private Conferences conferences;

    public void setName(String name) {
        this.name = name;
    }

    public void setPresentationDuration(Integer presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

    public void setConferences(Conferences conferences) {
        this.conferences = conferences;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPresentationDuration() {
        return presentationDuration;
    }

    public Conferences getConferences() {
        return conferences;
    }
}
