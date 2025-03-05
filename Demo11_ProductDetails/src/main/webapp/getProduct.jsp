<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.demo.bean.Product, com.demo.service.ProductService" %>
<%
    ProductService productService = new ProductService();
    Product product1 = null; // Initialize product1 to null

    String prodid = request.getParameter("prodid");

    if (prodid != null && !prodid.isEmpty()) { // Check if prodid is provided
        
            int prodIdInt = Integer.parseInt(prodid);
            product1 = productService.getProduct(prodIdInt); // Fetch product
        } else  {
            out.println("<p style='color:red;'>Invalid Product ID.</p>");
        }
    
%>

<h2>Get Product</h2>
<form method="get">
    Product ID: <input type="number" name="prodid" required>
    <input type="submit" name="action" value="fetch">
</form>

<h2>Product Details</h2>
<%
    if (product1 != null) { // Display product details if found
%>
    <table border="1">
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Quantity</th>
            <th>Price</th>
        </tr>
        <tr>
            <td><%= product1.getProdid() %></td>
            <td><%= product1.getProdname() %></td>
            <td><%= product1.getProdqty() %></td>
            <td><%= product1.getProdprice() %></td>
        </tr>
    </table>
    
<%
    } else if (prodid != null) { // If prodid is provided but no product found
        out.println("<p style='color:red;'>No product found with ID: " + prodid + "</p>");
    }
%>

    <a href="index.jsp">Go Back</a>

