/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package visitor_pattern;
import java.io.Serializable;
/**
 *
 * @author Sabahat
 */

public class Transcript implements Serializable {
    private int studentId;
    private String subject;
    private int grade;

    public Transcript(int studentId, String subject, int grade) {
        this.studentId = studentId;
        this.subject = subject;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Subject: " + subject + ", Grade: " + grade;
    }
}