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
public class LeapYearsUsingForLoop {

    public static void main(String[] args) {
        int i = 0;
        int lpyear = 2016;
        int n = 20;
        
        for (i = lpyear; i <= lpyear + (n * 4); i++) {
            if(i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
