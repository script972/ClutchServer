package server;

import dao.CardsService;
import tables.Card;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by script972 on 05.08.2017.
 */
@WebServlet(name = "CardServlet", urlPatterns = {"*.html"})
public class CardServlet extends HttpServlet {
    @EJB
    CardsService cs;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Card> cardList=cs.findAll();
        request.setAttribute("cards", cardList);
        request.getRequestDispatcher("/cards.jsp").forward(request, response);
    }
}
