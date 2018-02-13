package cn.itcast.invoice.invoice.storedetail.business.ebo;

import java.io.Serializable;
import java.util.List;

import cn.itcast.invoice.invoice.storedetail.business.ebi.StoreDetailEbi;
import cn.itcast.invoice.invoice.storedetail.dao.dao.StoreDetailDao;
import cn.itcast.invoice.invoice.storedetail.vo.StoreDetailModel;
import cn.itcast.invoice.util.base.BaseQueryModel;
/**
 * this class implements StoreDetailEbi
 *
 */
public class StoreDetailEbo implements StoreDetailEbi{
	private StoreDetailDao storeDetailDao;
	/**
	 * this method is used to set the store detail dao
	 * @param storeDetailDao
	 */
	public void setStoreDetailDao(StoreDetailDao storeDetailDao) {
		this.storeDetailDao = storeDetailDao;
	}

	/**
	 * this method is used to save the store detail model
	 */
	public void save(StoreDetailModel sm) {
		storeDetailDao.save(sm);
	}

	/**
	 * this method is used to delete the store detail model
	 */
	public void delete(StoreDetailModel sm) {
		storeDetailDao.delete(sm);
	}

	/**
	 * this method is used to update the store detail model
	 */
	public void update(StoreDetailModel sm) {
		storeDetailDao.update(sm);
	}

	/**
	 * this method is used to get the uuid
	 */
	public StoreDetailModel get(Serializable uuid) {
		return storeDetailDao.get(uuid);
	}

	/**
	 * this method is used to get all the store detail model
	 */
	public List<StoreDetailModel> getAll() {
		return storeDetailDao.getAll();
	}
	/**
	 * this method is used to get all the store detail model
	 */
	public List<StoreDetailModel> getAll(BaseQueryModel qm, Integer pageNum,Integer pageCount) {
		return storeDetailDao.getAll(qm,pageNum,pageCount);
	}

	/**
	 * this method is used to get the count
	 */
	public Integer getCount(BaseQueryModel qm) {
		return storeDetailDao.getCount(qm);
	}

}
