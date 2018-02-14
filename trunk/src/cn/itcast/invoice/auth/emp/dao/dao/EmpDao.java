package cn.itcast.invoice.auth.emp.dao.dao;

import java.util.List;

import cn.itcast.invoice.auth.emp.vo.EmpModel;
import cn.itcast.invoice.util.base.BaseDao;
/**
 * this interface extends BaseDao
 *
 */
public interface EmpDao extends BaseDao<EmpModel> {
	/**
	 * Ã¦Â Â¹Ã¦ï¿½Â®Ã§â€�Â¨Ã¦Ë†Â·Ã¥ï¿½ï¿½Ã¥Â¯â€ Ã§Â ï¿½Ã¨Å½Â·Ã¥ï¿½â€“Ã§â€�Â¨Ã¦Ë†Â·Ã¤Â¿Â¡Ã¦ï¿½Â¯
	 * @param userName Ã§â€�Â¨Ã¦Ë†Â·Ã¥ï¿½ï¿½
	 * @param pwd Ã¥Â¯â€ Ã§Â ï¿½
	 * @return Ã§â„¢Â»Ã©â„¢â€ Ã§â€�Â¨Ã¦Ë†Â·Ã¤Â¿Â¡Ã¦ï¿½Â¯Ã¦Â¨Â¡Ã¥Å¾â€¹
	 */
	public EmpModel getByNameAndPwd(String userName, String pwd);

	/**
	 * this method is used to update password
	 * @param userName 
	 * @param oldPwd is the old password
	 * @param newPwd is the new password
	 * @return 
	 */
	public boolean updatePwdByUserNameAndPwd(String userName, String oldPwd,
			String newPwd);

	
	/**
	 * this method returns a list
	 * @param depUuid
	 * @return
	 */
	public List<EmpModel> getAllByDepUuid(Long depUuid);
}
