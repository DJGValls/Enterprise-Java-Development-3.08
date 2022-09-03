package EnterpriseJavaDevelopment38.Model_ejercicio2;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "conferences")
public class Conferences extends Event {

    @OneToMany
    @JoinColumn(name = "speakers_list")
    private List<Speakers> speakersList;

    public List<Speakers> getSpeakersList() {
        return speakersList;
    }

    public void setSpeakersList(List<Speakers> speakersList) {
        this.speakersList = speakersList;
    }
}
