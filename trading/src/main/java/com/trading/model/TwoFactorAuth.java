package com.trading.model;
import com.trading.domain.VerificationType;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class TwoFactorAuth {

    private boolean isEnabled = false;
    private VerificationType sendTo;

}
