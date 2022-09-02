package EnterpriseJavaDevelopment38.Model_ejercicio2;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "guest")
public class Guest {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @Enumerated(EnumType.STRING)
    private GuestStatus status;

    @OneToOne(mappedBy = "guest")
    private Conferences conferences;

    @OneToOne(mappedBy = "guest")
    private Expositions expositions;

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(GuestStatus status) {
        this.status = status;
    }

    public void setConferences(Conferences conferences) {
        this.conferences = conferences;
    }

    public void setExpositions(Expositions expositions) {
        this.expositions = expositions;
    }

    public String getName() {
        return name;
    }

    public GuestStatus getStatus() {
        return status;
    }

    public Conferences getConferences() {
        return conferences;
    }

    public Expositions getExpositions() {
        return expositions;
    }
}
