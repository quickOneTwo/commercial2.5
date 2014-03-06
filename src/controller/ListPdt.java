package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.ProduitsPdtService;
import com.hibernate.ProduitsPrix;

/**
 * Servlet implementation class ListPdt
 */
@WebServlet("/ListPdt")
public class ListPdt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListPdt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		ProduitsPdtService pdtService = new ProduitsPdtService();
		List<ProduitsPrix> listPdtPrix = pdtService.listAll();
		
		if(listPdtPrix==null){
			out.println("nothing retrieved");
		}else{
		
		Iterator<ProduitsPrix> it = listPdtPrix.iterator();
		while(it.hasNext()){
			out.println(it.next().getNomPdt());
		}
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
