package EnterpriseJavaDevelopment38.Model_ejercicio1;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Member")
public class Member {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    @Enumerated(EnumType.STRING)
    private Status status;

    private Date renewalDate;

    @OneToOne(mappedBy = "member")
    private Chapter chapter;

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }
}
