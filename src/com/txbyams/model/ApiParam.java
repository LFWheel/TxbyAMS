package com.txbyams.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.google.gson.annotations.Expose;
@Entity
@Table(name="apiparam")
public class ApiParam implements Serializable {

	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
    @GeneratedValue(generator = "generator")
	private Integer id;
	
	@Column(name="pId")
	private String pId;
	
	@Column(name="paramName")
	private String paramName;
	
	@Column(name="paramType")
	private String paramType;
	
	@Column(name="remark")
	private String remark;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="apiId",referencedColumnName="apiId")
	private MyApi api;

	public ApiParam(){}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getParaName() {
		return paramName;
	}

	public void setParaName(String paraName) {
		this.paramName = paraName;
	}

	public String getParamType() {
		return paramType;
	}

	public void setParamType(String paramType) {
		this.paramType = paramType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public MyApi getApi() {
		return api;
	}

	public void setApi(MyApi api) {
		this.api = api;
	}
}
