package cn.itcast.invoice.invoice.goods.business.ebo;

import java.io.Serializable;
import java.util.List;

import cn.itcast.invoice.invoice.goods.business.ebi.GoodsEbi;
import cn.itcast.invoice.invoice.goods.dao.dao.GoodsDao;
import cn.itcast.invoice.invoice.goods.vo.GoodsModel;
import cn.itcast.invoice.util.base.BaseQueryModel;
/**
 * this class implements GoodsEbi
 *
 */
public class GoodsEbo implements GoodsEbi{
	private GoodsDao goodsDao;
	/**
	 * this method is used to set the goods dao
	 * @param goodsDao
	 */
	public void setGoodsDao(GoodsDao goodsDao) {
		this.goodsDao = goodsDao;
	}

	/**
	 * this method is used to save the goodsModel
	 */
	public void save(GoodsModel gm) {
		gm.setUseNum(0);
		goodsDao.save(gm);
	}

	/**
	 * this method is used to delete the goodsModel
	 */
	public void delete(GoodsModel gm) {
		goodsDao.delete(gm);
	}

	/**
	 * this method is used to update the goodsModel
	 */
	public void update(GoodsModel gm) {
		//快照更新
		goodsDao.update(gm);
	}

	/**
	 * this method is used to get the uuid
	 */
	public GoodsModel get(Serializable uuid) {
		return goodsDao.get(uuid);
	}

	/**
	 * this method is used to get all the goodsmodel
	 */
	public List<GoodsModel> getAll() {
		return goodsDao.getAll();
	}

	/**
	 * this method is used to get all the goodsmodel
	 */
	public List<GoodsModel> getAll(BaseQueryModel qm, Integer pageNum,Integer pageCount) {
		return goodsDao.getAll(qm,pageNum,pageCount);
	}

	/**
	 * this method is used to get the count
	 */
	public Integer getCount(BaseQueryModel qm) {
		return goodsDao.getCount(qm);
	}

	/**
	 * this method is used to get all the goodsmodel by uuid
	 */
	public List<GoodsModel> getAllByGtmUuid(Long gtmUuid) {
		return goodsDao.getAllByGtmUuid(gtmUuid);
	}

}
