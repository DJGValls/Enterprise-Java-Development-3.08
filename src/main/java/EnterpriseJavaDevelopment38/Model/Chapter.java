package EnterpriseJavaDevelopment38.Model;

import javax.persistence.*;

@Entity
@Table(name="Chapter")
public class Chapter {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String district;

    private String president;
    @OneToOne
    @JoinColumn(name="member_id")
    private Member member;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDistrict() {
        return district;
    }

    public String getPresident() {
        return president;
    }
}
