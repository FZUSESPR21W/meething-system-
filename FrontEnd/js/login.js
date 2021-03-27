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
        login () {
            this.usertishi = '';
            this.passtishi =''
            //用户名随意
            var obj=JSON.parse(this.Info);
            /*console.log(obj[0])//去数组里的第一组数据*/
            if (!this.userIn.user) {this.usertishi='用户名不能为空';}
            //判断注册的数组中是否能找到输入的用户名
            var testList = obj.find( (item) => {return this.userIn.user === item.username});
            if (!testList) this.usertishi='用户名不存在';
            //密码
            if (!this.userIn.pass) {
                this.passtishi='密码不能为空';
            }
            //判断输入的密码是否为输入的用户名的密码
            var testpass= obj.find( (item) => {return this.userIn.pass === item.password && this.userIn.user === item.username});
            /*console.log(testpass)*/
            if (!testpass) this.passtishi='密码不正确';
            if (this.usertishi || this.passtishi) return;

            userInfo = JSON.stringify(testpass)//把内容转换成字符串形式

        　  localStorage.setItem('userInfo', userInfo);
            window.location.href='../登录/登录成功.html';
            
            }
    }
})