package uz.pcmarket.data_rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pcmarket.data_rest.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product extends AbsEntity {
    private String name;
    private String model;
    private String description;
    @OneToOne
    private Attachment attachment;
    private Double price;
    @ManyToOne
    private Category category;
    @OneToOne
    private Characteristic characteristic;
    private boolean active;

}
