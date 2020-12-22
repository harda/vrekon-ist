package com.mpc.vrekon.domain;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Shclog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private NumberFormat numberFormat = new DecimalFormat("###");
	
	private String pan;
	private String acquirer;
	private String issuer;
	private int trace;
	private String local_date;
	private String termid;
	private double amount;
	private int local_time;
	private int respcode;
	private String refnum;
	
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAcquirer() {
		return acquirer;
	}
	public void setAcquirer(String acquirer) {
		this.acquirer = acquirer;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	public int getTrace() {
		return trace;
	}
	public void setTrace(int trace) {
		this.trace = trace;
	}
	public String getLocal_date() {
		return local_date;
	}
	public void setLocal_date(String local_date) {
		this.local_date = local_date;
	}
	public String getTermid() {
		return termid;
	}
	public void setTermid(String termid) {
		this.termid = termid;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getLocal_time() {
		return local_time;
	}
	public void setLocal_time(int local_time) {
		this.local_time = local_time;
	}
	public int getRespcode() {
		return respcode;
	}
	public void setRespcode(int respcode) {
		this.respcode = respcode;
	}
	
	public String getRefnum() {
		return refnum;
	}
	public void setRefnum(String refnum) {
		this.refnum = refnum;
	}
	public String getData(){
		String result = getFixedLengthField(pan, 19) +
				getFixedLengthField(acquirer, 10) +
				getFixedLengthField(issuer, 10) +
				getFixedLengthField(termid, 12) +
				getFixedLengthField(numberFormat.format(amount*100), 12) +
				getFixedLengthField(local_date, 10) +
				getFixedLengthField(String.valueOf(local_time), 10) +
				getFixedLengthField(String.valueOf(trace), 6) +
				getFixedLengthField(refnum, 12) +
				getFixedLengthField(String.valueOf(respcode), 2);
		
	    return result;
	}
	
	private String getFixedLengthField(String value, int length){
		
		if(value == null){
			value = " ";
		}
		
		if(value.length() > length){
			return value.substring(0, length);
		}
		
		while(value.length() < length){
			value = value + " ";
		}
		
		return value;
	}
	
	
}
