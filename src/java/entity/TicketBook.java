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
public class TicketBook {

    private String ticketBookId;
    private Movie movie;
    private Integer ticketAmount;
    private Set<Payment> payments = new HashSet<Payment>(0);
    private Set<Ticket> tickets = new HashSet<Ticket>(0);

    public TicketBook() {
    }

    public TicketBook(String ticketBookId) {
        this.ticketBookId = ticketBookId;
    }

    public TicketBook(String ticketBookId, Movie movie, Integer ticketAmount, Set<Payment> payments, Set<Ticket> tickets) {
        this.ticketBookId = ticketBookId;
        this.movie = movie;
        this.ticketAmount = ticketAmount;
        this.payments = payments;
        this.tickets = tickets;
    }

    public String getTicketBookId() {
        return this.ticketBookId;
    }

    public void setTicketBookId(String ticketBookId) {
        this.ticketBookId = ticketBookId;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Integer getTicketAmount() {
        return this.ticketAmount;
    }

    public void setTicketAmount(Integer ticketAmount) {
        this.ticketAmount = ticketAmount;
    }

    public Set<Payment> getPayments() {
        return this.payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }

    public Set<Ticket> getTickets() {
        return this.tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }
}
