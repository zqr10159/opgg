package com.example.opgg.entity.rank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@lombok.Data
@Document(value = "opgg",collection="opgg")
public class Opgg {
    @Id
    private String id;
    private List<Datum> data;
    private Meta meta;
}
