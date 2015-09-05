<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:url value="" var="currentUrl" ></c:url>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Admin</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <c:forEach var="menuItem" items="${menuItems}">
                    <c:set var="active" value="${fn:endsWith(pageContext.request.requestURL, menuItem.url)}" />
                    <c:out value="${pageContext.request.requestURI}" /> / <c:out value="${menuItem.url}" />
                    <li class="active"><a href="${menuItem.url}">${menuItem.name}</a></li>
                </c:forEach>
                <c:if test="${pageContext.request.userPrincipal.name != null}">
                    <li><a href="javascript:formSubmit()"> Logout</a></li>
                </c:if>
            </ul>

        </div><!--/.nav-collapse -->
    </div>
</nav>


<c:url value="/admin/j_spring_security_logout" var="logoutUrl" />

<!-- csrt for log out-->
<form action="${logoutUrl}" method="post" id="logoutForm">
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}" />
</form>

<script>
    function formSubmit() {
        document.getElementById("logoutForm").submit();
    }
</script>

