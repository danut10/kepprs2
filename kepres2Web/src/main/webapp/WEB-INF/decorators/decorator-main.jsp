<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator"%>

<html>
	<head>
		<title>
			Magazin brazi
		</title>

		<meta http-equiv="content-type" content="text/html; charset=iso-8859-1" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/body.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/layout.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/screen.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/tabs.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/home.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery-ui/jquery-ui.min.css">
				
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>	
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui-1.12.1.min.js"></script>	
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/navigation.js"></script>			
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/tabs.js"></script>			
	</head>

	<body>

		<div id="divContainer" style="margin: auto; width: 1300px;">

			<div id="divHeader"><jsp:include page="/WEB-INF/common/header.jsp"/></div>
			<div id="divMenu"><jsp:include page="/WEB-INF/common/menu.jsp"/></div>
			<div id="divBody"><decorator:body /></div>
			<div id="divFooter"><jsp:include page="/WEB-INF/common/footer.jsp"/></div>

		</div>
			<div id="divFootnote" style="margin: auto;"><jsp:include page="/WEB-INF/common/footnote.jsp"/>
		</div>

	</body>

</html>