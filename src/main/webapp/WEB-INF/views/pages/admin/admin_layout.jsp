<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome Admin</title>
    <script src="..\..\..\resources\js\admin\sidebar.js"></script>
    <script src="..\..\..\resources\js\admin\menu-popup.js"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.1/css/all.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/admin/menu.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/admin/sidebar.css">

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
    <c:if test="${not empty flashStatus}">
            <div id="statusMsgPopup" class="statusMsgPopup">
                <div class="statusMsgPopup-content">
                    <img src="${flashGif}" class="statusImg" alt="Status img"/>
                    <h4><c:out value="${flashStatus}" /></h4>
                </div>
            </div>

            <script>
                window.addEventListener('load', function () {
                    const popup = document.getElementById('statusMsgPopup');
                    if (!popup) return;
                    const textEl = popup.querySelector('h4');
                    if (textEl && textEl.textContent.trim().length > 0) {
                        popup.style.display = 'block';
                        setTimeout(() => popup.style.display = 'none', 4500);
                    }
                });
            </script>
        </c:if>
         <c:if test="${showAddModal == true}">
                <script>
                    document.addEventListener("DOMContentLoaded", function() {
                       openPopup();
                    });
                </script>
         </c:if>


</body>
</html>

