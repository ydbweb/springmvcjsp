package com.jsp.demo5.entity;

import java.math.BigInteger;

public class UserResults {
	private BigInteger id;
	private String nameuser;
	private String datetime;
	private BigInteger cntcomments;
	private BigInteger cntposts;
	
	
	public UserResults() {
	}
	
	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger i) {
		this.id = i;
	}

	public String getNameuser() {
		return nameuser;
	}

	public void setNameuser(String nameuser) {
		this.nameuser = nameuser;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public BigInteger getCntcomments() {
		return cntcomments;
	}

	public void setCntcomments(BigInteger cntcomments) {
		this.cntcomments = cntcomments;
	}

	public BigInteger getCntposts() {
		return cntposts;
	}

	public void setCntposts(BigInteger cntposts) {
		this.cntposts = cntposts;
	}

	public UserResults(BigInteger id, String nameuser, String datetime, BigInteger cntcomments, BigInteger cntposts) {
		this.id = id;
		this.nameuser = nameuser;
		this.datetime = datetime;
		this.cntcomments = cntcomments;
		this.cntposts = cntposts;
	}
	
	

}
