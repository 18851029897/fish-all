$(function () {
    var $loginForm = $('#loginForm');

    //登录提交
    $loginForm.validate({
        submitHandler: function () {
            var options = {
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                success: function (data) {
                    if (data.code == '1000') {

                    } else {

                    }
                },
                error: function (data) {

                }
            };
            $loginForm.ajaxSubmit(options);
        },
        success: function (element) {

        }
    });


});