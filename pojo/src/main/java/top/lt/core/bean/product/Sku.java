package top.lt.core.bean.product;

import java.io.Serializable;
import java.util.Date;

public class Sku implements Serializable {
    private Long id;

    private Long productId;

    private Long colorId;

    private String size;

    private Float marketPrice;

    private Float price;

    private Float deliveFee;

    private Integer stock;

    private Integer upperLimit;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Sku(Long id, Long productId, Long colorId, String size, Float marketPrice, Float price, Float deliveFee, Integer stock, Integer upperLimit, Date createTime) {
        this.id = id;
        this.productId = productId;
        this.colorId = colorId;
        this.size = size;
        this.marketPrice = marketPrice;
        this.price = price;
        this.deliveFee = deliveFee;
        this.stock = stock;
        this.upperLimit = upperLimit;
        this.createTime = createTime;
    }

    public Sku() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getColorId() {
        return colorId;
    }

    public void setColorId(Long colorId) {
        this.colorId = colorId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public Float getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Float marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getDeliveFee() {
        return deliveFee;
    }

    public void setDeliveFee(Float deliveFee) {
        this.deliveFee = deliveFee;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(Integer upperLimit) {
        this.upperLimit = upperLimit;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", colorId=").append(colorId);
        sb.append(", size=").append(size);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", price=").append(price);
        sb.append(", deliveFee=").append(deliveFee);
        sb.append(", stock=").append(stock);
        sb.append(", upperLimit=").append(upperLimit);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}