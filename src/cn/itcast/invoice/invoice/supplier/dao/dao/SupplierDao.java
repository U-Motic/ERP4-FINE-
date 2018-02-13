package cn.itcast.invoice.invoice.supplier.dao.dao;

import java.util.List;

import cn.itcast.invoice.invoice.supplier.vo.SupplierModel;
import cn.itcast.invoice.util.base.BaseDao;
/**
 * this interface extends BaseDao<SupplierModel>
 *
 */
public interface SupplierDao extends BaseDao<SupplierModel> {

	/**
	 * this method gives you all union
	 * @return
	 */
	public List<SupplierModel> getAllUnion();

	/**
	 * this method gives you all union two
	 * @return
	 */
	public List<SupplierModel> getAllUnionTwo();
}
