package cn.itcast.invoice.invoice.storeoper.business.ebo;

import java.io.Serializable;
import java.util.List;

import cn.itcast.invoice.invoice.storeoper.business.ebi.StoreOperEbi;
import cn.itcast.invoice.invoice.storeoper.dao.dao.StoreOperDao;
import cn.itcast.invoice.invoice.storeoper.vo.StoreOperModel;
import cn.itcast.invoice.util.base.BaseQueryModel;
/**
 * this class implements StoreOperEbi
 *
 */
public class StoreOperEbo implements StoreOperEbi{
	private StoreOperDao storeOperDao;
	/**
	 * this method is used to get the store oper dao
	 * @param storeOperDao
	 */
	public void setStoreOperDao(StoreOperDao storeOperDao) {
		this.storeOperDao = storeOperDao;
	}

	/**
	 * this method is used to save the store model oper
	 */
	public void save(StoreOperModel sm) {
		storeOperDao.save(sm);
	}

	/**
	 * this method is used to delete the store model oper
	 */
	public void delete(StoreOperModel sm) {
		storeOperDao.delete(sm);
	}

	/**
	 * this method is used to update the store model oper
	 */
	public void update(StoreOperModel sm) {
		storeOperDao.update(sm);
	}


	/**
	 * this method is used to save the get the uuid
	 */
	public StoreOperModel get(Serializable uuid) {
		return storeOperDao.get(uuid);
	}

	/**
	 * this method is used to get all the store oper model
	 */
	public List<StoreOperModel> getAll() {
		return storeOperDao.getAll();
	}

	/**
	 * this method is used to get all the store oper model
	 */
	public List<StoreOperModel> getAll(BaseQueryModel qm, Integer pageNum,Integer pageCount) {
		return storeOperDao.getAll(qm,pageNum,pageCount);
	}

	/**
	 * this method is used to get the count
	 */
	public Integer getCount(BaseQueryModel qm) {
		return storeOperDao.getCount(qm);
	}

}
