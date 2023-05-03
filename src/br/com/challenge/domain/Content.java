package br.com.challenge.domain;

public abstract class Content {
  protected static final double XPDefault = 10d;

  private String title;
  private String description;

  public abstract double calculateXp();

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
}
