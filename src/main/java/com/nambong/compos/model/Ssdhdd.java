package com.nambong.compos.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Ssdhdd extends CommonObject{
    @ManyToOne
    @JoinColumn(name="formatid", insertable=false, updatable=false)
    private Format format;
    private Integer formatid;

    @ManyToOne
    @JoinColumn(name="ssdvolid", insertable=false, updatable=false)
    private SsdVol ssdVol;
    private Integer ssdvolid;
}
