package com.db.observer;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by Evegeny on 29/08/2017.
 */
@Data
@Builder
public class PostEvent {
    private Post post;
    private LocalDateTime whenReleased;
}
