/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game2048;

import java.util.Random;
import javax.swing.JFrame;
import java.math.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author RAJU
 */
public class Game_2048 extends javax.swing.JFrame {

    int B[][]=new int[4][4];
    int st=0;
    int scr=0;
    int ovr=0;
    /**
     * Creates new form Game_2048
     */
    public Game_2048() {
        super("2048");
        initComponents();
        score.setText("0");
        btninit();
        gameovr.setTitle("Game-Over");
        youwin.setTitle("You-Win");
    }

    public void copy(){
        if(B[0][0]!=0)
            b1.setText(String.format("%d",B[0][0]));
        else
            b1.setText(null);
        switch(B[0][0]){
            case 0:
                b1.setBackground(new java.awt.Color(240, 240, 240));
                break;
            case 2:
                b1.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 4:
                b1.setBackground(new java.awt.Color(255, 220, 0));
                break;
            case 8:
                b1.setBackground(new java.awt.Color(255, 195, 0));
                break;
            case 16:
                b1.setBackground(new java.awt.Color(255, 170, 0));
                break;
            case 32:
                b1.setBackground(new java.awt.Color(255, 135, 0));
                break;
            case 64:
                b1.setBackground(new java.awt.Color(255, 135, 70));
                break;
            case 128:
                b1.setBackground(new java.awt.Color(240, 145, 85));
                break;
            case 256:
                b1.setBackground(new java.awt.Color(240, 135, 100));
                break;
            case 512:
                b1.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 1024:
                b1.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 2048:
                b1.setBackground(new java.awt.Color(255, 255, 0));
                break;
            default :
                b1.setBackground(new java.awt.Color(255, 255, 0));
                break;
        }
        if(B[0][1]!=0)
            b2.setText(String.format("%d",B[0][1]));
        else
            b2.setText(null);
            switch(B[0][1]){
            case 0:
                b2.setBackground(new java.awt.Color(240, 240, 240));
                break;
            case 2:
                b2.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 4:
                b2.setBackground(new java.awt.Color(255, 220, 0));
                break;
            case 8:
                b2.setBackground(new java.awt.Color(255, 195, 0));
                break;
            case 16:
                b2.setBackground(new java.awt.Color(255, 170, 0));
                break;
            case 32:
                b2.setBackground(new java.awt.Color(255, 135, 0));
                break;
            case 64:
                b2.setBackground(new java.awt.Color(255, 135, 70));
                break;
            case 128:
                b2.setBackground(new java.awt.Color(240, 145, 85));
                break;
            case 256:
                b2.setBackground(new java.awt.Color(240, 135, 100));
                break;
            case 512:
                b2.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 1024:
                b2.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 2048:
                b2.setBackground(new java.awt.Color(255, 255, 0));
                break;
            default :
                b2.setBackground(new java.awt.Color(255, 255, 0));
                break;
        }
        if(B[0][2]!=0)
            b3.setText(String.format("%d",B[0][2]));
        else
            b3.setText(null);
            switch(B[0][2]){
            case 0:
                b3.setBackground(new java.awt.Color(240, 240, 240));
                break;
            case 2:
                b3.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 4:
                b3.setBackground(new java.awt.Color(255, 220, 0));
                break;
            case 8:
                b3.setBackground(new java.awt.Color(255, 195, 0));
                break;
            case 16:
                b3.setBackground(new java.awt.Color(255, 170, 0));
                break;
            case 32:
                b3.setBackground(new java.awt.Color(255, 135, 0));
                break;
            case 64:
                b3.setBackground(new java.awt.Color(255, 135, 70));
                break;
            case 128:
                b3.setBackground(new java.awt.Color(240, 145, 85));
                break;
            case 256:
                b3.setBackground(new java.awt.Color(240, 135, 100));
                break;
            case 512:
                b3.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 1024:
                b3.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 2048:
                b3.setBackground(new java.awt.Color(255, 255, 0));
                break;
            default :
                b3.setBackground(new java.awt.Color(255, 255, 0));
                break;
        }
        if(B[0][3]!=0)
            b4.setText(String.format("%d",B[0][3]));
        else
            b4.setText(null);
            switch(B[0][3]){
            case 0:
                b4.setBackground(new java.awt.Color(240, 240, 240));
                break;
            case 2:
                b4.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 4:
                b4.setBackground(new java.awt.Color(255, 220, 0));
                break;
            case 8:
                b4.setBackground(new java.awt.Color(255, 195, 0));
                break;
            case 16:
                b4.setBackground(new java.awt.Color(255, 170, 0));
                break;
            case 32:
                b4.setBackground(new java.awt.Color(255, 135, 0));
                break;
            case 64:
                b4.setBackground(new java.awt.Color(255, 135, 70));
                break;
            case 128:
                b4.setBackground(new java.awt.Color(240, 145, 85));
                break;
            case 256:
                b4.setBackground(new java.awt.Color(240, 135, 100));
                break;
            case 512:
                b4.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 1024:
                b4.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 2048:
                b4.setBackground(new java.awt.Color(255, 255, 0));
                break;
            default :
                b4.setBackground(new java.awt.Color(255, 255, 0));
                break;
        }
        if(B[1][0]!=0)
            b5.setText(String.format("%d",B[1][0]));
        else
            b5.setText(null);
        switch(B[1][0]){
            case 0:
                b5.setBackground(new java.awt.Color(240, 240, 240));
                break;
            case 2:
                b5.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 4:
                b5.setBackground(new java.awt.Color(255, 220, 0));
                break;
            case 8:
                b5.setBackground(new java.awt.Color(255, 195, 0));
                break;
            case 16:
                b5.setBackground(new java.awt.Color(255, 170, 0));
                break;
            case 32:
                b5.setBackground(new java.awt.Color(255, 135, 0));
                break;
            case 64:
                b5.setBackground(new java.awt.Color(255, 135, 70));
                break;
            case 128:
                b5.setBackground(new java.awt.Color(240, 145, 85));
                break;
            case 256:
                b5.setBackground(new java.awt.Color(240, 135, 100));
                break;
            case 512:
                b5.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 1024:
                b5.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 2048:
                b5.setBackground(new java.awt.Color(255, 255, 0));
                break;
            default :
                b5.setBackground(new java.awt.Color(255, 255, 0));
                break;
        }
        if(B[1][1]!=0)
            b6.setText(String.format("%d",B[1][1]));
        else
            b6.setText(null);
        switch(B[1][1]){
            case 0:
                b6.setBackground(new java.awt.Color(240, 240, 240));
                break;
            case 2:
                b6.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 4:
                b6.setBackground(new java.awt.Color(255, 220, 0));
                break;
            case 8:
                b6.setBackground(new java.awt.Color(255, 195, 0));
                break;
            case 16:
                b6.setBackground(new java.awt.Color(255, 170, 0));
                break;
            case 32:
                b6.setBackground(new java.awt.Color(255, 135, 0));
                break;
            case 64:
                b6.setBackground(new java.awt.Color(255, 135, 70));
                break;
            case 128:
                b6.setBackground(new java.awt.Color(240, 145, 85));
                break;
            case 256:
                b6.setBackground(new java.awt.Color(240, 135, 100));
                break;
            case 512:
                b6.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 1024:
                b6.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 2048:
                b6.setBackground(new java.awt.Color(255, 255, 0));
                break;
            default :
                b6.setBackground(new java.awt.Color(255, 255, 0));
                break;
        }
        if(B[1][2]!=0)
            b7.setText(String.format("%d",B[1][2]));
        else
            b7.setText(null);
        switch(B[1][2]){
            case 0:
                b7.setBackground(new java.awt.Color(240, 240, 240));
                break;
            case 2:
                b7.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 4:
                b7.setBackground(new java.awt.Color(255, 220, 0));
                break;
            case 8:
                b7.setBackground(new java.awt.Color(255, 195, 0));
                break;
            case 16:
                b7.setBackground(new java.awt.Color(255, 170, 0));
                break;
            case 32:
                b7.setBackground(new java.awt.Color(255, 135, 0));
                break;
            case 64:
                b7.setBackground(new java.awt.Color(255, 135, 70));
                break;
            case 128:
                b7.setBackground(new java.awt.Color(240, 145, 85));
                break;
            case 256:
                b7.setBackground(new java.awt.Color(240, 135, 100));
                break;
            case 512:
                b7.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 1024:
                b7.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 2048:
                b7.setBackground(new java.awt.Color(255, 255, 0));
                break;
            default :
                b7.setBackground(new java.awt.Color(255, 255, 0));
                break;
        }
        if(B[1][3]!=0)
            b8.setText(String.format("%d",B[1][3]));
        else
            b8.setText(null);
        switch(B[1][3]){
            case 0:
                b8.setBackground(new java.awt.Color(240, 240, 240));
                break;
            case 2:
                b8.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 4:
                b8.setBackground(new java.awt.Color(255, 220, 0));
                break;
            case 8:
                b8.setBackground(new java.awt.Color(255, 195, 0));
                break;
            case 16:
                b8.setBackground(new java.awt.Color(255, 170, 0));
                break;
            case 32:
                b8.setBackground(new java.awt.Color(255, 135, 0));
                break;
            case 64:
                b8.setBackground(new java.awt.Color(255, 135, 70));
                break;
            case 128:
                b8.setBackground(new java.awt.Color(240, 145, 85));
                break;
            case 256:
                b8.setBackground(new java.awt.Color(240, 135, 100));
                break;
            case 512:
                b8.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 1024:
                b8.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 2048:
                b8.setBackground(new java.awt.Color(255, 255, 0));
                break;
            default :
                b8.setBackground(new java.awt.Color(255, 255, 0));
                break;
        }
        if(B[2][0]!=0)
            b9.setText(String.format("%d",B[2][0]));
        else
            b9.setText(null);
        switch(B[2][0]){
            case 0:
                b9.setBackground(new java.awt.Color(240, 240, 240));
                break;
            case 2:
                b9.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 4:
                b9.setBackground(new java.awt.Color(255, 220, 0));
                break;
            case 8:
                b9.setBackground(new java.awt.Color(255, 195, 0));
                break;
            case 16:
                b9.setBackground(new java.awt.Color(255, 170, 0));
                break;
            case 32:
                b9.setBackground(new java.awt.Color(255, 135, 0));
                break;
            case 64:
                b9.setBackground(new java.awt.Color(255, 135, 70));
                break;
            case 128:
                b9.setBackground(new java.awt.Color(240, 145, 85));
                break;
            case 256:
                b9.setBackground(new java.awt.Color(240, 135, 100));
                break;
            case 512:
                b9.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 1024:
                b9.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 2048:
                b9.setBackground(new java.awt.Color(255, 255, 0));
                break;
            default :
                b9.setBackground(new java.awt.Color(255, 255, 0));
                break;
        }
        if(B[2][1]!=0)
            b10.setText(String.format("%d",B[2][1]));
        else
            b10.setText(null);
        switch(B[2][1]){
            case 0:
                b10.setBackground(new java.awt.Color(240, 240, 240));
                break;
            case 2:
                b10.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 4:
                b10.setBackground(new java.awt.Color(255, 220, 0));
                break;
            case 8:
                b10.setBackground(new java.awt.Color(255, 195, 0));
                break;
            case 16:
                b10.setBackground(new java.awt.Color(255, 170, 0));
                break;
            case 32:
                b10.setBackground(new java.awt.Color(255, 135, 0));
                break;
            case 64:
                b10.setBackground(new java.awt.Color(255, 135, 70));
                break;
            case 128:
                b10.setBackground(new java.awt.Color(240, 145, 85));
                break;
            case 256:
                b10.setBackground(new java.awt.Color(240, 135, 100));
                break;
            case 512:
                b10.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 1024:
                b10.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 2048:
                b10.setBackground(new java.awt.Color(255, 255, 0));
                break;
            default :
                b10.setBackground(new java.awt.Color(255, 255, 0));
                break;
        }
        if(B[2][2]!=0)
            b11.setText(String.format("%d",B[2][2]));
        else
            b11.setText(null);
        switch(B[2][2]){
            case 0:
                b11.setBackground(new java.awt.Color(240, 240, 240));
                break;
            case 2:
                b11.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 4:
                b11.setBackground(new java.awt.Color(255, 220, 0));
                break;
            case 8:
                b11.setBackground(new java.awt.Color(255, 195, 0));
                break;
            case 16:
                b11.setBackground(new java.awt.Color(255, 170, 0));
                break;
            case 32:
                b11.setBackground(new java.awt.Color(255, 135, 0));
                break;
            case 64:
                b11.setBackground(new java.awt.Color(255, 135, 70));
                break;
            case 128:
                b11.setBackground(new java.awt.Color(240, 145, 85));
                break;
            case 256:
                b11.setBackground(new java.awt.Color(240, 135, 100));
                break;
            case 512:
                b11.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 1024:
                b11.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 2048:
                b11.setBackground(new java.awt.Color(255, 255, 0));
                break;
            default :
                b11.setBackground(new java.awt.Color(255, 255, 0));
                break;
        }
        if(B[2][3]!=0)
            b12.setText(String.format("%d",B[2][3]));
        else
            b12.setText(null);
        switch(B[2][3]){
            case 0:
                b12.setBackground(new java.awt.Color(240, 240, 240));
                break;
            case 2:
                b12.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 4:
                b12.setBackground(new java.awt.Color(255, 220, 0));
                break;
            case 8:
                b12.setBackground(new java.awt.Color(255, 195, 0));
                break;
            case 16:
                b12.setBackground(new java.awt.Color(255, 170, 0));
                break;
            case 32:
                b12.setBackground(new java.awt.Color(255, 135, 0));
                break;
            case 64:
                b12.setBackground(new java.awt.Color(255, 135, 70));
                break;
            case 128:
                b12.setBackground(new java.awt.Color(240, 145, 85));
                break;
            case 256:
                b12.setBackground(new java.awt.Color(240, 135, 100));
                break;
            case 512:
                b12.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 1024:
                b12.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 2048:
                b12.setBackground(new java.awt.Color(255, 255, 0));
                break;
            default :
                b12.setBackground(new java.awt.Color(255, 255, 0));
                break;
        }
        if(B[3][0]!=0)
            b13.setText(String.format("%d",B[3][0]));
        else
            b13.setText(null);
        switch(B[3][0]){
            case 0:
                b13.setBackground(new java.awt.Color(240, 240, 240));
                break;
            case 2:
                b13.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 4:
                b13.setBackground(new java.awt.Color(255, 220, 0));
                break;
            case 8:
                b13.setBackground(new java.awt.Color(255, 195, 0));
                break;
            case 16:
                b13.setBackground(new java.awt.Color(255, 170, 0));
                break;
            case 32:
                b13.setBackground(new java.awt.Color(255, 135, 0));
                break;
            case 64:
                b13.setBackground(new java.awt.Color(255, 135, 70));
                break;
            case 128:
                b13.setBackground(new java.awt.Color(240, 145, 85));
                break;
            case 256:
                b13.setBackground(new java.awt.Color(240, 135, 100));
                break;
            case 512:
                b13.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 1024:
                b13.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 2048:
                b13.setBackground(new java.awt.Color(255, 255, 0));
                break;
            default :
                b13.setBackground(new java.awt.Color(255, 255, 0));
                break;
        }
        if(B[3][1]!=0)
            b14.setText(String.format("%d",B[3][1]));
        else
            b14.setText(null);
        switch(B[3][1]){
            case 0:
                b14.setBackground(new java.awt.Color(240, 240, 240));
                break;
            case 2:
                b14.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 4:
                b14.setBackground(new java.awt.Color(255, 220, 0));
                break;
            case 8:
                b14.setBackground(new java.awt.Color(255, 195, 0));
                break;
            case 16:
                b14.setBackground(new java.awt.Color(255, 170, 0));
                break;
            case 32:
                b14.setBackground(new java.awt.Color(255, 135, 0));
                break;
            case 64:
                b14.setBackground(new java.awt.Color(255, 135, 70));
                break;
            case 128:
                b14.setBackground(new java.awt.Color(240, 145, 85));
                break;
            case 256:
                b14.setBackground(new java.awt.Color(240, 135, 100));
                break;
            case 512:
                b14.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 1024:
                b14.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 2048:
                b14.setBackground(new java.awt.Color(255, 255, 0));
                break;
            default :
                b14.setBackground(new java.awt.Color(255, 255, 0));
                break;
        }
        if(B[3][2]!=0)
            b15.setText(String.format("%d",B[3][2]));
        else
            b15.setText(null);
        switch(B[3][2]){
            case 0:
                b15.setBackground(new java.awt.Color(240, 240, 240));
                break;
            case 2:
                b15.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 4:
                b15.setBackground(new java.awt.Color(255, 220, 0));
                break;
            case 8:
                b15.setBackground(new java.awt.Color(255, 195, 0));
                break;
            case 16:
                b15.setBackground(new java.awt.Color(255, 170, 0));
                break;
            case 32:
                b15.setBackground(new java.awt.Color(255, 135, 0));
                break;
            case 64:
                b15.setBackground(new java.awt.Color(255, 135, 70));
                break;
            case 128:
                b15.setBackground(new java.awt.Color(240, 145, 85));
                break;
            case 256:
                b15.setBackground(new java.awt.Color(240, 135, 100));
                break;
            case 512:
                b15.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 1024:
                b15.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 2048:
                b15.setBackground(new java.awt.Color(255, 255, 0));
                break;
            default :
                b15.setBackground(new java.awt.Color(255, 255, 0));
                break;
        }
        if(B[3][3]!=0)
            b16.setText(String.format("%d",B[3][3]));
        else
            b16.setText(null);
        switch(B[3][3]){
            case 0:
                b16.setBackground(new java.awt.Color(240, 240, 240));
                break;
            case 2:
                b16.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 4:
                b16.setBackground(new java.awt.Color(255, 220, 0));
                break;
            case 8:
                b16.setBackground(new java.awt.Color(255, 195, 0));
                break;
            case 16:
                b16.setBackground(new java.awt.Color(255, 170, 0));
                break;
            case 32:
                b16.setBackground(new java.awt.Color(255, 135, 0));
                break;
            case 64:
                b16.setBackground(new java.awt.Color(255, 135, 70));
                break;
            case 128:
                b16.setBackground(new java.awt.Color(240, 145, 85));
                break;
            case 256:
                b16.setBackground(new java.awt.Color(240, 135, 100));
                break;
            case 512:
                b16.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 1024:
                b16.setBackground(new java.awt.Color(255, 255, 0));
                break;
            case 2048:
                b16.setBackground(new java.awt.Color(255, 255, 0));
                break;
            default :
                b16.setBackground(new java.awt.Color(255, 255, 0));
                break;
        }
    }
    
