package org.example;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Configuration extends io.dropwizard.core.Configuration {
    @NotNull private String defaultGreeting;
}
