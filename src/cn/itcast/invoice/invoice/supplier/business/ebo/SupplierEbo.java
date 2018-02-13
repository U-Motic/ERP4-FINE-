package cn.itcast.invoice.invoice.supplier.business.ebo;

import java.io.Serializable;
import java.util.List;

import cn.itcast.invoice.invoice.supplier.business.ebi.SupplierEbi;
import cn.itcast.invoice.invoice.supplier.dao.dao.SupplierDao;
import cn.itcast.invoice.invoice.supplier.vo.SupplierModel;
import cn.itcast.invoice.util.base.BaseQueryModel;
/**
 * this class implements SupplierEbi
 *
 */
public class SupplierEbo implements SupplierEbi{
	private SupplierDao supplierDao;
	/**
	 * this method is used to set the supplier dao
	 * @param supplierDao
	 */
	public void setSupplierDao(SupplierDao supplierDao) {
		this.supplierDao = supplierDao;
	}

	/**
	 * this method is used to save the Supplier model
	 */
	public void save(SupplierModel sm) {
		supplierDao.save(sm);
	}

	/**
	 * this method is delete used to save the Supplier model
	 */
	public void delete(SupplierModel sm) {
		supplierDao.delete(sm);
	}


	/**
	 * this method is used to update the Supplier model
	 */
	public void update(SupplierModel sm) {
		supplierDao.update(sm);
	}


	/**
	 * this method is used to get the Supplier model
	 */
	public SupplierModel get(Serializable uuid) {
		return supplierDao.get(uuid);
	}


	/**
	 * this method is used to get all the Supplier model
	 */
	public List<SupplierModel> getAll() {
		return supplierDao.getAll();
	}


	/**
	 * this method is used to get all the Supplier model
	 */
	public List<SupplierModel> getAll(BaseQueryModel qm, Integer pageNum,Integer pageCount) {
		return supplierDao.getAll(qm,pageNum,pageCount);
	}


	/**
	 * this method is used to get the count
	 */
	public Integer getCount(BaseQueryModel qm) {
		return supplierDao.getCount(qm);
	}


	/**
	 * this method is used to all the union of the Supplier model
	 */
	public List<SupplierModel> getAllUnion() {
		return supplierDao.getAllUnion();
	}

	/**
	 * this method is used to all the union two of the Supplier model
	 */
	public List<SupplierModel> getAllUnionTwo() {
		return supplierDao.getAllUnionTwo();
	}

}
