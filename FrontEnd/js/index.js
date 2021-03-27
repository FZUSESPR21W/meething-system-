$(function () {
    PostHandle("/index", {isLogin:"unKnow"}, function(data){
        $("#login-name").text(data.name);
        localStorage.setItem("uid",data.uid);
        localStorage.setItem("forums",data.uid);
        var identity;
        if(data.isadmin == 0){
            $("#manage").css("display","none");
            identity = "普通用户";
        } else if(data.isadmin == 1){
            identity = "会议主席";
        } else if(data.isadmin == 2){
            identity = "分论坛主席";
        } else if(data.isadmin == 3){
            identity = "秘书";
        }
        $("#identity").text(identity);
        data.forums
    });//判断登录身份
})

var app = new Vue({
    el: '#app',
    data: 
    {
        forums: /*localStorage.getItem("forums")*/
        [
            {
                name:"分论坛1",
                leader:"分论坛主席1",
                message:{
                    "8:00":"event1",
                    "9:00":"event2",
                    "10:00":"event3",
                    "11:00":"event4",
                    "12:00":"event5",
                    "13:00":"event6",
                }
            },
            {
                name:"分论坛2",
                leader:"分论坛主席2",
                message:{
                    "8:00":"event1",
                    "9:00":"event2",
                    "10:00":"event3",
                    "11:00":"event4",
                    "12:00":"event5",
                    "13:00":"event6",
                }
            },
            {
                name:"分论坛3",
                leader:"分论坛主席3",
                message:{
                    "8:00":"event1",
                    "9:00":"event2",
                    "10:00":"event3",
                    "11:00":"event4",
                    "12:00":"event5",
                    "13:00":"event6",
                }
            }
        ]
    },
    methods: {
        manage:function(){
            var uid = localStorage.getItem("uid");
            PostHandle("/manage", uid , function(data){
                
            });
        },
        message:function(){
            var uid = localStorage.getItem("uid");
            PostHandle("/message", uid , function(data){
                
            });
        },
        exit:function(){
            window.location.href = "../html/login.html";
        }
    },
    computed: {

    }
});