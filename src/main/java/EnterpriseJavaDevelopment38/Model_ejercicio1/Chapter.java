package EnterpriseJavaDevelopment38.Model_ejercicio1;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Chapter")
public class Chapter {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String district;

    private String president;
    @OneToMany
    @JoinColumn(name="member_id")
    private List<Member> memberList;

    @ManyToOne
    private Association association;

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
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
