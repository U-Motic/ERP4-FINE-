package cn.itcast.invoice.auth.emp.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cn.itcast.invoice.auth.dep.business.ebi.DepEbi;
import cn.itcast.invoice.auth.dep.vo.DepModel;
import cn.itcast.invoice.auth.emp.business.ebi.EmpEbi;
import cn.itcast.invoice.auth.emp.vo.EmpModel;
import cn.itcast.invoice.auth.emp.vo.EmpQueryModel;
import cn.itcast.invoice.auth.role.business.ebi.RoleEbi;
import cn.itcast.invoice.auth.role.vo.RoleModel;
import cn.itcast.invoice.util.base.BaseAction;
/**
 * this class extends BaseAction
 *
 */
public class EmpAction extends BaseAction{
	//1.getUm() Ã§â€�Â¨
	//2.Ã¥Â°ï¿½Ã¨Â¯â€¢Ã¦â‚¬Â§Ã§Å¡â€žÃ¤Â½Â¿Ã§â€�Â¨publicÃ¦ï¿½Æ’Ã©â„¢ï¿½Ã¨Â®Â¿Ã©â€”Â® Ã§â€�Â¨
	//3.setUm() Ã¦Å“â€°
	//3.1 Ã¥Å“Â¨Ã¦Â¯ï¿½Ã¦Â¬Â¡Ã¨Â°Æ’Ã§â€�Â¨Ã¥Â¯Â¹Ã¨Â±Â¡Ã¦â€”Â¶Ã¯Â¼Å’Ã¦â€°Â§Ã¨Â¡Å’setÃ¦â€“Â¹Ã¦Â³â€¢Ã¯Â¼Å’Ã¥Ë†â€ºÃ¥Â»ÂºÃ¤Â¸â‚¬Ã¤Â¸ÂªÃ¦â€“Â°Ã¥Â¯Â¹Ã¨Â±Â¡
	
	/**
	 * public field
	 */
	public EmpModel em = new EmpModel();
	/**
	 * public field
	 */
	public EmpQueryModel eqm = new EmpQueryModel();
	/**
	 * public field
	 */
	public Long[] roleUuids;
	private EmpEbi empEbi;
	private DepEbi depEbi;
	private RoleEbi roleEbi;
	
	
	/**
	 * public field
	 */
	public void setRoleEbi(RoleEbi roleEbi) {
		this.roleEbi = roleEbi;
	}

	/**
	 * public field
	 */
	public void setDepEbi(DepEbi depEbi) {
		this.depEbi = depEbi;
	}

	/**
	 * public field
	 */
	public void setEmpEbi(EmpEbi empEbi) {
		this.empEbi = empEbi;
	}

	
	
	//Ã¨Â·Â³Ã¨Â½Â¬Ã¥Ë†Â°Ã¥Ë†â€”Ã¨Â¡Â¨Ã©Â¡ÂµÃ©ï¿½Â¢
	/**
	 * public field
	 */
	public String list(){
		//Ã¥Å Â Ã¨Â½Â½Ã©Æ’Â¨Ã©â€”Â¨Ã¥â€¦Â¨Ã¤Â¿Â¡Ã¦ï¿½Â¯
		List<DepModel> depList = depEbi.getAll();
		put("depList",depList);
		setDataTotal(empEbi.getCount(eqm));
		List<EmpModel> empList = empEbi.getAll(eqm,pageNum,pageCount);
		put("empList",empList);
		return LIST;
	}

	//Ã¤Â¿ï¿½Ã¥Â­Ëœ/Ã¤Â¿Â®Ã¦â€�Â¹
	/**
	 * public field
	 */
	public String save(){
		if(em.getUuid()== null){
			empEbi.save(em,roleUuids);
		}else{
			empEbi.update(em,roleUuids);
		}
		return TO_LIST;
	}

	//Ã¨Â·Â³Ã¨Â½Â¬Ã¥Ë†Â°Ã¦Â·Â»Ã¥Å Â /Ã¤Â¿Â®Ã¦â€�Â¹Ã©Â¡ÂµÃ©ï¿½Â¢
	/**
	 * public field
	 */
	public String input(){
		//Ã¥Â°â€ Ã©Æ’Â¨Ã©â€”Â¨Ã¥Ë†â€”Ã¨Â¡Â¨Ã¦â€¢Â°Ã¦ï¿½Â®
		List<DepModel> depList = depEbi.getAll();
		put("depList",depList);
		//Ã¥Å Â Ã¨Â½Â½Ã¨Â§â€™Ã¨â€°Â²Ã¦â€¢Â°Ã¦ï¿½Â®
		List<RoleModel> roleList = roleEbi.getAll();
		put("roleList",roleList);
		if(em.getUuid()!=null){
			em = empEbi.get(em.getUuid());
			//Ã©â€ºâ€ Ã¥ï¿½Ë†->Ã¦â€¢Â°Ã§Â»â€ž
			roleUuids = new Long[em.getRoles().size()];
			int i = 0;
			for(RoleModel rm:em.getRoles()){
				roleUuids[i++] = rm.getUuid();
			}
		}
		return INPUT;
	}

