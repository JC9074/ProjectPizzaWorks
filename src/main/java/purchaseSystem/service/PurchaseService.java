package purchaseSystem.service;


import java.util.List;

import _model.MaterialsBean;
import _model.MaterialsUnitBean;
import _model.PurchaseOrderBean;
import _model.PurchaseRequestBean;
import _model.PurchaseRequestDetailBean;
import _model.StockRequestBean;
import _model.SuppliersProvisionBean;
import memberSystem.dao.MemberDao;
import purchaseSystem.dao.PurchaseDao;

public interface PurchaseService {
	
	void setDao(PurchaseDao dao);
	void setMemberDao(MemberDao memberDao);
	//查詢所有請購單
	String getAllPurchaseRequest();
	//修改請購單(依請購單號)
	void updatePurchaseRequest(PurchaseRequestBean prb, List<PurchaseRequestDetailBean> prdbList);
	//新增請購單
	void saveOnePurchaseRequest(PurchaseRequestBean prb, List<PurchaseRequestDetailBean> list);
	
	void saveOnePurchaseRequest2(PurchaseRequestBean purchaseRequest);
	
	PurchaseRequestBean getOnePurchaseRequest(Integer pRequestId);
	
	String getOnePurchaseRequestJson(Integer pRequestId);
	
	List<MaterialsBean> getAllMaterials();
	
	String getAllMaterialsJson();
	
	String getAllPurchaseOrder();
	
	void saveOnePurchaseOrder(PurchaseOrderBean purchaseOrder);
	
	String updateReadTime(PurchaseRequestBean purchaseRequest);
	
	String updateResponse(PurchaseRequestBean purchaseRequest);
	
	List<MaterialsUnitBean> getAllMaterialsUnits();
	
	List<SuppliersProvisionBean> getAllSuppliersProvisions();
	
	Integer insertPurchaseOrder(PurchaseOrderBean purchaseOrder);
	
	void insertStockRequest(StockRequestBean stockRequest);
	
	Integer updateOnePurchaseRequest(PurchaseRequestBean purchaseRequest);
	
	void updatePurchaseRequestStatus(Integer RequestId, Integer requestStatus);
	
	Integer updateApprovedPurchaseRequest(PurchaseRequestBean purchaseRequest);
	
	String getOnePurchaseOrderJson(Integer pOrderId);
}
