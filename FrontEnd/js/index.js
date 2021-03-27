var app = new Vue({
    el: '#app',
    data: {
        forums:[
            {
                name:"分论坛1",
                leader:"分论坛主席1",
                message:{
                    "8:00":"event1",
                    "9:00":"event2",
                    "10:00":"event3",
                }
            },
            {
                name:"分论坛2",
                leader:"分论坛主席2",
                message:{
                    "8:00":"event1",
                    "9:00":"event2",
                    "10:00":"event3",
                }
            },
            {
                name:"分论坛3",
                leader:"分论坛主席3",
                message:{
                    "8:00":"event1",
                    "9:00":"event2",
                    "10:00":"event3",
                }
            }
        ]
    },
    methods: {

    },
    computed: {

    }
});