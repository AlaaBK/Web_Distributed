package tn.ileadconsultiong.dto;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class StockDto {
    private long id;
    private String zone;
    private LocalDate createdAt;
    private LocalDate updatedAt;

}
