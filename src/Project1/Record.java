package Project1;

import java.io.Serializable;
import java.util.*;

/*******************************************************
 * Record class.
 *
 * This file contains and edits the student records.
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/11/2022
 *
 ******************************************************/
public class Record implements Serializable {
    private Date date;
    private Student student;
    private Course course;
    private float grade;

    /*********************************************************
     * Default Constructor.  Creates empty Record object
     ********************************************************/
    public Record() {
    }

    /*********************************************************
     * Default Constructor.  Creates default Record object
     ********************************************************/
    public Record(Date date, Student student, Course course, float grade) {
        this.date = date;
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    /*********************************************************
     * getDate.  returns the Date
     ********************************************************/
    public Date getDate() {
        return date;
    }

    /*********************************************************
     * setDate.  sets the Date
     * @Date date
     ********************************************************/
    public void setDate(Date date) {
        this.date = date;
    }

    /*********************************************************
     * getStudent.  returns a Student
     ********************************************************/
    public Student getStudent() {
        return student;
    }

    /*********************************************************
     * setStudent.  sets the student information
     * @Student student
     ********************************************************/
    public void setStudent(Student student) {
        this.student = student;
    }

    /*********************************************************
     * getCourse.  returns the Course
     ********************************************************/
    public Course getCourse() {
        return course;
    }

    /*********************************************************
     * setCourse.  sets the Course
     * @Course course
     ********************************************************/
    public void setCourse(Course course) {
        this.course = course;
    }

    /*********************************************************
     * getGrade.  returns a float with the student's grade
     ********************************************************/
    public float getGrade() {
        return grade;
    }

    /*********************************************************
     * setGrade.  sets the student's grade
     * @float grade
     ********************************************************/
    public void setGrade(float grade) {
        if(grade <= 4.0 && grade >= 0.0) {
            this.grade = grade;
        } else {
            throw new IllegalArgumentException("Grade must be between 0.0 and 4.0");
        }
    }


    public String toString() {
        return //"Record for " + student.getFirstName() + "\n" +
                "Date: " + date + "\n" +
                        "Course: " + course + "\n" +
                        "Grade: " + grade + "\n";
    }
}