<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Registration</title>
    </head>
    <body>
        <h1>Registration:</h1>
        <form action="/registration" method="POST">
            <p>
                <label>Username:</label><br>
                <input type="text" name="name"><br>
                <label>Password:</label><br>
                <input type="text" name="password"><br>
                <label><input type="submit"></label><br>
                <label><a href="/login">Already have an account?</a></label>
            </p>
        </form>
    </body>
</html>
