package com.lekhraj.springmvc.cops.model.DTO;

public class AuthDTO {
	
	Integer authId;
	Integer acctId;
	Integer mgrId;
	Integer assetId;
	Float authQty;
	Float openQty;
	Float postQty;
	char tradeCode;
	Enum orderType;
	Enum ordersubtupe;
	boolean onHold;
	String [] comments;
	String approverInit;
	public Integer getAuthId() {
		return authId;
	}
	public void setAuthId(Integer authId) {
		this.authId = authId;
	}
	public Integer getAcctId() {
		return acctId;
	}
	public void setAcctId(Integer acctId) {
		this.acctId = acctId;
	}
	public Integer getMgrId() {
		return mgrId;
	}
	public void setMgrId(Integer mgrId) {
		this.mgrId = mgrId;
	}
	public Integer getAssetId() {
		return assetId;
	}
	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}
	public Float getAuthQty() {
		return authQty;
	}
	public void setAuthQty(Float authQty) {
		this.authQty = authQty;
	}
	public Float getOpenQty() {
		return openQty;
	}
	public void setOpenQty(Float openQty) {
		this.openQty = openQty;
	}
	public Float getPostQty() {
		return postQty;
	}
	public void setPostQty(Float postQty) {
		this.postQty = postQty;
	}
	public char getTradeCode() {
		return tradeCode;
	}
	public void setTradeCode(char tradeCode) {
		this.tradeCode = tradeCode;
	}
	public Enum getOrderType() {
		return orderType;
	}
	public void setOrderType(Enum orderType) {
		this.orderType = orderType;
	}
	public Enum getOrdersubtupe() {
		return ordersubtupe;
	}
	public void setOrdersubtupe(Enum ordersubtupe) {
		this.ordersubtupe = ordersubtupe;
	}
	public boolean isOnHold() {
		return onHold;
	}
	public void setOnHold(boolean onHold) {
		this.onHold = onHold;
	}
	public String[] getComments() {
		return comments;
	}
	public void setComments(String[] comments) {
		this.comments = comments;
	}
	public String getApproverInit() {
		return approverInit;
	}
	public void setApproverInit(String approverInit) {
		this.approverInit = approverInit;
	}
	
	//----------------------------
	

}
