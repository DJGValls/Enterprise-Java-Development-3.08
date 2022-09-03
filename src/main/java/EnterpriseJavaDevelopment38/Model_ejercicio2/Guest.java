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

    @ManyToOne
    private Event event;

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(GuestStatus status) {
        this.status = status;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public GuestStatus getStatus() {
        return status;
    }

    public Event getEvent() {
        return event;
    }
}
