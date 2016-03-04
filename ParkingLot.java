/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ParkingLot;


import java.sql.Timestamp;
import java.util.HashMap;

/**
 *
 * @author shanliu
 */
public class ParkingLot {
    private final int max_size;
    private int currentsize;
    private HashMap<ParkingTicket, Vehicle> parkingSpace;

    /**
     *
     * @param size
     */
    public ParkingLot(int size) {
        max_size=size;
        currentsize=0;
        parkingSpace = new HashMap<ParkingTicket,Vehicle>(max_size,2);
    }
    
    /**
     *
     * @param v
     * @return
     */
    public ParkingTicket parkVehicle(Vehicle v){   
        if(!hasSpace()){
            return null;
        }
        ParkingTicket t= new ParkingTicket(currentsize++, new Timestamp(System.currentTimeMillis()+10000));
        parkingSpace.put(t, v);
        return t;
    }
    
    /**
     *
     * @param ticket
     * @return
     */
    public boolean pickUpVehicle(ParkingTicket ticket){
        if(parkingSpace.containsKey(ticket)){
            if(!ticket.isExpired()){
                parkingSpace.remove(ticket);
                currentsize--;
                return true;
            }
             
          System.out.print("Ticket expired, please purchase again.\n");
          return false;
        
        }
        return false;
    }
    
    /**
     *
     * @return
     */
    public boolean hasSpace(){
        return currentsize<max_size;
    }
}
