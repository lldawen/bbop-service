package ph.gov.bbop.code.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ph.gov.bbop.common.model.BaseModel;

@Entity
@Table(name = "BBOP_CODE")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Code extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BBOP_CODE_SEQ")
    @SequenceGenerator(name = "BBOP_CODE_SEQ", sequenceName = "BBOP_CODE_SEQ", allocationSize = 1)
    private Long id;

    @Column(length = 75, nullable = false)
    private String category;

    @Column(name = "CATEGORY_DESCR", length = 255, nullable = false)
    private String categoryDescr;

    @Column(length = 75, nullable = false)
    private String code;

    @Column(name = "CODE_DESCR", length = 255, nullable = false)
    private String codeDescr;

    @Column(name = "IS_ACTIVE", nullable = false)
    private boolean isActive;

}
