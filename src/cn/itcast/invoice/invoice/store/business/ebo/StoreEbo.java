package cn.itcast.invoice.invoice.store.business.ebo;

import java.io.Serializable;
import java.util.List;

import cn.itcast.invoice.auth.emp.vo.EmpModel;
import cn.itcast.invoice.invoice.goods.vo.GoodsModel;
import cn.itcast.invoice.invoice.order.dao.dao.OrderDetailDao;
import cn.itcast.invoice.invoice.order.vo.OrderDetailModel;
import cn.itcast.invoice.invoice.order.vo.OrderModel;
import cn.itcast.invoice.invoice.store.business.ebi.StoreEbi;
import cn.itcast.invoice.invoice.store.dao.dao.StoreDao;
import cn.itcast.invoice.invoice.store.vo.StoreModel;
import cn.itcast.invoice.invoice.storedetail.dao.dao.StoreDetailDao;
import cn.itcast.invoice.invoice.storedetail.vo.StoreDetailModel;
import cn.itcast.invoice.invoice.storeoper.dao.dao.StoreOperDao;
import cn.itcast.invoice.invoice.storeoper.vo.StoreOperModel;
import cn.itcast.invoice.util.base.BaseQueryModel;
import cn.itcast.invoice.util.exception.AppException;
/**
 * this class implements StoreEbi
 *
 */
public class StoreEbo implements StoreEbi{
	private StoreDao storeDao;
	private StoreDetailDao storeDetailDao;
	private OrderDetailDao orderDetailDao;
	private StoreOperDao storeOperDao;
	
	/**
	 * this method is use to set the Store oper Dao
	 * @param storeOperDao
	 */
	public void setStoreOperDao(StoreOperDao storeOperDao) {
		this.storeOperDao = storeOperDao;
	}

	/**
	 * this method is used to set the order detail dao
	 * @param orderDetailDao
	 */
	public void setOrderDetailDao(OrderDetailDao orderDetailDao) {
		this.orderDetailDao = orderDetailDao;
	}

	/**
	 * this method is used to set the store detail dao
	 * @param storeDetailDao
	 */
	public void setStoreDetailDao(StoreDetailDao storeDetailDao) {
		this.storeDetailDao = storeDetailDao;
	}

	/**
	 * this method is used to set the store do
	 * @param storeDao
	 */
	public void setStoreDao(StoreDao storeDao) {
		this.storeDao = storeDao;
	}
	
	/**
	 * this method is used to save the storeModel
	 */
	public void save(StoreModel sm) {
		storeDao.save(sm);
	}

	/**
	 * this method is used to delete the storeModel
	 */
	public void delete(StoreModel sm) {
		storeDao.delete(sm);
	}

	/**
	 * this method is used to updatee the storeModel
	 */
	public void update(StoreModel sm) {
		storeDao.update(sm);
	}

	/**
	 * this method is used to get the uuid
	 */
	public StoreModel get(Serializable uuid) {
		return storeDao.get(uuid);
	}

	/**
	 * this method is used to get all the store model
	 */
	public List<StoreModel> getAll() {
		return storeDao.getAll();
	}

	/**
	 * this method is used to get all the store model
	 */
	public List<StoreModel> getAll(BaseQueryModel qm, Integer pageNum,Integer pageCount) {
		return storeDao.getAll(qm,pageNum,pageCount);
	}

	/**
	 * this method is used to get the count
	 */
	public Integer getCount(BaseQueryModel qm) {
		return storeDao.getCount(qm);
	}