    public void btninit(){
        Random m=new Random();
        Random n=new Random();
        Random o=new Random();
        int s=0;
        while(true){
            int i,j,k;
            i=m.nextInt(4);
            j=m.nextInt(4);
            if(B[i][j]==0) {
                if(o.nextInt(9)==0)
                    B[i][j]=4;
                else
                    B[i][j]=2;   
                break;
            }
            } 
        copy();
    }
    
    public void gameover(){
        int k=0;
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                if(B[i][j]==2048){
                    youwin.setVisible(true);
                    return;
                }
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                if(B[i][j]==B[i][j+1] || B[i][j]==0 || B[i][j+1]==0){
                    return;
                }
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                if(B[j][i]==B[j+1][i]){
                    return;
                }
            }
        }
        gameovr.setVisible(true);
        ovr=1;
        return;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameovr = new javax.swing.JDialog();
        jTextField1 = new javax.swing.JTextField();
        yes = new javax.swing.JButton();
        no = new javax.swing.JButton();
        youwin = new javax.swing.JDialog();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        continu = new javax.swing.JButton();
        startgame = new javax.swing.JButton();
        title = new javax.swing.JTextField();
        scoreboard = new javax.swing.JTextField();
        score = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        left = new javax.swing.JButton();
        up = new javax.swing.JButton();
        right = new javax.swing.JButton();
        down = new javax.swing.JButton();
        refresh = new javax.swing.JButton();

        gameovr.setAlwaysOnTop(true);
        gameovr.setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tekton Pro Cond", 3, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(81, 11, 20));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Game-Over.!!\nStart a New Game ?");
        jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        yes.setFont(new java.awt.Font("Tekton Pro", 3, 36)); // NOI18N
        yes.setForeground(new java.awt.Color(102, 0, 0));
        yes.setText("Yes");
        yes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 0), null, null));
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesActionPerformed(evt);
            }
        });

        no.setFont(new java.awt.Font("Tekton Pro", 3, 36)); // NOI18N
        no.setForeground(new java.awt.Color(102, 0, 0));
        no.setText("No");
        no.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 0), null, null));
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gameovrLayout = new javax.swing.GroupLayout(gameovr.getContentPane());
        gameovr.getContentPane().setLayout(gameovrLayout);
        gameovrLayout.setHorizontalGroup(
            gameovrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameovrLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gameovrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameovrLayout.createSequentialGroup()
                        .addComponent(yes, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameovrLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        gameovrLayout.setVerticalGroup(
            gameovrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameovrLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gameovrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(yes)
                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tekton Pro Cond", 3, 36)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(81, 11, 20));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("!!..Hurray..!!");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tekton Pro Cond", 3, 36)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(81, 11, 20));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("!!..You Win.. \\m/ ..!!");
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        continu.setFont(new java.awt.Font("Tekton Pro", 3, 36)); // NOI18N
        continu.setForeground(new java.awt.Color(102, 0, 0));
        continu.setText("Continue");
        continu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 0), null, null));
        continu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuActionPerformed(evt);
            }
        });

        startgame.setFont(new java.awt.Font("Tekton Pro", 3, 36)); // NOI18N
        startgame.setForeground(new java.awt.Color(102, 0, 0));
        startgame.setText("NewGame");
        startgame.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 0), null, null));
        startgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startgameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout youwinLayout = new javax.swing.GroupLayout(youwin.getContentPane());
        youwin.getContentPane().setLayout(youwinLayout);
        youwinLayout.setHorizontalGroup(
            youwinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(youwinLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(youwinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(youwinLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(continu, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(startgame, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        youwinLayout.setVerticalGroup(
            youwinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(youwinLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(youwinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(continu)
                    .addComponent(startgame))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setEditable(false);
        title.setBackground(new java.awt.Color(255, 255, 51));
        title.setFont(new java.awt.Font("Tekton Pro Cond", 1, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        title.setText("2048");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 11, 134, 61));

        scoreboard.setEditable(false);
        scoreboard.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        scoreboard.setText("Score");
        getContentPane().add(scoreboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 15, 120, -1));

        score.setEditable(false);
        score.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreActionPerformed(evt);
            }
        });
        getContentPane().add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 45, 120, -1));

        b1.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        b1.setPreferredSize(new java.awt.Dimension(60, 60));
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 83, 112, 101));

        b2.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        b2.setPreferredSize(new java.awt.Dimension(60, 60));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 83, 106, 101));

        b3.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        b3.setPreferredSize(new java.awt.Dimension(60, 60));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 83, 107, 101));

        b4.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        b4.setPreferredSize(new java.awt.Dimension(60, 60));
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 83, 107, 101));

        b5.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        b5.setPreferredSize(new java.awt.Dimension(60, 60));
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 190, 112, 97));

        b6.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        b6.setPreferredSize(new java.awt.Dimension(60, 60));
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 190, 107, 97));

        b7.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        b7.setPreferredSize(new java.awt.Dimension(60, 60));
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 190, 107, 97));

        b8.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        b8.setPreferredSize(new java.awt.Dimension(60, 60));
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 190, 107, 97));

        b9.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        b9.setPreferredSize(new java.awt.Dimension(60, 60));
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 293, 112, 93));

        b10.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        b10.setPreferredSize(new java.awt.Dimension(60, 60));
        getContentPane().add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 293, 107, 93));

        b11.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        b11.setPreferredSize(new java.awt.Dimension(60, 60));
        getContentPane().add(b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 293, 107, 93));

        b12.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        b12.setPreferredSize(new java.awt.Dimension(60, 60));
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        getContentPane().add(b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 293, 107, 93));

        b13.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        b13.setPreferredSize(new java.awt.Dimension(60, 60));
        getContentPane().add(b13, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 392, 112, 95));

        b14.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        b14.setPreferredSize(new java.awt.Dimension(60, 60));
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        getContentPane().add(b14, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 392, 107, 95));

        b15.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        b15.setPreferredSize(new java.awt.Dimension(60, 60));
        getContentPane().add(b15, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 392, 107, 95));

        b16.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        b16.setPreferredSize(new java.awt.Dimension(60, 60));
        getContentPane().add(b16, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 392, 107, 95));

        left.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        left.setText("LEFT");
        left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftActionPerformed(evt);
            }
        });
        getContentPane().add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 537, 78, 50));

        up.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        up.setText("UP");
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        getContentPane().add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 519, 79, 50));

        right.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        right.setText("RIGHT");
        right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightActionPerformed(evt);
            }
        });
        getContentPane().add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 538, 78, 50));

        down.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        down.setText("DOWN");
        down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downActionPerformed(evt);
            }
        });
        getContentPane().add(down, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 575, -1, 50));

        refresh.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        getContentPane().add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 520, 148, 76));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        gameover();
        if(ovr==0){
            int move=0;
            for(int n=0;n<4;n++){
                int count=0;
                for(int i=0;i<4;i++)
                    if(B[i][n]!=0){
                        B[count][n]=B[i][n];
                        if(count!=i)
                            move=1;
                        count++;}
                int k=count;
                while(count<4){
                    B[count][n]=0;
                    count++;}
                for(int i=0;i<4-1 && k!=0;i++,k--){
                    int j=1;
                    if(B[i][n]==B[i+1][n] && B[i][n]!=0){
                        move=1;
                        B[i][n]=2*B[i+1][n];
                        scr=scr+B[i][n];
                        score.setText(String.format("%d",scr));
                        while(j!=k-1){
                            B[i+j][n]=B[i+1+j][n];
                            j++;
                        }
                        if(j==k-1)
                            B[i+j][n]=0;
                    }
                }
            }
            copy();
            if(move==1)
                btninit();
            copy();
        }
        else
            gameovr.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_upActionPerformed

    private void scoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreActionPerformed
       // score.setText("0");        // TODO add your handling code here:
    }//GEN-LAST:event_scoreActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                B[i][j]=0;
            }
        }
        ovr=0;
        scr=0;
        score.setText("0");
        copy();
        btninit();
        copy();
// TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

    private void downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed
        gameover();
        if(ovr==0){
             int move=0;
            for(int n=0;n<4;n++){
                int count=3,k=0;
                for(int i=3;i>=0;i--)
                    if(B[i][n]!=0){
                        B[count][n]=B[i][n];
                        if(count!=i)
                            move=1;
                        k++;
                        count--;}
                while(count>=0){
                    B[count][n]=0;
                    count--;}
                for(int i=3;i>=1 && k!=0;i--,k--){
                    int j=1;
                    if(B[i][n]==B[i-1][n] && B[i][n]!=0){
                        move=1;
                        B[i][n]=2*B[i-1][n];
                        scr=scr+B[i][n];
                        score.setText(String.format("%d",scr));
                        while(j!=k-1){
                            B[i-j][n]=B[i-1-j][n];
                            j++;
                        }
                        if(j==k-1)
                            B[i-j][n]=0;
                    }
                }
            }
            copy();
            if(move==1)
                btninit();
            copy();
        }
        else
            gameovr.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_downActionPerformed

    private void rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightActionPerformed
        gameover();
        if(ovr==0){
            int move=0;
            for(int n=0;n<4;n++){
                int count=3,k=0;
                for(int i=3;i>=0;i--)
                    if(B[n][i]!=0){
                        B[n][count]=B[n][i];
                        if(count!=i)
                            move=1;
                        k++;
                        count--;}
                while(count>=0){
                    B[n][count]=0;
                    count--;}
                for(int i=3;i>=1 && k!=0;i--,k--){
                    int j=1;
                    if(B[n][i]==B[n][i-1] && B[n][i]!=0){
                        move=1;
                        B[n][i]=2*B[n][i-1];
                        scr=scr+B[n][i];
                        score.setText(String.format("%d",scr));
                        while(j!=k-1){
                            B[n][i-j]=B[n][i-1-j];
                            j++;
                        }
                        if(j==k-1)
                            B[n][i-j]=0;
                    }
                }
            }
            copy();
            if(move==1)
                btninit();
            copy();
        } 
        else
            gameovr.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_rightActionPerformed

    private void leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftActionPerformed
        gameover();
        if(ovr==0){
            int move=0;
            for(int n=0;n<4;n++){
                int count=0;
                for(int i=0;i<4;i++)
                    if(B[n][i]!=0){
                        B[n][count]=B[n][i];
                        if(count!=i)
                            move=1;
                        count++;}
                int k=count;
                while(count<4){
                    B[n][count]=0;
                    count++;}
                for(int i=0;i<4-1 && k!=0;i++,k--){
                    int j=1;
                    if(B[n][i]==B[n][i+1] && B[n][i]!=0){
                        move=1;
                        B[n][i]=2*B[n][i+1];
                        scr=scr+B[n][i];
                        score.setText(String.format("%d",scr));
                        while(j!=k-1){
                            B[n][i+j]=B[n][i+1+j];
                            j++;
                        }
                        if(j==k-1)
                            B[n][i+j]=0;
                    }
                }
            }
            copy();
            if(move==1)
                btninit();
            copy();
        }
        else
            gameovr.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_leftActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesActionPerformed
        gameovr.setVisible(false);
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                B[i][j]=0;
            }
        }
        ovr=0;
        scr=0;
        score.setText("0");
        copy();
        btninit();
        copy();

