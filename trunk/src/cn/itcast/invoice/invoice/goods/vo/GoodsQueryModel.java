package cn.itcast.invoice.invoice.goods.vo;

import cn.itcast.invoice.util.base.BaseQueryModel;
/**
 * this class implementsBaseQueryModel and extends GoodsModel
 *
 */
public class GoodsQueryModel extends GoodsModel implements BaseQueryModel{
	private Double inPrice2;
	private Double outPrice2;
	/**
	 * this method is used to get the initial price 2
	 * @return
	 */
	public Double getInPrice2() {
		return inPrice2;
	}
	/**
	 * this method is used to set the initial price 2
	 * @return
	 */
	public void setInPrice2(Double inPrice2) {
		this.inPrice2 = inPrice2;
	}
	/**
	 * this method is used to get the out price 2
	 * @return
	 */
	public Double getOutPrice2() {
		return outPrice2;
	}
	/**
	 * this method is used to get the initial price 2
	 * @return
	 */
	public void setOutPrice2(Double outPrice2) {
		this.outPrice2 = outPrice2;
	}
	
}
