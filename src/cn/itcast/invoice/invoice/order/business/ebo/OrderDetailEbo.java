package cn.itcast.invoice.invoice.order.business.ebo;

import java.io.Serializable;
import java.util.List;

import cn.itcast.invoice.invoice.order.business.ebi.OrderDetailEbi;
import cn.itcast.invoice.invoice.order.dao.dao.OrderDetailDao;
import cn.itcast.invoice.invoice.order.vo.OrderDetailModel;
import cn.itcast.invoice.util.base.BaseQueryModel;
/**
 * this class implements OrderDetailEbi
 *
 */
public class OrderDetailEbo implements OrderDetailEbi{
	private OrderDetailDao orderDetailDao;
	/**
	 * this method is used to set the order detail dao
	 * @param orderDetailDao
	 */
	public void setOrderDetailDao(OrderDetailDao orderDetailDao) {
		this.orderDetailDao = orderDetailDao;
	}

	/**
	 * this method is used to save the order detail model
	 */
	public void save(OrderDetailModel om) {
		orderDetailDao.save(om);
	}

	/**
	 * this method is used to delete the order detail model
	 */
	public void delete(OrderDetailModel om) {
		orderDetailDao.delete(om);
	}

	/**
	 * this method is used to update the order detail model
	 */
	public void update(OrderDetailModel om) {
		orderDetailDao.update(om);
	}

	/**
	 * this method is used to get the uuid of the order detail model
	 */
	public OrderDetailModel get(Serializable uuid) {
		return orderDetailDao.get(uuid);
	}
	/**
	 * this method is used to get all the order detail model
	 */
	public List<OrderDetailModel> getAll() {
		return orderDetailDao.getAll();
	}

	/**
	 * this method is used to get all the order detail model
	 */
	public List<OrderDetailModel> getAll(BaseQueryModel qm, Integer pageNum,Integer pageCount) {
		return orderDetailDao.getAll(qm,pageNum,pageCount);
	}

	/**
	 * this method is used to get the count
	 */
	public Integer getCount(BaseQueryModel qm) {
		return orderDetailDao.getCount(qm);
	}

}
