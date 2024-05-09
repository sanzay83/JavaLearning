package Santosh.inherts;

import java.util.Objects;

public class Users {

    private String fname, lname, location;
    private boolean gender, emp;
    private long pnum;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        // e e2
        if (getClass() == o.getClass()) {
        }

        Users users = (Users) o;
        return gender == users.gender && pnum == users.pnum && Objects.equals(fname, users.fname) && Objects.equals(lname, users.lname) && Objects.equals(location, users.location);
    }


    @Override
    public int hashCode() {
        return Objects.hash(fname, lname, location, gender, pnum);
    }

    @Override
    public String toString() {
        return "Users{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", location='" + location + '\'' +
                ", gender=" + gender +
                ", emp=" + emp +
                ", pnum=" + pnum +
                '}';
    }

    public boolean isEmp() {
        return emp;
    }

    public void setEmp(boolean emp) {
        this.emp = emp;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public long getPnum() {
        return pnum;
    }

    public void setPnum(long pnum) {
        this.pnum = pnum;
    }
}
