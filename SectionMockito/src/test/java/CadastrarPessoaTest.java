
import org.example.ApiDosCoreeios;
import org.example.CadastrarPessoa;
import org.example.DadosLocalizado;
import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {


// Forma zuada de usar o Mokito
//    @BeforeAll
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//  private ApiDosCoreeios apiDosCorreios = Mockito.mock(ApiDosCoreeios.class)


    @Mock
    private ApiDosCoreeios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosCadastrado(){
        DadosLocalizado dadosLocalizado = new DadosLocalizado("SP","Sao roque","Avenida");
        Mockito.when(apiDosCorreios.buscarDadosCep("3472589142")).thenReturn(dadosLocalizado);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Gabriel","2345790345", LocalDate.now(),"3472589142");


        Assertions.assertEquals("Gabriel",pessoa.getNome());
        Assertions.assertEquals("2345790345",pessoa.getDocumento());
        Assertions.assertEquals("SP",pessoa.getCep());
    }

}
