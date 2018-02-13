<%-- input.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
			<span styleclass="page_title">员工管理</span>
		</div>
	</div>
	<div styleclass="content-text">
		<div styleclass="square-order">
			<s:form action="emp_save" method="post"> 
			<s:hidden name="em.uuid"/>
  			<div style="border:1px solid #cecece;">
				<table styleclass="table100">
				  <tr styleclass="trF">
				    <td>&nbsp;</td>
				  </tr>
				</table>
				<table styleclass="table100">
				    <tr styleclass="trF">
				      <td styleclass="td18">用&nbsp;户&nbsp;名</td>
				      <td width="32%">
				      	<s:textfield name="em.userName" size="25"/>
				      </td>
				      <td styleclass="td2no30">真实姓名</td>
				      <td width="32%">
				      	<s:textfield name="em.name" size="25"/>
					  </td>
				    </tr>
				    <tr styleclass="trF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr styleclass="trF">
				      <td styleclass="tdalign">密&nbsp;&nbsp;&nbsp;&nbsp;码</td>
				      <td>
				      	<s:textfield name="em.pwd" size="25"/>
				      </td>
				      <td styleclass="tdalign">确认密码</td>
				      <td >
				      	<input type="text" size="25"/>
				      </td>
				    </tr>
				     <tr styleclass="trF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr styleclass="trF">
				      <td styleclass="tdnowidth">电子邮箱</td>
				      <td>
				      	<s:textfield name="em.email" size="25"/>
				      <td styleclass="tdalign">电话号码</td>
				      <td>
				      	<s:textfield name="em.tele" size="25"/>
					  </td>
				     </tr>
				      <tr styleclass="trF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr styleclass="trF">
				      <td styleclass="tdnowidth">性&nbsp;&nbsp;&nbsp;&nbsp;别</td>
				      <td>
				      	<s:select name="em.gender" list="@cn.itcast.invoice.auth.emp.vo.EmpModel@genderMap" cssStyle="width:190px"></s:select>
					  </td>
				      <td styleclass="tdalign">地&nbsp;&nbsp;&nbsp;&nbsp;址</td>
				      <td>
				      	<s:textfield name="em.address" size="25"/>
					  </td>
				    </tr>
				     <tr styleclass="trF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr styleclass="trF">
				      <td styleclass="tdnowidth">出生日期</td>
				      <td>
				      	<input type="text" value= request.getParameter(em.birthdayView) size="25" onfocus="c.showMoreDay=false;c.show(this);" readonly="true"/>
				      	<s:hidden name="em.birthday"/>
					  </td>
				      <td styleclass="tdalign">所属部门</td>
				      <td>
				      	<s:select name="em.dm.uuid" list="depList" listKey="uuid" listValue="name" cssStyle="width:190px"></s:select>
					  </td>
				    </tr>
				    <tr styleclass="trF">
				      <td colspan="4">&nbsp;</td>
				    </tr>
				    <tr styleclass="trF">
				      <td styleclass="td18">角色名称</td>
				      <td width="82%" colspan="3">
				      	<input type="checkbox" id="all">全选&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				      	<input type="checkbox" id="reverse">反选
				      </td>
				    </tr>
				    <tr styleclass="trF">
				      <td styleclass="td18">&nbsp;</td>
				      <td width="82%" colspan="3">
				      	<s:checkboxlist name="roleUuids" list="roleList" listKey="uuid" listValue="name"></s:checkboxlist>
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