<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- 這個套件的css -->
<link rel='stylesheet'
	href='${pageContext.request.contextPath}/css/messageSystem/customerServiceMain.css'>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" type="text/css" rel="stylesheet">
<!-- <script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> -->
<!-- <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"></script> -->
<script type="text/javascript">

</script>
</head>

<body>
	<div class="container">
		<div class="messaging">
			<div class="inbox_msg">
				<div class="inbox_people">
					<div class="headind_srch">
						<div class="recent_heading">
							<h5>Pizza BIT 客服系統 </h5>
						</div>
						
					</div>
					<div class="inbox_CustomerService">
						
					</div>
				</div>
				<div class="mesgs">
					<!-- 每次都隱藏這裡 .msg_history 增加-->
					<!-- 這裡是佔位的 -->
					<div class='msg_history'></div>
					
					<div class="type_msg">
						<div class="input_msg_write">
							<input type="text" class="write_msg" placeholder="請輸入訊息..." onkeyup="CsputEnter(this)"/>
							<button class="msg_send_btn" type="button" onclick="sendToCustomerMessage(this)">
								<i class="fa fa-paper-plane-o" aria-hidden="true"></i>
							</button>
						</div>
					</div>
					
				</div>
			</div>
		</div>
	</div>
<script
	src="${pageContext.request.contextPath}/js/messageSystem/customerServiceMain.js"></script>
</body>
</html>