package com.jpstudio.study20221010jaeryul.api;

import com.jpstudio.study20221010jaeryul.dto.MemberReqDto;
import com.jpstudio.study20221010jaeryul.dto.validation.ValidaionSequence;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@RequestMapping("/api/member")
@RestController
public class MemberApi {

    @PostMapping("/SignUp")
    public ResponseEntity<?> SignUp(@Validated(ValidaionSequence.class) @RequestBody MemberReqDto memberReqDto, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            Map<String, String> errorMap = new TreeMap<String, String>();

            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for(FieldError fieldError : fieldErrors) {
                System.out.println("필드명: " + fieldError.getField());
                System.out.println("에러 메세지: " + fieldError.getDefaultMessage());
                errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
            }

            return ResponseEntity.badRequest().body(errorMap);
        }
        System.out.println("회원가입 요청 데이터: "+ memberReqDto.toString());
        return ResponseEntity.ok().body(null);
    }
}
