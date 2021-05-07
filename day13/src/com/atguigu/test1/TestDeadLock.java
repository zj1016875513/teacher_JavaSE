package com.atguigu.test1;

import java.util.TreeMap;

public class TestDeadLock {
    public static void main(String[] args) {
        Owner owner = new Owner();
        LockSmith lockSmith = new LockSmith();
        owner.setLockSmith(lockSmith);
        lockSmith.setOwner(owner);
        owner.start();
        lockSmith.start();
    }
}

class Owner extends Thread{
    private LockSmith lockSmith;

    public Owner(LockSmith lockSmith){
        this.lockSmith = lockSmith;
    }

    public Owner() {
    }

    public LockSmith getLockSmith() {
        return lockSmith;
    }

    public void setLockSmith(LockSmith lockSmith) {
        this.lockSmith = lockSmith;
    }

    @Override
    public void run() {
        synchronized (this){
            System.out.println("你先给我开门");
            synchronized (lockSmith){
                System.out.println("我给你看房本");
            }
        }
    }
}

class LockSmith extends Thread{

    private Owner owner;

    public LockSmith(Owner owner){
        this.owner = owner;
    }

    public LockSmith(){

    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public void run() {
        synchronized (this){
            System.out.println("你给我看房本");
            synchronized (owner){
                System.out.println("我给你开门");
            }
        }
    }
}

