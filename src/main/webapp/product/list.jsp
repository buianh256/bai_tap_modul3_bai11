<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <h2>Product </h2>
    <button onclick="window.location.href='/monkeychan?action=create'" type="button" class="btn btn-info">Create new product</button>
    <table class="table">
        <thead>
        <tr class="table-success">
            <th>CodeId</th>
            <th>Name</th>
            <th>Type</th>
            <th>Money</th>
            <th>Producer</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        </thead>
       <tbody>
       <c:forEach items='${products}' var="product">
            <tr class="table-primary">
                <td><a href="/monkeychan?action=view&id=${product.getCodeId()}">${product.getCodeId()}</a></td>
                <td>${product.getName()}</td>
                <td>${product.getType()}</td>
                <td>${product.getMoney()}</td>
                <td>${product.getProducer()}</td>
                <td><a href="/monkeychan?action=update&id=${product.getCodeId()}">update</a></td>
                <td>delete</td>
            </tr>
        </c:forEach>
       </tbody>
    </table>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
</body>
</html>
