package com.globant.bootcamp.card;

import java.time.LocalDate;

public class MagneticStripeCard extends Card {

	public MagneticStripeCard(String name, String number, Integer securityCode, LocalDate creationDay,
			LocalDate expirationDay, boolean isDebit, CardType cardType) {
		super(name, number, securityCode, creationDay, expirationDay, isDebit, cardType);
	}

	@Override
	public String read() {
		return getNumber() + ":" + getSecurityCode() + ":" + getExpirationDay().toEpochDay();
	}

}
