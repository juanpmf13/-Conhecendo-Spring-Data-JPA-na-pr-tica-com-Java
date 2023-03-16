package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotBlank(message = "campo não preenchido corretamente")
  @Size(min = 3,max = 70, message = "'${validatedValue}' precisa estar no range de {min} e {max} caracteres")
  private String nome;

  @NotBlank(message = "campo não preenchido corretamente")
  @CPF(message = "'${validatedValue}' é inválido")
  private String cpf;

  @NotBlank(message = "campo não preenchido corretamente")
  @Size(min = 3,max = 70, message = "'${validatedValue}' precisa estar no range de {min} e {max} caracteres")
  private String bairro;

  @NotNull(message = "campo não preenchido corretamente")
  @Past(message = "Data '${validatedValue}' é inválida")
  private LocalDate dataDeNascimento;
}
