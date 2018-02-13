package cn.itcast.invoice.invoice.supplier.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import cn.itcast.invoice.invoice.supplier.dao.dao.SupplierDao;
import cn.itcast.invoice.invoice.supplier.vo.SupplierModel;
import cn.itcast.invoice.invoice.supplier.vo.SupplierQueryModel;
import cn.itcast.invoice.util.base.BaseDaoImpl;
import cn.itcast.invoice.util.base.BaseQueryModel;
/**
 * this class implements SupplierDao and extends BaseDaoImpl<SupplierModel>
 *
 */
public class SupplierDaoImpl extends BaseDaoImpl<SupplierModel> implements SupplierDao{
	/**
	 * this method is used to do the qbc
	 */
	public void doQbc(DetachedCriteria dc,BaseQueryModel qm){
		SupplierQueryModel sqm = (SupplierQueryModel) qm;
		
		control1(sqm,dc);

		control2(sqm,dc);

		control3(sqm,dc);

		control4(sqm,dc);
		
		
	}

	/**
	 * this metod is used to control 1
	 * @param sqm
	 * @param dc
	 */
	public void control1(SupplierQueryModel sqm,DetachedCriteria dc) {
		if(sqm.getName()!=null && sqm.getName().trim().length()>0){
			dc.add(Restrictions.like("name", "%"+sqm.getName().trim()+"%"));
		}
	}
	

	/**
	 * this metod is used to control 2
	 * @param sqm
	 * @param dc
	 */
	public void control2(SupplierQueryModel sqm,DetachedCriteria dc) {
		if(sqm.getContact()!=null && sqm.getContact().trim().length()>0){
			dc.add(Restrictions.like("contact", "%"+sqm.getContact().trim()+"%"));
		}
		
	}
	 

	/**
	 * this metod is used to control 3
	 * @param sqm
	 * @param dc
	 */
	public void control3(SupplierQueryModel sqm,DetachedCriteria dc) {
		if(sqm.getTele()!=null && sqm.getTele().trim().length()>0){
			dc.add(Restrictions.like("tele", "%"+sqm.getTele().trim()+"%"));
		}
		
	}
	
	/**
	 * this method is used to control 4
	 * @param sqm
	 * @param dc
	 */
	public void control4(SupplierQueryModel sqm,DetachedCriteria dc) {
		if(sqm.getNeeds()!=null && sqm.getNeeds()!= -1){
			dc.add(Restrictions.eq("needs", sqm.getNeeds()));
		}
		
	}
	

	/**
	 * this method is used to get all the union
	 */
	public List<SupplierModel> getAllUnion() {
		//Ã¨Å½Â·Ã¥ï¿½â€“Ã¦â€°â‚¬Ã¦Å“â€°Ã¤Â¸Å½Ã¥â€¢â€ Ã¥â€œï¿½Ã§Â±Â»Ã¥Ë†Â«Ã¥â€¦Â·Ã¦Å“â€°Ã¥â€¦Â³Ã¨ï¿½â€�Ã¦â€¢Â°Ã¦ï¿½Â®Ã§Å¡â€žÃ¤Â¾â€ºÃ¥Âºâ€�Ã¥â€¢â€ Ã¤Â¿Â¡Ã¦ï¿½Â¯
		String hql = "select distinct sm from SupplierModel sm join sm.gtms";
		return this.getHibernateTemplate().find(hql);
	}

	/**
	 * this method is used to get all the union two
	 */
	public List<SupplierModel> getAllUnionTwo() {
		String hql = "select distinct sm from SupplierModel sm join sm.gtms gtm join gtm.gms";
		return this.getHibernateTemplate().find(hql);
	}
	
}
