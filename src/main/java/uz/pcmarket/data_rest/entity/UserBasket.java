package uz.pcmarket.data_rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pcmarket.data_rest.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class UserBasket extends AbsEntity {

    @OneToOne
    private OutputProduct outputProduct;
    private Double allSum;
    @OneToOne
    private User user;

}