	/**
	 * this method is used to get the in goods
	 */
	public OrderDetailModel inGoods(Long odmUuid ,Long goodsUuid, Long storeUuid, Integer num,EmpModel login) {
		GoodsModel gm = new GoodsModel();
		gm.setSegreto(goodsUuid);
		StoreModel sm = new StoreModel();
		sm.setSegreto(storeUuid);
		
		
		//Ã¥â€¦Â¥Ã¥Âºâ€œÃ§Â©Â¶Ã§Â«Å¸Ã¨Â¦ï¿½Ã¥ï¿½Å¡Ã¤Â»â‚¬Ã¤Â¹Ë†Ã¯Â¼Å¸
		//1.Ã¥Å½Å¸Ã¥Â§â€¹Ã¨Â®Â¢Ã¥ï¿½â€¢Ã¦ËœÅ½Ã§Â»â€ Ã¤Â¸Â­Ã§Å¡â€žÃ¥Â·Â²Ã¥â€¦Â¥Ã¥Âºâ€œÃ¦â€¢Â°Ã©â€¡ï¿½Ã¦â€ºÂ´Ã¦â€“Â°
		//update Ã¨Â®Â¢Ã¥ï¿½â€¢Ã¦ËœÅ½Ã§Â»â€   
		//Ã¥Â¿Â«Ã§â€¦Â§Ã¦â€ºÂ´Ã¦â€“Â°
		OrderDetailModel odm = orderDetailDao.get(odmUuid);
		
		
		
		odm.setSurplus(odm.getSurplus()-num);
		
		//2.Ã¨Â®Â°Ã¥Â½â€¢Ã¥â€¦Â¥Ã¥Âºâ€œÃ§Å¡â€žÃ¨Â®Â°Ã¥Â½â€¢
		StoreOperModel som = new StoreOperModel();
		//Ã¥â€¦Â¥Ã¥Âºâ€œÃ¦â€œï¿½Ã¤Â½Å“Ã¦â€”Â¶Ã©â€”Â´
		som.setOperTime(System.currentTimeMillis());
		//Ã¦Å“Â¬Ã¦Â¬Â¡Ã¦â€œï¿½Ã¤Â½Å“Ã¦â€¢Â°Ã©â€¡ï¿½
		som.setNum(num);
		//Ã¨Â®Â¾Ã§Â½Â®Ã¦â€œï¿½Ã¤Â½Å“Ã§Â±Â»Ã¥Å¾â€¹Ã¤Â¸ÂºÃ¥â€¦Â¥Ã¥Âºâ€œ
		som.setType(StoreOperModel.STOREOPER_TYPE_OF_IN);
		//Ã¨Â®Â¾Ã§Â½Â®Ã¦â€œï¿½Ã¤Â½Å“Ã§Å¡â€žÃ¥â€¢â€ Ã¥â€œï¿½
		som.setGm(gm);
		//Ã¨Â®Â¾Ã§Â½Â®Ã¦â€œï¿½Ã¤Â½Å“Ã¤ÂºÂº
		som.setEm(login);
		//Ã¨Â®Â¾Ã§Â½Â®Ã¥Â¯Â¹Ã¥Âºâ€�Ã§Å¡â€žÃ¤Â»â€œÃ¥Âºâ€œ
		som.setSm(sm);
		//Ã¨Â®Â¾Ã§Â½Â®Ã¦â€œï¿½Ã¤Â½Å“Ã¥Â¯Â¹Ã¥Âºâ€�Ã§Å¡â€žÃ¨Â®Â¢Ã¥ï¿½â€¢
		som.setOm(odm.getOm());
		storeOperDao.save(som);
		
		//3.Ã¤Â»â€œÃ¥Âºâ€œÃ¤Â¸Â­Ã§Å¡â€žÃ§Å½Â°Ã¦Å“â€°Ã¥â€¢â€ Ã¥â€œï¿½Ã¦â€¢Â°Ã©â€¡ï¿½Ã¦â€ºÂ´Ã¦â€“Â°
		//A BÃ¤Â¸Â¤Ã¤Â¸ÂªÃ¤Â»â€œÃ¥Âºâ€œ
		//Ã¥â€¦Â¥XÃ¥â€¢â€ Ã¥â€œï¿½Ã¯Â¼Å’AÃ¤Â»â€œÃ¥Âºâ€œXÃ¥â€¢â€ Ã¥â€œï¿½100Ã¤Â¸ÂªÃ¯Â¼Å’BÃ¤Â»â€œÃ¥Âºâ€œÃ¤Â»Å½Ã¦Â²Â¡Ã¦Å“â€°Ã¦â€�Â¾Ã¨Â¿â€¡XÃ¥â€¢â€ Ã¥â€œï¿½
		//XÃ¥â€¢â€ Ã¥â€œï¿½Ã¥â€¦Â¥B
		//Ã¦Â Â¹Ã¦ï¿½Â®Ã¥â€¢â€ Ã¥â€œï¿½uuidÃ¤Â¸Å½Ã¤Â»â€œÃ¥Âºâ€œÃ§Å¡â€žuuidÃ¨Å½Â·Ã¥ï¿½â€“Ã¥â€¢â€ Ã¥â€œï¿½Ã¥Å“Â¨Ã¤Â»â€œÃ¥Âºâ€œÃ¤Â¸Â­Ã§Å¡â€žÃ¦â€¢Â°Ã¦ï¿½Â®Ã¨Â®Â°Ã¥Â½â€¢
		StoreDetailModel sdm = storeDetailDao.getBySmAndGm(storeUuid,goodsUuid);
		if(sdm == null){
			//Ã¨Â¯Â¥Ã¤Â»â€œÃ¥Âºâ€œÃ¤Â¸Â­Ã¦Â²Â¡Ã¦Å“â€°Ã¥Â­ËœÃ¥â€šÂ¨Ã¨Â¿â€¡Ã¨Â¯Â¥Ã¥â€¢â€ Ã¥â€œï¿½
			//Ã¥Ë†ï¿½Ã¥Â§â€¹Ã¥Å’â€“Ã¦â€¢Â°Ã¦ï¿½Â®Ã¯Â¼Å’save
			sdm = new StoreDetailModel();
			sdm.setNum(num);
			sdm.setGm(gm);
			sdm.setSm(sm);
			storeDetailDao.save(sdm);
		}else{
			//Ã¨Â¯Â¥Ã¤Â»â€œÃ¥Âºâ€œÃ¤Â¸Â­Ã¥Â­ËœÃ¥â€šÂ¨Ã¨Â¿â€¡Ã¨Â¯Â¥Ã¥â€¢â€ Ã¥â€œï¿½
			//Ã¥Ë†Â©Ã§â€�Â¨Ã¥Â¿Â«Ã§â€¦Â§Ã¦â€ºÂ´Ã¦â€“Â°Ã¦â€¢Â°Ã©â€¡ï¿½
			sdm.setNum(sdm.getNum()+num);
		}
		
		//4.Ã¥Â½â€œÃ¨Â®Â¢Ã¥ï¿½â€¢Ã¤Â¸Â­Ã§Å¡â€žÃ¦â€°â‚¬Ã¦Å“â€°Ã¥â€¢â€ Ã¥â€œï¿½Ã¥â€¦Â¨Ã©Æ’Â¨Ã¥â€¦Â¥Ã¥Âºâ€œÃ¥Â®Å’Ã¦Â¯â€¢Ã¥ï¿½Å½Ã¯Â¼Å’Ã¤Â¿Â®Ã¦â€�Â¹Ã¨Â®Â¢Ã¥ï¿½â€¢Ã§Å¡â€žÃ§Å Â¶Ã¦â‚¬ï¿½Ã¯Â¼Å’Ã¥ï¿½Å’Ã¦â€”Â¶Ã¤Â¿Â®Ã¦â€�Â¹Ã¥Â®Å’Ã¦Ë†ï¿½Ã¦â€”Â¶Ã©â€”Â´
		OrderModel om = odm.getOm();
		int sum = 0;
		for(OrderDetailModel temp:om.getOdms()){
			sum += temp.getSurplus();
		}
		if(sum == 0){
			//Ã¥Â¿Â«Ã§â€¦Â§Ã¦â€ºÂ´Ã¦â€“Â°
			//Ã¤Â¿Â®Ã¦â€�Â¹Ã¨Â®Â¢Ã¥ï¿½â€¢Ã§Å Â¶Ã¦â‚¬ï¿½
			om.setType(OrderModel.ORDER_TYPE_OF_BUY_END);
			//Ã¤Â¿Â®Ã¦â€�Â¹Ã§Â»â€œÃ¥ï¿½â€¢Ã¦â€”Â¶Ã©â€”Â´
			om.setCompleteTime(System.currentTimeMillis());
		}
		return odm;
	}

}
