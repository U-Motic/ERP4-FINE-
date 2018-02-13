package cn.itcast.invoice.auth.menu.dao.dao;

import java.util.List;

import cn.itcast.invoice.auth.menu.vo.MenuModel;
import cn.itcast.invoice.util.base.BaseDao;
/**
 * this interface extends BaseDao<MenuModel>
 *
 */
public interface MenuDao extends BaseDao<MenuModel> {

	/**
	 * this method gives you the meny bu uuid
	 * @return
	 */
	public List<MenuModel> getByUuidAndPuuidIsOne();

	/**
	 * this method gives you the meny bu uuid
	 * @return
	 */
	public List<MenuModel> getByPuuidIsOne();
	/**
	 * this method gives you the meny bu uuid
	 * @return
	 */
	public List<MenuModel> getByPuuid(Long puuid);
	/**
	 * this method gives you the meny bu uuid
	 * @return
	 */
	public List<MenuModel> getParentByEmpUuid(Long uuid);
	/**
	 * this method gives you the meny bu uuid
	 * @return
	 */
	public List<MenuModel> getMenusByPuuidAndEmp(Long puuid, Long empUuid);
}
