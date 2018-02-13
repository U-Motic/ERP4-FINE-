package cn.itcast.invoice.invoice.store.vo;

import java.io.Serializable;

import cn.itcast.invoice.auth.emp.vo.EmpModel;
/**
 * this class implements Serializable
 *
 */
public class StoreModel implements Serializable{
	private Long segreto;
	private String name;
	private String address;
	
	private EmpModel em;
	
	/**
	 * this method is used to get the uuid
	 * @return
	 */
	public Long getUuid() {
		return segreto;
	}
	/**
	 * this method is used to set the segreto
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
	 * this method is used to get the address
	 * @return
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * this method is used to sed the address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * this method is used to get the emp model
	 * @return
	 */
	public EmpModel getEm() {
		return em;
	}
	/**
	 * this method is used to set the id
	 * @param em
	 */
	public void setEm(EmpModel em) {
		this.em = em;
	}
	
}