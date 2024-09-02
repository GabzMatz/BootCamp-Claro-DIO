import org.example.Conta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ContaTest {

    @Spy
    private Conta conta = new Conta(1000);

//    @Test
//    void validarOrdemChamadas(){
//
//        conta.pagaBoleto(300);
//
//
//        //Ver se els esta indo na ordem correta
//        InOrder inOrder =  Mockito.inOrder(conta);
//
//
//        inOrder.verify(conta).pagaBoleto(300);
//        inOrder.verify(conta).validaSaldo(300);
//        inOrder.verify(conta).debita(300);
//        inOrder.verify(conta).enviaCreditoParaEmissor(300);
//    }
    @Test
        void validarOrdemChamadas(){
        conta.validaSaldo(300);
        conta.validaSaldo(500);
        conta.validaSaldo(600);

        Mockito.verify(conta,Mockito.times(3)).validaSaldo(ArgumentMatchers.anyInt());


    }

}
