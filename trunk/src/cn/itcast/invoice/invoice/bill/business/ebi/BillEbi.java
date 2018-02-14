package cn.itcast.invoice.invoice.bill.business.ebi;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.invoice.invoice.bill.vo.BillQueryModel;
import cn.itcast.invoice.invoice.order.vo.OrderDetailModel;
/**
 * this interface is the model for the Bills
 *
 */
@Transactional
public interface BillEbi {

	/**
	 * this method gives you the bill by goods
	 * @param bqm
	 * @return
	 */
	public List<Object[]> getBillByGoods(BillQueryModel bqm);
	
	/**
	 * this method returns a list
	 * @param bqm
	 * @return
	 */
	 public List<OrderDetailModel> getBillDetailByGoods(BillQueryModel bqm);

	/**
	 * this method gives you the bill for pie
	 * @param os
	 * @param billList
	 */
	public void getBillForPie(OutputStream os, List<Object[]> billList);

	/**
	 * this method gives you excel bill
	 * @param billList
	 * @return
	 * @throws Exception
	 */
	public InputStream getExcelBill(List<Object[]> billList) throws Exception;
}
