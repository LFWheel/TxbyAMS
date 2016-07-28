package com.txbyams.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="dir")
public class Directory implements Serializable{
	
	
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
    @GeneratedValue(generator = "generator")
	private Integer id;
	
	@Column(name="dirId")
	private String dirId;
	
	@Column(name="dirName")
	private String dirName;

	@Column(name="parentId",insertable=false,updatable=false,nullable=true)
	private String parentId;
	
	@ManyToOne(cascade={CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH })
	@JoinColumn(name="parentId",referencedColumnName="dirId")
	private Directory parent;
	
	@OneToMany(cascade = { CascadeType.ALL },fetch=FetchType.LAZY,mappedBy="parent")
	private List<Directory> children = new ArrayList<>();
	
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, targetEntity = MyApi.class, mappedBy = "dir")
	private List<MyApi> myapis;
	
	
	public List<MyApi> getMyapis() {
		return myapis;
	}

	public void setMyapis(List<MyApi> myapis) {
		this.myapis = myapis;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDirName() {
		return dirName;
	}

	public void setDirName(String dirName) {
		this.dirName = dirName;
	}

	public String getDirId() {
		return dirId;
	}

	public void setDirId(String dirId) {
		this.dirId = dirId;
	}


	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Directory getParent() {
		return parent;
	}

	public void setParent(Directory parent) {
		this.parent = parent;
	}

	public List<Directory> getChildren() {
		return children;
	}

	public void setChildren(List<Directory> children) {
		this.children = children;
	}
	
	public void addChild(Directory directory){
		this.children.add(directory);
	}
	public Directory(){}
	public Directory(String dirId,String dirName){
		this.dirId = dirId;
		this.dirName = dirName;
	}
}
