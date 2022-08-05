package com.duccao.learn.entity;

import com.duccao.learn.constants.Status;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Organization entity class.
 *
 * @author thinhphamtx
 * @version 1.0
 * @since 2022/05/13
 */
@Entity(name = "Organization")
@Setter
@Getter
@NoArgsConstructor
@Table(name = "organizations")
public class Organization extends AbstractAuditingEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @NotNull
  @Column(name = "erp_id")
  private String erpId;

  @NotNull
  @Column(name = "name")
  private String name;

  @NotNull
  @Enumerated(EnumType.ORDINAL)
  @Column(name = "status")
  private Status status;

  @OneToMany(mappedBy = "organization")
  private List<Site> sites;
}
