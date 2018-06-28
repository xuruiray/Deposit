//获取银行卡信息
var oCard = $("#cardId");//卡号
var oAmount = $("#amount");//金额
var oCardForm = $("#cardForm");
oCardForm.on("submit", function (ev) {
    var cardId = oCard.val();
    var amount = oAmount.val();
    $.ajax({
        url: "http://210.209.89.206/card/getCardInfo",
        type: "post",
        dataType: "json",//必须要写数据类型，否则报错
        data: {
            card_id: cardId,
            amount: amount
        },
        success: function (result) {
            $("#inputInfo").css("display", "none");
            $("#cardInfo").css("display", "block");
            var result = eval(result);
            $("#bankName").html(result.bank);
            $("#cardNum").html(result.card_numbers);
        },
        error: function (data, type, err) {
            console.log("ajax错误类型：" + type);
            console.log(err);
        }
    });
    ev.preventDefault();
});
