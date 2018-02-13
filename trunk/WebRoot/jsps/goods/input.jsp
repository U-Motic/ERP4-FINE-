<%-- input.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<link href="../../css/index.css" rel="stylesheet" type="text/css" />
<link href="../../css/tagStyles.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../../js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="../../js/Calendar.js"></script>
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
			<form action="list.jsp" method="post">
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
				      		<optimyth:textOptionsList
								property="WIDTH:190PX"
								styleclass="kuan"
								value="-1"
								value="1"
								value="2"
							 />
				      </td>
				      <td styleclass="td2no30">商品类别</td>
				      <td width="32%">
				      		
				      		
							
								<optimyth:textOptionsList
								property="WIDTH:190PX"
								styleclass="kuan"
								value="-1"
								value="1"
								value="2"
							 />
							 
					  </td>
				    </tr>
				    <tr styleclass="trF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr styleclass="trF">
				      <td styleclass="tdalign">商品名称</td>
				      <td>
				      	<input type="text" size="25"/>
				      </td>
				      <td styleclass="tdalign">产&nbsp;&nbsp;&nbsp;&nbsp;地</td>
				      <td >
				      	<input type="text" size="25"/>
				      </td>
				    </tr>
				     <tr styleclass="trF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr styleclass="trF">
				      <td styleclass="tdnowidth">生产厂家</td>
				      <td>
				      	<input type="text" size="25"/>
				      <td styleclass="tdalign">单&nbsp;&nbsp;&nbsp;&nbsp;位</td>
				      <td>
				      	<input type="text" size="25"/>
					  </td>
				     </tr>
				    <tr styleclass="trF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr styleclass="trF">
				      <td styleclass="tdnowidth">进货单价</td>
				      <td>
				      	<input type="text" size="25"/>
					  </td>
				      <td styleclass="tdalign">销售单价</td>
				      <td>
				      	<input type="text" size="25"/>
					  </td>
				    </tr>
				    <tr styleclass="trF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr styleclass="trF">
				      <td styleclass="tdnowidth">体&nbsp;&nbsp;&nbsp;&nbsp;积</td>
				      <td>
				      	<input type="text" size="25"/>
					  </td>
				      <td styleclass="tdalign">&nbsp;</td>
				      <td>&nbsp;</td>
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
	<div styleclass="content-bbg"><img src="../../images/content_bbg.jpg" /></div>
</div>
<%-- end of input.jsp --%>