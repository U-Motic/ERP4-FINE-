package cn.itcast.invoice.util.base;

import java.io.Serializable;
import java.util.List;
/**
 * this interface is the base for all the Daos classes of the project
 *
 */
public interface BaseDao<T> {
	/**
	 * this method is used to save
	 * @param t
	 */
	public void save(T t);
	/**
	 * this method is used to update
	 * @param t
	 */
	public void update(T t);
	/**
	 * this method is used to delete
	 * @param t
	 */
	public void delete(T t);
	/**
	 * this method is used to get
	 * @param uuid
	 * @return
	 */
	public T get(Serializable uuid);
	/**
	 * this method is used to getAll
	 * @return
	 */
	public List<T> getAll();

	/**
	 * this method is used to get all
	 * @param qm
	 * @param pageNum
	 * @param pageCount
	 * @return
	 */
	public List<T> getAll(BaseQueryModel qm, Integer pageNum,Integer pageCount);

	/**
	 * this method is used to get count
	 * @param qm
	 * @return
	 */
	public Integer getCount(BaseQueryModel qm);
}
