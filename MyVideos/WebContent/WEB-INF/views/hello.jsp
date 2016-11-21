<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>YourVideos.com</title>
<link rel="shortcut icon" href="">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" type="text/css" rel="stylesheet">
<link href="<c:url value="/resources/hello.css" />" rel="stylesheet">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="<c:url value="/resources/hello.js" />" type="text/javascript"></script>

</head>

<body>
	<div id=bg>
	<img src="<c:url value="/resources/bg.jpg" />"  />
	</div> 
	
	<div class="containe" id="name_table">
		<div>
		<table class="table table-stripped" id="playlist">

			<thead>
				<tr>
					<th>Video Names</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${videos }" var="video">
					<tr>
						<td>${video}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
		

	</div>
	<div id="vid_container" class="vid">
	<div class="videoContainer_inner">
		<iframe  src="https://www.youtube.com/embed/fNs3yaMCnQ0" frameborder="0" allowfullscreen></iframe>
	</div>
	<div id="controls">
	<div id="inner">
		<button class="btn btn-primary" id="nextbtn">Next Video</button>
		<button class="btn btn-success" id="prevbtn">Prev Video</button>
	</div>
	</div>
	</div>
</body>
</html>