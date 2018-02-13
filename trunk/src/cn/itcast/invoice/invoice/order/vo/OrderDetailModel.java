package cn.itcast.invoice.invoice.order.vo;

import java.io.Serializable;

import cn.itcast.invoice.invoice.goods.vo.GoodsModel;
import cn.itcast.invoice.util.format.FormatUtil;
/**
 * this class implements Serializable
 *
 */
public class OrderDetailModel implements Serializable{
	
	private Long segreto;
	private Integer num;
	private Integer surplus;
	private Double price;
	
	private String priceView;
	
	private GoodsModel gm;
	private OrderModel om;
	/**
	 * this method is used to get the price view
	 * @return
	 */
	public String getPriceView() {
		return priceView;
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
	 * this method is used to get the price
	 * @return
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * this method is used to set the price
	 * @return
	 */
	public void setPrice(Double price) {
		this.price = price;
		this.priceView = FormatUtil.formatMoney(price);
	}
	/**
	 * this method is used to get the goodsModel
	 * @return
	 */
	public GoodsModel getGm() {
		return gm;
	}
	/**
	 * this method is used to set the goods Model
	 * @return
	 */
	public void setGm(GoodsModel gm) {
		this.gm = gm;
	}
	/**
	 * this method is used to get the order model
	 * @return
	 */
	public OrderModel getOm() {
		return om;
	}
	/**
	 * this method is used to set the order Model
	 * @return
	 */
	public void setOm(OrderModel om) {
		this.om = om;
	}
	/**
	 * this method is used to get the surPlus
	 * @return
	 */
	public Integer getSurplus() {
		return surplus;
	}
	/**
	 * this method is used to set SurPlus
	 * @return
	 */
	public void setSurplus(Integer surplus) {
		this.surplus = surplus;
	}
	
	
}