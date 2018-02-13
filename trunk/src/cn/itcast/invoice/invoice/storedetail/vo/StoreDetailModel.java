package cn.itcast.invoice.invoice.storedetail.vo;

import java.io.Serializable;

import cn.itcast.invoice.invoice.goods.vo.GoodsModel;
import cn.itcast.invoice.invoice.store.vo.StoreModel;
/**
 * this class implements Serializable
 *
 */
public class StoreDetailModel implements Serializable{
	private Long segreto;
	
	private Integer num;
	
	private GoodsModel gm;
	private StoreModel sm;
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
	 * this method is used to get the num
	 * @return
	 */
	public Integer getNum() {
		return num;
	}
	/**
	 * this method is used to set the num
	 * @return
	 */
	public void setNum(Integer num) {
		this.num = num;
	}
	/**
	 * this method is used to get the goods model
	 * @return
	 */
	public GoodsModel getGm() {
		return gm;
	}
	/**
	 * this method is used to set the goods model
	 * @return
	 */
	public void setGm(GoodsModel gm) {
		this.gm = gm;
	}
	/**
	 * this method is used to get the store model
	 * @return
	 */
	public StoreModel getSm() {
		return sm;
	}
	/**
	 * this method is used to set the store model
	 * @return
	 */
	public void setSm(StoreModel sm) {
		this.sm = sm;
	}
	
}