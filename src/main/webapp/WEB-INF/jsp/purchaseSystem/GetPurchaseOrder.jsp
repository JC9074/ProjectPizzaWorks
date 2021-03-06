<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Purchase Order</title>
</head>
<body>
<section class="content-header">
		<div class="container-fluid row">
			<div class="col-md-1">
				<button
					onclick="loadingPage('${request.contextPath}/purchase/GetAllPurchaseOrder')"
					class="btn btn-block btn-secondary">返回</button>
			</div>
			<!-- col end -->
			<div class="col-md-4"></div>
			<!-- col end -->
			<div class="col-md-2">
				<h1>採購單資訊</h1>
			</div>
			<!-- col end -->
		</div>
		<!-- row end -->
	</section>
	<section class="content">
		<div class="container">
			<div class="card">
				<div class="card-body">
					<form>
						<fieldset>
							<div class="row">
								<div class="col-md-6">
									<strong>採購單編號: <span id="pOrderId"></span></strong>
								</div>
								<!-- col end -->
								<div class="col-md-6">採購時間：<span id="requestTime"></span></div>
								
								<!-- col end -->
							</div>
							<!-- row end -->
							<div class="row">
								<div class="col-md-6">採購者：<span id="proposalerId"></span></div>
								<!-- col end -->
								<div class="col-md-6">採購總額：<span id="totalPrice"></span></div>
								<!-- col end -->
							</div>
							<!-- row end -->
							<div class="row">
								<div class="col-md-6">採購簡述：<span id="briefInfo"></span></div>
								<!-- col end -->
							</div>
							<!-- <hr> -->
							<!-- row end -->
							<!-- 
							<div class="row"> 
								<div class="col-md-6">審核者：<span id="approverId"></span></div>
								<div class="col-md-6">審核時間：<span id="responseTime"></span></div>
							</div>
							<div class="row">
								<div class="col-md-6">審核回覆：<span id="responseComment"></span></div>
							</div>
							-->
							<!-- row end -->
							<div class="table-responsive p-0 mt-4 ">
								<table id ="podTable" class="table table-hover text-nowrap text-center">
									<thead>
										<tr>
											<th>品項編號</th>
											<th>品項名稱</th>
											<th>採購總數</th>
											<th>品項總價</th>
										</tr>
									</thead>
								</table>
							</div>
							<!--  table end -->
						</fieldset>
					</form>
				</div>
				<!-- card-body end -->
			</div>
			<!-- card end -->
		</div>
		<!-- container end -->
	</section>
	<!-- content end -->
	<script>
		
		$(function(){
			prOrd = ${purchaseOrder_jsonStr};
			dataToHtml(prOrd);
		})
		
		function dataToHtml(data){
			$("#pOrderId").html(data.pOrderId);
			$("#proposalerId").html(data.proposalerName);
			$("#requestTime").html(data.requestTime);
			//$("#requestStatus").html(statusCheck(data.requestStatus));
			$("#briefInfo").html(data.briefInfo);
			var totalPrice = formatter.format(data.totalPrice);
			$("#totalPrice").html(totalPrice);
			/*
			$("#approverId").html(data.approverName);
			$("#responseTime").html(data.responseTime);
			$("#responseComment").html(data.responseComment);
			*/
			console.log(data);
			$("#podTable").DataTable({
				"data" : prOrd.purchaseOrderDetails,	
	            "columns":[
	            	{"data" : "materialsId" },
	            	{"data" : "materialsName" },
	             	{"data" : "quantity" },
	             	{"data" : "price" },
	           	],
           		"searching": false,
	            "lengthChange": false,
	            // 關閉上下頁
	            "bPaginate": false,
	            "language" :{
	            	"InfoEmpty": "顯示第 0 至 0 項結果，共 0 項",
	            	"info": "顯示第 _START_ 至 _END_ 項結果，共 _TOTAL_ 項",
	            }
			});
		}
		
		// 審核狀態的判斷
		/*function statusCheck(data){
			switch (data) {
            case 0:
                return '尚未審核';
            case 1:
                return '退回';
            case 2:
                return '核准但未進貨';
            case 3:
                return '核准已進貨';
            case 4:
                return '拒絕';
       	 }
		}
		*/
		
		// 金額轉換
		/* function numberCommas(strInput) {
		    if (strInput.indexOf(".") != -1) {
		        return strInput.replace(/\d(?=(?:\d{3})+\b\.)/g, '$&,');
		    } else {
		        return strInput.replace(/\d(?=(?:\d{3})+\b)/g, '$&,');
		    }
		} */
		var formatter = new Intl.NumberFormat('en-US', {
			  style: 'currency',
			  currency: 'TWD',
			  minimumFractionDigits: 0,
		});
		
	</script>
</body>
</html>