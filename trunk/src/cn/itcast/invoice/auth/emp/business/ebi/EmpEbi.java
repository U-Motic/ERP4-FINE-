package cn.itcast.invoice.auth.emp.business.ebi;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.invoice.auth.emp.vo.EmpModel;
import cn.itcast.invoice.util.base.BaseEbi;


/**
 * this interface extends BaseEbi
 *
 */
@Transactional
public interface EmpEbi extends BaseEbi<EmpModel> {
	/**
	 * Ã¦Â Â¹Ã¦ï¿½Â®Ã§â€�Â¨Ã¦Ë†Â·Ã¥ï¿½ï¿½Ã¯Â¼Å’Ã¥Â¯â€ Ã§Â ï¿½Ã¨Â¿â€ºÃ¨Â¡Å’Ã§â„¢Â»Ã©â„¢â€ 
	 * @param userName Ã§â€�Â¨Ã¦Ë†Â·Ã¥ï¿½ï¿½
	 * @param pwd Ã¥Â¯â€ Ã§Â ï¿½
	 * @param lastLoginIp Ã§â„¢Â»Ã©â„¢â€ IPÃ¥Å“Â°Ã¥ï¿½â‚¬
	 * @return
	 */
	public EmpModel login(String userName, String pwd,String lastLoginIp);
	/**
	 * Ã¤Â¿Â®Ã¦â€�Â¹Ã¥Â¯â€ Ã§Â ï¿½
	 * @param userName Ã§â€�Â¨Ã¦Ë†Â·Ã¥ï¿½ï¿½
	 * @param oldPwd Ã¥Å½Å¸Ã¥Â§â€¹Ã¥Â¯â€ Ã§Â ï¿½
	 * @param newPwd Ã¦â€“Â°Ã¥Â¯â€ Ã§Â ï¿½
	 * @return
	 */
	public boolean changePwd(String userName, String oldPwd, String newPwd);
	/**
	 * this method is used to save ebi
	 * @param em
	 * @param roleUuids
	 */
	public void save(EmpModel em, Long[] roleUuids);
	/**
	 * this method updates
	 * @param em
	 * @param roleUuids
	 */
	public void update(EmpModel em, Long[] roleUuids);
	/**
	 * Ã¦Â Â¹Ã¦ï¿½Â®Ã©Æ’Â¨Ã©â€”Â¨uuidÃ¨Å½Â·Ã¥ï¿½â€“Ã©Æ’Â¨Ã©â€”Â¨Ã¥â€˜ËœÃ¥Â·Â¥Ã¤Â¿Â¡Ã¦ï¿½Â¯
	 * @param depUuid Ã©Æ’Â¨Ã©â€”Â¨uuid
	 * @return
	 */
	public List<EmpModel> getAllByDep(Long depUuid);
}
