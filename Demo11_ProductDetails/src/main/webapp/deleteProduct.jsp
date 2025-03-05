<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.demo.service.ProductService" %>
<%
    ProductService productService = new ProductService();
    String prodid = request.getParameter("prodid");

    if (prodid != null) {
        productService.deleteProduct(Integer.parseInt(prodid));
        out.println("Product with ID " + prodid + " deleted successfully.");
    }
%>
<h2>Delete Product</h2>
<form method="post">
    Product ID: <input type="number" name="prodid" required>
    <input type="submit" value="Delete Product">
</form>

<a href="index.jsp">Go Back</a>
    