package com.txbyams.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tianxiabuyi.util.GsonUtil;
import com.txbyams.model.Directory;
import com.txbyams.util.DBUtil;

/**
 * Servlet implementation class GetAllDir
 */
@WebServlet("/GetAllDir")
public class GetAllDir extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllDir() {
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
		List<Directory> dirs = DBUtil.query("from Directory d", null);
		List<Map> result = new ArrayList<>();
		for(Directory d:dirs){
			Map<String,String> map =new HashMap<String, String>();
			map.put("dirId", d.getDirId());
			map.put("dirName", d.getDirName());
			result.add(map);
		}
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.write(GsonUtil.toJson(result));
	}

}
