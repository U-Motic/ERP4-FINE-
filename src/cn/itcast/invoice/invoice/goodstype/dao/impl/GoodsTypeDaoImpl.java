package cn.itcast.invoice.invoice.goodstype.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.itcast.invoice.invoice.goodstype.dao.dao.GoodsTypeDao;
import cn.itcast.invoice.invoice.goodstype.vo.GoodsTypeModel;
import cn.itcast.invoice.invoice.goodstype.vo.GoodsTypeQueryModel;
import cn.itcast.invoice.util.base.BaseDaoImpl;
import cn.itcast.invoice.util.base.BaseQueryModel;
/**
 * this class implements GoodsTypeDao and extends BaseDaoImpl<GoodsTypeModel>
 *
 */
public class GoodsTypeDaoImpl extends BaseDaoImpl<GoodsTypeModel> implements GoodsTypeDao{
	/**
	 * this method is use to do the qbc
	 */
	public void doQbc(DetachedCriteria dc,BaseQueryModel qm){
		GoodsTypeQueryModel gqm = (GoodsTypeQueryModel) qm;
		//TODO 添加自定义查询规则
	}

	/**
	 * this method is used to get all the goodstype model by supplier uuid
	 */
	public List<GoodsTypeModel> getAllBySupUuid(Long supplierUuid) {
		String hql = "from GoodsTypeModel where sm.uuid = ?";
		return this.getHibernateTemplate().find(hql,supplierUuid);
	}

	/**
	 * this method is used to get all the union by supplier uuid
	 */
	public List<GoodsTypeModel> getAllUnionBySupplier(Long uuid) {
		String hql = "select distinct gtm from GoodsTypeModel gtm join gtm.gms where gtm.sm.uuid = ?";
		return this.getHibernateTemplate().find(hql,uuid);
	}
}
