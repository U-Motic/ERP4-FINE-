<%-- input.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<link href="css/index.css" rel="stylesheet" type="text/css" />
<link href="css/tagStyles.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<%-- Here starts the javascript call function --%>
<script type="text/javascript" src="input.js">
</script>
	<div styleclass="content-right">
	<div styleclass="content-r-pic_w">
		<div style="margin:8px auto auto 12px;margin-top:6px">
			<span styleclass="page_title">部门管理</span>
		</div>
	</div>
	<div styleclass="content-text">
		<div styleclass="square-order">
			<s:form action="dep_save" method="post">
			<s:hidden name="dm.uuid"/>
  			<div style="border:1px solid #cecece;">
				<table styleclass="table">
				  <tr styleclass="trF">
				    <td>&nbsp;</td>
				  </tr>
				</table>
				<table styleclass="table100">
				    <tr  styleclass="trF">
				      <td styleclass="">部门名称</td>
				      <td width="32%">
				      	<s:textfield name="dm.name" size="25"/>
				      </td>
				      <td styleclass="td18">电话</td>
				      <td width="32%">
				      	<s:textfield name="dm.tele" size="25"/>
				      </td>
				    </tr>
				    <tr  styleclass="trF">
				      <td colspan="4">&nbsp;</td>
				    </tr>
				</table>
				
			</div>
			<div styleclass="order-botton">
				<div style="margin:1px auto auto 1px;">
					<table width="100%"  border="0" cellpadding="0" cellspacing="0">
					  <tr>
					    <td>
					    	<a href="javascript:void(0)" id="commit"><img src="images/order_tuo.gif" border="0" /></a>
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