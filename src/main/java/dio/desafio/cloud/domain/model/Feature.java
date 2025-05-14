
package dio.desafio.cloud.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity(name = "tb_feature")
public class Feature extends BaseFields {

    @Column(scale = 13, precision = 2)
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
