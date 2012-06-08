package cn.com.bblily.cgc.core;

import java.io.IOException;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

import cn.com.bblily.cgc.cgpp.CGCHttpClient;

public abstract class PageProvideBase {
	protected CGCHttpClient httpclient;
	private int pageindex;
	private int prepareCount;
	
	public int getPrepareCount() {
		return prepareCount;
	}
	public void setPrepareCount(int prepareCount) {
		this.prepareCount = prepareCount;
	}
	public int getPageindex() {
		return pageindex;
	}
	public void setPageindex(int pageindex) {
		this.pageindex = pageindex;
	}
	private int pagecount;
	public int getPagecount() {
		return pagecount;
	}
	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}
	public abstract PageBase getFirst();
	public abstract PageBase getprevious();
	public abstract PageBase getNext();
	public abstract PageBase getLast();
	public PageProvideBase()
	{
		 httpclient=new CGCHttpClient()  ;
	}

}
