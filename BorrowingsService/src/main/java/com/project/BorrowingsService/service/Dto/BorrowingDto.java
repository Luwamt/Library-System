package com.project.BorrowingsService.service.Dto;


import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BorrowingDto {

    private long borrowingNumber;
    private String date;
    private long customerNumber;
    private String customerName;
    private long isbn;
    private String bookTitle;
}
