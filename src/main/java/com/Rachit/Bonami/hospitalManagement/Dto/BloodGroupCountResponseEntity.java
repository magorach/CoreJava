package com.Rachit.Bonami.hospitalManagement.Dto;

import com.Rachit.Bonami.hospitalManagement.Entity.type.BloodGroupType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BloodGroupCountResponseEntity {

    private BloodGroupType bloodGroupType;
    private Long count;

}
