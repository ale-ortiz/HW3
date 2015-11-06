<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Albums"%>
<% Albums album = (Albums) request.getAttribute("album"); %>

<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update An Album</title>
        <link rel="stylesheet" type="text/css" href="style.css"
    </head>
     <h1>Update An Album</h1>
        
        <form name="updateForm" action="updateAlbum" method="get">
            <table>
                <tbody>
                     <tr>
                        <td>Album ID:</td>
                        <td><input type="text" name="id" value="<%= album.getAlbumID() %>" readonly/></td>
                    </tr>
                    <tr>
                        <td>Album Name:</td>
                        <td><input type="text" name="album" value="<%= album.getAlbumName() %>" /></td>
                    </tr>
                    <tr>
                        <td>Artist Name:</td>
                        <td><input type="text" name="artist" value="<%= album.getArtistName() %>" /></td>
                    </tr>
                    <tr>
                        <td>Year of Release:</td>
                        <td><input type="text" name="year" value="<%= album.getYearOfRelease() %>" /></td>
                    </tr>
                    <tr>
                        <td>Genre:</td>
                        <td><input type="text" name="genre" value="<%= album.getGenre() %>" /></td>
                    </tr>
                </tbody>
            </table>
            <div>
            <input type="reset" value="Clear"  id="clear">
            <input type="submit" value="Update"  id="update">
            </div>
        </form>
        <div class="d3"> <a href="index.jsp">Home</a></div>

    </body>
</html>
