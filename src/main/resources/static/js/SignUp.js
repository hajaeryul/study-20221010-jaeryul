const SignUpButton = document.querySelector(".account-button");

SignUpButton.onclick = () => {
    const SignUpInput = document.querySelectorAll(".field input")

    let user = {
        userName : SignUpInput[0].value,
        password : SignUpInput[1].value,
        passwordConf : SignUpInput[2].value,
        name : SignUpInput[3].value,
        resNo : SignUpInput[4].value + SignUpInput[5].value,
        address : SignUpInput[6].value + SignUpInput[7].value + SignUpInput[8].value
    }

    let ajaxOption = {
        async : false,
        type : "post",
        url : "/api/member/SignUp",
        contentType : "application/json",
        data : JSON.stringify(user),
        dataType : "json",
        success: (response) => {
            alert("회원가입 요청 성공");
        },
        error : (error) => {
            alert(error.responseJSON);
            console.log(error.responseJSON);
        }
    }

    $.ajax(ajaxOption);
}