/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Felipe
 */
public class Controlador extends HttpServlet {

    Empleado em = new Empleado();
    EmpleadoDAO edao = new EmpleadoDAO();
    int ide;
    Cliente cl = new Cliente();
    ClienteDAO cdao = new ClienteDAO();
    int ide2;
    Producto pr = new Producto();
    ProductoDAO pdao = new ProductoDAO();
    int ide3;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");

        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }
        if (menu.equals("Empleado")) {
            switch (accion) {
                case "Listar":
                    List lista = edao.listar();
                    request.setAttribute("empleados", lista);
                    break;
                case "Agregar":
                    String dni = request.getParameter("txtDni");
                    String nom = request.getParameter("txtNombres");
                    String tel = request.getParameter("txtTelefono");
                    String est = request.getParameter("txtEstado");
                    String user = request.getParameter("txtUsuario");
                    em.setDni(dni);
                    em.setNom(nom);
                    em.setTel(tel);
                    em.setEstado(est);
                    em.setUser(user);
                    edao.agregar(em);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    ide = Integer.parseInt(request.getParameter("id"));
                    Empleado e = edao.listarId(ide);
                    request.setAttribute("empleado", e);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);

                    break;
                case "Actualizar":
                    String dni1 = request.getParameter("txtDni");
                    String nom1 = request.getParameter("txtNombres");
                    String tel1 = request.getParameter("txtTelefono");
                    String est1 = request.getParameter("txtEstado");
                    String user1 = request.getParameter("txtUsuario");
                    em.setDni(dni1);
                    em.setNom(nom1);
                    em.setTel(tel1);
                    em.setEstado(est1);
                    em.setUser(user1);
                    em.setId(ide);
                    edao.actualizar(em);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);

                    break;
                case "Delete":
                    ide = Integer.parseInt(request.getParameter("id"));
                    edao.delete(ide);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);

                    break;
                default:
                    throw new AssertionError();

            }

            request.getRequestDispatcher("Empleado.jsp").forward(request, response);
        }
        if (menu.equals("Cliente")) {
            switch (accion) {
                case "Listar":
                    List lista = cdao.listar();
                    request.setAttribute("clientes", lista);
                    break;
                case "Agregar":
                    String dniCli = request.getParameter("txtDniCli");
                    String nomCli = request.getParameter("txtNombresCli");
                    String dirCli = request.getParameter("txtDirCli");
                    String estCli = request.getParameter("txtEstadoCli");

                    cl.setDniCli(dniCli);
                    cl.setNomCli(nomCli);
                    cl.setDirCli(dirCli);
                    cl.setEstadoCli(estCli);
                    cdao.agregar(cl);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    ide2 = Integer.parseInt(request.getParameter("idCli"));
                    Cliente c = cdao.listarId(ide2);
                    request.setAttribute("cliente", c);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);

                    break;
                case "Actualizar":
                    String dniCli1 = request.getParameter("txtDniCli");
                    String nomCli1 = request.getParameter("txtNombresCli");
                    String dirCli1 = request.getParameter("txtDirCli");
                    String estCli1 = request.getParameter("txtEstadoCli");
                    cl.setDniCli(dniCli1);
                    cl.setNomCli(nomCli1);
                    cl.setDirCli(dirCli1);
                    cl.setEstadoCli(estCli1);
                    cl.setIdCli(ide2);
                    cdao.actualizar(cl);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);

                    break;
                case "Delete":
                    ide2 = Integer.parseInt(request.getParameter("idCli"));
                    cdao.delete(ide2);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);

                    break;
                default:
                    throw new AssertionError();

            }

            request.getRequestDispatcher("Clientes.jsp").forward(request, response);
        }
        if (menu.equals("Producto")) {
            switch (accion) {
                case "Listar":
                    List lista = pdao.listar();
                    request.setAttribute("productos", lista);
                    break;
                case "Agregar":
                    String nomPro = request.getParameter("txtNomPro");
                    String prePro = request.getParameter("txtPrePro");
                    String stoPro = request.getParameter("txtStoPro");
                    String estPro = request.getParameter("txtEstadoPro");

                    pr.setNomPro(nomPro);
                    pr.setPrePro(Integer.parseInt(prePro));
                    pr.setPrePro(Integer.parseInt(stoPro));
                    pr.setEstadoPro(estPro);
                    pdao.agregar(pr);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    ide3 = Integer.parseInt(request.getParameter("idPro"));
                    Producto p = pdao.listarId(ide3);
                    request.setAttribute("producto", p);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);

                    break;
                case "Actualizar":
                    String nomPro1 = request.getParameter("txtNomPro");
                    String prePro1 = request.getParameter("txtPrePro");
                    String stoPro1 = request.getParameter("txtStoPro");
                    String estPro1 = request.getParameter("txtEstadoPro");
                    pr.setNomPro(nomPro1);
                    pr.setPrePro(Integer.parseInt(prePro1));
                    pr.setPrePro(Integer.parseInt(stoPro1));
                    pr.setEstadoPro(estPro1);
                    pdao.actualizar(pr);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);

                    break;
                case "Delete":
                    ide3 = Integer.parseInt(request.getParameter("idPro"));
                    pdao.delete(ide3);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);

                    break;
                default:
                    throw new AssertionError();

            }

            request.getRequestDispatcher("Producto.jsp").forward(request, response);
        }
        if (menu.equals("NuevaVenta")) {
            request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
