package cn.itcast.invoice.invoice.storedetail.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.itcast.invoice.invoice.storedetail.dao.dao.StoreDetailDao;
import cn.itcast.invoice.invoice.storedetail.vo.StoreDetailModel;
import cn.itcast.invoice.invoice.storedetail.vo.StoreDetailQueryModel;
import cn.itcast.invoice.util.base.BaseDaoImpl;
import cn.itcast.invoice.util.base.BaseQueryModel;
/**
 * this class implements StoreDetailDao and extends BaseDaoImpl<StoreDetailModel>
 *
 */
public class StoreDetailDaoImpl extends BaseDaoImpl<StoreDetailModel> implements StoreDetailDao{
	/**
	 * this method is used to do the qbc
	 */
	public void doQbc(DetachedCriteria dc,BaseQueryModel qm){
		StoreDetailQueryModel sqm = (StoreDetailQueryModel) qm;
		//TODO 添加自定义查询规则
	}

	/**
	 * this method is used to get the store detail model by the uuid
	 */
	public StoreDetailModel getBySmAndGm(Long storeUuid, Long goodsUuid) {
		String hql = "from StoreDetailModel where sm.uuid = ? and gm.uuid = ?";
		List<StoreDetailModel> temp = this.getHibernateTemplate().find(hql,storeUuid,goodsUuid);
		return temp.size()>0 ? temp.get(0) : null;
	}
}
