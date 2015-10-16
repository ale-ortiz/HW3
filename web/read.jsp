<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Database of Favorite Albums</title>
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    <body>
        <h1>Alejandro's Favorite Albums!</h1>
        <%= table %>
        <a href="add">Add A New Album</a>
    </body>
</html>
