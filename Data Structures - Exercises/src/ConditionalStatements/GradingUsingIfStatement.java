/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConditionalStatements;

/**
 *
 * @author EduhG
 */

//Write a program that assigns a grade based on the value of a mean score: E.g: an A for a score of 90% or above, a B for a score of 80% or ab
public class GradingUsingIfStatement {
    
    public static void main(String[] args) {
        System.out.println(grade(60));
    }
    
    public static String grade(int marks) {
        String grade = "";
        
        if (marks >90) {
            grade = "A";
        } else if (marks > 84) {
            grade = "A-";
        } else if (marks > 79) {
            grade = "B+";
        } else if (marks > 74) {
            grade = "B";
        } else if (marks > 69) {
            grade = "B-";
        } else if (marks > 64) {
            grade = "C+";
        } else if (marks > 59) {
            grade = "C";
        } else if (marks > 54) {
            grade = "C-";
        } else if (marks > 49) {
            grade = "D+";
        } else if (marks > 44) {
            grade = "D";
        } else if (marks > 29 && marks < 39) {
            grade = "D-";
        } else {
            grade = "E";
        }
        
        return grade;
    }
}
