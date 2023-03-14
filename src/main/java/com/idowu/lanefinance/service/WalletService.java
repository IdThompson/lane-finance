package com.idowu.lanefinance.service;


import com.idowu.lanefinance.dtos.request.ActivateAccountRequestDto;
import com.idowu.lanefinance.dtos.response.FetchAccountResponseDto;
import com.idowu.lanefinance.entity.Wallet;

public interface WalletService {
    FetchAccountResponseDto fetchAccount(long accountNumber);
    boolean activateAccount(ActivateAccountRequestDto activateAccountRequestDto);
    Wallet getLoggedInUserAccountDetails();

}
