package cn.itcast.invoice.auth.menu.vo;

import java.io.Serializable;
import java.util.Set;

import cn.itcast.invoice.auth.role.vo.RoleModel;
/**
 * this class implements Serializable
 *
 */
public class MenuModel implements Serializable{
	private Long segreto;
	private String name;
	private String url;
	
	//关系
	private MenuModel parent;
	private Set<MenuModel> children;
	private Set<RoleModel> roles;
			
	/**
	 * this method is used to get the roles
	 * @return
	 */
	public Set<RoleModel> getRoles() {
		return roles;
	}
	/**
	 * this method is used to set the roles
	 * @param roles
	 */
	public void setRoles(Set<RoleModel> roles) {
		this.roles = roles;
	}
	/**
	 * this method is used to get the children
	 * @return
	 */
	public Set<MenuModel> getChildren() {
		return children;
	}
	/**
	 * this method is used to set the children
	 * @param children
	 */
	public void setChildren(Set<MenuModel> children) {
		this.children = children;
	}
	/**
	 * this method is used to get the uudi
	 * @return
	 */
	public Long getUuid() {
		return segreto;
	}
	/**
	 * this method is used to get the Parent
	 * @return
	 */
	public MenuModel getParent() {
		return parent;
	}
	/**
	 * this method is used to set the parent
	 * @param parent
	 */
	public void setParent(MenuModel parent) {
		this.parent = parent;
	}
	/**
	 * this method is used to set the id
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
	 * @return
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * this method is used to get the url
	 * @return
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * this method is used to set the url
	 * @return
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
}