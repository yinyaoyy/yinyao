<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="../inc/contentHead.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="maximum-scale=1,minimum-scale=1,user-scalable=0,width=device-width,initial-scale=1,user-scalable=no">
<title></title>
<link href="<%=WEBROOT%>/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="<%=WEBROOT%>/bootstrap-3.3.7/css/bootstrap-datetimepicker.css" rel="stylesheet" type="text/css">
<link href="<%=WEBROOT%>/bootstrapValidator/css/bootstrapValidator.css" rel="stylesheet" type="text/css">
<link href="<%=WEBROOT%>/bootstrapFileinput/themes/explorer/theme.css" rel="stylesheet" type="text/css">
<link href="<%=WEBROOT%>/css/app/public.css" rel="stylesheet" type="text/css"/> 
<link href="<%=WEBROOT%>/css/app/data.css" rel="stylesheet" type="text/css"/> 

</head>
<body>
    <div class="header">
        <a href="<%=WEBROOT%>/app/user_toAppDefault.page"><img src="<%=WEBROOT%>/app_images/icon-left.png" alt=""></a>
    	<h1>首页</h1>
    </div>
    <div class="content"> 
      <div class="top-line" role="navigation"></div>
        <ul class="top-nav">
        	<li role="presentation" class="active"><a href="<%=WEBROOT%>/app/user_toAppUserInfo.page">基本信息</a></li>
        	<li role="presentation"><a href="<%=WEBROOT%>/app/user_toAppInputPicture.page">上传照片</a></li>
        	<li role="presentation"><a href="<%=WEBROOT%>/app/user_toResetPhone.page">换手机号</a></li>
        	<li role="presentation"><a href="<%=WEBROOT%>/app/user_toResetPassword.page">修改密码</a></li>
        </ul>
     </div>
     
              <div class="container" style="padding-top: 2.5rem;">
					<!-- 基本信息  -->
						<form id="form1" class="form-inline">
						<div class="control-group">
							<label for="name">姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</label><input id="name" type="text" class="form-control" name="name" readonly="readonly" placeholder="姓名" value="${user.realname}">
						</div>
									<div class="row">
											<div class="col-md-2"><label for="name">姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</label><input id="name" type="text" class="form-control" name="name" readonly="readonly" placeholder="姓名" value="${user.realname}" style="width:50%"></div>
									</div>
						<input type="hidden" name="infoid1" id="infoid1" value="${user.id}">
							<table>
								<tr>
									<td>
									<div class="row">
											<label for="name">姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</label><input id="name" type="text" class="form-control" name="name" readonly="readonly" placeholder="姓名" value="${user.realname}">
									</div>
									</td>					
								</tr>
								<tr>
								<td>
								<div class="row">	
								  <div class="col-xs-6" style="text-aline:right;"><label for="cardno">身份证号码：</label><input type="text" class="form-control" id="cardno" name="cardno" placeholder="身份证" readonly="readonly" value="${user.cardno}"></div>							   							
								</div>
								</td>
						
								</tr>
								<tr>
								<td>
									<div class="row">
										<div class="col-xs-6">
											<label for="sex" class="control-label">性别：</label>								
												<label> <input type="radio" name="sex" id="optionsRadios1" value="01" <c:if test="${user.sex eq '01' or user.sex eq null}">checked</c:if>>男
											</label>
										</div>
										<div class="col-xs-6">
												<label class="control-label"> <input type="radio" name="sex" id="optionsRadios2" value="02" <c:if test="${user.sex eq '02'}">checked</c:if>>女
												</label>
									    </div>	
									</div>					
								</td>															
								</tr>
								<tr>
									<td>
									<div class="row">
										<div class="col-xs-6">
											<label for="birthday">出生年月：</label><input type="text" class="form-control " id="birthday" name="birthday" readonly="readonly" placeholder="出生年月" value="${user.sysUserInfo.birthday}"  style="width:176px;">
										</div>
										
									</div>
									</td>
								</tr>
								<tr>
								  <td>
								   <div class="row">
								        <div class="col-xs-6">
											<label for="mobile" class="control-label">个人手机号：</label><input style="width: 176px;" type="text" class="form-control " id="mobile" name="mobile" readonly="readonly" placeholder="个人手机号" value="${user.mobile}">
										</div>
								   </div>
								  </td>
								</tr>
								<tr>
									<td>
									<div class="row">
										<div class="col-xs-6">
											<label for="schoole" class="control-label">最高学历：</label><select id="schoole" name="schoole" class="form-control" style="width:176px;">
												<option value="">未选择</option>
												<c:forEach items="${zgxl}" var="zgxl">
													<option value="${zgxl.codeNo}" <c:if test="${user.sysUserInfo.NEducation eq zgxl.codeNo}">selected</c:if>>${zgxl.codeName}</option>
												</c:forEach>
											</select>
										</div>
										
                                       </div>
									</td>
								</tr>
								<tr>
								  <td>
								    <div class="row">
								      <div class="col-xs-6">
											<label class="control-label" for="political">政治面貌：</label><select class="form-control" id="political" name="political"style="width:176px;">
												<option value="">未选择</option>
												<c:forEach items="${zzmm}" var="zzmm">
													<option value="${zzmm.codeNo}" <c:if test="${user.sysUserInfo.NPolitical eq zzmm.codeNo}">selected</c:if>>${zzmm.codeName}</option>
												</c:forEach>
											</select>
										</div>
								    </div>
								  </td>
								</tr>
								<tr>
									<td>
										<div class="row">
										<div class="col-xs-6">
											<label class="control-label" for="professiontype">专业系列：</label><select class="form-control" id="professiontype" name="professiontype" style="width:176px;">
												<option value="">未选择</option>
												<c:forEach items="${zyxl}" var="zyxl">
													<option value="${zyxl.codeNo}" <c:if test="${user.sysUserInfo.NProfessiontype eq zyxl.codeNo}">selected</c:if>>${zyxl.codeName}</option>
												</c:forEach>
											</select>
										</div>
										
										</div>
									</td>										
								</tr>
								<tr>
								<td>
								<div class="row">
								<div class="col-xs-6">
											<label class="control-label" for="technicalpostlevel">职称级别：</label><select class="form-control" id="technicalpostlevel" name="technicalpostlevel" style="width:176px;">
												<option value="">未选择</option>
												<c:forEach items="${zcjb}" var="zcjb">
													<option value="${zcjb.codeNo}" <c:if test="${user.sysUserInfo.NTechnicalpostlevel eq zcjb.codeNo}">selected</c:if>>${zcjb.codeName}</option>
												</c:forEach>
											</select>
									</div>
								</div>
								</td>
								</tr>								
								<tr>
								<td>
									<div class="row">
									<div class="col-xs-6">
											<label class="control-label" for="technicalpost">职&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称：</label><select class="form-control" id="technicalpost" name="technicalpost" style="width:176px;">
												<option value="">未选择</option>
												<c:forEach items="${zc}" var="zc">
													<option value="${zc.codeNo}" <c:if test="${user.sysUserInfo.NTechnicalpost eq zc.codeNo}">selected</c:if>>${zc.codeName}</option>
												</c:forEach>
											</select>
									</div>
									
																		
									</div>
								</td>
								</tr>
								<tr>
								  <td>
								    <div class="row">
								       <div class="col-xs-6">
										<label for="orgName" class="control-label">工作单位：</label><input type="text" class="form-control" id="orgName" name="orgName" placeholder="工作单位" value="${user.sysUserInfo.organization}" style="width:176px;">
									</div>	
								    </div>
								  </td>
								</tr>								
								<tr>
									<td>
									<div class="row">
										<div class="col-xs-6">
											<label for="duties" class="control-label">职&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;务：</label><input type="text" class="form-control" id="duties" name="duties" placeholder="职务" value="${user.sysUserInfo.NDuty}" style="width:176px;">
										</div>										
                                    </div>
									</td>
								</tr>
								<tr>
								  <td>
								    <div class="row">
								       <div class="col-xs-6">
											<label for="orgCode" class="control-label">社会信用代码:</label><input type="text" class="form-control " id="orgCode" name="orgCode" placeholder="统一社会信用代码" value="${user.sysUserInfo.NSocialcreditcode}" style="width:176px;">
										</div>
								    </div>
								  </td>
								</tr>
								<tr>
									<td>
										<div class="row">
										<div class="col-xs-6">
											<input type="button" class="btn btn-success" value="保存" id="btn1Save">
										</div>
									</div>
									</td>									
								</tr>

							</table>
							<div class="alert alert-danger">
								职称：结合专业系列与职称级别规范填写，如建筑工程专业系列，职称级别若为正高级，则职称填写为“教授级高级工程师”<br>职称级别若为副高级，则职称填写为“高级工程师”&nbsp;&nbsp;&nbsp;&nbsp;职称级别若为中级，则职称填写为“工程师”<br>职称级别若为初级，则职称填写为“助理工程师”&nbsp;&nbsp;&nbsp;&nbsp;职称级别若为员级，则职称填写为“技术员”
							</div>
						</form>					
				</div>
				<c:if test="${msg ne null}">
	<script type="text/javascript">
		alert('${msg}');
	</script>
