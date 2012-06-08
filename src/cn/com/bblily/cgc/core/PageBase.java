package cn.com.bblily.cgc.core;

import java.util.ArrayList;

public class PageBase {
	private int index;
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public ArrayList<Itembase> getItem() {
		return item;
	}
	public void setItem(ArrayList<Itembase> item) {
		this.item = item;
	}
	private ArrayList<Itembase> item;
 
}
