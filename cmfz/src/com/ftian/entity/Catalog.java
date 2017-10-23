package com.ftian.entity;

import java.io.Serializable;
import java.util.List;

public class Catalog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String url;
	private String type;
	private String parent;
	private String tag;
	private String icon;
	private List<Catalog> children;
	public Catalog(){}
	public Catalog(Integer id, String name, String url, String type,
			String parent, String tag, String icon, List<Catalog> children) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.type = type;
		this.parent = parent;
		this.tag = tag;
		this.icon = icon;
		this.children = children;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public List<Catalog> getChildren() {
		return children;
	}
	public void setChildren(List<Catalog> children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "Catalog [id=" + id + ", name=" + name + ", url=" + url
				+ ", type=" + type + ", parent=" + parent + ", tag=" + tag
				+ ", icon=" + icon + ", children=" + children + "]";
	}
	
}
