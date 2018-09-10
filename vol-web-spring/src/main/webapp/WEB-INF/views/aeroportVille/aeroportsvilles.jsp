<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Liste des élèves</title>
<meta name="description"
    content="Dépensez ici votre argent en toute impunité." />
<meta charset="UTF-8" />
<base href="/vol-web-spring/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

    <div class="container-fluid">
        <header class="header">

            <h1>Les aéroportsvilles</h1>

        </header>

        <section>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Identifiant</th>
                        <th>Version</th>
                        <th>Aeroport</th>
                        <th>Ville</th>
                        
                        <th></th>
                    </tr>
                </thead>

                <tbody>
                
                    <c:forEach items="${aeroportvilles}" var="aeroportville">
                        <tr>
                            <td>${aeroportville.id}</td>
                            <td>${aeroportville.version}</td>
                            <td>${aeroportville.aeroport.code}</td>                            
                            <td>${aeroportville.ville.nom}</td>
                            
                            
                                <td><a href="aeroportville/delete/${aeroportville.id}" class="btn btn-danger btn-sm">Supprimer</a></td>
                                
                        </tr>
                    
                    </c:forEach>
                

                </tbody>
            </table>
            <a href="aeroportville/add" class="btn btn-success">Ajouter</a>
        </section>
    </div>

</body>
</html>