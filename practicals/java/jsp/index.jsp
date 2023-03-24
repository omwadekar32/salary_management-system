<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <%
        // Check if the request method is POST
        if(request.getMethod().equals("POST")){
           // Retrieve the form data
           String name = request.getParameter("name");
           String email = request.getParameter("email");
        
           // Do something with the form data
           out.println("Name: " + name + "<br>");
           out.println("Email: " + email);
      }
%>
    <form action="<%= request.getRequestURL() %>" method="post">
        <input type="text" name="name" required/>
        <input type="text" name="email" required/>
        <button type="submit">Submit</button>
    </form>
</body>
</html>