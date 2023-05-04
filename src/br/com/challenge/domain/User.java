package br.com.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class User {
  private String name;
  private Set<Content> contentSignedUp = new LinkedHashSet<>();
  private Set<Content> contentConcluded = new LinkedHashSet<>();

  public void registerBootcamp(Bootcamp bootcamp) {
    this.contentSignedUp.addAll(bootcamp.getContent());
    bootcamp.getSignedUpUser().add(this);
  }

  public void progression() {
    Optional<Content> content = this.contentSignedUp.stream().findFirst();

    if (content.isPresent()) {
      this.contentConcluded.add(content.get());
      this.contentSignedUp.remove(content.get());
    } else {
      System.err.println("Você não está matriculado em nenhum curso!");
    }
  }

  public double calculatetotalXp() {
    return this.contentConcluded
        .stream()
        .mapToDouble(Content::calculateXp)
        .sum();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Content> getContentSignedUp() {
    return contentSignedUp;
  }

  public void setContentSignedUp(Set<Content> contentSignedUp) {
    this.contentSignedUp = contentSignedUp;
  }

  public Set<Content> getContentConcluded() {
    return contentConcluded;
  }

  public void setContentConcluded(Set<Content> contentConcluded) {
    this.contentConcluded = contentConcluded;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;

    if (o == null || getClass() != o.getClass())
      return false;

    User user = (User) o;

    return Objects.equals(name, user.name)
        && Objects.equals(contentSignedUp, user.contentSignedUp)
        && Objects.equals(contentConcluded, user.contentConcluded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, contentSignedUp, contentConcluded);
  }
}
