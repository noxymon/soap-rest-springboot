package com.noxymon.maria.v1.models.order.beans;

import java.math.BigDecimal;

public class FetchOrderResponse {
	private String orderNo;
	private BigDecimal amountFinal;
	private Integer status;
	
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public BigDecimal getAmountFinal() {
		return amountFinal;
	}
	public void setAmountFinal(BigDecimal amountFinal) {
		this.amountFinal = amountFinal;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
}
