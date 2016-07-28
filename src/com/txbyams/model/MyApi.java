package com.txbyams.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.google.gson.annotations.Expose;

@Entity
@Table(name="myapi")
public class MyApi implements Serializable{

	@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="dirId",referencedColumnName="dirId")
	private Directory dir;

	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
    @GeneratedValue(generator = "generator")
	private Integer id;
	
	@Column(name="url")
	private String url;
	
	@Column(name="apiId")
	private String apiId;
	
	
	@OneToMany(cascade={CascadeType.ALL},mappedBy="api")
	private List<ApiParam> params = new ArrayList<>();
	
	@Column(name="dirId",insertable=false,updatable=false)
	private String dirId;
	
	@Column(name="resultEx")
	private String resultEx;//该接口返回的json结果示例
	
	public String getResultEx() {
		return resultEx;
	}

	public void setResultEx(String resultEx) {
		this.resultEx = resultEx;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
	public Directory getDir() {
		return dir;
	}

	public void setDir(Directory dir) {
		this.dir = dir;
	}

	public List<ApiParam> getParams() {
		return params;
	}

	public void setParams(List<ApiParam> params) {
		this.params = params;
	}
	
	public void addParam(ApiParam ap){
		this.params.add(ap);
	}
	public String getDirId() {
		return dirId;
	}

	public void setDirId(String dirId) {
		this.dirId = dirId;
	}

	public MyApi(){}
	public MyApi(String apiId,String url){
		this.apiId = apiId;
		this.url = url;
	}
}
