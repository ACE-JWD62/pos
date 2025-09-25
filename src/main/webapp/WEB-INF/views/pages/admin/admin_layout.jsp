<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome Admin</title>
    <script src="..\..\..\resources\js\sidebar.js"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.1/css/all.min.css">
    <link rel="stylesheet" href="..\..\..\resources\css\sidebar.css">

</head>
<body>
    <div class="layout">
        <jsp:include page="/WEB-INF/views/common/admin_sidebar.jsp" />
        <div class="main">
            <div class="header">
                <h2><c:out value="${pageTitle}" /></h2>
                <li onclick="logout()"><c:out value="${sessionScope.username}" /><i class="fa-solid fa-right-from-bracket"></i>Logout</li>
            </div>
            <div class="content">
                <jsp:include page="${pageContent}" />
            </div>
        </div>
    </div>
</body>
</html>