</c:if>
<c:if test="${completeFlag ne null and completeFlag eq '01'}">
	<script type="text/javascript">
		alert('请完善您的个人资料!');
	</script>
</c:if> 
      
</body>
<!-- 引用js start -->
<script type="text/javascript" src="<%=WEBROOT%>/bootstrap-3.3.7/js/jquery.min.js"></script>
<script type="text/javascript" src="<%=WEBROOT%>/bootstrap-3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=WEBROOT%>/js/jquery.json.min.js"></script>
<script type="text/javascript" src="<%=WEBROOT%>/js/app/mediaquery.js"></script>
<script type='text/javascript' src="<%=WEBROOT%>/js/app/dic.js"></script>
<script type='text/javascript' src="<%=WEBROOT%>/js/app/updateAppUserInfo.js"></script>
<script type="text/javascript" src="<%=WEBROOT%>/bootstrapValidator/js/bootstrapValidator.js"></script>
<script type="text/javascript" src="<%=WEBROOT%>/bootstrapValidator/js/validator/date.js"></script>
<script type="text/javascript" src="<%=WEBROOT%>/bootstrapValidator/js/validator/notEmpty.js"></script>
<script type="text/javascript" src="<%=WEBROOT%>/bootstrapValidator/js/validator/regexp.js"></script>
<script type="text/javascript" src="<%=WEBROOT%>/bootstrapValidator/js/validator/phone.js"></script>
<script type="text/javascript" src="<%=WEBROOT%>/bootstrapValidator/js/validator/mobile.js"></script>
<script type="text/javascript" src="<%=WEBROOT%>/bootstrapValidator/js/validator/numeric.js"></script>
<script type="text/javascript" src="<%=WEBROOT%>/bootstrapValidator/js/validator/stringLength.js"></script>
<!-- datetimepicker -->
<script type="text/javascript" src="<%=WEBROOT%>/bootstrap-3.3.7/js/bootstrap-datetimepicker.min.js"></script>
<script type="text/javascript" src="<%=WEBROOT%>/bootstrap-3.3.7/js/bootstrap-datetimepicker.zh-CN.js"></script>
<script type='text/javascript' src='<%=WEBROOT%>/dwr/interface/showCity.js'></script>
<script type='text/javascript' src='<%=WEBROOT%>/dwr/interface/showArea.js'></script>
<script type='text/javascript' src='<%=WEBROOT%>/dwr/engine.js'></script>
<script type='text/javascript' src='<%=WEBROOT%>/dwr/util.js'></script>
<script type='text/javascript' src='<%=WEBROOT%>/js/province.js'></script>

<script type='text/javascript' src='<%=WEBROOT%>/js/student/updateUserInfo.js'></script>
<!-- 引用js  end -->
<script type="text/javascript">
$(document).ready(
		function() {
			//出生年月
			$('#birthday').datetimepicker({
				format : 'yyyy-mm-dd',
				language : 'zh-CN',
				autoclose : true,
				todayHighlight : true,
				minView : 2
			}).on(
					'hide',
					function(e) {
						$('#form1').data('bootstrapValidator')
								.updateStatus('birthday', 'NOT_VALIDATED',
										null).validateField('birthday');
					});
			/*基本信息*/
			checkInput1();
			$("#btn1Save").click(function() {
				SaveAppUserInfo();
			});
			
		
		});
</script>
</html>