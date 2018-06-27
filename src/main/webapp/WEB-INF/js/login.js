function showPsw(id) {//密码明文
    var obj = $("#" + id);
    obj.attr("type") == "password" ? obj.attr("type", "text") : obj.attr("type", "password");
}

//tab切换栏
$(document).ready(function () {
    //Default Action  
    $(".tab_content").hide(); //Hide all content  
    $("ul.tabs li:first").addClass("tabs-active").show(); //Activate first tab  
    $(".tab_content:first").show(); //Show first tab content  
    //On Click Event  
    $("ul.tabs li").click(function () {
        $("ul.tabs li").removeClass("tabs-active"); //Remove any "active" class
        $(this).addClass("tabs-active"); //Add "active" class to selected tab  
        $(".tab_content").hide(); //Hide all tab content  
        var activeTab = $(this).find("a").attr("href"); //Find the rel attribute value to identify the active tab + content  
        $(activeTab).fadeIn(); //Fade in the active content  
        return false;
    });
});
//登录
var oLoginUsn = $("#loginUsn");//用户名
var oLoginPsw = $("#loginPsw");//密码
var oLoginForm = $("#loginForm");
oLoginForm.on("submit", function (ev) {
    var loginUsn = oLoginUsn.val();
    var loginPsw = oLoginPsw.val();
    $.ajax({
        url: "http://210.209.89.206/user/login",
        type: "post",
        dataType: "json",//必须要写数据类型，否则报错
        data: {
            user_name: loginUsn,
            password: loginPsw
        },
        success: function (result) {
            var result = eval(result);
            if (result.session_id == "faeaa6fe-682b-4dc8-baa0-6377e2dc9930") {//登录成功
                window.location.href = "bankInfo.html";
                return;
            }
            if (result == false) {
                alert("登录失败，用户名或密码错误！");

            }
        },
        error: function (data, type, err) {
            console.log("ajax错误类型：" + type);
            console.log(err);
        }
    });
    ev.preventDefault();
});
//注册
var oRegUsn = $("#registerUsn");//用户名
var oRegPsw = $("#registerPsw");//密码
var oId = $("#idNum");//身份证号
var oRegForm = $("#registerForm");
oRegForm.on("submit", function (ev) {
    var regUsn = oRegUsn.val();
    var regPsw = oRegPsw.val();
    var regId = oId.val();
    $.ajax({
        url: "http://210.209.89.206/user/register",
        type: "post",
        dataType: "json",//必须要写数据类型，否则报错
        data: {
            user_name: regUsn,
            password: regPsw,
            identity_card: regId
        },
        success: function (result) {
            var result = eval(result);
            if (result.msg == "succeed") {//注册成功
                alert("注册成功，请登录！");
                window.location.href = "";
                return;
            }
            if (result.msg == "failed") {
                alert("注册失败！");
                return;
            }
            if (result.msg == "duplicate user_name") {
                alert("用户名重复，请重新注册！");
                oRegUsn.val("");//清空输入框
                oRegPsw.val("");
                oId.val("");

            }
        },
        error: function (data, type, err) {
            console.log("ajax错误类型：" + type);
            console.log(err);
        }
    });
    ev.preventDefault();
});