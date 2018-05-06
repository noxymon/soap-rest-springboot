package com.noxymon.maria.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.noxymon.maria.v1.models.order.beans.FetchOrderResponse;

@WebService(targetNamespace="http://v1.webservices.com", name="order")
public interface Order {
	
	@WebResult(name="response")
	@WebMethod
	public FetchOrderResponse getOrderDetail(@WebParam(name="orderNo") String orderNo);
}
