$(function () {
    $.post({
        url:'user/All',
        success: function (data) {
            //alert(data[0].name);
            //console.log(data);
            for (var i=0;i<data.length;i++){
                console.log(data[i].name)
            }
        }
    })
})