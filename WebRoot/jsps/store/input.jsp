<%-- input.jsp.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%-- css block --%>
<link href="../../css/index.css" rel="stylesheet" type="text/css" />
<link href="../../css/tagStyles.css" rel="stylesheet" type="text/css" />
<div styleclass="content-right">
	<div styleclass="content-r-pic_w">
		<div style="margin:8px auto auto 12px;margin-top:6px">
			<span styleclass="page_title">仓库管理</span>
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
				    <tr  styleclass="trF">
				      <td styleclass="td18">仓库名称</td>
				      <td width="32%">
				      	<input type="text" size="25"/>
				      </td>
				      <td styleclass="td2no30">仓库地址</td>
				      <td width="32%">
				      	<input type="text" size="25"/>
				      </td>
				    </tr>
				    <tr styleclass="trF">
				      <td colspan="4">&nbsp;</td>
				    </tr>
				    <tr styleclass="trF">
				      <td styleclass="td18">管理员</td>
				      <td width="32%">

						
													
								<optimyth:textOptionsList
								property="WIDTH:190PX"

								value="-1"
								value="1"
								value="2"
							 />
				      </td>
				      <td styleclass="td2no30">最大容积</td>
				      <td width="32%">
				      	<input type="text"size="22"/>&nbsp;米<sup>3</sup>
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