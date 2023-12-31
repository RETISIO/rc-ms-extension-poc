package com.retisio.arc.aggregate.catalog;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.retisio.arc.serializer.JsonSerializable;
import lombok.Value;

import java.io.Serializable;
import java.util.LinkedHashMap;

@Value
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonDeserialize
public class Catalog implements JsonSerializable {
    private String catalogId;
    private String catalogName;
    private Boolean active;
    private LinkedHashMap<String, Serializable> dynProps;
    private Boolean deleted;
}