	//Ã¥Ë†Â Ã©â„¢Â¤
	/**
	 * public field
	 */
	public String delete(){
		empEbi.delete(em);
		return TO_LIST;
	}

	//Ã§â„¢Â»Ã©â„¢â€ Ã¯Â¼Å¡Ã¤Â½Â¿Ã§â€�Â¨Ã§â€�Â¨Ã¦Ë†Â·Ã¤Â¼Â Ã©â‚¬â€™Ã§Å¡â€žÃ§â€�Â¨Ã¦Ë†Â·Ã¥ï¿½ï¿½Ã¥Â¯â€ Ã§Â ï¿½Ã¨Â¿â€ºÃ¨Â¡Å’Ã§â„¢Â»Ã©â„¢â€ 
	/**
	 * public field
	 */
	public String login(){
		String toReturn;
		HttpServletRequest request = getRequest();
		String loginIp = request.getHeader("x-forwarded-for"); 
		if(loginIp == null || loginIp.length() == 0 || "unknown".equalsIgnoreCase(loginIp)) { 
			loginIp = request.getHeader("Proxy-Client-IP"); 
		} 
		if(loginIp == null || loginIp.length() == 0 || "unknown".equalsIgnoreCase(loginIp)) { 
			loginIp = request.getHeader("WL-Proxy-Client-IP"); 
		} 
		if(loginIp == null || loginIp.length() == 0 || "unknown".equalsIgnoreCase(loginIp)) { 
			loginIp = request.getRemoteAddr(); 
		}
		//Ã¤Â½Â¿Ã§â€�Â¨Ã§â€�Â¨Ã¦Ë†Â·Ã¥ï¿½ï¿½Ã¥Â¯â€ Ã§Â ï¿½Ã¥Ë†Â°Ã¦â€¢Â°Ã¦ï¿½Â®Ã¥Âºâ€œÃ¨Â¿â€ºÃ¨Â¡Å’Ã¦Â Â¡Ã©ÂªÅ’Ã¦Å¸Â¥Ã¨Â¯Â¢
		EmpModel loginEm = empEbi.login(em.getUserName(),em.getPwd(),loginIp);
		//Ã¥Ë†Â¤Ã¦â€“Â­Ã¦ËœÂ¯Ã¥ï¿½Â¦Ã§â„¢Â»Ã©â„¢â€ Ã¦Ë†ï¿½Ã¥Å Å¸
		if(loginEm == null){
			//Ã¥Â¦â€šÃ¦Å¾Å“Ã¥Å’Â¹Ã©â€¦ï¿½Ã¥Â¤Â±Ã¨Â´Â¥
			//Ã¨Â·Â³Ã¨Â½Â¬Ã¥Ë†Â°Ã§â„¢Â»Ã©â„¢â€ Ã©Â¡Âµ
			toReturn = "loginFail";
		}else{
			//Ã¥Â¦â€šÃ¦Å¾Å“Ã¥Å’Â¹Ã©â€¦ï¿½Ã¦Ë†ï¿½Ã¥Å Å¸
			//Ã¥Â°â€ Ã§â„¢Â»Ã©â„¢â€ Ã§Å¡â€žÃ¤Â¿Â¡Ã¦ï¿½Â¯Ã¦â€�Â¾Ã¥â€¦Â¥Session
			putSession("loginEm", loginEm);
			//Ã¨Â·Â³Ã¨Â½Â¬Ã¥Ë†Â°Ã¤Â¸Â»Ã©Â¡Âµ
			toReturn = "loginSuccess";
		}
		return toReturn;
	}
	
	//Ã§â„¢Â»Ã¥â€¡Âº/Ã¦Â³Â¨Ã©â€�â‚¬
	/**
	 * public field
	 */
	public String logout(){
		//Ã¥Â°â€ sessionÃ¤Â¸Â­Ã§Å¡â€žÃ¦â€¢Â°Ã¦ï¿½Â®Ã¦Â¸â€¦Ã©â„¢Â¤
		putSession("loginEm", null);
		//Ã¨Â·Â³Ã¨Â½Â¬Ã¥Ë†Â°Ã§â„¢Â»Ã©â„¢â€ Ã©Â¡ÂµÃ©ï¿½Â¢
		return "loginFail";
	}
	
	//Ã¤Â¿Â®Ã¦â€�Â¹Ã¥Â¯â€ Ã§Â ï¿½
	/**
	 * public field
	 */
	public String changePwd(){
		//old: em.pwd
		//new: request.getParameter();
		String toReturn;
		String oldPwd = em.getPwd();
		String newPwd = getRequest().getParameter("newPwd");
		boolean flag = empEbi.changePwd(getLogin().getUserName(),oldPwd,newPwd);
		if(flag){
			//Ã¤Â¿Â®Ã¦â€�Â¹Ã¦Ë†ï¿½Ã¥Å Å¸
			toReturn = logout();
		}else{
			//Ã¤Â¿Â®Ã¦â€�Â¹Ã¥Â¤Â±Ã¨Â´Â¥
			toReturn = "hehe";
		}
		return toReturn;
	}
}







