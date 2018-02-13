package cn.itcast.invoice.invoice.bill.vo;

import cn.itcast.invoice.util.format.FormatUtil;
/**
 * this class is the model for the Bills queries
 *
 */

public class BillQueryModel{
	private Integer type;
	private Long supplierUuid;
	private Long begin;
	private Long end;
	private Long goodsUuid;
	
	private String beginView;
	private String endView;
	/**
	 * this method is used to get the begin view
	 * @return
	 */
	public String getBeginView() {
		return beginView;
	}
	/**
	 * this method is used to get the end view
	 * @return
	 */
	public String getEndView() {
		return endView;
	}
	/**
	 * this method is used to get the type
	 * @return
	 */
	public Integer getType() {
		return type;
	}
	/**
	 * this method is used to get the type
	 * @return
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * this method is used to get the supplier uuid
	 * @return
	 */
	public Long getSupplierUuid() {
		return supplierUuid;
	}
	/**
	 * this method is used to set the supplier uuid
	 * @return
	 */
	public void setSupplierUuid(Long supplierUuid) {
		this.supplierUuid = supplierUuid;
	}
	/**
	 * this method is used to get the goods uuid
	 * @return
	 */
	public Long getGoodsUuid() {
		return goodsUuid;
	}
	/**
	 * this method is used to set the goods uuid
	 * @param goodsUuid
	 */
	public void setGoodsUuid(Long goodsUuid) {
		this.goodsUuid = goodsUuid;
	}
	/**
	 * this method is used to get the begin
	 * @return
	 */
	public Long getBegin() {
		return begin;
	}
	/**
	 * this method is used to set the begin
	 * @return
	 */
	public void setBegin(Long begin) {
		this.begin = begin;
		this.beginView = FormatUtil.formatDate(begin);
	}
	/**
	 * this method is used to get the end
	 * @return
	 */
	public Long getEnd() {
		return end;
	}
	/**
	 * this method is used to set the end
	 * @return
	 */
	public void setEnd(Long end) {
		this.end = end;
		this.endView = FormatUtil.formatDate(end);
	}
	
}
