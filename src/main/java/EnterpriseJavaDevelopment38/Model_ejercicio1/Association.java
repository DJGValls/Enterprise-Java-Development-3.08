package EnterpriseJavaDevelopment38.Model_ejercicio1;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "association")
public class Association {

    @Id
    @GeneratedValue
    private int Id;

    @OneToMany
    @JoinColumn(name = "chapter_id")
    private List<Chapter> ChapterList;

    public int getId() {
        return Id;
    }

    public List<Chapter> getChapterList() {
        return ChapterList;
    }

    public void setChapterList(List<Chapter> chapterList) {
        ChapterList = chapterList;
    }
}
