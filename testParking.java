/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ParkingLot;

/**
 *
 * @author shanliu
 */
public class testParking {
    public static void main(String[] args){
        ParkingLot newParkingLot=new ParkingLot(1);
        ParkingTicket[] ticket=new ParkingTicket[10];
        ticket[0]=newParkingLot.parkVehicle(new Vehicle(CarType.MOTOCYCLE));
        System.out.println(newParkingLot.pickUpVehicle(ticket[0]));
        System.out.println(newParkingLot.parkVehicle(new Vehicle(CarType.SEDAN)));
        System.out.println(newParkingLot.hasSpace());
        
    }
}
