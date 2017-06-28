package net.viralpatel.spring.controller;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by rahul.singh@c1exchange.com on 6/10/2017.
 */
@Entity
@Table(name = "account")
public class AccountEntity implements Serializable {
    private int id;
    private String name;
    private String currencyCode;
    private String currencySymbol;
    private String timeZone;
    private String imageUrl;
    private Integer decimalLimit;
    private int createUser;
    private Timestamp createTs;
    private int updateUser;
    private Timestamp updateTs;
    private int status;
    private String title;
    private String emailId;
    private String faq;
    private String adConfig;
    private double budget;
    private Double giftedCredit;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "currency_code", nullable = false, length = 10)
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Basic
    @Column(name = "currency_symbol", nullable = false, length = 10)
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    @Basic
    @Column(name = "time_zone", nullable = false, length = 50)
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Basic
    @Column(name = "image_url", nullable = true, length = 500)
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Basic
    @Column(name = "decimal_limit", nullable = true)
    public Integer getDecimalLimit() {
        return decimalLimit;
    }

    public void setDecimalLimit(Integer decimalLimit) {
        this.decimalLimit = decimalLimit;
    }

    @Basic
    @Column(name = "create_user", nullable = false)
    public int getCreateUser() {
        return createUser;
    }

    public void setCreateUser(int createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "create_ts", nullable = false)
    public Timestamp getCreateTs() {
        return createTs;
    }

    public void setCreateTs(Timestamp createTs) {
        this.createTs = createTs;
    }

    @Basic
    @Column(name = "update_user", nullable = false)
    public int getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(int updateUser) {
        this.updateUser = updateUser;
    }

    @Basic
    @Column(name = "update_ts", nullable = false)
    public Timestamp getUpdateTs() {
        return updateTs;
    }

    public void setUpdateTs(Timestamp updateTs) {
        this.updateTs = updateTs;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 200)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "email_id", nullable = false, length = 100)
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Basic
    @Column(name = "faq", nullable = false, length = 300)
    public String getFaq() {
        return faq;
    }

    public void setFaq(String faq) {
        this.faq = faq;
    }

    @Basic
    @Column(name = "ad_config", nullable = true, length = 500)
    public String getAdConfig() {
        return adConfig;
    }

    public void setAdConfig(String adConfig) {
        this.adConfig = adConfig;
    }

    @Basic
    @Column(name = "budget", nullable = false, precision = 0)
    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Basic
    @Column(name = "gifted_credit", nullable = true, precision = 0)
    public Double getGiftedCredit() {
        return giftedCredit;
    }

    public void setGiftedCredit(Double giftedCredit) {
        this.giftedCredit = giftedCredit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountEntity entity = (AccountEntity) o;

        if (id != entity.id) return false;
        if (createUser != entity.createUser) return false;
        if (updateUser != entity.updateUser) return false;
        if (status != entity.status) return false;
        if (Double.compare(entity.budget, budget) != 0) return false;
        if (name != null ? !name.equals(entity.name) : entity.name != null) return false;
        if (currencyCode != null ? !currencyCode.equals(entity.currencyCode) : entity.currencyCode != null)
            return false;
        if (currencySymbol != null ? !currencySymbol.equals(entity.currencySymbol) : entity.currencySymbol != null)
            return false;
        if (timeZone != null ? !timeZone.equals(entity.timeZone) : entity.timeZone != null) return false;
        if (imageUrl != null ? !imageUrl.equals(entity.imageUrl) : entity.imageUrl != null) return false;
        if (decimalLimit != null ? !decimalLimit.equals(entity.decimalLimit) : entity.decimalLimit != null)
            return false;
        if (createTs != null ? !createTs.equals(entity.createTs) : entity.createTs != null) return false;
        if (updateTs != null ? !updateTs.equals(entity.updateTs) : entity.updateTs != null) return false;
        if (title != null ? !title.equals(entity.title) : entity.title != null) return false;
        if (emailId != null ? !emailId.equals(entity.emailId) : entity.emailId != null) return false;
        if (faq != null ? !faq.equals(entity.faq) : entity.faq != null) return false;
        if (adConfig != null ? !adConfig.equals(entity.adConfig) : entity.adConfig != null) return false;
        if (giftedCredit != null ? !giftedCredit.equals(entity.giftedCredit) : entity.giftedCredit != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (currencyCode != null ? currencyCode.hashCode() : 0);
        result = 31 * result + (currencySymbol != null ? currencySymbol.hashCode() : 0);
        result = 31 * result + (timeZone != null ? timeZone.hashCode() : 0);
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        result = 31 * result + (decimalLimit != null ? decimalLimit.hashCode() : 0);
        result = 31 * result + createUser;
        result = 31 * result + (createTs != null ? createTs.hashCode() : 0);
        result = 31 * result + updateUser;
        result = 31 * result + (updateTs != null ? updateTs.hashCode() : 0);
        result = 31 * result + status;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (emailId != null ? emailId.hashCode() : 0);
        result = 31 * result + (faq != null ? faq.hashCode() : 0);
        result = 31 * result + (adConfig != null ? adConfig.hashCode() : 0);
        temp = Double.doubleToLongBits(budget);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (giftedCredit != null ? giftedCredit.hashCode() : 0);
        return result;
    }
}
