<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Hello World!</h2>
<form method="post" action="<c:url value="/evaluate" />" target="theframe">
<textarea name="script" rows="20" cols="100"></textarea><br />
<input type="submit" value="Evaluate!" />
</form>
<iframe style="width: 100pct" name="theframe" id="theframe"></iframe>
</body>
</html>
