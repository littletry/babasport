package top.lt.core.bean.product;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {
    private Long id;

    private Long brandId;

    private String name;

    private Float weight;

    private Boolean isNew;

    private Boolean isHot;

    private Boolean isCommend;

    private Boolean isShow;

    private String imgUrl;

    private Boolean isDel;

    private String description;

    private String packageList;

    private String colors;

    private String sizes;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Product(Long id, Long brandId, String name, Float weight, Boolean isNew, Boolean isHot, Boolean isCommend, Boolean isShow, String imgUrl, Boolean isDel, String description, String packageList, String colors, String sizes, Date createTime) {
        this.id = id;
        this.brandId = brandId;
        this.name = name;
        this.weight = weight;
        this.isNew = isNew;
        this.isHot = isHot;
        this.isCommend = isCommend;
        this.isShow = isShow;
        this.imgUrl = imgUrl;
        this.isDel = isDel;
        this.description = description;
        this.packageList = packageList;
        this.colors = colors;
        this.sizes = sizes;
        this.createTime = createTime;
    }

    public Product() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    public Boolean getIsCommend() {
        return isCommend;
    }

    public void setIsCommend(Boolean isCommend) {
        this.isCommend = isCommend;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPackageList() {
        return packageList;
    }

    public void setPackageList(String packageList) {
        this.packageList = packageList;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors == null ? null : colors.trim();
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes == null ? null : sizes.trim();
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
        sb.append(", brandId=").append(brandId);
        sb.append(", name=").append(name);
        sb.append(", weight=").append(weight);
        sb.append(", isNew=").append(isNew);
        sb.append(", isHot=").append(isHot);
        sb.append(", isCommend=").append(isCommend);
        sb.append(", isShow=").append(isShow);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", isDel=").append(isDel);
        sb.append(", description=").append(description);
        sb.append(", packageList=").append(packageList);
        sb.append(", colors=").append(colors);
        sb.append(", sizes=").append(sizes);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}