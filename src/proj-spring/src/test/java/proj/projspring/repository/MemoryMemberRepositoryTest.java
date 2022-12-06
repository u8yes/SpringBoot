package proj.projspring.repository;

import org.junit.jupiter.api.Test;
import proj.projspring.domain.Member;

import static org.junit.jupiter.api.Assertions.*;

public class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save(){
        Member member = new Member();
        Member result;
        member.setName("spring");

        result = repository.save(member);

        assertEquals(member.getName(), result.getName());
        // main과 test가 똑같은 값으로 반환되어지는지 확인함.

    }
}
