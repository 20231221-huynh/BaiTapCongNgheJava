<%-- 
    Document   : student-form
    Created on : Aug 27, 2026, 9:56:39 AM
    Author     : PC DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form nhập thông tin sinh viên</title>
    </head>
    <body>
        <h1>Form nhập thông tin sinh viên</h1>
        <form action = "${pageContext.request.contextPath}/students" method = "POST">
            <label>Mã sinh viên:</label> <br>
            <input type="text" name="msv" required> <br> <br>
            
            <label>Tên sinh viên:</label> <br>
            <input type="text" name="tensv" required> <br> <br>
            
            <label>Lớp:</label> <br>
            <input type="text" name="lop" required> <br> <br>
            
            <label>Email:</label> <br>
            <input type="email" name="email" required> <br> <br>
            
            <button type="submit">Lưu sinh viên</button>
        </form>
    </body>
</html>
