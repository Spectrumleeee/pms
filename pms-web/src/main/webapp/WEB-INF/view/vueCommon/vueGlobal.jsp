<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextpath} }" />

<%
session.setAttribute("jqueryVersion", "1.8.3");
session.setAttribute("elementVersion", "1.2.9");
session.setAttribute("vueJsVersion", "2.1.8");
%>
<script type="text/javascript">
	var ctx = '<%=request.getContextpath() %>';
</script>