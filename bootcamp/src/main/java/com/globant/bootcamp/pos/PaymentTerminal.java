package com.globant.bootcamp.pos;

import java.util.ArrayList;
import java.util.List;

import com.globant.bootcamp.card.Card;
import com.globant.bootcamp.card.ChipCard;
import com.globant.bootcamp.card.MagneticStripeCard;
import com.globant.bootcamp.server.PaymentTerminalServer;

public class PaymentTerminal {
	private List<String> payments = new ArrayList<>();
	
	public PaymentTerminal() {
		new PaymentTerminalServer(this.payments);
	}
	
	public void readByMagneticSlotAndPay(MagneticStripeCard card, Integer amount) {
		makePayment(card, amount);
	}
	
	public void readByChipSlotAndPay(ChipCard card, Integer amount) {
		makePayment(card, amount);
	}
	
	private void makePayment(Card card, Integer amount) {
		payments.add(card.read() + ":" + amount);
	}
}
