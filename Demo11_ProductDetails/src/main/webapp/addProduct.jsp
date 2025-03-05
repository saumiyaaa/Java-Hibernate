<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.demo.bean.Product, com.demo.service.ProductService" %>
<%
    ProductService productService = new ProductService();

    String prodid = request.getParameter("prodid");
    String prodname = request.getParameter("prodname");
    String prodqty = request.getParameter("prodqty");
    String prodprice = request.getParameter("prodprice");

    if (prodid != null && prodname != null && prodqty != null && prodprice != null) {
        Product product = new Product(Integer.parseInt(prodid), prodname, Integer.parseInt(prodqty), Double.parseDouble(prodprice));
        productService.addProduct(product);
        out.println("Product added successfully: " + product);
    }
%>
<form method="post">
    Product ID: <input type="number" name="prodid" required><br>
    Product Name: <input type="text" name="prodname" required><br>
    Quantity: <input type="number" name="prodqty" required><br>
    Price: <input type="number" step="0.01" name="prodprice" required><br>
    <input type="submit" value="Add Product">
</form>


<a href="index.jsp">Go Back</a>
