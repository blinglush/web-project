<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>AJAX calls to Servlet using JQuery and JSON</title>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <script>
        $(document).ready(function() {
            $('#country').change(function(event) {
                var $country=$("select#country").val();
                $.get('country',{countryname:$country},function(responseJson) {
                    var $select = $('#states');
                    $select.find('option').remove();
                    $.each(responseJson, function(key, value) {
                        $('<option>').val(key).text(value).appendTo($select);
                    });
                });
            });
        });
    </script>
</head>
<body>
<h1>AJAX calls to Servlet using JQuery and JSON</h1>
Select Country:
<select id="country">
    <option>Select Country</option>
    <option value="nepal">Nepal</option>
    <option value="US">US</option>
</select>
<br/>
<br/>
Select State:
<select id="states">
    <option>Select State</option>
</select>
</body>
</html>