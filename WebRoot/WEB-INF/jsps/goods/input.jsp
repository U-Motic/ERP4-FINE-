<%-- input.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<link href="css/index.css" rel="stylesheet" type="text/css" />
<link href="css/tagStyles.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="js/Calendar.js"></script>
<%-- Here starts the javascript call function --%>
<script type="text/javascript" src="input.js">
</script>
<div styleclass="content-right">
	<div styleclass="content-r-pic_w">
		<div style="margin:8px auto auto 12px;margin-top:6px">
			<span styleclass="page_title">商品管理</span>
		</div>
	</div>
	<div styleclass="content-text">
		<div styleclass="square-order">
			<s:form action="goods_save" method="post">
			<s:hidden name="gm.uuid"/>
  			<div style="border:1px solid #cecece;">
				<table styleclass="table100">
				  <tr styleclass="trF">
				    <td>&nbsp;</td>
				  </tr>
				</table>
				<table styleclass="table100">
				    <tr styleclass="trF">
				      <td styleclass="td18">供&nbsp;应&nbsp;商</td>
				      <td width="32%">
				      	<s:select id="supplier" list="supplierList" listKey="uuid" listValue="name" cssStyle="width:190px"></s:select>
				      </td>
				      <td styleclass="td2no30">商品类别</td>
				      <td width="32%">
				      	<s:select name="gm.gtm.uuid" id="goodsType" list="gtmList" listKey="uuid" listValue="name" cssStyle="width:190px"></s:select>
					  </td>
				    </tr>
				    <tr styleclass="trF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr styleclass="trF">
				      <td styleclass="tdalign">商品名称</td>
				      <td>
				      	<s:textfield name="gm.name" size="25"/>
				      </td>
				      <td styleclass="tdalign">产&nbsp;&nbsp;&nbsp;&nbsp;地</td>
				      <td >
				      	<s:textfield name="gm.origin" size="25"/>
				      </td>
				    </tr>
				     <tr styleclass="trF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr  styleclass="trF">
				      <td styleclass="tdnowidth">生产厂家</td>
				      <td>
				      	<s:textfield name="gm.producer" size="25"/>
				      <td styleclass="tdalign">单&nbsp;&nbsp;&nbsp;&nbsp;位</td>
				      <td>
				      	<s:textfield name="gm.unit" size="25"/>
					  </td>
				     </tr>
				    <tr styleclass="trF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr  styleclass="trF">
				      <td styleclass="tdnowidth">进货单价</td>
				      <td>
				      	<s:textfield name="gm.inPrice" size="25"/>
					  </td>
				      <td styleclass="tdalign">销售单价</td>
				      <td>
				      	<s:textfield name="gm.outPrice" size="25"/>
					  </td>
				    </tr>
				    <tr styleclass="trF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				</table>
			</div>
			<div styleclass="order-botton">
				<div style="margin:1px auto auto 1px;">
					<table styleclass="table100">
					  <tr>
					    <td>
					    	<a href="javascript:document.forms[0].submit()"><img src="images/order_tuo.gif" border="0" /></a>
					    </td>
					    <td>&nbsp;</td>
					    <td><a href="#"><img src="images/order_tuo.gif" border="0" /></a></td>
					    <td>&nbsp;</td>
					    <td><a href="#"><img src="images/order_tuo.gif" border="0" /></a></td>
					  </tr>
					</table>
				</div>
			</div>
			</s:form>
		</div><!--"square-order"end-->
	</div><!--"content-text"end-->
	<div styleclass="content-bbg"><img src="images/content_bbg.jpg" /></div>
</div>
<%-- end of input.jsp --%>