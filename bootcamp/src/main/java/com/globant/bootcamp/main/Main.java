package com.globant.bootcamp.main;

import java.time.LocalDate;

import com.globant.bootcamp.card.Card.CardType;
import com.globant.bootcamp.card.ChipCard;
import com.globant.bootcamp.card.MagneticStripeCard;
import com.globant.bootcamp.pos.PaymentTerminal;

public class Main {
	public static void main(String args[]) 
	{
		PaymentTerminal pos = new PaymentTerminal();
		
		MagneticStripeCard card1 = new MagneticStripeCard(
				"Pepito Perez", 
				"5555 1111 2222 3333 5555", 
				888, 
				LocalDate.now(), 
				LocalDate.now().plusYears(2), 
				false,
				CardType.VISA
		);
		
		ChipCard card2 = new ChipCard(
				"Hector Nillos", 
				"5555 2222 4444 3333 5555", 
				999, 
				LocalDate.now(), 
				LocalDate.now().plusYears(2), 
				false,
				CardType.MASTERCARD
		);
		
		ChipCard card3 = new ChipCard(
				"Hernando Gallo", 
				"5555 2222 1111 4444 9999", 
				555, 
				LocalDate.now(), 
				LocalDate.now().plusYears(2), 
				false,
				CardType.MASTERCARD
		);
		
		
		pos.readByMagneticSlotAndPay(card1, 1000);
		pos.readByChipSlotAndPay(card2, 500);
		pos.readByChipSlotAndPay(card3, 500);
		pos.readByMagneticSlotAndPay(card2, 1000);
	}
}
