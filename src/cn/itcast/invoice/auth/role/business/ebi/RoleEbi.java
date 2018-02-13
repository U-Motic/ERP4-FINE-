package cn.itcast.invoice.auth.role.business.ebi;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.invoice.auth.role.vo.RoleModel;
import cn.itcast.invoice.util.base.BaseEbi;

/**
 * this interface extends BaseEbi<RoleModel>
 *
 */
@Transactional
public interface RoleEbi extends BaseEbi<RoleModel> {

	/**
	 * this methond save the rolemodel
	 * @param rm
	 * @param resUuids
	 * @param menuUuids
	 */
	public void save(RoleModel rm, Long[] resUuids, Long[] menuUuids);

	/**
	 * this method update the rolemodel
	 * @param rm
	 * @param resUuids
	 * @param menuUuids
	 */
	public void update(RoleModel rm, Long[] resUuids, Long[] menuUuids);
}
