package cn.itcast.invoice.invoice.order.web;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import cn.itcast.invoice.auth.emp.business.ebi.EmpEbi;
import cn.itcast.invoice.auth.emp.vo.EmpModel;
import cn.itcast.invoice.invoice.goods.business.ebi.GoodsEbi;
import cn.itcast.invoice.invoice.goods.vo.GoodsModel;
import cn.itcast.invoice.invoice.goodstype.business.ebi.GoodsTypeEbi;
import cn.itcast.invoice.invoice.goodstype.vo.GoodsTypeModel;
import cn.itcast.invoice.invoice.order.business.ebi.OrderDetailEbi;
import cn.itcast.invoice.invoice.order.business.ebi.OrderEbi;
import cn.itcast.invoice.invoice.order.vo.OrderDetailModel;
import cn.itcast.invoice.invoice.order.vo.OrderModel;
import cn.itcast.invoice.invoice.order.vo.OrderQueryModel;
import cn.itcast.invoice.invoice.store.business.ebi.StoreEbi;
import cn.itcast.invoice.invoice.supplier.business.ebi.SupplierEbi;
import cn.itcast.invoice.invoice.supplier.vo.SupplierModel;
import cn.itcast.invoice.util.base.BaseAction;
/**
 * this class extends BaseAction
 *
 */
public class OrderAction extends BaseAction{
	
	
	private final static int seven = 7;
	/**
	 * this public elfgjhement is a public element
	 *
	 */
	public Long supplierUuid;
	/**
	 * this public element is a public element
	 *
	 */
	public Long goodsTypeUuid;
	/**
	 * this public element is a public element
	 *
	 */
	public Long goodsUuid;
	/**
	 * this public element is a public element
	 *
	 */
	public String used;
	/**
	 * this public element is a public element
	 *
	 */
	
	private List<GoodsTypeModel> gtmList;
	private List<GoodsModel> gmList;
	private GoodsModel gm;
	
	/**
	 * this public element is a public element
	 *
	 */
	/**
	 * this public element is a public element
	 *
	 */
	public Long[] goodsUuids;
	/**
	 * this public element is a public element
	 *
	 */
	public Integer[] nums;
	/**
	 * this public element is a public element
	 *
	 */
	public Double[] prices;
	
	/**
	 * this public element is a public element
	 *
	 */
	public Long odmUuid;
	private OrderDetailModel odm;
	
	/**
	 * this public element is a public element
	 *
	 */
	public OrderModel om = new OrderModel();
	/**
	 * this public element is a public element
	 *
	 */
	public OrderQueryModel oqm = new OrderQueryModel();

	private OrderEbi orderEbi;
	private SupplierEbi supplierEbi;
	private GoodsTypeEbi goodsTypeEbi;
	private GoodsEbi goodsEbi;
	private EmpEbi empEbi;
	private StoreEbi storeEbi;
	private OrderDetailEbi orderDetailEbi;
	
	/**
	 * this public element is a public element
	 *
	 */
	public void setStoreEbi(StoreEbi storeEbi) {
		this.storeEbi = storeEbi;
	}

	/**
	 * this public element is a public element
	 *
	 */
	public void setEmpEbi(EmpEbi empEbi) {
		this.empEbi = empEbi;
	}

	/**
	 * this public element is a public element
	 *
	 */
	public void setGoodsEbi(GoodsEbi goodsEbi) {
		this.goodsEbi = goodsEbi;
	}

	/**
	 * this public element is a public element
	 *
	 */
	public void setGoodsTypeEbi(GoodsTypeEbi goodsTypeEbi) {
		this.goodsTypeEbi = goodsTypeEbi;
	}

	/**
	 * this public element is a public element
	 *
	 */
	public void setOrderEbi(OrderEbi orderEbi) {
		this.orderEbi = orderEbi;
	}

	/**
	 * this public element is a public element
	 *
	 */
	public String list(){
		setDataTotal(orderEbi.getCount(oqm));
		List<OrderModel> orderList = orderEbi.getAll(oqm,pageNum,pageCount);
		final String rep="orderlist";
		put(rep,orderList);
		return LIST;
	}

	/**
	 * this public element is a public element
	 *
	 */
	public String save(){
		if(om.getUuid()== null){
			orderEbi.save(om);
		}else{
			orderEbi.update(om);
		}
		return TO_LIST;
	}

	/**
	 * this public element is a public element
	 *
	 */
	public String input(){
		if(om.getUuid()!=null){
			om = orderEbi.get(om.getUuid());
		}
		return INPUT;
	}
	
	/**
	 * this method returns the string buyinput
	 * @param flag
	 * @param supplierList
	 * @param i
	 * @return
	 */
	private String funct1(int flag, List<SupplierModel> supplierList, int i) {
		
		if(flag!=1) {
			supplierList.remove(i);
	    }
	

	List<GoodsTypeModel> gtmListint = goodsTypeEbi.getAllUnionBySupplier(supplierList.get(0).getUuid());
	List<GoodsModel> gmListint = goodsEbi.getAllByGtmUuid(gtmListint.get(0).getUuid());
	put("supplierList",supplierList);
	put("gtmList",gtmListint);
	put("gmList",gmListint);
	return "buyInput";

	}
	
