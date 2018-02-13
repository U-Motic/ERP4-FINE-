package cn.itcast.invoice.invoice.supplier.business.ebi;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.invoice.invoice.supplier.vo.SupplierModel;
import cn.itcast.invoice.util.base.BaseEbi;
/**
 * this interface extends BaseEbi<SupplierModel>
 *
 */
@Transactional
public interface SupplierEbi extends BaseEbi<SupplierModel> {

	/**
	 * this method gives you all Union
	 * @return
	 */
	public List<SupplierModel> getAllUnion();
	/**
	 * Ã¨Å½Â·Ã¥ï¿½â€“Ã¥â€¦Â·Ã¦Å“â€°Ã¥â€¢â€ Ã¥â€œï¿½Ã§Å¡â€žÃ¦â€°â‚¬Ã¦Å“â€°Ã¤Â¾â€ºÃ¥Âºâ€�Ã¥â€¢â€ Ã¤Â¿Â¡Ã¦ï¿½Â¯
	 * @return
	 */
	public List<SupplierModel> getAllUnionTwo();
}
