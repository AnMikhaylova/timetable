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
 * Classes generated by hbm2java
 */
@Entity
@Table(name = "classes",
        schema = "public"
)
public class Classes implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id", unique = true, nullable = false)
    private int classId;

    @Column(name = "class", nullable = false) ///////!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private String class_name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "classes")
    private Set<TimetableIate> timetableIates = new HashSet(0);

    public Classes() {
    }

    public Classes(int classId, String class_name) {
        this.classId = classId;
        this.class_name = class_name;
    }

    public Classes(int classId, String class_name, Set<TimetableIate> timetableIates) {
        this.classId = classId;
        this.class_name = class_name;
        this.timetableIates = timetableIates;
    }

    public int getClassId() {
        return this.classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClass_name() {
        return this.class_name;
    }

    public void setClass_(String class_name) {
        this.class_name = class_name;
    }

    public Set<TimetableIate> getTimetableIates() {
        return this.timetableIates;
    }

    public void setTimetableIates(Set<TimetableIate> timetableIates) {
        this.timetableIates = timetableIates;
    }

}