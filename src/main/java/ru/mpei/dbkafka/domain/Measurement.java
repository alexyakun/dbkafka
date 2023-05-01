package ru.mpei.dbkafka.domain;

import java.time.Instant;

public record Measurement(Instant timestamp, String source, Double value){}
