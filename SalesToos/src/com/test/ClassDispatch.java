package com.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class ClassDispatch extends DispatchAction {
	public ActionForward add(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response){
		System.out.println("Class Dispatch with ADD method");
		return mapping.findForward("add");
	}
	public ActionForward sub(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response){	
		System.out.println(" Class Dispatch with SUB method");
		return mapping.findForward("sub");
	}

}
