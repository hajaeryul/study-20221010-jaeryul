package com.jpstudio.study20221010jaeryul.dto;

import com.jpstudio.study20221010jaeryul.dto.validation.ValidationGroups;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class MemberReqDto {
    @NotBlank(message = "아이디는 비워둘 수 없습니다", groups = ValidationGroups.NotBlankGroup.class)
    @Size(min = 4, max = 16, message = "4~16자 입력하세요", groups = ValidationGroups.SizeGroup.class)
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "영문, 숫자만 입력가능합니다", groups = ValidationGroups.PatternCheckGroup.class)
    private String userName;

    @NotBlank(message = "비밀번호는 비워둘 수 없습니다", groups = ValidationGroups.NotBlankGroup.class)
    @Size(min = 4, max = 16, message = "4~16자 입력하세요", groups = ValidationGroups.SizeGroup.class)
    @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[~!@#$%^&*_])[a-zA-Z\\d-~!@#$%^&*_]*$", message = "특수기호, 영문, 숫자를 모두 포함해야합니다", groups = ValidationGroups.PatternCheckGroup.class)
    private String password;

    @NotBlank(message = "비밀번호 확인은 비워둘 수 없습니다", groups = ValidationGroups.NotBlankGroup.class)
    @Size(min = 4, max = 16, message = "4~16자 입력하세요", groups = ValidationGroups.SizeGroup.class)
    private String passwordConf;

    @NotBlank(message = "이름은 비워둘 수 없습니다", groups = ValidationGroups.NotBlankGroup.class)
    @Size(min = 2, max = 4, message = "2~4자 입력하세요", groups = ValidationGroups.SizeGroup.class)
    @Pattern(regexp = "^[가-힇]*$", message = "한글만 입력하세요", groups = ValidationGroups.PatternCheckGroup.class)
    private String name;

    @NotBlank(message = "주민등록번호는 비워둘 수 없습니다", groups = ValidationGroups.NotBlankGroup.class)
    @Size(min = 13, max = 13, message = "13자 입력하세요", groups = ValidationGroups.SizeGroup.class)
    @Pattern(regexp = "^[0-9]*$", message = "숫자만 입력하세요", groups = ValidationGroups.PatternCheckGroup.class)
    private String resNo;

    @NotBlank(message = "주소는 비워둘 수 없습니다", groups = ValidationGroups.NotBlankGroup.class)
    private String address;
}
