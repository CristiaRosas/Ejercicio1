package org.cristianrosas.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/producto-servlet")
@MultipartConfig
public class ProductoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> datosProducto = new ArrayList<>();
        
        String nombreproducto = req.getParameter("nombreproducto");
        String marcaProducto = req.getParameter("marcaProducto");
        String descripcionproducto = req.getParameter("descricionproducto");
        String precioProducto = req.getParameter("precioProducto");
        getServletContext().getRequestDispatcher("/formulario-productos/formulario-productos.jsp").forward(req, resp);
        
        datosProducto.add(nombreproducto);
        datosProducto.add(marcaProducto);
        datosProducto.add(descripcionproducto);
        datosProducto.add(precioProducto);
    }
    
    
    
    
}
