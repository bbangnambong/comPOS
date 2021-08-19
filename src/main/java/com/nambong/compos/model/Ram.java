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
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Ram extends CommonObject{

    @ManyToOne
    @JoinColumn(name="ddrid", insertable=false, updatable=false)
    private Ddr ddr;
    private Integer ddrid;

    @ManyToOne
    @JoinColumn(name="volid", insertable=false, updatable=false)
    private Vol vol;
    private Integer volid;
}
