package tn.ileadconsultiong.msarticle.entities;

import lombok.*;
import tn.ileadconsultiong.entities.BaseEntity;

import javax.persistence.Entity;
 @Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Article extends BaseEntity {
    private String name;
    private int qte;
    private long idStock;
}
