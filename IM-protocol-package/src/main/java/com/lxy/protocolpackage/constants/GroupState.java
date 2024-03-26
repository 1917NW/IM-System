package com.lxy.protocolpackage.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GroupState {
    NOT_ADD(0),
    RESRVED(1),
    HAVE_ADDED(2);
    private Integer stateCode;
}