// TODO add your handling code here:
    }//GEN-LAST:event_yesActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        gameovr.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_noActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void continuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuActionPerformed
        youwin.setVisible(false);
        gameover();
// TODO add your handling code here:
    }//GEN-LAST:event_continuActionPerformed

    private void startgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startgameActionPerformed
        youwin.setVisible(false);
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                B[i][j]=0;
            }
        }
        ovr=0;
        scr=0;
        score.setText("0");
        copy();
        btninit();
        copy();
        // TODO add your handling code here:
    }//GEN-LAST:event_startgameActionPerformed

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            moveleft();
        }
        if (key == KeyEvent.VK_RIGHT) {
            moveright();
        }
        if (key == KeyEvent.VK_UP) {
            moveup();
        }
        if (key == KeyEvent.VK_DOWN) {
            movedown();
    }
}
    
    public void moveleft(){
         gameover();
        if(ovr==0){
            int move=0;
            for(int n=0;n<4;n++){
                int count=0;
                for(int i=0;i<4;i++)
                    if(B[n][i]!=0){
                        B[n][count]=B[n][i];
                        if(count!=i)
                            move=1;
                        count++;}
                int k=count;
                while(count<4){
                    B[n][count]=0;
                    count++;}
                for(int i=0;i<4-1 && k!=0;i++,k--){
                    int j=1;
                    if(B[n][i]==B[n][i+1] && B[n][i]!=0){
                        move=1;
                        B[n][i]=2*B[n][i+1];
                        scr=scr+B[n][i];
                        score.setText(String.format("%d",scr));
                        while(j!=k-1){
                            B[n][i+j]=B[n][i+1+j];
                            j++;
                        }
                        if(j==k-1)
                            B[n][i+j]=0;
                    }
                }
            }
            copy();
            if(move==1)
                btninit();
            copy();
        }
        else
            gameovr.setVisible(true);
    }
    
    public void moveright(){
         gameover();
        if(ovr==0){
            int move=0;
            for(int n=0;n<4;n++){
                int count=3,k=0;
                for(int i=3;i>=0;i--)
                    if(B[n][i]!=0){
                        B[n][count]=B[n][i];
                        if(count!=i)
                            move=1;
                        k++;
                        count--;}
                while(count>=0){
                    B[n][count]=0;
                    count--;}
                for(int i=3;i>=1 && k!=0;i--,k--){
                    int j=1;
                    if(B[n][i]==B[n][i-1] && B[n][i]!=0){
                        move=1;
                        B[n][i]=2*B[n][i-1];
                        scr=scr+B[n][i];
                        score.setText(String.format("%d",scr));
                        while(j!=k-1){
                            B[n][i-j]=B[n][i-1-j];
                            j++;
                        }
                        if(j==k-1)
                            B[n][i-j]=0;
                    }
                }
            }
            copy();
            if(move==1)
                btninit();
            copy();
        } 
        else
            gameovr.setVisible(true);
    }
    
    public void moveup(){
        gameover();
        if(ovr==0){
            int move=0;
            for(int n=0;n<4;n++){
                int count=0;
                for(int i=0;i<4;i++)
                    if(B[i][n]!=0){
                        B[count][n]=B[i][n];
                        if(count!=i)
                            move=1;
                        count++;}
                int k=count;
                while(count<4){
                    B[count][n]=0;
                    count++;}
                for(int i=0;i<4-1 && k!=0;i++,k--){
                    int j=1;
                    if(B[i][n]==B[i+1][n] && B[i][n]!=0){
                        move=1;
                        B[i][n]=2*B[i+1][n];
                        scr=scr+B[i][n];
                        score.setText(String.format("%d",scr));
                        while(j!=k-1){
                            B[i+j][n]=B[i+1+j][n];
                            j++;
                        }
                        if(j==k-1)
                            B[i+j][n]=0;
                    }
                }
            }
            copy();
            if(move==1)
                btninit();
            copy();
        }
        else
            gameovr.setVisible(true);
    }
    
    public void movedown(){
        gameover();
        if(ovr==0){
             int move=0;
            for(int n=0;n<4;n++){
                int count=3,k=0;
                for(int i=3;i>=0;i--)
                    if(B[i][n]!=0){
                        B[count][n]=B[i][n];
                        if(count!=i)
                            move=1;
                        k++;
                        count--;}
                while(count>=0){
                    B[count][n]=0;
                    count--;}
                for(int i=3;i>=1 && k!=0;i--,k--){
                    int j=1;
                    if(B[i][n]==B[i-1][n] && B[i][n]!=0){
                        move=1;
                        B[i][n]=2*B[i-1][n];
                        scr=scr+B[i][n];
                        score.setText(String.format("%d",scr));
                        while(j!=k-1){
                            B[i-j][n]=B[i-1-j][n];
                            j++;
                        }
                        if(j==k-1)
                            B[i-j][n]=0;
                    }
                }
            }
            copy();
            if(move==1)
                btninit();
            copy();
        }
        else
            gameovr.setVisible(true);
    }
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b12ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b14ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game_2048.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game_2048.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game_2048.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game_2048.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game_2048().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton continu;
    private javax.swing.JButton down;
    private javax.swing.JDialog gameovr;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton left;
    private javax.swing.JButton no;
    private javax.swing.JButton refresh;
    private javax.swing.JButton right;
    private javax.swing.JTextField score;
    private javax.swing.JTextField scoreboard;
    private javax.swing.JButton startgame;
    private javax.swing.JTextField title;
    private javax.swing.JButton up;
    private javax.swing.JButton yes;
    private javax.swing.JDialog youwin;
    // End of variables declaration//GEN-END:variables
}
