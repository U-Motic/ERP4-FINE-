package cn.itcast.invoice.auth.emp.business.ebo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import cn.itcast.invoice.auth.emp.business.ebi.EmpEbi;
import cn.itcast.invoice.auth.emp.dao.dao.EmpDao;
import cn.itcast.invoice.auth.emp.vo.EmpModel;
import cn.itcast.invoice.auth.res.dao.dao.ResDao;
import cn.itcast.invoice.auth.role.vo.RoleModel;
import cn.itcast.invoice.util.base.BaseQueryModel;
import cn.itcast.invoice.util.format.MD5Utils;


/**
 * this interface implements EmpEbi
 *
 */
public class EmpEbo implements EmpEbi{
	
	private static int two = 2, three = 3;
	private EmpDao empDao;
	private ResDao resDao;
	/**
	 * this method to sed the resdao
	 * @param resDao
	 */
	public void setResDao(ResDao resDao) {
		this.resDao = resDao;
	}

	/**
	 * this method to sed the empdao
	 * @param resDao
	 */
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	/**
	 * this method to save the empmodel
	 * @param resDao
	 */
	public void save(EmpModel em) {
		//Ã¤Â¸ÂºÃ¦Å¸ï¿½Ã¤Âºâ€ºÃ¦â€¢Â°Ã¦ï¿½Â®Ã¨Â¿â€ºÃ¨Â¡Å’Ã¥Ë†ï¿½Ã¥Â§â€¹Ã¥Å’â€“
		em.setPwd(MD5Utils.sha256(em.getPwd()));
		em.setLastLoginIp("--");
		em.setLastLoginTime(System.currentTimeMillis());
		//Ã¨Â®Â¾Ã§Â½Â®Ã¦â€“Â°Ã¦Â³Â¨Ã¥â€ Å’Ã§â€�Â¨Ã¦Ë†Â·Ã§â„¢Â»Ã¥Â½â€¢Ã¦Â¬Â¡Ã¦â€¢Â°Ã¤Â¸Âº0
		em.setLoginTimes(0);
		empDao.save(em);
	}
	/**
	 * this method to delete the empmodel
	 * @param resDao
	 */
	public void delete(EmpModel em) {
		empDao.delete(em);
	}

	/**
	 * this method to update the empmodel
	 * @param resDao
	 */
	public void update(EmpModel em) {
		//Ã§Â¼ÂºÃ¥Â°â€˜Ã¤Â¸â‚¬Ã¤Âºâ€ºÃ¦â€¢Â°Ã¦ï¿½Â®Ã¯Â¼Å’Ã¨Â¿â„¢Ã¤Âºâ€ºÃ¦â€¢Â°Ã¦ï¿½Â®Ã¤Â¸ï¿½Ã¨Æ’Â½Ã¤Â»Å½Ã©Â¡ÂµÃ©ï¿½Â¢Ã¦â€�Â¶Ã©â€ºâ€ 
		//Ã¥Â¿Â«Ã§â€¦Â§Ã¦â€ºÂ´Ã¦â€“Â°
		EmpModel temp = empDao.get(em.getUuid());
		//Ã¥Â°â€ Ã§Â¼ÂºÃ¥Â°â€˜Ã§Å¡â€žÃ¥â‚¬Â¼Ã¥â€¦Â¨Ã©Æ’Â¨Ã¨Âµâ€¹Ã¥â‚¬Â¼Ã¤Â¸Å Ã¥Å½Â»
		temp.setName(em.getPersonalInformation(0));
		temp.setEmail(em.getPersonalInformation(1));
		temp.setTele(em.getPersonalInformation(two));
		temp.setAddress(em.getPersonalInformation(three));
		temp.setBirthday(em.getBirthday());
		temp.setGender(em.getGender());
		temp.setDm(em.getDm());
		
	
		
	}

	/**
	 * this method to get the uuid
	 * @param resDao
	 */
	public EmpModel get(Serializable uuid) {
		return empDao.get(uuid);
	}

