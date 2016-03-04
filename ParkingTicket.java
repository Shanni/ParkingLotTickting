/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ParkingLot;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author shanliu
 */
public class ParkingTicket {
    private int ticketId;
    private Timestamp expiredTime;

    public ParkingTicket(int id, Timestamp time){
        id=ticketId;
        expiredTime=time;
    }
    
    public int getTicketId(){
        return ticketId;
    } 
    
    public boolean isExpired(){
        return expiredTime.after(new Date()) ? false : true;
    }
}
