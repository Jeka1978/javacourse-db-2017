package com.db.never_use_switch;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Created by Evegeny on 24/08/2017.
 */
@Data
@RequiredArgsConstructor
public class MailInfo {
    private ClientData clientData;
    private final int mailCode;
}
