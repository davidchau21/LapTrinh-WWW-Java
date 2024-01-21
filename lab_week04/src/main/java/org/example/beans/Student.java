package org.example.beans;

public class Student {
    private long id;
    private String name;

    private Class lophoc;

    public Student() {
    }

    public Student(long id, String name, Class lophoc) {
        this.id = id;
        this.name = name;
        this.lophoc = lophoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Class getLophoc() {
        return lophoc;
    }

    public void setLophoc(Class lophoc) {
        this.lophoc = lophoc;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lophoc=" + lophoc +
                '}';
    }
}
