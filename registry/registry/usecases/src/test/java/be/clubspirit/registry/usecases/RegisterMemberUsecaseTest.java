package be.clubspirit.registry.usecases;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

class RegisterMemberUsecaseTest {



    @InjectMocks
    private RegisterMemberUsecase registerMemberUsecase;

    @Test
    public void givenAValidCreateMemberRequest_whenUsecaseExecuted_thenRequestGetsValidatedAndSaved() {

        var registerMemberRequest = Mockito.mock(RegisterMemberRequest.class);

        registerMemberUsecase.execute(registerMemberRequest);

        Mockito.inOrder(reg)
                .verify(registerMemberUsecase).

    }


}