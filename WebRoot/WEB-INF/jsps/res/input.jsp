<%-- input.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<link href="css/index.css" rel="stylesheet" type="text/css" />
<link href="css/tagStyles.css" rel="stylesheet" type="text/css" />
<%-- jquery lib --%>
<script type="text/javascript" src="js/Calendar.js"></script>
<div styleclass="content-right">
	<div styleclass="content-r-pic_w">
		<div style="margin:8px auto auto 12px;margin-top:6px">
			<span styleclass="page_title">资源管理</span>
		</div>
	</div>
	<div styleclass="content-text">
		<div styleclass="square-order">
			<s:form action="res_save" method="post">
			<s:hidden name="rm.uuid"/>
  			<div style="border:1px solid #cecece;">
				<table styleclass="table100">
				  <tr styleclass="trF">
				    <td>&nbsp;</td>
				  </tr>
				</table>
				<table styleclass="table100">
				    <tr  styleclass="trF">
				      <td styleclass="td2no30">资源名称</td>
				      <td width="82%" colspan="3">
				      	<s:textfield name="rm.name" size="82"/>
				      </td>
				    </tr>
				    <tr  styleclass="trF">
				      <td colspan="4">&nbsp;</td>
				    </tr>
				    <tr  styleclass="trF">
				      <td styleclass="td18">资源值</td>
				      <td width="82%" colspan="3">
				      	<s:textfield name="rm.url" size="82"/>
				      </td>
				    </tr>
				    <tr styleclass="trF">
					  <td colspan="4">&nbsp;</td>
					</tr>
					 <tr  styleclass="trF">
				      <td styleclass="td18">角色名称</td>
				      <td width="82%" colspan="3">
				      	<input type="checkbox" id="all2">全选&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				      	<input type="checkbox" id="reverse2">反选
				      </td>
				    </tr>
				    <tr styleclass="trF">
				      <td styleclass="td18">&nbsp;</td>
				      <td width="82%" colspan="3">
				      	<s:checkboxlist name="roleUuids" list="roleList" listKey="uuid" listValue="name"></s:checkboxlist>
				      </td>
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