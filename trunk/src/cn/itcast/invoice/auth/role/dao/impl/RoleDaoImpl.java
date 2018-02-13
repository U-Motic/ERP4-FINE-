package cn.itcast.invoice.auth.role.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.itcast.invoice.auth.role.dao.dao.RoleDao;
import cn.itcast.invoice.auth.role.vo.RoleModel;
import cn.itcast.invoice.auth.role.vo.RoleQueryModel;
import cn.itcast.invoice.util.base.BaseDaoImpl;
import cn.itcast.invoice.util.base.BaseQueryModel;
/**
 * this class implements RoleDao and extends BaseDaoImpl<RoleModel>
 *
 */
public class RoleDaoImpl extends BaseDaoImpl<RoleModel> implements RoleDao{
	/**
	 * this method is used to do the the qbc
	 */
	public void doQbc(DetachedCriteria dc,BaseQueryModel qm){
		RoleQueryModel rqm = (RoleQueryModel) qm;
		//TODO 添加自定义查询规则
	}
}
