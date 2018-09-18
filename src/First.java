/*
 * Copyright (c) 07.09.2018, DMITRIY BLUDOV. All rights reserved.
 */

import java.time.Clock;
import java.time.Instant;

public class First {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());

        Instant instant = Clock.systemDefaultZone().instant();

        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());

        System.out.println(instant.toEpochMilli());

    }
}