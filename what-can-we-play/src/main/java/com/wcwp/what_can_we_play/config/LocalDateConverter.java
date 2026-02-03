package com.wcwp.what_can_we_play.config;

import java.time.LocalDate;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<LocalDate, String>{
    @Override  
    public String convertToDatabaseColumn(LocalDate attribute) {  
        return attribute != null ? attribute.toString() : null;  
    }  
    @Override  
    public LocalDate convertToEntityAttribute(String dbData) {  
        return dbData != null ? LocalDate.parse(dbData) : null;  
    } 
}