	/**
	 * this method to get all the list of empmodel
	 * 
	 */
	public List<EmpModel> getAll() {
		return empDao.getAll();
	}

	/**
	 * this method to get all the list
	 * 
	 */
	public List<EmpModel> getAll(BaseQueryModel qm, Integer pageNum,Integer pageCount) {
		return empDao.getAll(qm,pageNum,pageCount);
	}

	/**
	 * this method is used to get the count of the query model
	 */
	public Integer getCount(BaseQueryModel qm) {
		return empDao.getCount(qm);
	}
/**
 * this method is used to login
 */
	public EmpModel login(String userName, String pwd ,String lastLoginIp) {
		//Ã¥Â¯Â¹Ã¥Â¯â€ Ã§Â ï¿½Ã¨Â¿â€ºÃ¨Â¡Å’md5Ã¥Å Â Ã¥Â¯â€ 
		pwd = MD5Utils.sha256(pwd);
		EmpModel loginEm = empDao.getByNameAndPwd(userName,pwd);
		//Ã¤Â»Â»Ã¦â€žï¿½Ã¦â€”Â¶Ã¥Ë†Â»Ã¥ï¿½â€“Ã¥â€¡ÂºÃ§Å¡â€žÃ¦â€¢Â°Ã¦ï¿½Â®Ã¯Â¼Å’Ã§Â¬Â¬Ã¤Â¸â‚¬Ã¤Â»Â¶Ã¤Âºâ€¹Ã¥Â¿â€¦Ã©Â¡Â»Ã¥ï¿½Å¡nullÃ¥Ë†Â¤Ã¥Â®Å¡
		if(loginEm != null){
			//Ã¨Â®Â°Ã¥Â½â€¢Ã§â„¢Â»Ã©â„¢â€ Ã§Å¡â€žÃ¦â€”Â¶Ã©â€”Â´,ip,Ã¦Â¬Â¡Ã¦â€¢Â°
			loginEm.setLastLoginIp(lastLoginIp);
			loginEm.setLastLoginTime(System.currentTimeMillis());
			//Ã¤Â¿Â®Ã¦â€�Â¹Ã§â„¢Â»Ã©â„¢â€ Ã¦Â¬Â¡Ã¦â€¢Â°
			loginEm.setLoginTimes(loginEm.getLoginTimes()+1);
			
			//Ã§â„¢Â»Ã©â„¢â€ Ã¦â€”Â¶Ã¯Â¼Å’Ã¥Â°â€ Ã¥Â½â€œÃ¥â€°ï¿½Ã§â€�Â¨Ã¦Ë†Â·Ã§Å¡â€žÃ¦â€°â‚¬Ã¦Å“â€°Ã¥ï¿½Â¯Ã¦â€œï¿½Ã¤Â½Å“Ã¨Âµâ€žÃ¦Âºï¿½Ã¨Â½Â¬Ã¦ï¿½Â¢Ã¤Â¸ÂºÃ¤Â¸â‚¬Ã¤Â¸ÂªÃ©â€¢Â¿Ã¥Â­â€”Ã§Â¬Â¦Ã¤Â¸Â²Ã¯Â¼Å’Ã¥Â¹Â¶Ã¨Â®Â¾Ã§Â½Â®Ã¥Ë†Â°Ã§â„¢Â»Ã©â„¢â€ Ã¥Â¯Â¹Ã¨Â±Â¡Ã¤Â¸Â­
			List<String> resList = resDao.getAllResByEmp(loginEm.getUuid());
			StringBuilder sbf = new StringBuilder();
			for(String url:resList){
				sbf.append(url);
				sbf.append(" ");
			}
			loginEm.setResValue(sbf.toString());
		}
		
		return loginEm;
	}

