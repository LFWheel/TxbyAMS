package com.txbyams.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.tianxiabuyi.util.GsonUtil;
import com.tianxiabuyi.util.HttpUtil;
import com.txbyams.model.Node;
import com.txbyams.util.Encrypt;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
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
		// TODO Auto-generated method stub
		String url = request.getParameter("url");
		Enumeration<String> e = request.getParameterNames();
		Map<String,String> paraMap = new HashMap<String,String>();
		while(e.hasMoreElements()){
			String name = e.nextElement();
			if(request.getParameter(name)!=null){
				paraMap.put(name, request.getParameter(name));
			}			
		}
		paraMap.remove("url");
		System.out.println(GsonUtil.toJson(paraMap));
		Map<String,String> postMap = new HashMap<String,String>();
		postMap.put("json", Encrypt.encryptStr(GsonUtil.toJson(paraMap)));
		String result = HttpUtil.post(url, postMap);
		/*Node p = new Node("parent1");
		Node c1 = new Node("child1");
		Node c2 = new Node("child2");
		List<Node> children = new ArrayList<Node>();
		children.add(c1);
		children.add(c2);
		p.setNodes(children);
		
		List<Node> tree = new ArrayList<Node>();
		tree.add(p);
		
		Gson gson = new Gson();
		String jsonStr = gson.toJson(tree);*/
		//PrintWriter out = response.getWriter();
		//out.write(Encrypt.decryptStr(result));
		System.out.println(Encrypt.decryptStr(result));
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		//out.write(Encrypt.decryptStr(result));
		out.print(Encrypt.decryptStr(result));
	}

}
