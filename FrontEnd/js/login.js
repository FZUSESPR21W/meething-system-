var vm=new Vue({
    el:'#app',
    data:{
        isShow:false,
        Info:localStorage.getItem("userArr"),
        usertishi:'',
        passtishi:'',
        tishi:'',
        userIn:{
            user:'',
            pass:'',
        },

    },
    methods:{
        login : function() {
            var url= "http://1.15.141.65:8080/login";
            var user = {
                name: document.getElementById("user").value,
                password: document.getElementById("pw").value
            };
            PostHandle(url,JSON.stringify(user),function(data){
                if(data.code == 0){
                    localStorage.setItem("uid",data.uid);
                    localStorage.setItem("forums",data.uid);
                var identity;
                if(data.role == 1){
                    $("#manage").css("display","none");
                    identity = "用户";
                } else if(data.role == 2){
                    identity = "分主席";
                } else if(data.role == 3){
                    identity = "秘书";
                } else if(data.role == 4){
                identity = "主席";
            }
            localStorage.setItem("uid",data.user.uid);
            localStorage.setItem("role",data.user.role);
            localStorage.setItem("identity",identity);
            localStorage.setItem("username",data.user.name);
            }
            window.location.href = "../html/index.html";
            })
        }
    }
})