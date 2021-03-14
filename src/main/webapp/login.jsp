<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <h1>Login:</h1>
        <form action="/login" method="POST">
            <p>
                <label>Username:</label><br>
                <input type="text" name="name"><br>
                <label>Password:</label><br>
                <input type="text" name="password"><br>
                <label><input type="submit"></label><br>
                <label><a href="/registration">Are you a new student?</a></label>
            </p>
        </form>
    </body>
</html>
