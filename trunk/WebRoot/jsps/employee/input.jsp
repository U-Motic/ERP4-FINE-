<%-- input.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<link href="../../css/index.css" rel="stylesheet" type="text/css" />
<link href="../../css/tagStyles.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript" src="../../js/Calendar.js"></script>
<%-- Here starts the javascript call function --%>
<script type="text/javascript" src="input.js">
</script>
<div class="content-right">
	<div class="content-r-pic_w">
		<div style="margin:8px auto auto 12px;margin-top:6px">
			<span class="page_title">员工管理</span>
		</div>
	</div>
	<div class="content-text">
		<div class="square-order">
			<form action="list.jsp" method="post"> 
  			<div style="border:1px solid #cecece;">
				<table class="table100">
				  <tr class="trF">
				    <td>&nbsp;</td>
				  </tr>
				</table>
				<table class="table100">
				    <tr class="trF">
				      <td class="td18">用&nbsp;户&nbsp;名</td>
				      <td width="32%">
				      	<input type="text" size="25"/>
				      </td>
				      <td class="td2no30">真实姓名</td>
				      <td width="32%">
				      	<input type="text" size="25"/>
					  </td>
				    </tr>
				    <tr class="trF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr class="trF">
				      <td class="tdalign">密&nbsp;&nbsp;&nbsp;&nbsp;码</td>
				      <td>
				      	<input type="text" size="25"/>
				      </td>
				      <td class="tdalign">确认密码</td>
				      <td >
				      	<input type="text" size="25"/>
				      </td>
				    </tr>
				     <tr class="trF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr class="trF">
				      <td class="tdnowidth">电子邮箱</td>
				      <td>
				      	<input type="text" size="25"/>
				      <td class="tdalign">电话号码</td>
				      <td>
				      	<input type="text" size="25"/>
					  </td>
				     </tr>
				      <tr class="trF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr class="trF">
				      <td class="tdnowidth">性&nbsp;&nbsp;&nbsp;&nbsp;别</td>
				      <td>
			
							
														
								<optimyth:textOptionsList
								property="WIDTH:190PX"
							
								value="-1"
								value="1"
								value="0"
							 />
					  </td>
				      <td class="tdalign">地&nbsp;&nbsp;&nbsp;&nbsp;址</td>
				      <td>
				      	<input type="text" size="25"/>
					  </td>
				    </tr>
				     <tr class="trF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr  class="trF">
				      <td class="tdnowidth">出生日期</td>
				      <td>
				      	<input type="text" size="25" onfocus="c.showMoreDay=false;c.show(this);" readonly="true"/>
					  </td>
				      <td class="tdalign">所属部门</td>
				      <td>
				      	

							
								<optimyth:textOptionsList
								property="WIDTH:190PX"
								class="kuan"
								value="-1"
								value="1"
								value="2"
							 />
						
					  </td>
				    </tr>
				    <tr class="trF">
				      <td colspan="4">&nbsp;</td>
				    </tr>
				    <tr class="trF">
				      <td class="td18">角色名称</td>
				      <td width="82%" colspan="3">
				      	<input type="checkbox" id="all">全选&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				      	<input type="checkbox" id="reverse">反选
				      </td>
				    </tr>
				    <tr class="trF">
				      <td class="td18">&nbsp;</td>
				      <td width="82%" colspan="3">
				      	<input type="checkbox">经理
				      	<input type="checkbox">主管
				      	<input type="checkbox">员工
				      	<input type="checkbox">经理
				      	<input type="checkbox">主管
				      	<input type="checkbox">员工
				      	<input type="checkbox">经理
				      	<input type="checkbox">主管
				      	<input type="checkbox">员工
				      </td>
				    </tr>
				    <tr class="trF">
				      <td colspan="4">&nbsp;</td>
				    </tr>
				</table>
			</div>
			<div class="order-botton">
				<div style="margin:1px auto auto 1px;">
					<table class="table100">
					  <tr>
					    <td>
					    	<a href="javascript:document.forms[0].submit()"><img src="../../images/order_tuo.gif" border="0" /></a>
					    </td>
					    <td>&nbsp;</td>
					    <td><a href="#"><img src="../../images/order_tuo.gif" border="0" /></a></td>
					    <td>&nbsp;</td>
					    <td><a href="#"><img src="../../images/order_tuo.gif" border="0" /></a></td>
					  </tr>
					</table>
				</div>
			</div>
			</form>
		</div><!--"square-order"end-->
	</div><!--"content-text"end-->
	<div class="content-bbg"><img src="../../images/content_bbg.jpg" /></div>
</div>
<%-- end of input.jsp --%>