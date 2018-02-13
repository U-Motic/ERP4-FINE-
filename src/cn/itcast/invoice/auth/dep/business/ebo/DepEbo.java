package cn.itcast.invoice.auth.dep.business.ebo;

import java.io.Serializable;
import java.util.List;

import cn.itcast.invoice.auth.dep.business.ebi.DepEbi;
import cn.itcast.invoice.auth.dep.dao.dao.DepDao;
import cn.itcast.invoice.auth.dep.vo.DepModel;
import cn.itcast.invoice.util.base.BaseQueryModel;
import cn.itcast.invoice.util.exception.AppException;


/**
 * This class implements DepEbi
 *
 */

public class DepEbo implements DepEbi{
	private DepDao depDao;
	/**
	 * this method set the DepDao
	 * @param depDao
	 */
	public void setDepDao(DepDao depDao) {
		this.depDao = depDao;
	}

	/**
	 * this method saves the DepModel
	 */
	public void save(DepModel dm) {
		//逻辑校验
		if(dm.getName().trim().length() == 0){
			//报告错误
			try {
				throw new AppException("INFO_DEP_NAME_IS_EMPTY");
			} catch (AppException e) {
				System.out.println("Something was wrong!");
			}
		}
		depDao.save(dm);
	}

	/**
	 * this method update the depModel
	 */
	public void update(DepModel dm) {
		depDao.update(dm);
	}
	/**
	 * this method delete the depModel
	 */
	public void delete(DepModel dm) {
		depDao.delete(dm);
	}
	/**
	 * this method is used to get uudi
	 */
	public DepModel get(Serializable uuid) {
		return depDao.get(uuid);
	}
	/**
	 * this method is used to getAll
	 */
	public List<DepModel> getAll() {
		return depDao.getAll();
	}

	/**
	 * this method is used to get all
	 */
	public List<DepModel> getAll(BaseQueryModel qm, Integer pageNum,Integer pageCount) {
		return depDao.getAll(qm,pageNum,pageCount);
	}

	/**
	 * this method is used to getCount
	 */
	public Integer getCount(BaseQueryModel qm) {
		return depDao.getCount(qm);
	}

}
