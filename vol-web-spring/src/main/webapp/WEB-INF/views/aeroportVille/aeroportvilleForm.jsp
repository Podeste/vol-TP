<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="sopra.promo404.vol.model.AeroportVille"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<title>Edition de l'élève</title>
<meta charset="UTF-8" />
<base href="/vol-web-spring/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

    <div class="container">
        <header class="header">

            <h1>Edition d'AéroportVille</h1>

        </header>

        <section>
            <form action="aeroportville/save" method="post">
                <input type="hidden" name="id" id="id"
                    value="${monAeroportVille.id}" />

                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Aéroport</label>
                    <div class="col-sm-10">
                        <select class="custom-select" name="aeroport.id">
                            <option value=""></option>
                            <c:forEach items="${aeroports}" var="aero">
                                <option value="${aero.id}">${aero.code}</option>
                            </c:forEach>

                        </select>
                    </div>
                </div>

                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Ville</label>
                    <div class="col-sm-10">
                        <select class="custom-select" name="ville.id">
                            <option value=""></option>
                            <c:forEach items="${villes}" var="ville">
                                <option value="${ville.id}">${ville.nom}>${ville.codePostal}</option>
                            </c:forEach>

                        </select>
<!--                          <select class="custom-select" name="ville.codePostal" -->
<!--                             id="codePostal"> -->
<!--                             <option value=""></option> -->
<%--                             <c:forEach items="${codePostal}" var="cpl"> --%>
<%--                                 <option value="${codePostal}" --%>
<%--                                     ${monAeroportVille.ville.cpl eq nom?'selected':''}>${cpl.label}</option> --%>
<%--                             </c:forEach> --%>

<!--                         </select> <select class="custom-select" name="version" id="version"> -->
<!--                             <option value=""></option> -->
<%--                             <c:forEach items="${pays}" var="pay"> --%>
<%--                                 <option value="${pays}" --%>
<%--                                     ${monAeroportVille.ville.pay eq pay?'selected':''}>${pay.label}</option> --%>
<%--                             </c:forEach> --%>
<!--                         </select> -->

                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-7">
                        <button type="submit" class="btn btn-primary col-sm-12">Envoyer</button>
                    </div>
                    <div class="col-sm-3">
                        <a href="aeroportville/list" class="btn btn-warning col-sm-12">Annuler</a>
                    </div>
                </div>
            </form>
        </section>
    </div>
</body>
</html>