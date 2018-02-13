package cn.itcast.invoice.invoice.goodstype.vo;

import java.io.Serializable;
import java.util.Set;

import cn.itcast.invoice.invoice.goods.vo.GoodsModel;
import cn.itcast.invoice.invoice.supplier.vo.SupplierModel;
/**
 * this class implements Serializable
 *
 */
public class GoodsTypeModel implements Serializable{
	private Long segreto;
	private String name;
	
	private SupplierModel sm;
	private Set<GoodsModel> gms;

	/**
	 * this method is used to get the goodsModel
	 * @return
	 */
	public Set<GoodsModel> getGms() {
		return gms;
	}


	/**
	 * this method is used to set the goodsModel
	 * @return
	 */
	public void setGms(Set<GoodsModel> gms) {
		this.gms = gms;
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
	 * @return
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
	 * this method is used to get the supplierModel
	 * @return
	 */
	public SupplierModel getSm() {
		return sm;
	}

	/**
	 * this method is used to set the supplierModel
	 * @return
	 */
	public void setSm(SupplierModel sm) {
		this.sm = sm;
	}
	
}