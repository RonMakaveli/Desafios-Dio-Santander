import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class Cliente {
	@NonNull
	private String nome;
	private Conta conta;
}

