/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Admin
 */
public class Seat {
    private int seatID;
    private int screenRows;
    private int seats;

    public Seat() {
    }

    
    public Seat(int seatID, int screenRows, int seats) {
        this.seatID = seatID;
        this.screenRows = screenRows;
        this.seats = seats;
    }

    public int getSeatID() {
        return seatID;
    }

    public void setSeatID(int seatID) {
        this.seatID = seatID;
    }

    public int getScreenRows() {
        return screenRows;
    }

    public void setScreenRows(int screenRows) {
        this.screenRows = screenRows;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    
}
