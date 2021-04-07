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
        <nav class="navbar navbar-expand-lg navbar-light bg-info">
            <div class="container-fluid">
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a style="margin-left:10px; border:none" class="btn btn-outline-light" aria-current="page" href="#">Home</a>
                        </li>
                        <li class="nav-item">
                            <a style="margin-left:10px; border:none" class="btn btn-outline-light" href="Controlador?menu=Producto" target="myFrame">producto</a>
                        </li>
                        <li class="nav-item">
                            <a style="margin-left:10px; border:none" class="btn btn-outline-light" href="Controlador?menu=Empleado&accion=Listar" target="myFrame">Empleado</a>
                        </li>
                        <li class="nav-item">
                            <a style="margin-left:10px; border:none" class="btn btn-outline-light" href="Controlador?menu=Clientes" target="myFrame">Clientes</a>
                        </li>
                        <li class="nav-item">
                            <a style="margin-left:10px; border:none" class="btn btn-outline-light" href="Controlador?menu=NuevaVenta" target="myFrame">Nueva Venta</a>
                        </li>

                    </ul>
                </div>
                <div class="dropdown">
                    <a style="border:none" class="btn btn-outline-light dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-bs-toggle="dropdown" aria-expanded="true">
                        ${usuario.getNom()}
                    </a>

                    <ul class="dropdown-menu text-center" aria-labelledby="dropdownMenuLink">
                        <li><a class="dropdown-item" href="#">
                                <img src="mg/perfil.jpg" alt="" height="60" width="60"/>

                            </a></li>
                        <li><a class="dropdown-item" href="#">${usuario.getUser()}</a></li>
                        <li><a class="dropdown-item" href="#">usuario@gmail.com</a></li>
                        <div class="dropdown-divider"></div>
                        <form action="Validar" method="POST">
                            <button name="accion" value="Salir" class="dropdown-item" href="#">salir</button>
                        </form>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="m-4" style="height:550px">
            <iframe name="myFrame" style="height:100% ; width:100%">

            </iframe>
        </div>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>

    </body>
</html>
