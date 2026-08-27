<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String msv = (String) request.getAttribute("msv");
    String tensv = (String) request.getAttribute("tensv");
    String lop = (String) request.getAttribute("lop");
    String email = (String) request.getAttribute("email");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Thông tin sinh viên</title>
    </head>

    <body>

        <h1>Thông tin sinh viên</h1>

        <p>Mã sinh viên: <%= msv %></p>
        <p>Tên sinh viên: <%= tensv %></p>
        <p>Lớp: <%= lop %></p>
        <p>Email: <%= email %></p>

        <br>

        <a href="<%= request.getContextPath() %>/BaiLab6_Bai2/student-form.jsp">
            Quay lại
        </a>

    </body>
</html>