<%-- changePwd.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%-- Here starts the javascript call function --%>
<link href="css/index.css" rel="stylesheet" type="text/css" />
<link href="css/tagStyles.css" rel="stylesheet" type="text/css" />
<div styleclass="content-right">
	<div styleclass="content-r-pic_w">
		<div style="margin:8px auto auto 12px;margin-top:6px">
			<span styleclass="page_title">修改密码</span>
		</div>
	</div>
	<div styleclass="content-text">
		<div styleclass="square-order">
			<s:form action="emp_changePwd" method="post">
  			<div style="border:1px solid #cecece;">
				<table styleclass="table100">
				  <tr styleclass="trF">
				    <td>&nbsp;</td>
				  </tr>
				</table>
				<table width="100%"  border="0" cellpadding="0" cellspacing="0">
					<tr  styleclass="trF">
				      <td styleclass="tdalign">原始密码</td>
				      <td colspan="3">
				      	<s:password name="em.pwd" size="25"/>
				      </td>
				    </tr>
				    <tr styleclass="trF">
					  <td colspan="4">&nbsp;</td>
					</tr>
					<tr  styleclass="trF">
				      <td styleclass="tdalign">新&nbsp;密&nbsp;码</td>
				       <td colspan="3">
				      	<s:password name="newPwd" size="25"/>
				      </td>
				    </tr>
				    <tr styleclass="trF">
					  <td colspan="4">&nbsp;</td>
					</tr>
					<tr  styleclass="trF">
				      <td styleclass="tdalign">确认密码</td>
				       <td colspan="3">
				      	<input type="password" size="25"/>
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
					    	<a href="javascript:void(0)" onclick="document.forms[0].submit()"><img src="images/order_tuo.gif" border="0" /></a>
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
<%-- end of changePwd.jsp --%>