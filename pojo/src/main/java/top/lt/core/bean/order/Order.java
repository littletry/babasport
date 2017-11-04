package top.lt.core.bean.order;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private Long id;

    private Float deliverFee;

    private Float totalPrice;

    private Float orderPrice;

    private Integer paymentWay;

    private Integer paymentCash;

    private Integer delivery;

    private Boolean isConfirm;

    private Integer isPaiy;

    private Integer orderState;

    private Date createDate;

    private String note;

    private Long buyerId;

    private static final long serialVersionUID = 1L;

    public Order(Long id, Float deliverFee, Float totalPrice, Float orderPrice, Integer paymentWay, Integer paymentCash, Integer delivery, Boolean isConfirm, Integer isPaiy, Integer orderState, Date createDate, String note, Long buyerId) {
        this.id = id;
        this.deliverFee = deliverFee;
        this.totalPrice = totalPrice;
        this.orderPrice = orderPrice;
        this.paymentWay = paymentWay;
        this.paymentCash = paymentCash;
        this.delivery = delivery;
        this.isConfirm = isConfirm;
        this.isPaiy = isPaiy;
        this.orderState = orderState;
        this.createDate = createDate;
        this.note = note;
        this.buyerId = buyerId;
    }

    public Order() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getDeliverFee() {
        return deliverFee;
    }

    public void setDeliverFee(Float deliverFee) {
        this.deliverFee = deliverFee;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Float orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(Integer paymentWay) {
        this.paymentWay = paymentWay;
    }

    public Integer getPaymentCash() {
        return paymentCash;
    }

    public void setPaymentCash(Integer paymentCash) {
        this.paymentCash = paymentCash;
    }

    public Integer getDelivery() {
        return delivery;
    }

    public void setDelivery(Integer delivery) {
        this.delivery = delivery;
    }

    public Boolean getIsConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(Boolean isConfirm) {
        this.isConfirm = isConfirm;
    }

    public Integer getIsPaiy() {
        return isPaiy;
    }

    public void setIsPaiy(Integer isPaiy) {
        this.isPaiy = isPaiy;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", deliverFee=").append(deliverFee);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", orderPrice=").append(orderPrice);
        sb.append(", paymentWay=").append(paymentWay);
        sb.append(", paymentCash=").append(paymentCash);
        sb.append(", delivery=").append(delivery);
        sb.append(", isConfirm=").append(isConfirm);
        sb.append(", isPaiy=").append(isPaiy);
        sb.append(", orderState=").append(orderState);
        sb.append(", createDate=").append(createDate);
        sb.append(", note=").append(note);
        sb.append(", buyerId=").append(buyerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}