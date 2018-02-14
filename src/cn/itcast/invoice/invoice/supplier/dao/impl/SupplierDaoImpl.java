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
	public void doQbc(DetachedCriteria dc,BaseQueryModel qm){
		SupplierQueryModel sqm = (SupplierQueryModel) qm;
		
		control1(sqm,dc);

		control2(sqm,dc);

		control3(sqm,dc);

		control4(sqm,dc);
		
		
	}

	public void control1(SupplierQueryModel sqm,DetachedCriteria dc) {
		if(sqm.getName()!=null && sqm.getName().trim().length()>0){
			final String rep="%"+sqm.getName().trim()+"%";
			dc.add(Restrictions.like("name", rep));
		}
	}
	
	public void control2(SupplierQueryModel sqm,DetachedCriteria dc) {
		if(sqm.getContact()!=null && sqm.getContact().trim().length()>0){
			final String rep="%"+sqm.getContact().trim()+"%";
			dc.add(Restrictions.like("contact", rep));
		}
		
	}
	 
	public void control3(SupplierQueryModel sqm,DetachedCriteria dc) {
		if(sqm.getTele()!=null && sqm.getTele().trim().length()>0){
			final String rep="%"+sqm.getTele().trim()+"%";
			dc.add(Restrictions.like("tele", rep));
		}
		
	}
	
	
	public void control4(SupplierQueryModel sqm,DetachedCriteria dc) {
		if(sqm.getNeeds()!=null && sqm.getNeeds()!= -1){
			dc.add(Restrictions.eq("needs", sqm.getNeeds()));
		}
		
	}
	
	
	public List<SupplierModel> getAllUnion() {
		//Ã¨Å½Â·Ã¥ï¿½â€“Ã¦â€°â‚¬Ã¦Å“â€°Ã¤Â¸Å½Ã¥â€¢â€ Ã¥â€œï¿½Ã§Â±Â»Ã¥Ë†Â«Ã¥â€¦Â·Ã¦Å“â€°Ã¥â€¦Â³Ã¨ï¿½â€�Ã¦â€¢Â°Ã¦ï¿½Â®Ã§Å¡â€žÃ¤Â¾â€ºÃ¥Âºâ€�Ã¥â€¢â€ Ã¤Â¿Â¡Ã¦ï¿½Â¯
		String hql = "select distinct sm from SupplierModel sm join sm.gtms";
		return this.getHibernateTemplate().find(hql);
	}

	public List<SupplierModel> getAllUnionTwo() {
		String hql = "select distinct sm from SupplierModel sm join sm.gtms gtm join gtm.gms";
		return this.getHibernateTemplate().find(hql);
	}
	
}
