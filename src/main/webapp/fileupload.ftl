<html>
<head><title>File Upload</title>

<body>
<form name="user" action="upload" method="post">

    <input type="upload" value="upload" />
</form>


<form name="form1" id="form1" action="upload" method="post" enctype="multipart/form-data">
    <input type="hidden" name="hiddenfield1" value="ok">
    Files to upload:
    <br/>
    <input type="file" size="50" name="file1">
    <br/>
    <input type="file" size="50" name="file2">
    <br/>
    <input type="file" size="50" name="file3">
    <br/>
    <input type="submit" value="Upload">
</form>

<form action="upload" method="post">
    <p>
        <label for="firstname">first name: </label>
        <input type="text" id="firstname"><br />
        <label for="lastname">last name: </label>
        <input type="text" id="lastname"><br />
        <label for="email">email: </label>
        <input type="email" id="email"><br>
        <input type="radio" name="sex" value="male"> Male<br>
        <input type="radio" name="sex" value="female"> Female<br>
        <input type="submit" value="send"> <input type="reset">
    </p>


</body>
</html>