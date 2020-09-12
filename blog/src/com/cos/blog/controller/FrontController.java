package com.cos.blog.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.blog.model.Post;

//http://localhost:8080/blog/adsnfknlaksdfnl.do
// 모든 .do 요청은 FrontController를 탄다
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public FrontController() {
        super();
       
    }
    protected void route(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String uri = request.getRequestURI();
    	System.out.println("최초 uri: "+uri);
	 
    	
    	
    	
		
		if(uri.equals("/post/list.do")) { //메인페이지
			// 모델(DB연결 - 데이터가져와서)
			Post post = new Post(1,"제목1","내용1",1,null,2);
			request.setAttribute("post", post);

			//페이지 이동시에 request,response가 새로 만들어지는데
			//RequestDispatcher는 request,response를 유지시킨다.
			RequestDispatcher dis =
					request.getRequestDispatcher("/post/list.jsp");
			dis.forward(request, response);
		}else if(uri.equals("/post/detail.do")) {
			response.sendRedirect("/post/detail.jsp");
		}else if(uri.equals("/post/saveform.do")) {
			response.sendRedirect("/post/saveform.jsp");
		}else if(uri.equals("/post/updataform.do")) {
			response.sendRedirect("/post/updataform.jsp");
		}else if (uri.equals("/user/joinform.do")) {
			response.sendRedirect("/user/joinform.jsp");
		}else if(uri.equals("/user/loginform.do")) {
			response.sendRedirect("/user/loginform.jsp");
		}else if(uri.equals("/user/userdetail.do")) {
			response.sendRedirect("/user/userdetail.do");
		}else if(uri.equals("/user/userupdata.do")) {
			response.sendRedirect("/user/userupdata.do");
		}
    }	
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		route(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	}

}
