package cn.itcast.invoice.util.quartz;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.invoice.invoice.goods.dao.dao.GoodsDao;
import cn.itcast.invoice.util.format.FormatUtil;
/**
 * this class is a time class that send automatic emails
 *
 */
@Transactional
public class QuartzTasks {
	private final static int onetwothree = 123;
	private GoodsDao goodsDao;
	private JavaMailSenderImpl mailSender;
	
	/**
	 * this method is the setter for the mailSender
	 * @param mailSender
	 */
	public void setMailSender(JavaMailSenderImpl mailSender) {
		this.mailSender = mailSender;
	}
	//ÃƒÂ¨Ã‚Â¦Ã¯Â¿Â½ÃƒÂ¦Ã‚Â±Ã¢â‚¬Å¡ÃƒÂ¦Ã…â€™Ã¢â‚¬Â¡ÃƒÂ¥Ã‚Â®Ã…Â¡ÃƒÂ¤Ã‚ÂºÃ¢â‚¬Â¹ÃƒÂ¤Ã‚Â»Ã‚Â¶ÃƒÂ§Ã¢â‚¬Å¡Ã‚Â¹ÃƒÂ¤Ã‚Â¸Ã…Â ÃƒÂ¥Ã‚Â®Ã…â€™ÃƒÂ¦Ã‹â€ Ã¯Â¿Â½ÃƒÂ¤Ã‚Â¸Ã¢â‚¬Â¹ÃƒÂ¥Ã‹â€ Ã¢â‚¬â€�ÃƒÂ¤Ã‚Â»Ã‚Â»ÃƒÂ¥Ã…Â Ã‚Â¡ 
	
	/**
	 * this method is the setter for goodsDao
	 */
	public void setGoodsDao(GoodsDao goodsDao) {
		this.goodsDao = goodsDao;
	}
	
