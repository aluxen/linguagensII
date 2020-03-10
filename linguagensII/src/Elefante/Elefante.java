/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elefante;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Elefante {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lxd = new Scanner(System.in);
        int i = 1;
        int max = lxd.nextInt();

        while (i <= max) {
            System.out.print(i);
            if (i == 1) {
                System.out.print(" elefante ");
            } else {
                System.out.print(" elefantes ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 1) {
                    System.out.print("incomoda ");
                } else {
                    System.out.print("incomodam, ");
                }
            }
            if (i % 2 != 0) {
                System.out.println("muita gente");
            } else {
                System.out.println("muito mais");
            }

            i++;
        }

    }
}
