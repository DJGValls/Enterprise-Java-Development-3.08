package EnterpriseJavaDevelopment38.Model_ejercicio2;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Event")
public class Event {

    @Id
    @GeneratedValue
    private int id;

    private Date date;

    private Integer duration;

    private String location;

    private String title;

    @OneToMany
    @JoinColumn(name = "guest_list")
    private List<Guest> guestList;

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getLocation() {
        return location;
    }

    public String getTitle() {
        return title;
    }

    public List<Guest> getGuestList() {
        return guestList;
    }
}
