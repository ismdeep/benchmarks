package com.ismdeep.utils;

import java.time.Instant;

public class UnixTimeUtil {
    public static long unix_timestamp_ms() {
        Instant current_time = Instant.now();
        return current_time.getEpochSecond() * 1000 + current_time.getNano() / 1000000;
    }
}
