package cn.itcast.invoice.auth.emp.vo;

import cn.itcast.invoice.util.base.BaseQueryModel;
import cn.itcast.invoice.util.format.FormatUtil;
/**
 * this class implements BaseQueryModel and exdends EmpModel
 *
 */
public class EmpQueryModel extends EmpModel implements BaseQueryModel{
	//æ­¤å¤„æ·»åŠ çš„æ˜¯æ‰€æœ‰çš„è¦�æŸ¥è¯¢çš„å­—æ®µå��
	private Long birthday2;
	private Long lastLoginTime2;
	
	private String birthday2View;
	private String lastLoginTime2View;
	
	/**
	 * this method is used to get the birthday 2 view
	 * @return
	 */
	public String getBirthday2View() {
		return birthday2View;
	}
	/**
	 * this method is used to get the login time 2 view
	 * @return
	 */
	public String getLastLoginTime2View() {
		return lastLoginTime2View;
	}
	/**
	 * this method is used to get the birthday 2 
	 * @return
	 */
	public Long getBirthday2() {
		return birthday2;
	}
	/**
	 * this method is used to set the birthday 2 
	 * @return
	 */
	public void setBirthday2(Long birthday2) {
		this.birthday2 = birthday2;
		this.birthday2View = FormatUtil.formatDate(birthday2);
	}
	/**
	 * this method is used to get the last login time 2
	 * @return
	 */
	public Long getLastLoginTime2() {
		return lastLoginTime2;
	}
	/**
	 * this method is used to set the last login time 2
	 * @return
	 */
	public void setLastLoginTime2(Long lastLoginTime2) {
		this.lastLoginTime2 = lastLoginTime2;
		this.lastLoginTime2View = FormatUtil.formatDate(lastLoginTime2);
	}
}
