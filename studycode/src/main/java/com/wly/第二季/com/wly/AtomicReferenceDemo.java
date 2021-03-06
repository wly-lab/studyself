package com.wly.第二季.com.wly;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.concurrent.atomic.AtomicReference;

@Getter
@ToString
@AllArgsConstructor
class User{
    String userName;
    int age;
}
public class AtomicReferenceDemo {


    public static void main(String[] args) {
        User z3 = new User("z3", 22);
        User li4 = new User("li4", 22);
        AtomicReference<User> atomicReference=new AtomicReference<>();
        atomicReference.set(z3);
        System.out.println(atomicReference.compareAndSet(z3,li4)+"\t User:"+ atomicReference.get().getUserName());
    }
}
