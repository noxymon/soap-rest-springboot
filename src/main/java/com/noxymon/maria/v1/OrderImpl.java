package com.noxymon.maria.v1;

import java.math.BigDecimal;

import javax.jws.WebService;

import com.noxymon.maria.v1.models.order.beans.FetchOrderResponse;

@WebService(endpointInterface="com.noxymon.maria.v1.Order")
public class OrderImpl implements Order {
	
	@Override
	public FetchOrderResponse getOrderDetail(String orderNo) {
		FetchOrderResponse response=new FetchOrderResponse();
				
		response.setOrderNo(orderNo);
		response.setStatus(12);
		response.setAmountFinal(new BigDecimal(12000000));
		return response;
	}

}
