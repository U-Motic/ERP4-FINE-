package cn.itcast.invoice.auth.dep.vo;

import java.io.Serializable;


/**
 * this class implements Serializable
 *
 */
public class DepModel implements Serializable{
	private Long segreto;
	
	private String name;
	
	private String tele;
	/**
	 * this method is used to get the id
	 * @return
	 */
	public Long getUuid() {
		return segreto;
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
	 * this method is used to get the tele
	 * @return
	 */
	public String getTele() {
		return tele;
	}
	/**
	 * this method is used to set the tele
	 * @return
	 */
	public void setTele(String tele) {
		this.tele = tele;
	}
	
}