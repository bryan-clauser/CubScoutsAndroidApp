package com.bsa.android.cubscouts.academicssports;

public class IconRow {

	private String name = "";
	private String desc = "";
	
	public IconRow(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
