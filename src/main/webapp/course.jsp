<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Adding course</title>
    </head>
    <body>
        <h2><a href="/main">back to main</a></h2>
        <form action="/course" method="POST">
            <label>name: </label><br>
            <input type="text" name="name">
            <br>
            <label>description: </label><br>
            <input type="text" name="description">
            <br>
            <label>category: </label><br>
            <input type="text" name="category">
            <br>
            <label>price: </label><br>
            <input type="text" name="price">
            <br>
            <label>hours: </label><br>
            <input type="text" name="hours">
            <br>
            <input type="submit" value="submit">
        </form>
    </body>
</html>
