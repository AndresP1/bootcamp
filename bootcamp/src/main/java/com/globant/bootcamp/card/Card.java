package com.globant.bootcamp.card;

import java.time.LocalDate;

import com.globant.bootcamp.Readeable;

public abstract class Card implements Readeable{
	
	public enum CardType{
		VISA,
		MASTERCARD,
		AMERICAN_EXPRESS,
		DINNERS
	}
	
	private String name;
	private String number;
	private Integer securityCode;
	private LocalDate creationDay;
	private LocalDate expirationDay;
	private boolean isDebit;
	private CardType cardType;
	
	public Card(String name, String number, Integer securityCode, LocalDate creationDay, LocalDate expirationDay,
			boolean isDebit, CardType cardType) {
		super();
		this.name = name;
		this.number = number;
		this.securityCode = securityCode;
		this.creationDay = creationDay;
		this.expirationDay = expirationDay;
		this.isDebit = isDebit;
		this.cardType = cardType;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNumber() {
		return number;
	}
	
	public Integer getSecurityCode() {
		return securityCode;
	}
	
	public LocalDate getCreationDay() {
		return creationDay;
	}
	
	public LocalDate getExpirationDay() {
		return expirationDay;
	}
	
	public boolean isDebit() {
		return isDebit;
	}
	
	public CardType getCardType() {
		return cardType;
	}
}
