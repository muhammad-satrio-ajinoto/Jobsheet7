/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5;

/**
 *
 * @author HP 242
 */
public class OperatorTernary {
    public static void main(String[]args){
        int nilai = 70;
        String grade = (nilai < 75) ? "belum kompeten" : "kompeten";
        System.out.println(nilai  + "=>" + grade);
    }
}
