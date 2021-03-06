<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Student Registration Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			
			FirstName:<form:input path="firstName"/>
			<br><br>
			
			LastName:<form:input path="lastName"/>
			<br><br>
			
			<form:select path="country">
				<form:options items="${student.countryOptions}"/>
			</form:select>
			
			<input type="submit" value="Submit"/>
			
			Operating Systems:
			Linux<form:checkbox path="operatingSystems" value="Linux"/>
			Mac Os<form:checkbox path="operatingSystems" value="Mac Os"/>
			Ms Window<form:checkbox path="operatingSystems" value="Ms Window"/>
			
			
		</form:form>
	</body>	
</html>