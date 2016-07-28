package com.txbyams.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tianxiabuyi.db.DBTools;
import com.tianxiabuyi.util.GsonUtil;
import com.txbyams.model.Directory;
import com.txbyams.util.DBUtil;
import com.txbyams.util.IDGenerator;

/**
 * Servlet implementation class AddDirServlet
 */
@WebServlet("/AddDirServlet")
public class AddDirServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDirServlet() {
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
		request.setCharacterEncoding("utf-8");
		boolean isSuccess = false;
		String dirId = IDGenerator.getUUID();
		String dirName = request.getParameter("dirName");
		String parentId = request.getParameter("parentId");
		Directory d = new Directory(dirId, dirName);
		if(parentId!=null){
			List<Directory> dirs = DBUtil.query("from Directory d where d.dirId = '"+parentId+"'", null);
			if(dirs.size()>0&&dirs!=null){
				Directory parent = dirs.get(0);
				d.setParent(parent);				
			}
		}
		isSuccess=DBUtil.add(d);
		Map<String, String> result = new HashMap<String, String>();
		if(isSuccess){
			result.put("status", "ok");
			response.getWriter().write(GsonUtil.toJson(result));
		}else{
			result.put("status", "fail");
			response.getWriter().write(GsonUtil.toJson(result));
		}
	}

}
