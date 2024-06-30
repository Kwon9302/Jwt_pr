package com.housing.back.dto.response;

import com.housing.back.common.ResponseCode;
import com.housing.back.common.ResponseMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
@AllArgsConstructor
public class ResponseDto {

    private String code;
    private String message;

    public ResponseDto(){
        this.code = ResponseCode.Success;
        this.message= ResponseMessage.Success;
    }

    // ** 데이터베이스 오류 발생시 출력 ** //
    public static ResponseEntity<ResponseDto> databaseError() {
        ResponseDto responseBody = new ResponseDto(ResponseCode.DataBase_Error, ResponseMessage.DataBase_Error);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseBody);
    }

    // ** 인증 오류 발생시 출력 ** //
    public static ResponseEntity<ResponseDto> validationFail() {
        ResponseDto responseBody = new ResponseDto(ResponseCode.Validation_Fail, ResponseMessage.Validation_Fail);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }
}
