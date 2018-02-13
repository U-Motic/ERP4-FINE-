package cn.itcast.invoice.invoice.goods.vo;

import java.io.Serializable;

import cn.itcast.invoice.invoice.goodstype.vo.GoodsTypeModel;
import cn.itcast.invoice.util.format.FormatUtil;
/**
 * this class implements Serializable
 *
 */
public class GoodsModel implements Serializable{
	private Long segreto;
	
	private String name;
	private String origin;
	private String producer;
	private String unit;
	private Integer useNum;
	private Integer maxNum;
	private Integer minNum;
	
	private Double inPrice;
	private Double outPrice;
	
	private String inPriceView;
	private String outPriceView;
	
	//关系
	private GoodsTypeModel gtm;
	/**
	 * this model is used to get the price View
	 * @return
	 */
	public String getInPriceView() {
		return inPriceView;
	}
	
	/**
	 * this model is used to get the max num
	 * @return
	 */
	public Integer getMaxNum() {
		return maxNum;
	}

	/**
	 * this model is used to set the max num
	 * @return
	 */
	public void setMaxNum(Integer maxNum) {
		this.maxNum = maxNum;
	}

	/**
	 * this model is used to get the min num
	 * @return
	 */
	public Integer getMinNum() {
		return minNum;
	}


	/**
	 * this model is used to set the min num
	 * @return
	 */
	public void setMinNum(Integer minNum) {
		this.minNum = minNum;
	}


	/**
	 * this model is used to get the price View
	 * @return
	 */
	public String getOutPriceView() {
		return outPriceView;
	}

	/**
	 * this model is used to get the use num
	 * @return
	 */
	public Integer getUseNum() {
		return useNum;
	}
	/**
	 * this model is used to get set the usenum
	 * @return
	 */
	public void setUseNum(Integer useNum) {
		this.useNum = useNum;
	}

	/**
	 * this model is used to get the uuid
	 * @return
	 */
	public Long getUuid() {
		return segreto;
	}

	/**
	 * this model is used to set the uuid
	 * @return
	 */
	public void setSegreto(Long segreto) {
		this.segreto = segreto;
	}

	/**
	 * this model is used to get the name
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * this model is used to set the name
	 * @return
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * this model is used to get origin
	 * @return
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * this model is used to set the origin
	 * @return
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * this model is used to get the producer
	 * @return
	 */
	public String getProducer() {
		return producer;
	}

	/**
	 * this model is used to set the producer
	 * @return
	 */
	public void setProducer(String producer) {
		this.producer = producer;
	}

	/**
	 * this model is used to get the unit
	 * @return
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * this model is used to set the unit
	 * @return
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * this model is used to get initial price
	 * @return
	 */
	public Double getInPrice() {
		return inPrice;
	}

	/**
	 * this model is used to set initial price
	 * @return
	 */
	public void setInPrice(Double inPrice) {
		this.inPrice = inPrice;
		this.inPriceView = FormatUtil.formatMoney(inPrice);
	}

	/**
	 * this model is used to get out price
	 * @return
	 */
	public Double getOutPrice() {
		return outPrice;
	}

	/**
	 * this model is used to set out price
	 * @return
	 */
	public void setOutPrice(Double outPrice) {
		this.outPrice = outPrice;
		this.outPriceView = FormatUtil.formatMoney(outPrice);
	}

	/**
	 * this model is used to get good type model
	 * @return
	 */
	public GoodsTypeModel getGtm() {
		return gtm;
	}

	/**
	 * this model is used to set the good type model
	 * @return
	 */
	public void setGtm(GoodsTypeModel gtm) {
		this.gtm = gtm;
	}
	
}