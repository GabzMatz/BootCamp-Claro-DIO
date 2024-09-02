import org.example.Email;
import org.example.Formato;
import org.example.PlataformaDeEnvio;
import org.example.ServicoEnvioEmail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEmailTest {
    
    @Mock
    private PlataformaDeEnvio plataforma;

    @InjectMocks
    private ServicoEnvioEmail servico;


    @Captor
    ArgumentCaptor<Email> captor;

    @Test
    void validarDados(){

        String enderecoEmail = "gabriel.antiqueira@hotmail.com";
        String mensagem = "Ola Mundo";

        boolean eFormatoHtml = false;

        servico.enviaEmail(enderecoEmail,mensagem,eFormatoHtml);

        Mockito.verify(plataforma).enviaEmail(captor.capture());
        Email email = captor.getValue();

        Assertions.assertEquals(enderecoEmail, email.getEnderecoEmail());
        Assertions.assertEquals(mensagem, email.getMensagem());
        Assertions.assertEquals(Formato.TEXTO,email.getFormato());

    }

}
