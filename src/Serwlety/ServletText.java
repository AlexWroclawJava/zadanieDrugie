package Serwlety;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import pl.Javastart.Obliczenia.IleZnakow;
import pl.Javastart.Obliczenia.IloscZnakowBezSpacji;

@WebServlet("/SkanerTextu")
public class ServletText extends HttpServlet {

    private static String STALA3= "ghi";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String text = request.getParameter("tekst");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<head><title>Aplikacja do przeliczania miar</title>/<head>");

        writer.println("<body>");
        writer.println("<h1> Przesłany tekst </h1>");

        writer.println(text);
        IleZnakow ileZnakow = new IleZnakow();
        writer.println("<h2> Ilość wszytkich znaków: " + ileZnakow.konwerter1(text) + "</h2>");

        IloscZnakowBezSpacji iloscZnakowBezSpacji = new IloscZnakowBezSpacji();
        writer.println("<h2> Ilość znaków bez spacji: " + iloscZnakowBezSpacji.konwerter2(text) + "</h2>");
        writer.println("<h2> Ilość wyrazów: " + STALA3 + "</h2>");

        writer.println("</body>");
        writer.println("</html>");
    }
}


