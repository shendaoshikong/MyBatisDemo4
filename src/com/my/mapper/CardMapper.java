package com.my.mapper;

import com.my.vo.Card;

public interface CardMapper {

	public Card selectCardById(int id);

	public void saveCard(Card card);

	public void deleteCardById(int id);
	
	public void updateCardById(Card card);
}