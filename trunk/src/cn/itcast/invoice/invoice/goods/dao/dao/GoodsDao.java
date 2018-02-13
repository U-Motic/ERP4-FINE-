package cn.itcast.invoice.invoice.goods.dao.dao;

import java.util.List;

import cn.itcast.invoice.invoice.goods.vo.GoodsModel;
import cn.itcast.invoice.util.base.BaseDao;
/**
 * this interface extends BaseDao<GoodsModel>
 *
 */
public interface GoodsDao extends BaseDao<GoodsModel> {

	/**
	 * this method gives you all bu uuid
	 * @param gtmUuid
	 * @return
	 */
	public List<GoodsModel> getAllByGtmUuid(Long gtmUuid);

	/**
	 * this method update use num
	 */
	public void updateUseNum();

	/**
	 * this method gives you store warn info
	 * @return
	 */
	public List<Object[]> getStoreWarnInfo();
}
