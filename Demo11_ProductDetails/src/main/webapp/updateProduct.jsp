<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.demo.bean.Product, com.demo.service.ProductService" %>
<%
    ProductService productService = new ProductService();
    String prodid = request.getParameter("prodid");
    String prodname = request.getParameter("prodname");
    String prodqty = request.getParameter("prodqty");
    String prodprice = request.getParameter("prodprice");
    String action = request.getParameter("action");

    Product product = null;

    if (prodid != null && action != null && action.equals("fetch")) {
        product = productService.getProduct(Integer.parseInt(prodid));
    } else if (prodid != null && prodname != null && prodqty != null && prodprice != null) {
        product = new Product(Integer.parseInt(prodid), prodname, Integer.parseInt(prodqty), Double.parseDouble(prodprice));
        productService.updateProduct(product);
        out.println("Product updated successfully: " + product);
    }
%>
<h2>Update Product</h2>
<form method="post">
    Product ID: <input type="number" name="prodid" required>
    <input type="submit" name="action" value="fetch">
</form>

<%
    if (product != null) {
%>
    <form method="post">
        Product ID: <input type="number" name="prodid" value="<%= product.getProdid() %>" readonly><br>
        Product Name: <input type="text" name="prodname" value="<%= product.getProdname() %>" required><br>
        Quantity: <input type="number" name="prodqty" value="<%= product.getProdqty() %>" required><br>
        Price: <input type="number" step="0.01" name="prodprice" value="<%= product.getProdprice() %>" required><br>
        <input type="submit" value="Update Product">
    </form>
<%
    }
%>


<a href="index.jsp">Go Back</a>
