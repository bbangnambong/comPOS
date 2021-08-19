package com.nambong.compos.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Cpu extends CommonObject{

    @ManyToOne
    @JoinColumn(name="socketid", insertable=false, updatable=false)
    private Socket socket;
    private Integer socketid;

    @ManyToOne
    @JoinColumn(name="brandid", insertable=false, updatable=false)
    private Brand brand;
    private Integer brandid;

}
