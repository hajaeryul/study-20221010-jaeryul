package com.jpstudio.study20221010jaeryul.dto.validation;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

@GroupSequence({ValidationGroups.NotBlankGroup.class,
            ValidationGroups.SizeGroup.class,
            ValidationGroups.PatternCheckGroup.class,
            Default.class
})

public interface ValidaionSequence {}
