package cn.itcast.invoice.invoice.goodstype.business.ebo;

import java.io.Serializable;
import java.util.List;

import cn.itcast.invoice.invoice.goodstype.business.ebi.GoodsTypeEbi;
import cn.itcast.invoice.invoice.goodstype.dao.dao.GoodsTypeDao;
import cn.itcast.invoice.invoice.goodstype.vo.GoodsTypeModel;
import cn.itcast.invoice.util.base.BaseQueryModel;
/**
 * this class implements GoodsTypeEbi
 *
 */
public class GoodsTypeEbo implements GoodsTypeEbi{
	private GoodsTypeDao goodsTypeDao;
	/**
	 * this method is used to set the goodstype dao
	 * @param goodsTypeDao
	 */
	public void setGoodsTypeDao(GoodsTypeDao goodsTypeDao) {
		this.goodsTypeDao = goodsTypeDao;
	}

	/**
	 * this method is used to save the goodstype model
	 */
	public void save(GoodsTypeModel gm) {
		goodsTypeDao.save(gm);
	}

	/**
	 * this method is used to delete the goodstype model
	 */
	public void delete(GoodsTypeModel gm) {
		goodsTypeDao.delete(gm);
	}

	/**
	 * this method is used to update the goodstype model
	 */
	public void update(GoodsTypeModel gm) {
		goodsTypeDao.update(gm);
	}

	/**
	 * this method is used to get the goodstype model
	 */
	public GoodsTypeModel get(Serializable uuid) {
		return goodsTypeDao.get(uuid);
	}

	/**
	 * this method is used to get all the goodstypemodel
	 */
	public List<GoodsTypeModel> getAll() {
		return goodsTypeDao.getAll();
	}
	/**
	 * this method is used to get all the goodstypemodel
	 */
	public List<GoodsTypeModel> getAll(BaseQueryModel qm, Integer pageNum,Integer pageCount) {
		return goodsTypeDao.getAll(qm,pageNum,pageCount);
	}
	/**
	 * this method is used to get the count
	 */
	public Integer getCount(BaseQueryModel qm) {
		return goodsTypeDao.getCount(qm);
	}
	/**
	 * this method is used to get all the goodstypemodel by supplier
	 */
	public List<GoodsTypeModel> getAllBySupplier(Long supplierUuid) {
		return goodsTypeDao.getAllBySupUuid(supplierUuid);
	}

	/**
	 * this method is used to get all the union by supplier
	 */
	public List<GoodsTypeModel> getAllUnionBySupplier(Long uuid) {
		return goodsTypeDao.getAllUnionBySupplier(uuid);
	}

}
