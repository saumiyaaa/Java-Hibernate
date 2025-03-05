<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.demo.bean.Product, com.demo.service.ProductService" %>
<%
    ProductService productService = new ProductService();
    java.util.List<Product> products = productService.getAllProducts();
%>
<h2>Product List</h2>
<table border="1">
    <tr>
        <th>Product ID</th>
        <th>Product Name</th>
        <th>Quantity</th>
        <th>Price</th>
    </tr>
    <%
        for (Product product : products) {
    %>
        <tr>
            <td><%= product.getProdid() %></td>
            <td><%= product.getProdname() %></td>
            <td><%= product.getProdqty() %></td>
            <td><%= product.getProdprice() %></td>
        </tr>
    <%
        }
    %>
</table>
