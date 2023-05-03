package br.com.challenge.domain;

import java.time.LocalDate;

public class Mentoring extends Content{
  private LocalDate date;

  public LocalDate getDate() {
    return date;
  }

  @Override
  public double calculateXp() {
    return XPDefault + 20d;
  };

  public void setDate(LocalDate date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Mentoria{" +
           "titulo='" + getTitle() + '\'' +
           ", descricao='" + getDescription() + '\'' +
           ", data='" + date + '\'' +
           "}";
  }
}
