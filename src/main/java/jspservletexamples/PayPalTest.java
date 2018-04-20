package jspservletexamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Payer;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.RedirectUrls;
import com.paypal.api.payments.Transaction;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalRESTException;

public class PayPalTest {
	
	private static final String clientId = "Ad-tvO3mNuiv6r7G2vj0cOC5LjHrXj9Agte4Smg41eGqZOW7qqU6waKye6PVfqcJi7DpNoup2lxqVM8e";
	private static final String clientSecret = "EE7pwyZDUO1uWqm6fmwgVAwnF7j-BSev7kb5XrC8OywSiZuKfjE_WuBydSzseCQ81h6SbTs59LZnckwk";
	
	
	public static void main(String[] args) {
		Map<String, String> sdkConfig = new HashMap<String, String>();
		sdkConfig.put("mode", "sandbox");

		try {
			String accessToken = new OAuthTokenCredential(clientId, clientSecret, sdkConfig).getAccessToken();
			
			System.out.println("accessToken: " + accessToken);			
			
			APIContext apiContext = new APIContext(accessToken);
			apiContext.setConfigurationMap(sdkConfig);


			Amount amount = new Amount();
			amount.setCurrency("USD");
			amount.setTotal("12");


			Transaction transaction = new Transaction();
			transaction.setDescription("creating a payment");
			transaction.setAmount(amount);

			List<Transaction> transactions = new ArrayList<Transaction>();
			transactions.add(transaction);

			Payer payer = new Payer();
			payer.setPaymentMethod("paypal");


			Payment payment = new Payment();
			payment.setIntent("sale");
			payment.setPayer(payer);
			payment.setTransactions(transactions);
			RedirectUrls redirectUrls = new RedirectUrls();
			redirectUrls.setCancelUrl("http://10.20.220.79:8080/jspservletexamples/index.jsp");
			redirectUrls.setReturnUrl("http://10.20.220.79:8080/jspservletexamples/index.jsp");
			payment.setRedirectUrls(redirectUrls);


			Payment createdPayment = payment.create(apiContext);
			
			System.out.println("createdPayment: " + createdPayment);
			
		} catch (PayPalRESTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
