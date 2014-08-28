<html>
<head><title> - Registration </title>

<body>
<form name="user" action="hello" method="post">
    Firstname: <input type="text" name="firstname" /> <br/>
    Lastname: <input type="text" name="lastname" />       <br/>
    <input type="submit" value="Save" />
</form>

<table class="datatable">
    <tr>
        <th>Firstname</th>  <th>password</th>
    </tr>
<#list users as user>
    <tr>
        <td>${user.userName}</td> <td>${user.passWord}</td>
    </tr>
</#list>
</table>
</body>
</html>
