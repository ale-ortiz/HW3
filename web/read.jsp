<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Database of Favorite Albums</title>
        <link rel="stylesheet" type="text/css" href="style.css"
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    <body>
        <h1>Alejandro's Favorite Albums!</h1>
        <div class="d">
        <%= table %>
        <a href="add.jsp">Add A New Album</a>
        </div>
        <div class="d3"><a href="index.jsp">Home</a></div>
    </body>
</html>
