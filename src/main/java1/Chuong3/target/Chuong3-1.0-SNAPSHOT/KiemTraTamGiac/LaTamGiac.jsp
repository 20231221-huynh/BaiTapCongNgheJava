<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kiểm tra tam giác</title>
    </head>

    <body>

        <h1>Kiểm tra 3 số có phải là độ dài 3 cạnh của một tam giác</h1>

        <form action="LaTamGiac.jsp" method="POST">

            <label>Nhập a:</label>
            <input type="text" name="a" required>
            <br><br>

            <label>Nhập b:</label>
            <input type="text" name="b" required>
            <br><br>

            <label>Nhập c:</label>
            <input type="text" name="c" required>
            <br><br>

            <input type="submit" value="Kiểm tra">

        </form>

        <%
            String strA = request.getParameter("a");
            String strB = request.getParameter("b");
            String strC = request.getParameter("c");

            if (strA != null && strB != null && strC != null) {

                try {
                    int a = Integer.parseInt(strA);
                    int b = Integer.parseInt(strB);
                    int c = Integer.parseInt(strC);

                    if (a > 0 && b > 0 && c > 0
                            && a + b > c
                            && a + c > b
                            && b + c > a) {

                        out.println("<h3>Kết quả:</h3>");
                        out.println("<p>" + a + ", " + b + ", " + c
                                + " là độ dài 3 cạnh của một tam giác.</p>");

                    } else {

                        out.println("<h3>Kết quả:</h3>");
                        out.println("<p>" + a + ", " + b + ", " + c
                                + " không phải là độ dài 3 cạnh của một tam giác.</p>");
                    }

                } catch (NumberFormatException e) {

                    out.println("<p>Vui lòng nhập 3 số nguyên hợp lệ!</p>");
                }
            }
        %>

    </body>
</html>