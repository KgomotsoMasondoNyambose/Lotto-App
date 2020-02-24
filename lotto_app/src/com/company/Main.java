package com.company;

import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int ball1, ball2,ball3, ball4, ball5, ball7, ball6, count = 0;
        int[] draw = new int[7];
        int[] temp = new int[7];
        int[] same = new int[7];
        Random rm = new Random();


        ball1 = Integer.parseInt(JOptionPane.showInputDialog("Enter ball number 1"));
        while(ball1 < 1 || ball1 > 59)
        {
            ball1 = Integer.parseInt(JOptionPane.showInputDialog("Enter ball number 1"));

        }
        System.out.print("Your Numbers: " + ball1 + " ");


        ball2 = Integer.parseInt(JOptionPane.showInputDialog("Enter ball number 2"));
        while(ball2 < 1 || ball2 > 59 || ball2 == ball1)
        {
            ball2 = Integer.parseInt(JOptionPane.showInputDialog("Enter ball number 2"));

        }
        System.out.print(ball2 + " ");

        ball3 = Integer.parseInt(JOptionPane.showInputDialog("Enter ball number 3"));
        while(ball3 < 1 || ball3 > 59 || ball3 == ball1 || ball3 == ball2)
        {
            ball3 = Integer.parseInt(JOptionPane.showInputDialog("Enter ball number 3"));

        }
        System.out.print(ball3 + " ");

        ball4 = Integer.parseInt(JOptionPane.showInputDialog("Enter ball number 4"));
        while(ball4 < 1 || ball4 > 59 || ball4 == ball1 || ball4 == ball2 || ball4 == ball3)
        {
            ball4 = Integer.parseInt(JOptionPane.showInputDialog("Enter ball number 4"));

        }
        System.out.print(ball4 + " ");

        ball5 = Integer.parseInt(JOptionPane.showInputDialog("Enter ball number 5"));
        while(ball5 < 1 || ball5 > 59 || ball5 == ball1 || ball5 == ball2 || ball5 == ball3 || ball5 == ball4)
        {
            ball5 = Integer.parseInt(JOptionPane.showInputDialog("Enter ball number 5"));

        }
        System.out.print(ball5 + " ");

        ball6 = Integer.parseInt(JOptionPane.showInputDialog("Enter ball number 6"));
        while(ball6 < 1 || ball6 > 59 || ball6 == ball1 || ball6 == ball2 || ball6 == ball3 || ball6 == ball4 || ball6 == ball5)
        {
            ball6 = Integer.parseInt(JOptionPane.showInputDialog("Enter ball number 6"));

        }
        System.out.print(ball6 + " ");

        ball7 = Integer.parseInt(JOptionPane.showInputDialog("Enter ball number 7"));
        while(ball7 < 1 || ball7 > 59 || ball7 == ball1 || ball7 == ball2 || ball7 == ball3 || ball7 == ball4 || ball7 == ball5 || ball7 == ball6)
        {
            ball7 = Integer.parseInt(JOptionPane.showInputDialog("Enter ball number 7"));

        }
        System.out.print(ball7 + " ");


        /*
        System.out.print("Raw draw: ");
        for(int i = 0; i < 6; i++)
        {
            temp[i] = rm.nextInt(59) +1;
            System.out.print(temp[i] + " ");

        }
*/
        System.out.println();

        while(temp[0] == temp[1] || temp[0] == temp[2] || temp[0] == temp[3] || temp[0] == temp[4] || temp[0] == temp[5] || temp[0] == temp[6])
            temp[0] = rm.nextInt(59) + 1;

        draw[0] = temp[0];

        while(temp[1] == temp[0] || temp[1] == temp[2] || temp[1] == temp[3] || temp[1] == temp[4] || temp[1] == temp[5] || temp[1] == temp[6])
            temp[1] = rm.nextInt(59) + 1;

        draw[1] = temp[1];

        while(temp[2] == temp[0] || temp[2] == temp[1] || temp[2] == temp[3] || temp[2] == temp[4] || temp[2] == temp[5] || temp[2] == temp[6])
            temp[2] = rm.nextInt(59) + 1;

        draw[2] = temp[2];

        while(temp[3] == temp[0] || temp[3] == temp[1] || temp[3] == temp[2] || temp[3] == temp[4] || temp[3] == temp[5] || temp[3] == temp[6])
            temp[3] = rm.nextInt(59) + 1;

        draw[3] = temp[3];

        while(temp[4] == temp[0] || temp[4] == temp[1] || temp[4] == temp[2] || temp[4] == temp[3] || temp[4] == temp[5] || temp[4] == temp[6])
            temp[4] = rm.nextInt(59) + 1;

        draw[4] = temp[4];

        while(temp[5] == temp[0] || temp[5] == temp[1] || temp[5] == temp[2] || temp[5] == temp[3] || temp[5] == temp[4] || temp[5] == temp[6])
            temp[5] = rm.nextInt(59) + 1;

        draw[5] = temp[5];

        while(temp[6] == temp[0] || temp[6] == temp[1] || temp[6] == temp[2] || temp[6] == temp[3] || temp[6] == temp[4] || temp[6] == temp[5])
            temp[6] = rm.nextInt(59) + 1;

        draw[6] = temp[6];
        System.out.println();
        System.out.println("********************************************************************************");

        System.out.print("Final draw: ");
        for(int j = 0; j < 6; j++)
        {
            draw[j] = rm.nextInt(59) +1;
            System.out.print(draw[j] + " ");

        }

        System.out.println();
        System.out.println("Winning Numbers");

        if(ball1 == draw[0] || ball1 == draw[1] || ball1 == draw[2] || ball1 == draw[3] || ball1 == draw[4] || ball1 == draw[5] || ball1 == draw[6])
        {
            System.out.print(ball1 + " ");
            count++;
        }

        if(ball2 == draw[0] || ball2 == draw[1] || ball2 == draw[2] || ball2 == draw[3] || ball2 == draw[4] || ball2 == draw[5] || ball2 == draw[6])
        {
            System.out.print(ball2 + " ");
            count++;
        }

        if(ball3 == draw[0] || ball3 == draw[1] || ball3 == draw[2] || ball3 == draw[3] || ball3 == draw[4] || ball3 == draw[5] || ball3 == draw[6])
        {
            System.out.print(ball3 + " ");
            count++;
        }

        if(ball4 == draw[0] || ball4 == draw[1] || ball4 == draw[2] || ball4 == draw[3] || ball4 == draw[4] || ball4 == draw[5] || ball4 == draw[6])
        {
            System.out.print(ball4 + " ");
            count++;
        }

        if(ball5 == draw[0] || ball5 == draw[1] || ball5 == draw[2] || ball5 == draw[3] || ball5 == draw[4] || ball5 == draw[5] || ball5 == draw[6])
        {
            System.out.print(ball5 + " ");
            count++;
        }

        if(ball6 == draw[0] || ball6 == draw[1] || ball6 == draw[2] || ball6 == draw[3] || ball6 == draw[4] || ball6 == draw[5] || ball6 == draw[6])
        {
            System.out.print(ball6 + " ");
            count++;
        }

        if(ball7 == draw[0] || ball7 == draw[1] || ball7 == draw[2] || ball7 == draw[3] || ball7 == draw[4] || ball7 == draw[5] || ball7 == draw[6])
        {
            System.out.print(ball7 + " ");
            count++;
        }

        System.out.println();

        System.out.println("Number of similar ball: " + count);

    }
}

