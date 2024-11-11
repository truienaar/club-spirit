package be.clubspirit.registry.usecases;

public class RegisterMemberUsecase {

    private final MemberRepository memberRepository;

    public RegisterMemberUsecase(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void execute(RegisterMemberRequest request) {

    }
}
