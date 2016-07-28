package com.txbyams.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class Node {

	private String text;//node name
	private String href;

	private List<Node> nodes;
	
	public Node(String text,boolean isLeaf){
		if(!isLeaf){
			this.nodes = new ArrayList<>();
		}
		this.text = text;
	}
	public Node(){}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<Node> getNodes() {
		return nodes;
	}
	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	
	public void addNode(Node node){
		this.nodes.add(node);
	}
	public static void main(String args[]){
		Node p = new Node("parent1",false);
		Node c1 = new Node("child1",true);
		Node c2 = new Node("child2",true);
		List<Node> children = new ArrayList<Node>();
		children.add(c1);
		children.add(c2);
		p.setNodes(children);
		
		List<Node> tree = new ArrayList<Node>();
		tree.add(p);
		
		Gson gson = new Gson();
		String jsonStr = gson.toJson(tree);
		System.out.print(jsonStr);
	}
}
