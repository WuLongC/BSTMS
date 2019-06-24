package com.bank.BSTMS.svc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.BSTMS.mapper.CardInfoMapper;
import com.bank.BSTMS.pojo.CardInfo;

/**
 * 
 * @ClassName: CardInfoSvc
 * @Description: 卡信息服务
 * @author coke
 * @date 2019年6月19日
 * @since JDK 1.8
 */

@Service
public class CardInfoSvc {

	/**
	 * 银行卡信息依赖
	 */
	@Autowired(required=true)
	private CardInfoMapper cardInfoMapper;
	
	public CardInfo getCardById(String userID) {
		return cardInfoMapper.selectByPrimaryKey(userID);
	}
}
