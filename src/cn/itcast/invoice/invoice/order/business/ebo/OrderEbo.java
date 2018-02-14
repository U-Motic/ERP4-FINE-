package cn.itcast.invoice.invoice.order.business.ebo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import cn.itcast.invoice.auth.emp.vo.EmpModel;
import cn.itcast.invoice.invoice.goods.vo.GoodsModel;
import cn.itcast.invoice.invoice.order.business.ebi.OrderEbi;
import cn.itcast.invoice.invoice.order.dao.dao.OrderDao;
import cn.itcast.invoice.invoice.order.vo.OrderDetailModel;
import cn.itcast.invoice.invoice.order.vo.OrderModel;
import cn.itcast.invoice.invoice.order.vo.OrderQueryModel;
import cn.itcast.invoice.util.base.BaseQueryModel;
import cn.itcast.invoice.util.exception.AppException;
import cn.itcast.invoice.util.format.MD5Utils;
/**
 * this class implements OrderEbi
 *
 */
public class OrderEbo implements OrderEbi{
	private OrderDao orderDao;
	/**
	 * this public element is a public element
	 *
	 */
	
	private final Integer[] inTypes = {
			OrderModel.ORDER_TYPE_OF_BUY_IN_STORE,
			//ç¼ºå°‘1ç§�
			};
	private Integer[] nums;
	private Double[] prices;
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	/**
	 * this public element is a public element
	 *
	 */
	
	public void save(OrderModel om) {
		orderDao.save(om);
	}

	/**
	 * this public element is a public element
	 *
	 */
	public void delete(OrderModel om) {
		orderDao.delete(om);
	}

	/**
	 * this public element is a public element
	 *
	 */
	public void update(OrderModel om) {
		orderDao.update(om);
	}

	/**
	 * this public element is a public element
	 *
	 */
	public OrderModel get(Serializable uuid) {
		return orderDao.get(uuid);
	}

	/**
	 * this public element is a public element
	 *
	 */
	public List<OrderModel> getAll() {
		return orderDao.getAll();
	}

	/**
	 * this public element is a public element
	 *
	 */
	public List<OrderModel> getAll(BaseQueryModel qm, Integer pageNum,Integer pageCount) {
		return orderDao.getAll(qm,pageNum,pageCount);
	}

	/**
	 * this public element is a public element
	 *
	 */
	public Integer getCount(BaseQueryModel qm) {
		return orderDao.getCount(qm);
	}
	
	
	
	private void funz(int i, Set<OrderDetailModel> odms, Long[] goodsUuids, GoodsModel gm, OrderDetailModel odm,Double totalPrice, OrderModel om,Integer totalNum, Double totalPrice1, OrderModel om1) {
		Long goodsUuid = goodsUuids[i];
		Integer num = nums[i];
		Double price = prices[i];
		
		totalNum+=num;
		totalPrice1+=num*price;
		
		
		odm.setNum(num);
		//è®¾ç½®è®¢å�•æ˜Žç»†ä¸­å½“å‰�è´§ç‰©å®Œæˆ�é‡�ä¸ºè®¢å�•å•†å“�è´§ç‰©æ€»é‡�
		odm.setSurplus(num);
		odm.setPrice(price);
		
		
		gm.setSegreto(goodsUuid);
		odm.setGm(gm);
		//ç»‘å®šæ˜Žç»†åˆ°è®¢å�•çš„å…³ç³»
		odm.setOm(om1);
		odms.add(odm);
	
	}
	
	private void funz2(EmpModel emInt,OrderModel omInt, Long[] goodsUuidsInt, Integer[] numsInt,Double[] pricesInt) {
		String orderNum = System.currentTimeMillis()+""+emInt.getUuid();
		omInt.setOrderNum(MD5Utils.sha256(orderNum));
		omInt.setOrderType(OrderModel.ORDER_ORDERTYPE_OF_BUY);
		omInt.setType(OrderModel.ORDER_TYPE_OF_BUY_NO_CHECK);
		omInt.setCreateTime(System.currentTimeMillis());
		omInt.setCreater(emInt);
		
		Integer totalNum = 0;
		Double totalPrice = 0.0d;
		OrderDetailModel odm = new OrderDetailModel();
		GoodsModel gm = new GoodsModel();
		//å°†è®¢å�•æ˜Žç»†ä¿¡æ�¯ç»„ç»‡åŒ…ï¼Œä¿�å­˜
		
	}
	
