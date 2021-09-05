<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear employee! Welcome!!!</h2>
<br>
<br>
<br>

<%--Your name: ${param.employeeName}--%>

Your name: ${employee.name}
<br><br>
Your surname: ${employee.surname}
<br><br>
Your salary: ${employee.salary}
<br><br>
Your department: ${employee.department}
<br><br>
Your car brand: ${employee.carBrand}
<br><br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">

        <li>  ${lang}  </li>

    </c:forEach>

</ul>

Phone number: ${employee.phoneNumber}
<br><br>
Email: ${employee.email}
</body>


</html>