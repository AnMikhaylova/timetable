package entity;
// Generated 23 ���. 2021 �., 15:01:38 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TimetableIate generated by hbm2java
 */
@Entity
@Table(name = "timetable_iate",
        schema = "public"
)
public class TimetableIate implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "timetable_id", unique = true, nullable = false)
    private int timetableId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "auditorium_id", nullable = false)
    private Auditoriums auditoriums;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id", nullable = false)
    private Classes classes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", nullable = false)
    private Groups groups;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parity_id", nullable = false)
    private Parity parity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "period_id", nullable = false)
    private Periods periods;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id", nullable = false)
    private Subjects subjects;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teachers teachers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", nullable = false)
    private Teams teams;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "weekday_id", nullable = false)
    private Weekdays weekdays;

    public TimetableIate() {
    }

    public TimetableIate(int timetableId, Auditoriums auditoriums, Classes classes, Groups groups, Parity parity, Periods periods, Subjects subjects, Teachers teachers, Teams teams, Weekdays weekdays) {
        this.timetableId = timetableId;
        this.auditoriums = auditoriums;
        this.classes = classes;
        this.groups = groups;
        this.parity = parity;
        this.periods = periods;
        this.subjects = subjects;
        this.teachers = teachers;
        this.teams = teams;
        this.weekdays = weekdays;
    }

    public int getTimetableId() {
        return this.timetableId;
    }

    public void setTimetableId(int timetableId) {
        this.timetableId = timetableId;
    }

    public Auditoriums getAuditoriums() {
        return this.auditoriums;
    }

    public void setAuditoriums(Auditoriums auditoriums) {
        this.auditoriums = auditoriums;
    }

    public Classes getClasses() {
        return this.classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Groups getGroups() {
        return this.groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    public Parity getParity() {
        return this.parity;
    }

    public void setParity(Parity parity) {
        this.parity = parity;
    }

    public Periods getPeriods() {
        return this.periods;
    }

    public void setPeriods(Periods periods) {
        this.periods = periods;
    }

    public Subjects getSubjects() {
        return this.subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public Teachers getTeachers() {
        return this.teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }

    public Teams getTeams() {
        return this.teams;
    }

    public void setTeams(Teams teams) {
        this.teams = teams;
    }

    public Weekdays getWeekdays() {
        return this.weekdays;
    }

    public void setWeekdays(Weekdays weekdays) {
        this.weekdays = weekdays;
    }

}
