package com.project.BorrowingsService.Domain;

import com.project.BorrowingsService.service.Dto.BookDto;
import com.project.BorrowingsService.service.Dto.CustomerDto;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Borrowing {
    @Id
    private long borrowingNumber;
    private String date;
//    private long customerNumber;
//    private String customerName;
//    private long isbn;
//    private String bookTitle;
    private CustomerDto customer;
    private BookDto book;

}
