package com.txbyams.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;

import com.google.gson.Gson;
import com.txbyams.model.Directory;
import com.txbyams.model.MyApi;
import com.txbyams.model.Node;
import com.txbyams.util.DBUtil;

/**
 * Servlet implementation class AllApiServlet
 */
@WebServlet("/AllApiServlet")
public class AllApiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Node> tree = new ArrayList<Node>();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllApiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Session session = DBUtil.getCurrentSession();
		Query q = session.createQuery("from Directory d where d.parentId is null");
		List<Directory> dirs=q.list();
		List<Node> tree = new ArrayList<>();
		for(Directory d : dirs){
			Node node = dir2Node(d);
			tree.add(node);
		}
		session.close();
		Gson gson = new Gson();
		String jsonStr = gson.toJson(tree);
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.write(jsonStr);
	}
	
	public Node dir2Node(Directory dir){
		Node parent = new Node(dir.getDirName(),false);
		List<Directory> children = dir.getChildren();
		List<MyApi> apis = dir.getMyapis();
		if(children==null&&apis==null){
			return parent;
		}else if(children!=null&&apis==null){
			for(Directory d : children){
				parent.addNode(dir2Node(d));
			}
		}else if(children==null&&apis!=null){
			for(MyApi api:apis){
				parent.addNode(api2Node(api));
			}
		}else{
			for(Directory d : children){
				parent.addNode(dir2Node(d));
			}
			for(MyApi api:apis){
				parent.addNode(api2Node(api));
			}
		}
		return parent;
	}
	
	public Node api2Node(MyApi api){
		Node node = new Node(api.getUrl(),true);
		node.setHref(api.getApiId());
		return node;
	}

}
