package com.txbyams.model;

import java.util.List;

public class ApiVo {

	private String url;
	private List<ParamVo> params;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<ParamVo> getParams() {
		return params;
	}
	public void setParams(List<ParamVo> params) {
		this.params = params;
	}
}
