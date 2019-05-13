<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div class="container">
        <h1 style="text-align:center;">USD to Indian Rupees Conversion</h1>

        <table>
            <thead style="background-color:darkcyan;">
              <tr>
                <th scope="col">USD</th>
                <th scope="col">Indian Rupees</th>
              </tr>
            </thead>
            <tbody>
             <c:forEach var = "i" begin="1" end ="50" step="1">
             <tr>
             	<td><c:out value="${i}"></c:out></td>
             	<td><c:out value="${i * 45}"></c:out></td>
             </tr>
             </c:forEach>
              
            </tbody>
          </table>
    </div>
</body>
</html>