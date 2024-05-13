import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class Banco {
	@NonNull
	private String nome;
	private List<Cliente> clientes;

	public void listarClientes() {
		System.out.println("Clientes do Banco " + nome + ":");
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
		}
	}
}