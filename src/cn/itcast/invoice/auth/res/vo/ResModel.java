package cn.itcast.invoice.auth.res.vo;

import java.io.Serializable;
import java.util.Set;

import cn.itcast.invoice.auth.role.vo.RoleModel;
/**
 * this class implements Serializable
 *
 */
public class ResModel implements Serializable{
	private Long segreto;
	private String name;
	//action访问路径
	private String url;
	
	//角色
	private Set<RoleModel> roles;
	
	/**
	 * this method is uset to get the roles
	 * @return
	 */
	public Set<RoleModel> getRoles() {
		return roles;
	}
	/**
	 * this method is used to set the rolse
	 * @param roles
	 */
	public void setRoles(Set<RoleModel> roles) {
		this.roles = roles;
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
	/**
	 * this method is used to get the Url
	 * @return
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * this method is used to set the url
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
}