package cn.itcast.invoice.auth.res.business.ebi;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.invoice.auth.res.vo.ResModel;
import cn.itcast.invoice.util.base.BaseEbi;
/**
 * this class extends BaseEbi<ResModel>
 *
 */
@Transactional
public interface ResEbi extends BaseEbi<ResModel> {

	/**
	 * this method save your res
	 * @param rm
	 * @param roleUuids
	 */
	public void save(ResModel rm, Long[] roleUuids);

	
	/**
	 * this method updates
	 * @param rm
	 * @param roleUuids
	 */
	public void update(ResModel rm, Long[] roleUuids);
	/**
	 * èŽ·å�–æŒ‡å®šå‘˜å·¥çš„æ‰€æœ‰å�¯æ“�ä½œèµ„æº�ä¿¡æ�¯
	 * @param uuid å‘˜å·¥uuid
	 * @return
	 */
	public List<String> getAllResByEmp(Long uuid);

	/**
	 * this method returns a list
	 * @return
	 */
	public List<String> getAllUrl();
}
