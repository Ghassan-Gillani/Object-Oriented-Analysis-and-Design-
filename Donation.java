/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP_Project;

import java.util.*;

/**
 *
 * @author Ghassan
 */
public class Donation {
    
    int amount;
    String donor;
    String project;
    String donationType;
    public Donation(String p , String d , String type , int total) {
       this.amount = total;
       project=p;
       donationType=type;
       donor=d;
    }
}