	/**
	 * this method is used to change the password
	 */
	public boolean changePwd(String userName, String oldPwd, String newPwd) {
		oldPwd = MD5Utils.sha256(oldPwd);
		newPwd = MD5Utils.sha256(newPwd);
		return empDao.updatePwdByUserNameAndPwd(userName,oldPwd,newPwd);
	}

	/**
	 * this method to save the empmodel
	 * @param resDao
	 */
	public void save(EmpModel em, Long[] roleUuids) {
		//Ã¤Â¸ÂºÃ¦Å¸ï¿½Ã¤Âºâ€ºÃ¦â€¢Â°Ã¦ï¿½Â®Ã¨Â¿â€ºÃ¨Â¡Å’Ã¥Ë†ï¿½Ã¥Â§â€¹Ã¥Å’â€“
		em.setPwd(MD5Utils.sha256(em.getPwd()));
		em.setLastLoginIp("--");
		em.setLastLoginTime(System.currentTimeMillis());
		//Ã¨Â®Â¾Ã§Â½Â®Ã¦â€“Â°Ã¦Â³Â¨Ã¥â€ Å’Ã§â€�Â¨Ã¦Ë†Â·Ã§â„¢Â»Ã¥Â½â€¢Ã¦Â¬Â¡Ã¦â€¢Â°Ã¤Â¸Âº0
		em.setLoginTimes(0);
		
		//Ã¥Â»ÂºÃ§Â«â€¹Ã¤Â¸Å½Ã¨Â§â€™Ã¨â€°Â²Ã§Å¡â€žÃ¥â€¦Â³Ã§Â³Â»
		//Ã¦â€¢Â°Ã§Â»â€ž->Ã©â€ºâ€ Ã¥ï¿½Ë†
		Set<RoleModel> roles = new HashSet<RoleModel>();
		for(Long uuid:roleUuids){
			RoleModel rm = new RoleModel();
			rm.setSegreto(uuid);
			roles.add(rm);
		}
		em.setRoles(roles);
		empDao.save(em);
	}

	/**
	 * this method to update the empmodel
	 * @param resDao
	 */
	public void update(EmpModel em, Long[] roleUuids) {
		//Ã§Â¼ÂºÃ¥Â°â€˜Ã¤Â¸â‚¬Ã¤Âºâ€ºÃ¦â€¢Â°Ã¦ï¿½Â®Ã¯Â¼Å’Ã¨Â¿â„¢Ã¤Âºâ€ºÃ¦â€¢Â°Ã¦ï¿½Â®Ã¤Â¸ï¿½Ã¨Æ’Â½Ã¤Â»Å½Ã©Â¡ÂµÃ©ï¿½Â¢Ã¦â€�Â¶Ã©â€ºâ€ 
		//Ã¥Â¿Â«Ã§â€¦Â§Ã¦â€ºÂ´Ã¦â€“Â°
		EmpModel temp = empDao.get(em.getUuid());
		//Ã¥Â°â€ Ã§Â¼ÂºÃ¥Â°â€˜Ã§Å¡â€žÃ¥â‚¬Â¼Ã¥â€¦Â¨Ã©Æ’Â¨Ã¨Âµâ€¹Ã¥â‚¬Â¼Ã¤Â¸Å Ã¥Å½Â»
		temp.setName(em.getPersonalInformation(0));
		temp.setEmail(em.getPersonalInformation(1));
		temp.setTele(em.getPersonalInformation(two));
		temp.setAddress(em.getPersonalInformation(three));
		temp.setBirthday(em.getBirthday());
		temp.setGender(em.getGender());
		temp.setDm(em.getDm());
		
		Set<RoleModel> roles = new HashSet<RoleModel>();
		for(Long uuid:roleUuids){
			RoleModel rm = new RoleModel();
			rm.setSegreto(uuid);
			roles.add(rm);
		}
		temp.setRoles(roles);
	}

	/**
	 * this method to get all by dep uuid
	 * @param resDao
	 */
	public List<EmpModel> getAllByDep(Long depUuid) {
		return empDao.getAllByDepUuid(depUuid);
	}
	
}
