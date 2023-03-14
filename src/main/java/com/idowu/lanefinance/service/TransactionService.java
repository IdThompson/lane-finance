package com.idowu.lanefinance.service;


import com.idowu.lanefinance.dtos.request.DepositAccountRequestDto;
import com.idowu.lanefinance.dtos.request.TransferFundRequestDto;
import com.idowu.lanefinance.dtos.request.WithdrawFundRequestDto;
import com.idowu.lanefinance.dtos.response.DepositResponseDto;
import com.idowu.lanefinance.dtos.response.TransferResponseDto;
import com.idowu.lanefinance.dtos.response.WithdrawFundResponseDto;

public interface TransactionService {
    DepositResponseDto depositFunds(DepositAccountRequestDto depositAccountRequestDto);
    TransferResponseDto transferFunds(TransferFundRequestDto transferFundRequestDto);
    WithdrawFundResponseDto withdrawFunds(WithdrawFundRequestDto withdrawFundRequestDto);
}
