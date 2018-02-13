package cn.itcast.invoice.auth.role.vo;

import java.io.Serializable;
import java.util.Set;

import cn.itcast.invoice.auth.emp.vo.EmpModel;
import cn.itcast.invoice.auth.menu.vo.MenuModel;
import cn.itcast.invoice.auth.res.vo.ResModel;
/**
 * this class implements Serializable
 *
 */
public class RoleModel implements Serializable{
	private Long segreto;
	private String name;
	
	//关系
	private Set<ResModel> reses;
	private Set<EmpModel> emps;
	private Set<MenuModel> menus;
	
	/**
	 * this method is used to get the menus
	 * @return
	 */
	public Set<MenuModel> getMenus() {
		return menus;
	}
	/**
	 * this method is used to set the menus
	 * @param menus
	 */
	public void setMenus(Set<MenuModel> menus) {
		this.menus = menus;
	}
	/**
	 * this method is used to get the emps
	 * @return
	 */
	public Set<EmpModel> getEmps() {
		return emps;
	}
	/**
	 * this method is used to set the emps
	 * @param emps
	 */
	public void setEmps(Set<EmpModel> emps) {
		this.emps = emps;
	}
	/**
	 * this method is used to get the reses
	 * @return
	 */
	public Set<ResModel> getReses() {
		return reses;
	}
	/**
	 * this method is used to set the reses
	 * @param reses
	 */
	public void setReses(Set<ResModel> reses) {
		this.reses = reses;
	}
	/**
	 * this method is used to get the uuid
	 * @return
	 */
	public Long getUuid() {
		return segreto;
	}
	/**
	 * this method is used to set the uuid
	 * @param segreto
	 */
	public void setSegreto(Long segreto) {
		this.segreto = segreto;
	}
	/**
	 * this method is used to get the name
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * this method is used to set the name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}