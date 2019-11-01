/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author MyPC
 */
public class Dayss {

    private String dayId;
    private String dayss;
    private Set<Ticket> tickets = new HashSet<Ticket>(0);

    public Dayss() {
    }

    public Dayss(String dayId) {
        this.dayId = dayId;
    }

    public Dayss(String dayId, String dayss, Set<Ticket> tickets) {
        this.dayId = dayId;
        this.dayss = dayss;
        this.tickets = tickets;
    }

    public String getDayId() {
        return this.dayId;
    }

    public void setDayId(String dayId) {
        this.dayId = dayId;
    }

    public String getDayss() {
        return this.dayss;
    }

    public void setDayss(String dayss) {
        this.dayss = dayss;
    }

    public Set<Ticket> getTickets() {
        return this.tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }
}