	/**
	 * this method is goodsDao to update use num
	 */
	public void goodsUseNumUpdate(){
		System.out.println(onetwothree);
		//ÃƒÂ¨Ã‚Â°Ã†â€™ÃƒÂ§Ã¢â‚¬ï¿½Ã‚Â¨goodsÃƒÂ¦Ã‚Â¨Ã‚Â¡ÃƒÂ¥Ã¯Â¿Â½Ã¢â‚¬â€�ÃƒÂ§Ã…Â¡Ã¢â‚¬Å¾daoÃƒÂ¦Ã¢â‚¬Â°Ã‚Â§ÃƒÂ¨Ã‚Â¡Ã…â€™ÃƒÂ¥Ã‚Â¯Ã‚Â¹ÃƒÂ¥Ã‚ÂºÃ¢â‚¬ï¿½ÃƒÂ§Ã…Â¡Ã¢â‚¬Å¾updateÃƒÂ¨Ã‚Â¯Ã‚Â­ÃƒÂ¥Ã¯Â¿Â½Ã‚Â¥
		/*
		update 
			tbl_goods g
		set
			useNum =
		(
		select 
			count(goodsUuid)
		from 
			tbl_orderdetail
		where 
			goodsUuid = g.uuid
		)
		*/
		goodsDao.updateUseNum();
	}
	
	
	/**
	 * thie method is the storeWarn method to warn for the storing
	 */
	public void storeWarn(){
		try {
			
		
		//ÃƒÂ¨Ã…Â½Ã‚Â·ÃƒÂ¥Ã¯Â¿Â½Ã¢â‚¬â€œÃƒÂ¦Ã…Â Ã‚Â¥ÃƒÂ¨Ã‚Â­Ã‚Â¦ÃƒÂ¦Ã¢â‚¬Â¢Ã‚Â°ÃƒÂ¦Ã¯Â¿Â½Ã‚Â®
		/*
		select
			gm.name,sum(sdm.num)>gm.maxNum,sum(sdm.num)<gm.minNum
		from 
			tbl_storedetail sdm,
			tbl_goods gm
		where
			gm.uuid = sdm.goodsUuid
		group by
			goodsUuid
		*/
		List<Object[]> temp = goodsDao.getStoreWarnInfo();
		//ÃƒÂ¤Ã‚Â½Ã‚Â¿ÃƒÂ§Ã¢â‚¬ï¿½Ã‚Â¨emailÃƒÂ¥Ã¯Â¿Â½Ã¢â‚¬ËœÃƒÂ©Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÂ¦Ã¢â‚¬Â¢Ã‚Â°ÃƒÂ¦Ã¯Â¿Â½Ã‚Â®ÃƒÂ¥Ã‹â€ Ã‚Â°ÃƒÂ¦Ã…â€™Ã¢â‚¬Â¡ÃƒÂ¥Ã‚Â®Ã…Â¡ÃƒÂ¨Ã‚Â´Ã‚Â¦ÃƒÂ¦Ã‹â€ Ã‚Â·
		//ÃƒÂ¤Ã‚Â½Ã‚Â¿ÃƒÂ§Ã¢â‚¬ï¿½Ã‚Â¨mailsenderÃƒÂ¥Ã‚Â¯Ã‚Â¹ÃƒÂ¨Ã‚Â±Ã‚Â¡
		SimpleMailMessage msg = new SimpleMailMessage();
		//ÃƒÂ¨Ã‚Â®Ã‚Â¾ÃƒÂ§Ã‚Â½Ã‚Â®ÃƒÂ¥Ã¯Â¿Â½Ã¢â‚¬ËœÃƒÂ©Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÂ¤Ã‚ÂºÃ‚Âº
		msg.setFrom("itcast0228@126.com");
		//ÃƒÂ¨Ã‚Â®Ã‚Â¾ÃƒÂ§Ã‚Â½Ã‚Â®ÃƒÂ¦Ã…Â½Ã‚Â¥ÃƒÂ¦Ã¢â‚¬ï¿½Ã‚Â¶ÃƒÂ¤Ã‚ÂºÃ‚Âº
		msg.setTo("1@126.com");
		//ÃƒÂ¨Ã‚Â®Ã‚Â¾ÃƒÂ§Ã‚Â½Ã‚Â®ÃƒÂ¤Ã‚Â¸Ã‚Â»ÃƒÂ©Ã‚Â¢Ã‹Å“
		msg.setSubject("ÃƒÂ¥Ã‚ÂºÃ¢â‚¬Å“ÃƒÂ¥Ã‚Â­Ã‹Å“ÃƒÂ©Ã‚Â¢Ã¢â‚¬Å¾ÃƒÂ¨Ã‚Â­Ã‚Â¦ÃƒÂ¤Ã‚Â¿Ã‚Â¡ÃƒÂ¦Ã¯Â¿Â½Ã‚Â¯"+FormatUtil.formatDateTime(System.currentTimeMillis()));
		//ÃƒÂ¨Ã‚Â®Ã‚Â¾ÃƒÂ§Ã‚Â½Ã‚Â®ÃƒÂ¦Ã‚Â­Ã‚Â£ÃƒÂ¦Ã¢â‚¬â€œÃ¢â‚¬Â¡
		StringBuilder sbf = new StringBuilder();
		//ÃƒÂ¦Ã‚Â Ã‚Â¹ÃƒÂ¦Ã¯Â¿Â½Ã‚Â®ÃƒÂ¦Ã¢â‚¬Â¢Ã‚Â°ÃƒÂ¦Ã¯Â¿Â½Ã‚Â®ÃƒÂ§Ã‚Â»Ã¢â‚¬Å¾ÃƒÂ§Ã‚Â»Ã¢â‚¬Â¡ÃƒÂ¦Ã‚Â­Ã‚Â£ÃƒÂ¦Ã¢â‚¬â€œÃ¢â‚¬Â¡ÃƒÂ¥Ã¢â‚¬Â Ã¢â‚¬Â¦ÃƒÂ¥Ã‚Â®Ã‚Â¹
		for(Object[] objs:temp){
			BigInteger flag = (BigInteger) objs[1];
			if(flag.intValue() == 1){
				//ÃƒÂ¨Ã‚Â¶Ã¢â‚¬Â¦ÃƒÂ¨Ã‚Â¿Ã¢â‚¬Â¡ÃƒÂ¤Ã‚Â¸Ã…Â ÃƒÂ©Ã¢â€žÂ¢Ã¯Â¿Â½
				sbf.append("ÃƒÂ¥Ã¢â‚¬Â¢Ã¢â‚¬Â ÃƒÂ¥Ã¢â‚¬Å“Ã¯Â¿Â½ÃƒÂ£Ã¢â€šÂ¬Ã¯Â¿Â½"+objs[0].toString()+"ÃƒÂ£Ã¢â€šÂ¬Ã¢â‚¬ËœÃƒÂ¥Ã‚ÂºÃ¢â‚¬Å“ÃƒÂ¥Ã‚Â­Ã‹Å“ÃƒÂ¨Ã‚Â¶Ã¢â‚¬Â¦ÃƒÂ¨Ã‚Â¿Ã¢â‚¬Â¡ÃƒÂ¦Ã…â€œÃ¢â€šÂ¬ÃƒÂ¥Ã‚Â¤Ã‚Â§ÃƒÂ¥Ã¢â€šÂ¬Ã‚Â¼ÃƒÂ¯Ã‚Â¼Ã…â€™ÃƒÂ¨Ã‚Â¯Ã‚Â·ÃƒÂ¥Ã¯Â¿Â½Ã…â€œÃƒÂ¦Ã‚Â­Ã‚Â¢ÃƒÂ¨Ã‚Â¡Ã‚Â¥ÃƒÂ¨Ã‚Â´Ã‚Â§ÃƒÂ¯Ã‚Â¼Ã…â€™ÃƒÂ¥Ã‚Â¹Ã‚Â¶ÃƒÂ¨Ã‚Â¿Ã¢â‚¬ÂºÃƒÂ¨Ã‚Â¡Ã…â€™ÃƒÂ¤Ã‚Â¿Ã†â€™ÃƒÂ©Ã¢â‚¬ï¿½Ã¢â€šÂ¬ÃƒÂ¯Ã‚Â¼Ã¯Â¿Â½");
				sbf.append("\r\n");
				continue;
			}
			flag = (BigInteger) objs[2];
			if(flag.intValue() == 1){
				//ÃƒÂ¤Ã‚Â½Ã…Â½ÃƒÂ¤Ã‚ÂºÃ…Â½ÃƒÂ¤Ã‚Â¸Ã¢â‚¬Â¹ÃƒÂ©Ã¢â€žÂ¢Ã¯Â¿Â½
				sbf.append("ÃƒÂ¥Ã¢â‚¬Â¢Ã¢â‚¬Â ÃƒÂ¥Ã¢â‚¬Å“Ã¯Â¿Â½ÃƒÂ£Ã¢â€šÂ¬Ã¯Â¿Â½"+objs[0].toString()+"ÃƒÂ£Ã¢â€šÂ¬Ã¢â‚¬ËœÃƒÂ¥Ã‚ÂºÃ¢â‚¬Å“ÃƒÂ¥Ã‚Â­Ã‹Å“ÃƒÂ¤Ã‚Â¸Ã¯Â¿Â½ÃƒÂ¨Ã‚Â¶Ã‚Â³ÃƒÂ¯Ã‚Â¼Ã…â€™ÃƒÂ¨Ã‚Â¯Ã‚Â·ÃƒÂ¥Ã¯Â¿Â½Ã…Â ÃƒÂ¦Ã¢â‚¬â€�Ã‚Â¶ÃƒÂ¨Ã‚Â¡Ã‚Â¥ÃƒÂ¨Ã‚Â´Ã‚Â§ÃƒÂ¯Ã‚Â¼Ã¯Â¿Â½");
				sbf.append("\r\n");
			}
		}
		msg.setText(sbf.toString());
		//ÃƒÂ¨Ã‚Â®Ã‚Â¾ÃƒÂ§Ã‚Â½Ã‚Â®ÃƒÂ¥Ã¯Â¿Â½Ã¢â‚¬ËœÃƒÂ©Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÂ¦Ã¢â‚¬â€�Ã‚Â¶ÃƒÂ©Ã¢â‚¬â€�Ã‚Â´
		msg.setSentDate(new Date());
		mailSender.send(msg);
		} catch (Exception e) {
			 System.out.println("Something was wrong");
		}
	}
}
