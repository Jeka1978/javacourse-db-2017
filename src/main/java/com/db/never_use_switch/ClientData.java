package com.db.never_use_switch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * Created by Evegeny on 24/08/2017.
 */
@AllArgsConstructor
@Builder
public class ClientData {
    @Getter
    private String clientName;

    @Getter
    private String email;
}
