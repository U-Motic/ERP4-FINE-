package cn.itcast.invoice.invoice.order.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.itcast.invoice.invoice.order.dao.dao.OrderDetailDao;
import cn.itcast.invoice.invoice.order.vo.OrderDetailModel;
import cn.itcast.invoice.invoice.order.vo.OrderDetailQueryModel;
import cn.itcast.invoice.util.base.BaseDaoImpl;
import cn.itcast.invoice.util.base.BaseQueryModel;
/**
 * this class implements OrderDetailDao and extends BaseDaoImpl<OrderDetailModel>
 *
 */
public class OrderDetailDaoImpl extends BaseDaoImpl<OrderDetailModel> implements OrderDetailDao{
	/**
	 * this method is used to do the qbc
	 */
	public void doQbc(DetachedCriteria dc,BaseQueryModel qm){
		OrderDetailQueryModel oqm = (OrderDetailQueryModel) qm;
		//TODO 添加自定义查询规则
	}
}
