/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.clase11jpsjpa.servlest;

import com.mycompany.clase11jpsjpa.logica.Partido;
import com.mycompany.clase11jpsjpa.persistencia.ControladoraPersistencia;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlos Jaquez
 */
@WebServlet(name = "SvPartido", urlPatterns = {"/SvPartido"})
public class SvPartido extends HttpServlet {

    private final String INDEXJSP = "index.jsp";
    private ControladoraPersistencia controladora = new ControladoraPersistencia();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvPartido</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvPartido at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Partido> lista = controladora.listarPartidos();

        request.setAttribute("partidos", lista);

        // Redirigir de vuelta al formulario
        request.getRequestDispatcher(INDEXJSP).forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String codigopartido = request.getParameter("codigopartido");
        String fechapartido = request.getParameter("fechapartido");
        String resultadopartido = request.getParameter("resultadopartido");
        Long equipolocal = Long.valueOf(request.getParameter("equipolocal"));
        Long equipovisitante = Long.valueOf(request.getParameter("equipovisitante"));

        Partido partido = new Partido();
        partido.setCodigo(codigopartido);
        partido.setFecha(fechapartido);
        partido.setResultado(resultadopartido);

        controladora.crearPartido(partido, equipolocal, equipovisitante);
        response.sendRedirect(INDEXJSP);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
