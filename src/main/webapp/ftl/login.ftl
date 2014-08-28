<link class="cssdeck" rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/2.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/2.3.1/css/bootstrap-responsive.min.css" class="cssdeck">
<#--<script src="/Users/shrestar/Documents/noBackUp/jquery/jquery/js/jquery-1.9.1.js"></script>-->
<script class="cssdeck" src="//cdnjs.cloudflare.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script class="cssdeck" src="//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/2.3.1/js/bootstrap.min.js"></script>

    <div class="" id="loginModal">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>Have an Account?</h3>
    </div>
    <div class="modal-body">
        <div class="well">
            <ul class="nav nav-tabs">
                <li class="active"><a href="#login" data-toggle="tab">Login</a></li>
                <li><a href="#create" data-toggle="tab">Create Account</a></li>
            </ul>
            <div id="myTabContent" class="tab-content">
                <div class="tab-pane active in" id="login">
                    <form class="form-horizontal" action='login' method="POST">
                        <fieldset>
                            <div id="legend">
                                <legend class="">Login</legend>
                            </div>
                            <div class="control-group">
                                <!-- Username -->
                                <label class="control-label"  for="username">User Email</label>
                                <div class="controls">
                                    <input type="text" id="username" name="username" placeholder="" class="input-xlarge">
                                </div>
                            </div>

                            <div class="control-group">
                                <!-- Password-->
                                <label class="control-label" for="password">Password</label>
                                <div class="controls">
                                    <input type="password" id="password" name="password" placeholder="" class="input-xlarge">
                                </div>
                            </div>


                            <div class="control-group">
                                <!-- Button -->
                                <div class="controls">
                                    <button class="btn btn-success">Login</button>
                                </div>
                            </div>
                        </fieldset>
                    </form>
                </div>
                <div class="tab-pane fade" id="create">
                    <form id="tab" method="post">
                        <label>Username</label>
                        <input id="usernamea" type="text" placeholder="Enter User Name" class="input-xlarge">
                        <label>Password</label>
                        <input type="passworda" id="passworda" class="input-xlarge">
                        <label>First Name</label>
                        <input type="text" id="firstname" class="input-xlarge">
                        <label>Last Name</label>
                        <input type="text" id="lastname" class="input-xlarge">
                        <label>Email</label>
                        <input type="email" id="email" class="input-xlarge">
                        <div>
                            <button class="btn btn-primary" id="create-account">Create Account</button>
                        </div>

                    </form>
                </div>
                <div id="welcometext"></div>
            </div>
        </div>
    </div>

    <script>

        $(document).ready(function () {

            $("#create-account").click(function () {
                var username = $("#usernamea").val();
                var password = $("#passworda").val();
                var firstname = $("#firstname").val();
                var lastname = $("#lastname").val();
                var email = $("#email").val();

                $.ajax({
                    url:'createuser',
                    type:'POST',
                    data:{ username:username, password:password, firstname:firstname,lastname:lastname,email:email }
                })
            });


        });


    </script>

