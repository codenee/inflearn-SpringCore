package hello.core.member;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public class MemoryMemberRespository implements MemberRepository{

    //private static Map<Long, Member> store = new HashMap<>();
    private Map<Long, Member> store = new HashMap<>();
    //동시성 이슈 때문에 ConcurrentHashMap을 써야 하지만 일단 HashMap사용

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
