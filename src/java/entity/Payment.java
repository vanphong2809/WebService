package entity;

public class Payment {

    private String paymentId;
    private BankCard bankCard;
    private TicketBook ticketBook;
    private Integer totalAmount;

    public Payment() {
    }

    public Payment(String paymentId) {
        this.paymentId = paymentId;
    }

    public Payment(String paymentId, BankCard bankCard, TicketBook ticketBook, Integer totalAmount) {
        this.paymentId = paymentId;
        this.bankCard = bankCard;
        this.ticketBook = ticketBook;
        this.totalAmount = totalAmount;
    }

    public String getPaymentId() {
        return this.paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public BankCard getBankCard() {
        return this.bankCard;
    }

    public void setBankCard(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public TicketBook getTicketBook() {
        return this.ticketBook;
    }

    public void setTicketBook(TicketBook ticketBook) {
        this.ticketBook = ticketBook;
    }

    public Integer getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

}
