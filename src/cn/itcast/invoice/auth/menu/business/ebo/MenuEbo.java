package cn.itcast.invoice.auth.menu.business.ebo;

import java.io.Serializable;
import java.util.List;

import cn.itcast.invoice.auth.menu.business.ebi.MenuEbi;
import cn.itcast.invoice.auth.menu.dao.dao.MenuDao;
import cn.itcast.invoice.auth.menu.vo.MenuModel;
import cn.itcast.invoice.util.base.BaseQueryModel;
/**
 * this class implements MenuEbi
 *
 */
public class MenuEbo implements MenuEbi{
	private MenuDao menuDao;
	/**
	 * this method is used to set the menu dao
	 * @param menuDao
	 */
	public void setMenuDao(MenuDao menuDao) {
		this.menuDao = menuDao;
	}

	/**
	 * this method is used to save the menu dao
	 */
	public void save(MenuModel mm) {
		menuDao.save(mm);
	}
	/**
	 * this method is used to delete the menu dao
	 */
	public void delete(MenuModel mm) {
		//Ã©Â¡ÂµÃ©ï¿½Â¢Ã¦â€�Â¶Ã©â€ºâ€ Ã§Å¡â€žÃ¦â€¢Â°Ã¦ï¿½Â®Ã¤Â¸Â­Ã¤Â»â€¦Ã¥Å’â€¦Ã¥ï¿½Â«uuid,Ã¦Â­Â¤Ã¥Â¤â€žÃ¥Ë†Â Ã©â„¢Â¤Ã¤Â¸Å¡Ã¥Å Â¡Ã©Å“â‚¬Ã¨Â¦ï¿½Ã¨Â¿â€ºÃ¨Â¡Å’Ã§ÂºÂ§Ã¨ï¿½â€�Ã¯Â¼Å’Ã¥Â¿â€¦Ã©Â¡Â»Ã¥â€¦Ë†Ã¥Â°â€ Ã¥â€¦Â³Ã¨ï¿½â€�Ã¥â€¦Â³Ã§Â³Â»Ã¦â€¢Â°Ã¦ï¿½Â®Ã¥Å Â Ã¨Â½Â½Ã¤Â¸Å 
		//Ã¥â€ºÂ Ã¦Â­Â¤Ã¥Å“Â¨Ã¥Ë†Â Ã©â„¢Â¤Ã¤Â¹â€¹Ã¥â€°ï¿½Ã¨Â¿â€ºÃ¨Â¡Å’Ã¤Â¸â‚¬Ã¦Â¬Â¡Ã¦Å¸Â¥Ã¨Â¯Â¢Ã¯Â¼Å’Ã¥Å Â Ã¨Â½Â½Ã¥â€¦Â³Ã¨ï¿½â€�Ã¦â€¢Â°Ã¦ï¿½Â®
		mm = menuDao.get(mm.getUuid());
		menuDao.delete(mm);
	}
	/**
	 * this method is used to update the menu dao
	 */
	public void update(MenuModel mm) {
		menuDao.update(mm);
	}

	/**
	 * this method is used to get the uudi
	 */
	public MenuModel get(Serializable uuid) {
		return menuDao.get(uuid);
	}

	/**
	 * this method is used to get all the menu model
	 */
	public List<MenuModel> getAll() {
		return menuDao.getAll();
	}

	/**
	 * this method is used to save the menu dao
	 */
	public List<MenuModel> getAll(BaseQueryModel qm, Integer pageNum,Integer pageCount) {
		return menuDao.getAll(qm,pageNum,pageCount);
	}

	/**
	 * this method is used to save the count
	 */
	public Integer getCount(BaseQueryModel qm) {
		return menuDao.getCount(qm);
	}

	/**
	 * this method is used to get the parent menu
	 */
	public List<MenuModel> getParentMenu() {
		return menuDao.getByUuidAndPuuidIsOne();
	}

	/**
	 * this method is used to get the parent menu 2
	 */
	public List<MenuModel> getParentMenu2() {
		return menuDao.getByPuuidIsOne();
	}

	/**
	 * this method is used to get the menu by Puuid
	 */
	public List<MenuModel> getMenusByPuuid(Long puuid) {
		return menuDao.getByPuuid(puuid);
	}

	/**
	 * this method is used to get the menu by uuid
	 */
	public List<MenuModel> getParentMenuByEmp(Long uuid) {
		return menuDao.getParentByEmpUuid(uuid);
	}

	/**
	 * this method is used to get the menu by Puuid and emp
	 */
	public List<MenuModel> getMenusByPuuidAndEmp(Long puuid, Long empUuid) {
		return menuDao.getMenusByPuuidAndEmp(puuid,empUuid);
	}

}
