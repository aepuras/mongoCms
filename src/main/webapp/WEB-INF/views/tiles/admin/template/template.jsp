<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
  <title>MongoCms Admin</title>
</head>
<body>
<div class="container">
  <!-- Header -->
  <tiles:insertAttribute name="header" />
  <!-- Menu Page -->
  <div>
    <tiles:insertAttribute name="menu" />
  </div>
  <!-- Body Page -->
  <div class="span-19 last">
    <tiles:insertAttribute name="body" />
  </div>
  <!-- Footer Page -->
  <tiles:insertAttribute name="footer" />
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</div>
</body>
</html>
