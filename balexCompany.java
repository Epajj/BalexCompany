/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course.coursework;

import java.util.Scanner;

/**
 *
 * @author ebepa
 */
public class balexCompany {

    /**
     *
     * @param args
     */
    public static void main(String []args){
        
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter employee, Base pay, Hours worked");
        
        String employeename  =  myobj.nextLine();
        float basepay = myobj.nextFloat();
        int hoursworked = myobj.nextInt();
        
        
        if(basepay<8) {
            //System.out.println("ERROR");    
        }
        if (hoursworked>60){
          //  System.out.println("ERROR");
        }
       
        if(hoursworked <= 40 && basepay>8){
            System.out.println("Total pay :" + hoursworked*basepay);
        }
            else if (hoursworked> 40 && hoursworked <60 && basepay>8){
                System.out.println("total pay:" + ((hoursworked-40)*1.5* basepay));
            }
                else{
                        System.out.println("ERROR");
                        }
                
            }
        
                    
                    
                    }
