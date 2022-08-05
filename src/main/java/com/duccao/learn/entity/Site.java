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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Class {@link Site} defined properties for site entity.
 *
 * @author dungphanx
 * @version 1.0
 * @since 2022/05/12
 */
@Getter
@Setter
@Entity(name = "Site")
@Table(name = "sites")
public class Site extends AbstractAuditingEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "erp_id")
  private String erpId;

  @ManyToOne
  @JoinColumn(name = "organization_id", nullable = false)
  private Organization organization;

  @Column(name = "name")
  private String name;

  @Enumerated(EnumType.ORDINAL)
  @Column(name = "status")
  private Status status;

  @OneToMany(mappedBy = "site")
  private List<SiteLocale> locales;
}
