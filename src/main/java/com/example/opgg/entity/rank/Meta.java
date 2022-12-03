package com.example.opgg.entity.rank;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@lombok.Data
public class Meta {
    private String version;
    //不能使用offsetDateTime
    private LocalDateTime cachedAt;
}
