package com.redhat.demo.aml;

public class TransactionEntity {
    private Long custId;

    private Double amount;

    private String customerCountry;

    private String customerIndustry;

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCustomerCountry() {
        return customerCountry;
    }

    public void setCustomerCountry(String customerCountry) {
        this.customerCountry = customerCountry;
    }

    public String getCustomerIndustry() {
        return customerIndustry;
    }

    public void setCustomerIndustry(String customerIndustry) {
        this.customerIndustry = customerIndustry;
    }

    @Override
    public String toString() {
        return "TransactionEntity{" +
                "id=" + id +
                ", custId=" + custId +
                ", amount=" + amount +
                ", customerCountry='" + customerCountry + '\'' +
                ", customerIndustry='" + customerIndustry + '\'' +
                '}';
    }
}
