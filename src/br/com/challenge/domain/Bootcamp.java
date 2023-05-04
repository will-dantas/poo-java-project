package br.com.challenge.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
  private String title;
  private String description;
  private final LocalDate inicialDate = LocalDate.now();
  private final LocalDate endDate = inicialDate.plusDays(45);
  private Set<User> signedUpUser = new HashSet<>();
  private Set<Content> contents = new LinkedHashSet<>();

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getInicialDatel() {
    return inicialDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public Set<User> getSignedUpUser() {
    return signedUpUser;
  }

  public void setSignedUpUser(Set<User> signedUpUser) {
    this.signedUpUser = signedUpUser;
  }

  public Set<Content> getContent() {
    return contents;
  }

  public void setContent(Set<Content> contents) {
    this.contents = contents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;

    if (o == null || getClass() != o.getClass())
      return false;

    Bootcamp bootcamp = (Bootcamp) o;

    return Objects.equals(title, bootcamp.title)
        && Objects.equals(description, bootcamp.description)
        && Objects.equals(inicialDate, bootcamp.inicialDate)
        && Objects.equals(endDate, bootcamp.endDate)
        && Objects.equals(signedUpUser, bootcamp.signedUpUser)
        && Objects.equals(contents, bootcamp.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        title,
        description,
        inicialDate,
        endDate,
        signedUpUser,
        contents);
  }
}
