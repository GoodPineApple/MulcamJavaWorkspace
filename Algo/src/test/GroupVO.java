package com.poby.web;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class GroupVO implements Comparable<GroupVO> {

	@SerializedName("GROUP")
	private List<String>	groupList;

	@SerializedName("URL")
	private String			url;

	public List<String> getGroupList() {
		return groupList;
	}

	public void setGroupList(List<String> groupList) {
		this.groupList = groupList;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public int compareTo(GroupVO o) {
		if (!getGroupList().get(0).equals(o.getGroupList().get(0))) {
			return this.getGroupList().get(0).compareTo(o.getGroupList().get(0));
		} else {
			return Integer.parseInt(this.getGroupList().get(1)) - Integer.parseInt(o.getGroupList().get(1));
		}
	}

	@Override
	public String toString() {
		return "GroupVO [groupList=" + groupList + ", url=" + url + "]";
	}

}
