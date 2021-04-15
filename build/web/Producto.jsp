<%-- 
    Document   : Principal
    Created on : 28-03-2021, 21:05:06
    Author     : Felipe
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                    <form action="Controlador?menu=Producto" method="POST">
                        <div class="form-group">
                            <label>Nombre</label>
                            <input type="text" value="${Producto.getNomPro()}"  name="txtNomPro" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Precio</label>
                            <input type="text" value="${Producto.getPrePro()}" name="txtPrePro" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Stock</label>
                            <input type="text" value="${Producto.getStoPro()}" name="txtStoPro" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Estado</label>
                            <input type="text" value="${Producto.getEstadoPro()}" name="txtEstadoPro" class="form-control">
                        </div>
                        
                        <input type="submit" name="accion" value="Agregar"  class="btn btn-info">
                        <input type="submit" name="accion" value="Actualizar"  class="btn btn-success">
                    </form>

                </div>
            </div>
            <div class="col-sm-8">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>NOMBRE</th>
                            <th>PRECIO</th>
                            <th>STOCK</th>
                            <th>ESTADO</th>
                            <th>ACCIONES</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="pr" items="${productos}">
                            <tr>
                                <td>${pr.getIdPro()}</td>
                                <td>${pr.getNomPro()}</td>
                                <td>${pr.getPrePro()}</td>
                                <td>${pr.getStoPro()}</td>
                                <td>${pr.getEstadoPro()}</td>
                                <td>
                                    <a class="btn btn-warning" href="Controlador?menu=Producto&accion=Editar&idPro=${pr.getIdPro()}">Editar</a> 
                                    <a class="btn btn-danger" href="Controlador?menu=Producto&accion=Delete&idPro=${pr.getIdPro()}">Delete</a>


                                </td>
                            </tr> 
                        </c:forEach>
                    </tbody>
                </table>


            </div>
        </div>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>

    </body>
</html>