	/**
	 * this public element is a public element
	 *
	 */
	public void save(EmpModel emInt,OrderModel omInt, Long[] goodsUuidsInt, Integer[] numsInt,Double[] pricesInt) {
		funz2(emInt,omInt,goodsUuidsInt,numsInt,pricesInt);
		Set<OrderDetailModel> odms = new HashSet<OrderDetailModel>();
		for(int i = 0;i<goodsUuidsInt.length;i++){
		funz(i,odms,goodsUuidsInt,null, null, null, omInt,i, null, omInt);
		}
		//è®¾ç½®æ‰€æœ‰çš„è®¢å�•æ˜Žç»†é›†å�ˆ
		omInt.setOdms(odms);
		//è®¾ç½®å•†å“�æ€»æ•°é‡�
		omInt.setTotalNum(nums[0]);
		//è®¾ç½®è®¢å�•æ€»ä»·æ ¼
		omInt.setTotalPrice(prices[1]);
		//çŽ°åœ¨çš„çŠ¶æ€�ï¼šomä¸­åŒ…å�«æœ‰odms ,odmsä¸­çš„odmåŒ…å�«om
		//å½“ä½¿ç”¨çº§è�”æ·»åŠ æ—¶ï¼Œä¿�å­˜çš„æ˜¯omï¼ŒåŸºäºŽå…³è�”å…³ç³»ï¼Œä¼šçº§è�”åˆ°odmsä¸­çš„æ‰€æœ‰å¯¹è±¡
		//ç”±äºŽodmä¸­ç»‘å®šäº†ä¸Žomçš„å…³ç³»ï¼Œå› æ­¤åœ¨æ·»åŠ æ—¶ï¼Œinsertè¯­å�¥ä¸­å°†å‡ºçŽ°orderUuidè¿™ä¸ªå­—æ®µ
		orderDao.save(omInt);
	}

	
	private final Integer[] buyCheckTypes = {
			OrderModel.ORDER_TYPE_OF_BUY_NO_CHECK,
			//OrderModel.ORDER_TYPE_OF_BUY_RETURN_NO_CHECK
			};
	/**
	 * this public element is a public element
	 *
	 */
	public List<OrderModel> getAllNoCheckOrder(OrderQueryModel oqm,Integer pageNum, Integer pageCount) {
			//é‡‡è´­æœªå®¡æ ¸
			//é‡‡è´­é€€è´§æœªå®¡æ ¸
			//å°†ä¸¤ç§�çŠ¶æ€�æ��äº¤åˆ°æ•°æ�®å±‚	é‡‡è´­æœªå®¡æ ¸çŠ¶æ€�ï¼Œé‡‡è´­é€€è´§æœªå®¡æ ¸çŠ¶æ€�
			//ä¼ é€’çš„æ�¡ä»¶æ˜¯å¤šä¸ªå€¼ï¼Œå› æ­¤éœ€è¦�å°†æ•°æ�®è¿›è¡ŒåŒ…è£…ï¼Œç§°ä¸ºæ•°ç»„/é›†å�ˆ
		return orderDao.getAllByTypes(oqm,pageNum,pageCount,buyCheckTypes);
	}

	/**
	 * this public element is a public element
	 *
	 */
	public Integer getCountByTypes(OrderQueryModel oqm) {
		return orderDao.getCountByTypes(oqm,buyCheckTypes);
	}

	/**
	 * this public element is a public element
	 *
	 */
	public void buyCheckPass(Long uuid,EmpModel em) {
		//å¦‚æžœè¯¥è®¢å�•æ²¡æœ‰å®¡æ ¸
		//ä¿®æ”¹çŠ¶æ€�å°†æœªå®¡æ ¸çŠ¶æ€�ä¿®æ”¹ä¸ºå®¡æ ¸é€šè¿‡çŠ¶æ€�	ORDER_TYPE_OF_BUY_CHECK_PASS
		//å¿«ç…§æ›´æ–°
		OrderModel om = orderDao.get(uuid);
		//é€»è¾‘åˆ¤å®š
		if(!Arrays.asList(buyCheckTypes).contains(om.getType())){
			try {
				throw new AppException("å¯¹ä¸�èµ·,è¯·ä¸�è¦�è¿›è¡Œé�žæ³•æ“�ä½œï¼�");
			} catch (AppException e) {
				System.out.println("Something was wrong!");
			}
		}
		om.setType(OrderModel.ORDER_TYPE_OF_BUY_CHECK_PASS);
		//è°�ä»€ä¹ˆæ—¶é—´å®¡æ ¸çš„ï¼Ÿ
		om.setCheckTime(System.currentTimeMillis());
		om.setChecker(em);
	}

