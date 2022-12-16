<%-- 
    Document   : index.jsp
    Created on : 16 груд. 2022 р., 14:16:28
    Author     : Andrii
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java EE 12</title>
        <style>
            body {
                background-image:url("https://visit.sumy.ua/wp-content/uploads/2019/04/345345-1.png");
                background-repeat: no-repeat;
                background-size: cover;
                background-color: #cccccc; 
                font: "Roboto";
            }
            h1 {
                text-align: center;
            }
            #page {
                width: 800px;
                margin: auto;
            }
            form {
                width: 400px;
                margin: 20px auto;
            }
            mark {
                background-color: indianred;
                font-weight: bold;
                font-size: 14px;
            }
            input[type="submit"] {
                margin: auto;
                font-weight: bold;
            }
            .list, .list td, .list th {
                margin: auto;
                border: 1px solid black;
                border-collapse: collapse;
            }
            .list td, .list th {
                padding: 10px;
            }
            </style>
    </head>
    <body>
        <form method="post" action="StudentAdd">
            <table>
                <tbody>
                    <tr>
                        <td><label for="firstName"><b>First Name</b></label></td>
                        <td><input id="firstName" type="text" name="firstName"></td>
                    </tr>
                    <tr>
                        <td><label for="lastName"><b>Last Name</b></label></td>
                        <td><input id="lastName" type="text" name="lastName"></td>
                    </tr>
                    <tr>
                        <td><label for="age"><b>Age</b></label></td>
                        <td><input id="age" type="text" name="age"></td>
                    </tr>
                    <tr>
                        <td><label for="email"><b>Email</b></label></td>
                        <td><input id="email" type="email" name="email"></td>
                    </tr>
                    <tr>
                        <td><label for="group"><b>Group</b></label></td>
                        <td><input id="group" type="text" name="group"></td>
                    </tr>
                    <tr>
                        <td><label for="faculty"><b>Faculty</b></label></td>
                        <td><input id="faculty" type="text" name="faculty"></td>
                    </tr>
                </tbody>
            </table>
            <input type="submit" name="send" value="Send">
        </form>
        <c:if test="${students.size() > 0}">
                <table class='list'>
                    <tr>
                        <th><mark>First Name</mark></th>
                        <th><mark>Last Name</mark></th>
                        <th><mark>Age</mark></th>
                        <th><mark>Email</mark></th>
                        <th><mark>Group</mark></th>
                        <th><mark>Faculty</mark></th>
                    </tr>
                    <c:forEach var="student" items="${students}">
                        <tr>
                            <td><mark><c:out value="${student.getFirstName()}"/></mark></td>
                            <td><mark><c:out value="${student.getLastName()}"/></mark></td>
                            <td><mark><c:out value="${student.getAge()}"/></mark></td>
                            <td><mark><c:out value="${student.getEmail()}"/></mark></td>
                            <td><mark><c:out value="${student.getGroup()}"/></mark></td>
                            <td><mark><c:out value="${student.getFaculty()}"/></mark></td>
                        </tr>
                    </c:forEach>
                </table>
            </c:if>
    </body>
</html>
