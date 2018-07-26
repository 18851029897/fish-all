$(function () {
    var $loginForm = $('#loginForm');

    //登录提交
    $loginForm.validate({
        submitHandler: function () {
            var options = {
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
        // rules: {
        //     phone: {
        //         required: true
        //     },
        //     password: {
        //         required: true
        //     },
        //     code: {
        //         required: true
        //     }
        // },
        // messages: {
        //     phone: {
        //         required: "用户名没有填写"
        //     },
        //     password: {
        //         required: "密码没有填写"
        //     },
        //     code: {
        //         required: "验证码没有填写"
        //     }
        // }
    });


});