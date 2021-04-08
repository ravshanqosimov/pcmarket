package uz.pcmarket.data_rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pcmarket.data_rest.entity.District;
import uz.pcmarket.data_rest.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address extends AbsEntity {

    private String street;

    private Integer homeNumber;

    @ManyToOne
    private District district;

}
