package com.txbyams.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tianxiabuyi.util.GsonUtil;
import com.txbyams.model.ApiParam;
import com.txbyams.model.Directory;
import com.txbyams.model.MyApi;
import com.txbyams.util.DBUtil;
import com.txbyams.util.IDGenerator;

/**
 * Servlet implementation class AddApiServlet
 */
@WebServlet("/AddApiServlet")
public class AddApiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddApiServlet() {
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
		StringBuffer acceptJson = new StringBuffer();
		String line = null;
		BufferedReader reader = request.getReader();
		try{
			while((line=reader.readLine())!=null){
				acceptJson.append(line);
			}
		}catch(Exception e){
			
		}
		String apiJson = acceptJson.toString();
		MyApi oneApi = GsonUtil.fromJson(apiJson, MyApi.class);
		String apiId = IDGenerator.getUUID();
		oneApi.setApiId(apiId);
		List<ApiParam> params = oneApi.getParams();
		for(ApiParam p : params){
			String pId = IDGenerator.getUUID();
			p.setpId(pId);
			p.setApi(oneApi);
		}
		String dirId = oneApi.getDirId();
		List<Directory> dirs = DBUtil.query("from Directory d where d.dirId = '"+dirId+"'", null);
		if(dirs!=null){
			oneApi.setDir(dirs.get(0));
		}		
		boolean isSuccess = DBUtil.add(oneApi);
		if(isSuccess){
			response.getWriter().write("ok");
		}
		//System.out.println(apiJson);
		//String id = IDGenerator.getUUID();
	}

}
