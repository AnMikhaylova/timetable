package entity;
// Generated 23 ���. 2021 �., 15:01:38 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Subjects generated by hbm2java
 */
@Entity
@Table(name = "subjects",
        schema = "public"
)
public class Subjects implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id", unique = true, nullable = false)
    private int subjectId;

    @Column(name = "subject", nullable = false)
    private String subject;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "subjects")
    private Set<Tasks> taskses = new HashSet(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "subjects")
    private Set<TimetableIate> timetableIates = new HashSet(0);

    public Subjects() {
    }

    public Subjects(String subject) {

        this.subject = subject;
    }

    public Subjects(int subjectId, String subject, Set<Tasks> taskses, Set<TimetableIate> timetableIates) {
        this.subjectId = subjectId;
        this.subject = subject;
        this.taskses = taskses;
        this.timetableIates = timetableIates;
    }

    public int getSubjectId() {
        return this.subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Set<Tasks> getTaskses() {
        return this.taskses;
    }

    public void setTaskses(Set<Tasks> taskses) {
        this.taskses = taskses;
    }

    public Set<TimetableIate> getTimetableIates() {
        return this.timetableIates;
    }

    public void setTimetableIates(Set<TimetableIate> timetableIates) {
        this.timetableIates = timetableIates;
    }

}
