package pod;

import java.time.Duration;
import java.time.Instant;

final class Temporizador {
    public static long calculaTempoTotal(Instant inicio, Instant fim) {
        Duration tempoTotal = Duration.between(inicio, fim);
        return tempoTotal.toMillis();
    }
}