package cn.itcast.invoice.auth.res.dao.dao;

import java.util.List;

import cn.itcast.invoice.auth.res.vo.ResModel;
import cn.itcast.invoice.util.base.BaseDao;
/**
 * this interface extends BaseDao<ResModel>
 *
 */
public interface ResDao extends BaseDao<ResModel> {

	/**
	 * this method gives you all res
	 * @param empUuid
	 * @return
	 */
	public List<String> getAllResByEmp(Long empUuid);

	public List<String> getUrls();
}
