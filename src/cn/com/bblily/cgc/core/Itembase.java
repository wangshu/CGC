package cn.com.bblily.cgc.core;

import java.util.ArrayList;

public abstract class Itembase {
	
	public String getInfo_href() {
		return info_href;
	}
	public void setInfo_href(String info_href) {
		this.info_href = info_href;
	}
	public ArrayList<linkitem> getLink() {
		return link;
	}
	public void setLink(ArrayList<linkitem> link) {
		this.link = link;
	}
	public String getSend_id() {
		return send_id;
	}
	public void setSend_id(String send_id) {
		this.send_id = send_id;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getItem_info() {
		return item_info;
	}
	public void setItem_info(String item_info) {
		this.item_info = item_info;
	}
	public String getList_text() {
		return list_text;
	}
	public void setList_text(String list_text) {
		this.list_text = list_text;
	}
	private String info_href;
	private ArrayList<linkitem> link;
	private String send_id;
	private String host;
	private String item_info;
	private String  list_text;
	

}
