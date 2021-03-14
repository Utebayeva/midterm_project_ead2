<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Main page</title>
    </head>
    <body>
        <div>
            <h1>Online store of courses</h1>
            <a href="/logout">Logout</a> |
            <a href="/course">Add course</a> <br>
        </div>
        <%
            out.println(request.getAttribute("courses"));
        %>
    </body>
</html>