	/**
	 * this public element is a public element
	 *
	 */
	public void buyInput(){
		List<SupplierModel> supplierList = supplierEbi.getAll();
		int flag=0;
		for(int i = supplierList.size()-1;i>=0;i--){
			flag=0;
			SupplierModel sm = supplierList.get(i);
			List<GoodsTypeModel> gtms = goodsTypeEbi.getAllBySupplier(sm.getUuid());
			for(int j = gtms.size()-1;j>=0;j--){
				GoodsTypeModel gtm = gtms.get(j);
				if(gtm.getGms().size() > 0){
					flag=1;
					continue;
				}
				}
			}
			
			
			funct1(flag,supplierList,seven);
		}
	

	/**
	 * this public element is a public element
	 *
	 */
	public String delete(){
		orderEbi.delete(om);
		return TO_LIST;
	}
	
	
	/**
	 * this public element is a public element
	 *
	 */
	public GoodsModel getGm() {
		return gm;
	}

	

	/**
	 * this public element is a public element
	 *
	 */
	public String ajaxGetGtmAndGm(){
		gtmList = goodsTypeEbi.getAllUnionBySupplier(supplierUuid);
		gmList = goodsEbi.getAllByGtmUuid(gtmList.get(0).getUuid());
		gm = gmList.get(0);
		return "ajaxGetGtmAndGm";
	}
	
	/**
	 * this method returns the string ajax
	 * @param flag
	 * @param i
	 * @param uuids
	 * @return
	 */
private String funz2(int flag, int i, Set<Long> uuids) {
if(flag ==1){
	i=0;
} else gtmList.remove(i);



gmList = goodsEbi.getAllByGtmUuid(gtmList.get(0).getUuid());
for(int i1 = gmList.size()-1;i1>=0;i1--){
GoodsModel gmInt = gmList.get(i1);
if(uuids.contains(gmInt.getUuid())){
gmList.remove(i1);
}
}

gm = gmList.get(0);
return "ajaxGetGtmAndGm";

}
	
	
	/**
	 * this public element is a public element
	 *
	 */
	public void ajaxGetGtmAndGm2(){
		String[] uuidsArr = used.split(",");
		Set<Long> uuids = new HashSet<Long>();
		for(String uuidStr:uuidsArr){
			uuids.add(new Long(uuidStr));}
		gtmList = goodsTypeEbi.getAllUnionBySupplier(supplierUuid);
		int flag=0;
		for(int i = gtmList.size()-1;i>=0;i--){
			flag = 0;
			GoodsTypeModel gtm = gtmList.get(i);
			gmList = goodsEbi.getAllByGtmUuid(gtm.getUuid());
			for(GoodsModel temp:gmList){
				if(!uuids.contains(temp.getUuid())){
					flag = 1;
					funz2(flag,i,uuids);
			}}}}
	
	/**
	 * this public element is a public element
	 *
	 */
	public String ajaxGetGm(){
		gmList = goodsEbi.getAllByGtmUuid(goodsTypeUuid);
		gm = gmList.get(0);
		return "ajaxGetGm";
	}
	
	/**
	 * this public element is a public element
	 *
	 */
	public String ajaxGetOne(){
		gm = goodsEbi.get(goodsUuid);
		return "ajaxGetOne";
	}
	
	
	/**
	 * this method returs to_list
	 * @return
	 */
	public String buyOrder(){
			orderEbi.save(getLogin(),om,goodsUuids,nums,prices);
		return TO_LIST;
	}
	
	/**
	 * this public element is a public element
	 *
	 */
	public String buyDetailList(){
		om = orderEbi.get(om.getUuid());
		return "buyDetailList";
	}
	
	/**
	 * 
	 * @param check insert 0 to get buyCheck, 1 to get toBuyCheckDetail, 2 to get buyCheckPass, 3 to get buyCheckNoPass
	 * @return a string with the desidered value
	 */
	public String Check(int check){
		String toReturn = null;
		if (check==0) {
		setDataTotal(orderEbi.getCountByTypes(oqm));
		List<OrderModel> orderList = orderEbi.getAllNoCheckOrder(oqm,pageNum,pageCount);
			final String rep="orderlist";
		put(rep,orderList);
		toReturn= "buyCheck";
		}
		else if (check==1) {
			om = orderEbi.get(om.getUuid());
			toReturn = "toBuyCheckDetail";
		}
		else if (check==2) {
			orderEbi.buyCheckPass(om.getUuid(),getLogin());
			toReturn = "toBuyCheck";
		}
		else if (check==3) {
			orderEbi.buyCheckNoPass(om.getUuid(),getLogin());
			toReturn = "toBuyCheck";
		}
		else {
			toReturn = "The Value is not correct, please read documentation!";
		}
		return toReturn;
	}

	/**
	 * 
	 * @param check insert 0 to get assignTask, 1 to get assignTaskList, 2 to get assignTaskDetail
	 * @return a string with the desidered value
	 */
	public String assignTask(int check){
		String toReturn = null;
		if (check==0) {
		orderEbi.assignTask(om);
		toReturn = "toAssignTaskList";
		} else
		if (check ==1) {
			List<OrderModel> orderList = orderEbi.getAllTasks(oqm,pageNum,pageCount);
			put("orderList",orderList);
			toReturn = "assignTaskList";
		}
		else if (check ==2) {
			Long depUuid = getLogin().getDm().getUuid();
			List<EmpModel> empList = empEbi.getAllByDep(depUuid);
			put("empList",empList);
			om = orderEbi.get(om.getUuid());
			toReturn = "assignTaskDetail";
		}
		else {
			toReturn = "The Value is not correct, please read documentation!";
		}
		return toReturn;
	}

}
