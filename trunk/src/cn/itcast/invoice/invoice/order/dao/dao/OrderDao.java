package cn.itcast.invoice.invoice.order.dao.dao;

import java.util.List;

import cn.itcast.invoice.invoice.order.vo.OrderModel;
import cn.itcast.invoice.invoice.order.vo.OrderQueryModel;
import cn.itcast.invoice.util.base.BaseDao;
/**
 * this interface extends BaseDao<OrderModel>
 *
 */
public interface OrderDao extends BaseDao<OrderModel> {

	/**
	 * this method gives you all by tipes
	 * @param oqm
	 * @param pageNum
	 * @param pageCount
	 * @param types
	 * @return
	 */
	public List<OrderModel> getAllByTypes(OrderQueryModel oqm, Integer pageNum,	Integer pageCount, Integer[] types);

	/**
	 * this method gives you the count by types
	 * @param oqm
	 * @param types
	 * @return
	 */
	public Integer getCountByTypes(OrderQueryModel oqm, Integer[] types);
}
