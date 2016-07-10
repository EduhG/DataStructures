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
        int num = 0;
        String primeNumbers = "";
        int n = 20;
        
        for (i = 1; i <= n; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println(primeNumbers);
    }
}
