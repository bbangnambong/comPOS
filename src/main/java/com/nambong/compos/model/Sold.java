package com.nambong.compos.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Sold extends CommonObject {

    private String market;
    private String phone;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate soldDate = LocalDate.now();
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate addedDate;

    public Sold(Selling selling) {
        super(selling.getId(), selling.getPrice(), selling.getName(), selling.getDetails());
        this.market = selling.getMarket();
        this.phone = selling.getPhone();
        this.soldDate = LocalDate.now();
        this.addedDate = selling.getAddedDate();
    }
}