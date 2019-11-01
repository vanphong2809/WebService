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
public class Hourss {

    private String hoursId;
    private String hourss;
    private Set<Ticket> tickets = new HashSet<Ticket>(0);

    public Hourss() {
    }

    public Hourss(String hoursId) {
        this.hoursId = hoursId;
    }

    public Hourss(String hoursId, String hourss, Set<Ticket> tickets) {
        this.hoursId = hoursId;
        this.hourss = hourss;
        this.tickets = tickets;
    }

    public String getHoursId() {
        return this.hoursId;
    }

    public void setHoursId(String hoursId) {
        this.hoursId = hoursId;
    }

    public String getHourss() {
        return this.hourss;
    }

    public void setHourss(String hourss) {
        this.hourss = hourss;
    }

    public Set<Ticket> getTickets() {
        return this.tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }
}
