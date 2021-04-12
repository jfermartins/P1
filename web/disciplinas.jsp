<%-- 
    Document   : disciplinas
    Created on : 12 de abr de 2021, 17:53:44
    Author     : Fernanda
--%>

<%@page import="br.com.fatecpg.Disciplinas"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/header.jspf" %>

        <%if (session.getAttribute("session.username") == null) {%>
        <div style="color:red">
            Você precisa estar identificado para ter acesso a este conteúdo.
        </div>
        <%} else {%>
        <%
            ArrayList<Disciplinas> disciplinas = (ArrayList) application.getAttribute("disciplinas");

            if (disciplinas == null) {
                disciplinas = Disciplinas.getList();
            }

            String[] notasP1 = request.getParameterValues("notas P1");
            String[] notasP2 = request.getParameterValues("notas P2");

            if (notasP1 != null && notasP2 != null) {
                for (int i = 0; i < disciplinas.size(); i++) {
                    disciplinas.get(i).setNotaP1(Double.parseDouble(notasP1[i]));
                    disciplinas.get(i).setNotaP2(Double.parseDouble(notasP2[i]));

                }
                application.setAttribute("disciplinas", disciplinas);
            }
        %>

        <form>
            <div>
                <table>
                    <tr>
                        <th>Disciplinas</th>
                        <th>Nota P1</th>
                        <th>Nota P2</th>

                    </tr>
                    <%for (Disciplinas disciplina : disciplinas) {%>
                    <tr>
                        <td><%= disciplina.getNome()%></td>
                        <td><input type="text" name="notas P1" value="<%= disciplina.getNotaP1()%>"></td>
                        <td><input type="text" name="notas P2" value="<%= disciplina.getNotaP2()%>"></td>
                    </tr>
                    <%}%>
                </table>

                <div>
                    <input type="submit" value="Enviar">
                </div>
            </div>
        </form>
        <%}%>

    </body>
</html>
