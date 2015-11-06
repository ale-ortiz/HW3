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
            <table>
                <tbody>
                    <tr class="tr1">
                        <td>ID</td>
                        <td class="td1">Album Name</td>
                        <td>Album Artist</td>
                        <td>Year of Release</td>
                        <td>Genre</td>
                    </tr>
                </tbody>
            </table>
        <%= table %>
        <a href="add">Add A New Album</a
         <br><br>
        <a href="search.jsp">Search Friends</a>
        </div>
        <div class="d3"><a href="index.jsp">Home</a></div>
    </body>
</html>
