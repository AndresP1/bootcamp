package com.globant.bootcamp.card;

import java.time.LocalDate;

public class ChipCard extends MagneticStripeCard{

	public ChipCard(String name, String number, Integer securityCode, LocalDate creationDay, LocalDate expirationDay,
			boolean isDebit, CardType cardType) {
		super(name, number, securityCode, creationDay, expirationDay, isDebit, cardType);
	}
}
