<%-- input.jsp file --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%-- link to css --%>
<link href="css/index.css" rel="stylesheet" type="text/css" />
<link href="css/tagStyles.css" rel="stylesheet" type="text/css" />
<div styleclass="content-right">
	<div styleclass="content-r-pic_w">
		<div style="margin:8px auto auto 12px;margin-top:6px">
			<span styleclass="page_title">商品类别管理</span>
		</div>
	</div>
	<div styleclass="content-text">
		<div styleclass="square-order">
			<s:form action="goodsType_save" method="post">
  			<div style="border:1px solid #cecece;">
				<table styleclass="table100">
				  <tr styleclass="trF">
				    <td>&nbsp;</td>
				  </tr>
				</table>
				<table styleclass="table100">
				    <tr  styleclass="trF">
				      <td styleclass="td18">供应商</td>
				      <td width="82%" colspan="3">
				      	<s:select name="gm.sm.uuid" list="supplierList" listKey="uuid" listValue="name" cssstyleclass="kuan" cssStyle="width:190px"></s:select>
				      </td>
				    </tr>
				    <tr  styleclass="trF">
				      <td colspan="4">&nbsp;</td>
				    </tr>
				    <tr  styleclass="trF">
				      <td styleclass="td18">商品类别名称</td>
				      <td width="82%" colspan="3">
				      	<s:textfield name="gm.name" size="25"/>
				      </td>
				    </tr>
				    <tr  styleclass="trF">
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