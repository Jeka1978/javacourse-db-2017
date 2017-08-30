package com.db.observer;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by Evegeny on 29/08/2017.
 */
@Builder
@Data
public class Post {
    private Author author;
    private String content;
    private LocalDateTime whenPublished;
}
