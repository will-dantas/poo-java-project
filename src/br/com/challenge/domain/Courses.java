package br.com.challenge.domain;

public class Courses extends Content {
  private int workload;

  @Override
  public double calculateXp() {
    return XPDefault * workload;
  };

  public int getWorkload() {
    return workload;
  }

  public void setWorkload(int workload) {
    this.workload = workload;
  }

  @Override
  public String toString() {
    return "Curso{" +
           "titulo='" + getTitle() + '\'' +
           ", descricao='" + getDescription() + '\'' +
           ", carga horaria='" + workload + '\'' +
           "}";
  }
}
