package com.mama.doc.addo;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mama.doc.Execute;
import com.mama.doc.Result;
import com.mama.doc.dao.AdDoctorDAO;

public class AdDoctorApproveController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {
		
		AdDoctorDAO adDoctorDAO = new AdDoctorDAO();
		Result result = new Result();
		
		int doctorNumber = Integer.parseInt(request.getParameter("doctorNumber"));
		
		adDoctorDAO.approve(doctorNumber);
		
		result.setRedirect(true);
		result.setPath("adminDoctorApply.addo");
		
		return result;
	}
	
	

}
