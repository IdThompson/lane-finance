package com.idowu.lanefinance.dtos.response;

import com.idowu.lanefinance.constants.WalletType;
import lombok.Data;

@Data
public class RegistrationResponseDto {
    private Long newAccountNumber;
    private String accountType = WalletType.SAVINGS.toString();

    public RegistrationResponseDto(Long newAccountNumber) {
        this.newAccountNumber = newAccountNumber;
    }
}
