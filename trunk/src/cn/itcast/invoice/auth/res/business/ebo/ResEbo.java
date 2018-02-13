package cn.itcast.invoice.auth.res.business.ebo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import cn.itcast.invoice.auth.res.business.ebi.ResEbi;
import cn.itcast.invoice.auth.res.dao.dao.ResDao;
import cn.itcast.invoice.auth.res.vo.ResModel;
import cn.itcast.invoice.auth.role.vo.RoleModel;
import cn.itcast.invoice.util.base.BaseQueryModel;
/**
 * this class implements ResEbi
 *
 */
public class ResEbo implements ResEbi{
	private ResDao resDao;
	/**
	 * this method is used to set the resDao
	 * @param resDao
	 */
	public void setResDao(ResDao resDao) {
		this.resDao = resDao;
	}

	/**
	 * this method is used to save the ResModel
	 */
	public void save(ResModel rm) {
		resDao.save(rm);
	}
	/**
	 * this method is used to delete the ResModel
	 */
	public void delete(ResModel rm) {
		resDao.delete(rm);
	}
	/**
	 * this method is used to update the ResModel
	 */
	public void update(ResModel rm) {
		resDao.update(rm);
	}
	/**
	 * this method is used to get the uudi
	 */
	public ResModel get(Serializable uuid) {
		return resDao.get(uuid);
	}
	/**
	 * this method is used to get all teh resmodel
	 */
	public List<ResModel> getAll() {
		return resDao.getAll();
	}
	/**
	 * this method is used to get all the resmodel
	 */
	public List<ResModel> getAll(BaseQueryModel qm, Integer pageNum,Integer pageCount) {
		return resDao.getAll(qm,pageNum,pageCount);
	}

	/**
	 * this method is used to get the count 
	 */
	public Integer getCount(BaseQueryModel qm) {
		return resDao.getCount(qm);
	}

	/**
	 * this method is used to save the ResModel
	 */
	public void save(ResModel rm, Long[] roleUuids) {
		Set<RoleModel> roles = new HashSet<RoleModel>();
		for(Long uuid:roleUuids){
			RoleModel temp = new RoleModel();
			temp.setSegreto(uuid);
			roles.add(temp);
		}
		rm.setRoles(roles);
		resDao.save(rm);
	}
	/**
	 * this method is used to update the ResModel
	 */
	public void update(ResModel rm, Long[] roleUuids) {
		Set<RoleModel> roles = new HashSet<RoleModel>();
		for(Long uuid:roleUuids){
			RoleModel temp = new RoleModel();
			temp.setSegreto(uuid);
			roles.add(temp);
		}
		rm.setRoles(roles);
		resDao.update(rm);
	}

	/**
	 * this method is used to get all the res model by emp
	 */
	public List<String> getAllResByEmp(Long empUuid) {
		return resDao.getAllResByEmp(empUuid);
	}

	/**
	 * this method is used to get all the urls
	 */
	public List<String> getAllUrl() {
		return resDao.getUrls();
	}

}
