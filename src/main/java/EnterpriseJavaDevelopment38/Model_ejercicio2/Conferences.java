package EnterpriseJavaDevelopment38.Model_ejercicio2;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "conferences")
public class Conferences {

    @Id
    @GeneratedValue
    private int id;

    private Date date;

    private Integer duration;

    private String location;

    private String title;

    @OneToOne
    @JoinColumn(name = "guest_list")
    private Guest guest;

    @OneToOne
    @JoinColumn(name = "speakers_list")
    private Speakers speakers;

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

    public Guest getGuest() {
        return guest;
    }

    public EnterpriseJavaDevelopment38.Model_ejercicio2.Speakers getSpeakers() {
        return speakers;
    }

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

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public void setSpeakers(EnterpriseJavaDevelopment38.Model_ejercicio2.Speakers speakers) {
        speakers = speakers;
    }
}
