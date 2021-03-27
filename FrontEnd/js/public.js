function PostHandle(url,data,callback) {
    $.ajax({
        type: "POST",
        url: url,
        data: data,
        dataType: 'json',
        success: function (data){
            callback(data);
        },
        error: function(xhr){
            alert("错误提示： " + xhr.status + " " + xhr.statusText);
        }
    });
}