package cn.itcast.invoice.util.base;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * this Abstract class is the base for the DaoImpl classes and extends HibernateDaoSupport
 *
 */
public abstract class BaseDaoImpl<T> extends HibernateDaoSupport{
	//ÃƒÂ¥Ã‚Â½Ã¢â‚¬Å“ÃƒÂ¥Ã¢â‚¬Â°Ã¯Â¿Â½ÃƒÂ§Ã‚Â±Ã‚Â»ÃƒÂ¤Ã‚Â¸Ã‚Â­ÃƒÂ¦Ã‚Â³Ã¢â‚¬ÂºÃƒÂ¥Ã…Â¾Ã¢â‚¬Â¹ÃƒÂ§Ã…Â¡Ã¢â‚¬Å¾ÃƒÂ§Ã‚Â±Ã‚Â»ÃƒÂ¥Ã…Â¾Ã¢â‚¬Â¹
	private Class<T> entityClass;
	
	//ÃƒÂ¤Ã‚Â½Ã¢â‚¬Â¢ÃƒÂ¦Ã¢â‚¬â€�Ã‚Â¶ÃƒÂ¥Ã‹â€ Ã¯Â¿Â½ÃƒÂ¥Ã‚Â§Ã¢â‚¬Â¹ÃƒÂ¥Ã…â€™Ã¢â‚¬â€œ:ÃƒÂ¥Ã‚Â½Ã¢â‚¬Å“ÃƒÂ¥Ã¢â‚¬Â°Ã¯Â¿Â½ÃƒÂ§Ã‚Â±Ã‚Â»ÃƒÂ§Ã…Â¡Ã¢â‚¬Å¾ÃƒÂ¥Ã‚Â¯Ã‚Â¹ÃƒÂ¨Ã‚Â±Ã‚Â¡ÃƒÂ¥Ã‹â€ Ã¢â‚¬ÂºÃƒÂ¥Ã‚Â»Ã‚ÂºÃƒÂ¥Ã‚Â®Ã…â€™ÃƒÂ¦Ã‚Â¯Ã¢â‚¬Â¢ÃƒÂ¤Ã‚Â¹Ã¢â‚¬Â¹ÃƒÂ¥Ã¢â‚¬Â°Ã¯Â¿Â½
	/**
	 * this method is the constructor
	 */
	public BaseDaoImpl(){
		Class clazz = this.getClass();
		Type type = clazz.getGenericSuperclass();
		ParameterizedType pType =(ParameterizedType)type;
		Type[] types = pType.getActualTypeArguments(); 
		entityClass = (Class) types[0];
	}
	/**
	 * this method is used to save
	 * @param t
	 */
	public void save(T t) {
		this.getHibernateTemplate().save(t);
		
	}

	/**
	 * this method is used to update
	 * @param t
	 */
	public void update(T t) {
		this.getHibernateTemplate().update(t);
	}

	/**
	 * this method is used to delete
	 * @param t
	 */
	public void delete(T t) {
		this.getHibernateTemplate().delete(t);
	}

	/**
	 * this method is used to get the uuid
	 * @param uuid
	 * @return
	 */
	public T get(Serializable uuid) {
		return this.getHibernateTemplate().get(entityClass,uuid);
	}
	
	/**
	 * this method is used to get all the list
	 * @return
	 */
	public List<T> getAll() {
		DetachedCriteria dc = DetachedCriteria.forClass(entityClass);
		return this.getHibernateTemplate().findByCriteria(dc);
	}

	/**
	 * this method is used to get all the list
	 * @return
	 */
	public List<T> getAll(BaseQueryModel qm, Integer pageNum,Integer pageCount) {
		DetachedCriteria dc = DetachedCriteria.forClass(entityClass);
		doQbc(dc,qm);
		return this.getHibernateTemplate().findByCriteria(dc,(pageNum-1)*pageCount,pageCount);
	}
	
	/**
	 * this method is used to get the count
	 * @param qm
	 * @return
	 */
	public Integer getCount(BaseQueryModel qm) {
		DetachedCriteria dc = DetachedCriteria.forClass(entityClass);
		dc.setProjection(Projections.rowCount());
		doQbc(dc,qm);
		List<Long> count = this.getHibernateTemplate().findByCriteria(dc);
		return count.get(0).intValue();
	}
	
	//ÃƒÂ¥Ã‚Â¼Ã‚ÂºÃƒÂ¥Ã‹â€ Ã‚Â¶ÃƒÂ¥Ã‚Â­Ã¯Â¿Â½ÃƒÂ§Ã‚Â±Ã‚Â»ÃƒÂ¨Ã‚Â¦Ã¢â‚¬Â ÃƒÂ§Ã¢â‚¬ÂºÃ¢â‚¬â€œdoQbcÃƒÂ¦Ã¢â‚¬â€œÃ‚Â¹ÃƒÂ¦Ã‚Â³Ã¢â‚¬Â¢
	protected abstract void doQbc(DetachedCriteria dc,BaseQueryModel qm);
}
