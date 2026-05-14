<html>
<body>

<h2>Echo Server</h2>

<div>${message}</div><br/><br/>

<form action="/echo" method="post">
  <label for="msg">Message to server:</label><br>
  <input type="text" id="msg" name="msg"><br>   
  <input type="submit" value="Ping Server">
</form> 

</body>
</html>