$(function () {
    var name = localStorage.getItem("username");
    $("#login-name").text(name);
    var identity = localStorage.getItem("identity");
    $("#identity").text(identity);
    var role = localStorage.getItem("role");
    if(role==1){
        $("#manage").css("display","none");
    }//判断登录身份
    var data = {
        uid:localStorage.getItem("uid")
    };
    PostHandle("http://1.15.141.65:8080/myforum", JSON.stringify(data), function(data){
        var forums = data.forums;
        JSON.stringify(forums);
        localStorage.setItem("forums",forums);
    });
})

var app = new Vue({
    el: '#app',
    data: 
    {
        forums: //JSON.parse(localStorage.getItem("forums")),
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