package com.noxymon.maria.v1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.noxymon.maria.v1.models.order.beans.FetchOrderResponse;

@Path("/order")
public class OrderRest extends OrderImpl{

	@GET
	@Path("{orderNo}")
	@Produces(MediaType.APPLICATION_JSON)
	public FetchOrderResponse getOrderDetail(@PathParam("orderNo") String orderNo) {
		System.out.println("Order No : " +orderNo);
		return super.getOrderDetail(orderNo);
	}
	
}