	/**
	 * this public element is a public element
	 *
	 */
	public void buyCheckNoPass(Long uuid,EmpModel em) {
		OrderModel om = orderDao.get(uuid);
		//é€»è¾‘åˆ¤å®š
		if(!Arrays.asList(buyCheckTypes).contains(om.getType())){
			try {
				throw new AppException("å¯¹ä¸�èµ·,è¯·ä¸�è¦�è¿›è¡Œé�žæ³•æ“�ä½œï¼�");
			} catch (AppException e) {
				System.out.println("Something was wrong!");
			}
		}
		om.setType(OrderModel.ORDER_TYPE_OF_BUY_CHECK_NO_PASS);
		om.setCheckTime(System.currentTimeMillis());
		om.setChecker(em);
	}
	/**
	 * this public element is a public element
	 *
	 */
	private final Integer[] taskTypes = {
			OrderModel.ORDER_TYPE_OF_BUY_CHECK_PASS,
			OrderModel.ORDER_TYPE_OF_BUY_BUYING,
			OrderModel.ORDER_TYPE_OF_BUY_IN_STORE,
			OrderModel.ORDER_TYPE_OF_BUY_END,
			//ç¼ºå°‘12ç§�
			//å…±è®¡16ç§�çŠ¶æ€�
			};
	/**
	 * this public element is a public element
	 *
	 */
	public List<OrderModel> getAllTasks(OrderQueryModel oqm, Integer pageNum,Integer pageCount) {
		//èŽ·å�–çš„æ•°æ�®æœ‰å“ªäº›ï¼Ÿæ— è®ºä½•ç§�ç±»åˆ«çš„è®¢å�•ï¼Œå�ªè¦�æ˜¯å®¡æ ¸é€šè¿‡å�Žï¼Œæ‰€æœ‰çŠ¶æ€�å�‡æ˜¾ç¤º
		return orderDao.getAllByTypes(oqm, pageNum, pageCount, taskTypes);
	}
	
	/**
	 * this public element is a public element
	 *
	 */
	public static Integer[] taskTypes2 = {
			OrderModel.ORDER_TYPE_OF_BUY_CHECK_PASS,
			//ç¼ºå°‘3ç§�
			//å…±è®¡4ç§�çŠ¶æ€�
			};
	
	/**
	 * this public element is a public element
	 *
	 */
	public static final Set<Integer> taskTypesSet;
	static{
		taskTypesSet = new HashSet<Integer>();
		taskTypesSet.add(OrderModel.ORDER_TYPE_OF_BUY_CHECK_PASS);
		
	}
	
	/**
	 * this public element is a public element
	 *
	 */
	public void assignTask(OrderModel om) {
		OrderModel temp = orderDao.get(om.getUuid());
		if(!Arrays.asList(taskTypes2).contains(temp.getType())){
			try {
				throw new AppException("å¯¹ä¸�èµ·,è¯·ä¸�è¦�è¿›è¡Œé�žæ³•æ“�ä½œï¼�");
			} catch (AppException e) {
				System.out.println("Something was wrong!");
			}
		}
		//å½“å‰�ä»»åŠ¡åˆ†é…�å®Œæ¯•å�Žï¼Œåˆ‡æ�¢çŠ¶æ€�ä¸ºæ­£åœ¨é‡‡è´­
		//é‡‡è´­å’Œé‡‡è´­é€€è´§éƒ½å½’å�Œä¸€ä¸ªäººå®¡æ‰¹
		
		temp.setType(OrderModel.ORDER_TYPE_OF_BUY_BUYING);
		temp.setCompleter(om.getCompleter());
	}

	/**
	 * this public element is a public element
	 *
	 */
	public List<OrderModel> getAllByCompleter(OrderQueryModel oqm,Integer pageNum, Integer pageCount, EmpModel login) {
		oqm.setCompleter(login);
		return orderDao.getAll(oqm, pageNum, pageCount);
	}

	/**
	 * this public element is a public element
	 *
	 */
	public void endTask(Long uuid) {
		OrderModel om = orderDao.get(uuid);
		
		//ä»…éœ€è¦�ä¿®æ”¹ä¸€ä¸ªçŠ¶æ€�
		om.setType(OrderModel.ORDER_TYPE_OF_BUY_IN_STORE);
	}


	/**
	 * this public element is a public element
	 *
	 */
	public List<OrderModel> getAllNotIn(OrderQueryModel oqm, Integer pageNum,Integer pageCount) {
		//
		return orderDao.getAllByTypes(oqm, pageNum, pageCount, inTypes);
	}

}
