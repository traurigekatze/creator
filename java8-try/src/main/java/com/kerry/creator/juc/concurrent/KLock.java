package com.kerry.creator.juc.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.LockSupport;

public class KLock {

    private static volatile Map<String, Integer> lock_key_map = new HashMap<>();

    private static final int unlock = 0;

    private static final int lock = 1;

    public static boolean lock(String lockKey) {
        if (compareAndSet(lockKey)) {
            return true;
        }
        return false;
    }

    private static synchronized boolean compareAndSet(String lockKey) {
        if (lock_key_map.containsKey(lockKey) && lock_key_map.get(lockKey) == lock) {
            return false;
        }
        lock_key_map.put(lockKey, lock);
        return true;
    }

    private void park() {
        LockSupport.park();
    }

    private void unpark() {
        LockSupport.unpark(new Thread());
    }

}
