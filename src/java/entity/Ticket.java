/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author MyPC
 */
public class Ticket {

    private String ticketId;
    private Dayss dayss;
    private Hourss hourss;
    private TicketBook ticketBook;
    private Integer ticketPrice;

    public Ticket() {
    }

    public Ticket(String ticketId) {
        this.ticketId = ticketId;
    }

    public Ticket(String ticketId, Dayss dayss, Hourss hourss, TicketBook ticketBook, Integer ticketPrice) {
        this.ticketId = ticketId;
        this.dayss = dayss;
        this.hourss = hourss;
        this.ticketBook = ticketBook;
        this.ticketPrice = ticketPrice;
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public Dayss getDayss() {
        return this.dayss;
    }

    public void setDayss(Dayss dayss) {
        this.dayss = dayss;
    }

    public Hourss getHourss() {
        return this.hourss;
    }

    public void setHourss(Hourss hourss) {
        this.hourss = hourss;
    }

    public TicketBook getTicketBook() {
        return this.ticketBook;
    }

    public void setTicketBook(TicketBook ticketBook) {
        this.ticketBook = ticketBook;
    }

    public Integer getTicketPrice() {
        return this.ticketPrice;
    }

    public void setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
