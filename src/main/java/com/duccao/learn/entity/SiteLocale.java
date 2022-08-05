package com.duccao.learn.entity;

import com.duccao.learn.constants.Status;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Class {@link SiteLocale} defined properties for locale entity.
 *
 * @author dungphanx
 * @version 1.0
 * @since 2022/05/12
 */
@Getter
@Setter
@Entity(name = "SiteLocale")
@Table(name = "site_locales")
public class SiteLocale extends AbstractAuditingEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "erp_id")
  private String erpId;

  @Column(name = "locale")
  private String locale;

  @Column(name = "name")
  private String name;

  @Enumerated(EnumType.ORDINAL)
  @Column(name = "status")
  private Status status;

  @ManyToOne
  @JoinColumn(name = "site_id", nullable = false)
  private Site site;
}
