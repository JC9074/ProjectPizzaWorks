<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- privilegeId=5 -->


<!-- StockSystem -->
<li class="nav-item has-treeview menu-open"><div class="nav-link">
		<i class="nav-icon fas fa-cubes"></i>
		<p>
			庫存管理 <i class="fas fa-angle-left right"></i>
		</p>
	</div>

	<ul class="nav nav-treeview" style="display: block;">
		<li class="nav-item has-treeview"
			onclick="loadingPage('${request.contextPath}/stock/viewStorageHistory')">
			<div class="nav-link">
				<i class="far fa-circle nav-icon "></i>
				<p>檢視庫存歷史</p>
			</div>
		</li>
		<li class="nav-item has-treeview"
			onclick="loadingPage('${request.contextPath}/purchase/GetAllMaterials')">
			<div class="nav-link">
				<i class="far fa-circle nav-icon "></i>
				<p>檢視存貨</p>
			</div>
		</li>
		<li class="nav-item  has-treeview"
			onclick="loadingPage('/stock/GetAllStockRequest')"><div
				class="nav-link">
				<i class="far fa-circle nav-icon"></i>
				<p>查詢進貨單</p>
			</div></li>
		<li class="nav-item has-treeview"
			onclick="loadingPage('/shopManageSystem/GetAllSalesList')"><div
				class="nav-link">
				<i class="far fa-circle nav-icon"></i>
				<p>查詢銷貨單</p>
			</div></li>
	</ul></li>
<!-- /StockSystem -->
<li class="nav-header"
	style="margin: 0; padding: 0px; text-align: center; font-size: 25px; line-height: 1.5">StockManager</li>
