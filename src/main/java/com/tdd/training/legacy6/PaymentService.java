package com.tdd.training.legacy6;

import com.tdd.training.legacy3.User;


public final class PaymentService {

	public PaymentService() throws Exception {
		throw new Exception("Unable to connect to server");
	}
	
	public boolean doPayment(User user, Booking booking) {
		return true;
	}

}
