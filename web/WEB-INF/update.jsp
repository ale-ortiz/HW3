<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update An Album</title>
        <link rel="stylesheet" type="text/css" href="style.css"
    </head>
    <body>
        <h1>Update An Album</h1>
        
        <form name="addForm" action="read.jsp" method="post">
            <table>
                <tbody>
                    <tr>
                        <td>Album Name:</td>
                        <td><input type="text" name="album" value="" size="50"</td>
                    </tr>
                    <tr>
                        <td>Artist Name:</td>
                        <td><input type="text" name="artist" value="" size="50"</td>
                    </tr>
                    <tr>
                        <td>Year of Release:</td>
                        <td><input type="text" name="year" value="" size="50"</td>
                    </tr>
                    <tr>
                        <td>Genre:</td>
                        <td><input type="text" name="genre" value="" size="50"</td>
                    </tr>
                </tbody>
            </table>
            <div>
            <input type="reset" value="Clear"  id="clear">
            <input type="submit" value="Add"  id="add">
            </div>
        </form>
        <div class="d3"> <a href="index.jsp">Home</a></div>

    </body>
</html>