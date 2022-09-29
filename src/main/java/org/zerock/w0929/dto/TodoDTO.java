package org.zerock.w0929.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
//DTO는 데이터를 담는 틀이라고 생각해
public class TodoDTO {

    private Integer tno;
    private String title;
    private String memo;
    private LocalDate dueDate;
    private boolean complete;

    private LocalDateTime regDate, modDate;


}
