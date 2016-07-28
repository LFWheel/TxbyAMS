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

import org.hibernate.Query;
import org.hibernate.Session;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tianxiabuyi.util.GsonUtil;
import com.txbyams.model.ApiParam;
import com.txbyams.model.ApiVo;
import com.txbyams.model.Directory;
import com.txbyams.model.MyApi;
import com.txbyams.model.ParamVo;
import com.txbyams.util.DBUtil;

/**
 * Servlet implementation class GetOneApi
 */
@WebServlet("/GetOneApi")
public class GetOneApi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetOneApi() {
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
		String apiId = request.getParameter("apiId");
		Session session = DBUtil.getCurrentSession();
		Query q = session.createQuery("from MyApi m where m.apiId = '"+apiId+"'");
		List<MyApi> apis = q.list();
		MyApi a = null;
		if(apis!=null){
			 a = apis.get(0);
		}
		//System.out.println(a.getDir().getDirName());
		ApiVo apiVo = new ApiVo();
		apiVo.setUrl(a.getUrl());
		List<ParamVo> params = new ArrayList<>();
		for(ApiParam m : a.getParams()){
			ParamVo pvo = new ParamVo();
			pvo.setParamName(m.getParaName());
			pvo.setParamType(m.getParamType());
			pvo.setRemark(m.getRemark());
			params.add(pvo);
		}
		apiVo.setParams(params);
		String result = GsonUtil.toJson(apiVo);
		System.out.println(result);
		response.setCharacterEncoding("utf-8");
		response.getWriter().write(result);
		session.close();
	}
	

	
}
