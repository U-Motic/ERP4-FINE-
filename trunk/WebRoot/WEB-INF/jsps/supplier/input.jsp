<%-- input.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%-- css link --%>
<link href="css/index.css" rel="stylesheet" type="text/css" />
<link href="css/tagStyles.css" rel="stylesheet" type="text/css" />
<div styleclass="content-right">
	<div styleclass="content-r-pic_w">
		<div style="margin:8px auto auto 12px;margin-top:6px">
			<span styleclass="page_title">供应商管理</span>
		</div>
	</div>
	<div styleclass="content-text">
		<div styleclass="square-order">
			<s:form action="supplier_save" method="post">
			<s:hidden name="sm.uuid"/>
  			<div style="border:1px solid #cecece;">
				<table styleclass="table100">
				  <tr styleclass="trF">
				    <td>&nbsp;</td>
				  </tr>
				</table>
				<table styleclass="table100">
				    <tr styleclass="trF">
				      <td styleclass="td18">供应商名称</td>
				      <td width="82%" colspan="3">
				      	<s:textfield name="sm.name" size="82"/>
				      </td>
				    </tr>
				    <tr styleclass="trF">
				      <td colspan="4">&nbsp;</td>
				    </tr>
				    <tr styleclass="trF">
				      <td styleclass="td18">供应商地址</td>
				      <td width="82%" colspan="3">
				      	<s:textfield name="sm.address" size="82"/>
				      </td>
				    </tr>
				    <tr styleclass="trF">
				      <td colspan="4">&nbsp;</td>
				    </tr>
				    <tr styleclass="trF">
				      <td styleclass="td18">联系人</td>
				      <td width="32%">
				      	<s:textfield name="sm.contact" size="25"/>
				      </td>
				      <td styleclass="td2no30">电话</td>
				      <td width="32%">
				      	<s:textfield name="sm.tele" size="25"/>
				      </td>
				    </tr>
				    <tr styleclass="trF">
				      <td colspan="4">&nbsp;</td>
				    </tr>
				    <tr styleclass="trF">
				      <td styleclass="td18">送货方式</td>
				      <td width="32%">
				      		<s:select name="sm.needs" list="@cn.itcast.invoice.invoice.supplier.vo.SupplierModel@needsMap" cssStyle="width:190px"></s:select>
				      </td>
				      <td styleclass="td2no30">&nbsp;</td>
				      <td width="32%">
				      	&nbsp;
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