package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;



/**
 * Servlet implementation class kisi
 */
@WebServlet("/kisi")
public class kisi extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Ogrenci ogrn = new Ogrenci();
	Memur memr = new Memur();
	Ogretmen ogrt = new Ogretmen();
	OgretimUyesi ogrUye = new OgretimUyesi();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public kisi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		
		/*Ogrenci*/
		ogrn.setOkulNo(1);
		ogrn.setTCNo(1234567890);
		ogrn.setAd("Ali Burak");
		ogrn.setSoyad("Öncül");
		ogrn.setBolum("Bilgisayar Mühendisliği");
		ogrn.setMemleket("Amasya");
		
		/*Ogretmen*/
		ogrt.setTCNo(1234567890);
		ogrt.setAd("Ahmet");
		ogrt.setSoyad("Ahmetoğlu");
		ogrt.setDogumTarihi(1960);
		ogrt.setSicilNo(1234);
		
		/*Ogretim Uyesi*/
		ogrUye.setTCNo(987654321);
		ogrUye.setAd("Mehmet");
		ogrUye.setSoyad("Mehmetoğlu");
		ogrUye.setDogumTarihi(1950);
		ogrUye.setSicilNo(5678);
		ogrUye.setUnvan("Doçent Doktor");
		ogrUye.setBolum("Bilgisayar Mühendisliği");
		
		/*Memur*/
		memr.setTCNo(1245789523);
		memr.setAd("Hasan");
		memr.setSoyad("Hasanoğlu");
		memr.setDogumTarihi(1970);
		memr.setSicilNo(6564);
		memr.setBirim("Satın Alma");
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html><html><head>" +
				"</head><body>");
		out.println("<div> Öğrenci");
		out.println("<ul>");
		out.println("<li>Okul Numarası : " + ogrn.getOkulNo() + "</li>" +
				"<li>TC Kimlik Numarası : " + ogrn.getTCNo() + "</li>" +
				"<li>Ad : " + ogrn.getAd() + "</li>" +
				"<li>Soyad : " + ogrn.getSoyad() + "</li>" +
				"<li>Bölüm : " + ogrn.getBolum() + "</li>" +
				"<li>Memleket : " + ogrn.getMemleket() + "</li></ul>"
			   );
		out.println("</div>");
				
		out.println("<div> Öğretmen");
		out.println("<ul>");
		out.println("<li>TC Kimlik Numarası : " + ogrUye.getTCNo() + "</li>" +
				"<li>Ad : " + ogrUye.getAd() + "</li>" +
				"<li>Soyad : " + ogrUye.getSoyad() + "</li>" +
				"<li>Doğum Tarihi : " + ogrUye.getDogumTarihi() + "</li>" +
				"<li>Sicil Numarası : " + ogrUye.getSicilNo() + "</li>"
				);
		out.println("</div>");
		
		out.println("<div> Öğretim Üyesi");
		out.println("<ul>");
		out.println("<li>TC Kimlik Numarası : " + ogrt.getTCNo() + "</li>" +
				"<li>Ad : " + ogrt.getAd() + "</li>" +
				"<li>Soyad : " + ogrt.getSoyad() + "</li>" +
				"<li>Doğum Tarihi : " + ogrt.getDogumTarihi() + "</li>" +
				"<li>Ünvan : " + ogrUye.getUnvan() + "</li>" +
				"<li>Bölüm : " + ogrUye.getBolum() + "</li>"
				);
		out.println("</div>");
		
		out.println("<div> Memur");
		out.println("<ul>");
		out.println("<li>TC Kimlik Numarası : " + memr.getTCNo() + "</li>" +
				"<li>Ad : " + memr.getAd() + "</li>" +
				"<li>Soyad : " + memr.getSoyad() + "</li>" +
				"<li>Doğum Tarihi : " + memr.getDogumTarihi() + "</li>" +
				"<li>Sicil Numarası : " + memr.getSicilNo() + "</li>" +
				"<li>Birim : " + memr.getBirim() + "</li>"
				);
		
		out.println("</div>");
		out.println("</html></body>");
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
