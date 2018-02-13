package cn.itcast.invoice.invoice.goodstype.dao.dao;

import java.util.List;

import cn.itcast.invoice.invoice.goodstype.vo.GoodsTypeModel;
import cn.itcast.invoice.util.base.BaseDao;
/**
 * this interface extends BaseDao<GoodsTypeModel>
 *
 */
public interface GoodsTypeDao extends BaseDao<GoodsTypeModel> {

	/**
	 * this method gives you all by uuid
	 * @param supplierUuid
	 * @return
	 */
	public List<GoodsTypeModel> getAllBySupUuid(Long supplierUuid);

	/**
	 * this method gives you all union by supplier
	 * @param uuid
	 * @return
	 */
	public List<GoodsTypeModel> getAllUnionBySupplier(Long uuid);
}
