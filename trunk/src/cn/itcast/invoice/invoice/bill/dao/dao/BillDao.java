package cn.itcast.invoice.invoice.bill.dao.dao;

import java.util.List;

import cn.itcast.invoice.invoice.bill.vo.BillQueryModel;
import cn.itcast.invoice.invoice.order.vo.OrderDetailModel;

/**
 * this interface is the model for the dao Bill
 *
 */
public interface BillDao  {

	/**
	 * this method gives you bill by boods
	 * @param bqm
	 * @return
	 */
	public List<Object[]> getBillByGoods(BillQueryModel bqm);

	/**
	 * this method gives you bill details by goods
	 * @param bqm
	 * @return
	 */
	public List<OrderDetailModel> getBillDetailByGoods(BillQueryModel bqm);
}
