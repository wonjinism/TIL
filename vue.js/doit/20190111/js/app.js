Vue.component(
    'todo-footer', {
        template: '<p>이것은 또 다른 글로벌 자식 컴포넌트</p>'
    }
);

// cmp 선언은 인스턴스 생성 코드 위에 있어야 한다.
var cmp = {
    template: '<p>이것은 또 다른 지역 자식 컴포넌트'
};

var app = new Vue({
    el: '#app',
    data: {
        message: "이것은 부모 컴포넌트"
    },
    components: {
        // 'todo-list': {
        //     template: '<p>이것은 또 다른 지역 자식 컴포넌트'
        // }
        'todo-list': cmp
    }
});