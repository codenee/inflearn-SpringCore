package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{
    private int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        //enum타입은 ==으로 비교한다
        if(member.getGrade() == Grade.VIP){
            return discountFixAmount;
        }
        return 0;
    }
}
