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
public class BankCard {

    private String bankCardId;
    private Customer customer;
    private String cardNumber;
    private Set<Payment> payments = new HashSet<Payment>(0);

    public BankCard() {
    }

    public BankCard(String bankCardId) {
        this.bankCardId = bankCardId;
    }

    public BankCard(String bankCardId, Customer customer, String cardNumber, Set<Payment> payments) {
        this.bankCardId = bankCardId;
        this.customer = customer;
        this.cardNumber = cardNumber;
        this.payments = payments;
    }

    public String getBankCardId() {
        return this.bankCardId;
    }

    public void setBankCardId(String bankCardId) {
        this.bankCardId = bankCardId;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Set<Payment> getPayments() {
        return this.payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }
}
