package com.example.effectivejava.item7.optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Channel {

    private int numOfSubscribers;

    public Optional<MemberShip> defaultMemberShip() {
        if (this.numOfSubscribers < 2000) {
            return Optional.empty();
            //Optional이전의 NPE발생 부분 처리
            //throw new Exception();
            //throw null;
            //원시형은 OptionalInt, OptionalLong쓰면 됨.
        } else  {
            return Optional.of(new MemberShip());
        }
    }
}
